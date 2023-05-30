/*******************************************************************************
 * Descripcion       : jQuery que contiene los metodos y acciones para envio y recepcion de data de areaController
 * Creado por        : Quichua
 * Fecha de Creacion : 05/01/2018 14:35:07
 ** *****************************************************************************/

var oTable;
$(document).ready(function () {
    oTable = $('#grid').dataTable({
        "lengthMenu": [[5, 10, 20, -1], [5, 10, 20, "All"]]
    });
});
$(function () {
    initForm();
    ConstruirGrid();
    ConstruirAutocomplete();
//initDropDownList();
});
$(function () {
    $("#btnNuevo").click(function (e) {
        if ($("#btnNuevo").text() === 'Nuevo') {
            $.HabilitarForm('#form');
            $("#btnNuevo").text('Guardar');
            return;
        }
        if ($("#btnNuevo").text() === 'Guardar') {
            save();
            return;
        }
        if ($("#btnNuevo").text() === 'Actualizar') {
            actualizar();
        }
        e.stopPropagation();
    });
    $("#btnCancelar").click(function (e) {
        $.DesabilitarForm('#form');
        $.LimpiarForm('#form');
        $("#btnNuevo").text('Nuevo');
    });
});

function initForm() {
    $.DesabilitarForm('#form');
    $.LimpiarForm('#form');
    $("#title").html("Administración de area");
    $("#title1").html("Administración de area");
}
function initDropDownList() {
    $.CargarCombo(urlApp + '/areaController/fnGetListareaBean.htm', {poJsonItem: {}}, '#drpItem');
}
function ConstruirAutocomplete() {
    $("#txtItemAutocomplete").AutocompleteWithPobject(urlApp + "/areaController/fnAutocompleteareaBean.htm", {poJsonItem: $('#txtItemAutocomplete').val()}, "#txtItemAutocomplete", 200,
            function (item) {
                console.log(item);
                return {
                    label: item.Denominacion
                }
            },
            function (event, ui) {
                $('#txtItemAutocomplete').focus();
                $('#txtItemAutocomplete').val(ui.item.label);
            });
}
function ConstruirGrid() {
    $.ajaxCall(urlApp + '/areaController/fnGridareaBean.htm', {poJsonItem: {iOps: 6, Estado: true}}, false, function (response) {
        oTable.fnClearTable();
        $.each(response, function (i, dat) {
            oTable.fnAddData(['<a class="green" href="javascript:FnSelEditGrid(' + dat[0] + ');"><i class="ace-icon fa fa-pencil bigger-130"></i></a>', '<a class="red" href="javascript:FnSelDelGrid(' + dat[0] + ');"><i class="glyphicon glyphicon-trash icon-white"></i></a>', dat[1], dat[2]]);
            //oTable.fnAddData(['<a class="green" href="javascript:FnSelEditGrid(' + dat[0] + ');"><i class="ace-icon fa fa-pencil bigger-130"></i></a><a class="red" href="javascript:FnSelDelGrid(' + dat[0] + ');"><i class="ace-icon fa fa-trash-o bigger-130"></i></a></div>', dat[1], dat[2]]);
        });
    });
}
function FnSelEditGrid(id) {
    var oItem = {
        IdArea: id,
        Estado: true,
        iOps: 1
    };
    $.ajaxCall(urlApp + '/areaController/fnGetareaBean.htm', {poJsonItem: oItem}, false, function (rowData) {
        if (rowData !== null) {
            $('#_area').data('IdArea', rowData.IdArea);
            $('#txtDenominacion').val(rowData.Denominacion);
            $("#btnNuevo").text('Actualizar');
            $.HabilitarForm('#form');
        } else {
            bootbox.alert("Ocurrio un Error Inesperado");
        }
    });
}
function FnSelDelGrid(id) {
    var oItem = {
        IdArea: id,
        Estado: true,
        iOps: 1
    };
    $.ajaxCall(urlApp + '/areaController/fnGetareaBean.htm', {poJsonItem: oItem}, false, function (rowData) {
        if (rowData !== null) {
            eliminar(rowData);
        } else {
            bootbox.alert("Ocurrio un Error Inesperado");
        }
    });
}
function eliminar(rowData) {
    var eliminar = function () {
        var oItem = {
            iOps: 1,
            IdArea: rowData.IdArea,
            Denominacion: rowData.Denominacion,
            Estado: false
        };
        $.ajaxCall(urlApp + '/areaController/fnEliminarareaBean.htm', {poJsonItem: oItem}, false, function (response) {
            if (response) {
                bootbox.alert(Mensajes.operacionCorrecta);
                $("#btnNuevo").text('Nuevo');
                $.DesabilitarForm('#form');
                $.LimpiarForm('#form');
                ConstruirGrid();
            } else {
                bootbox.alert("Ocurrio un Error Inesperado");
            }
        });
    };
    bootbox.confirm(Mensajes.deseaEliminarGeometria, function (result) {
        if (result === true) {
            eliminar();
        }
        else {
            return;
        }
    });
}
function save() {
    var resulValidacion = 0;
    resulValidacion = $.ValidarData('#form');
    switch (resulValidacion) {
        case 0:
            var oItem = {
                iOps: 1,
                Denominacion: $('#txtDenominacion').val()
            };
            $.ajaxCall(urlApp + '/areaController/fnInsertarareaBean.htm', {poJsonItem: oItem}, false, function (response) {
                if (response) {
                    bootbox.alert(Mensajes.operacionCorrecta);
                    $("#btnNuevo").text('Nuevo');
                    $.DesabilitarForm('#form');
                    $.LimpiarForm('#form');
                    ConstruirGrid();
                } else {
                    bootbox.alert("Ocurrio Un Error al Momento de Registrar");
                }
            });
            break;
        case -1:
            bootbox.alert(Mensajes.camposRequeridos);
            break;
        case -2:
            bootbox.alert(Mensajes.camposIncorrectos);
            break;
    }
}
function actualizar() {
    var resulValidacion = 0;
    resulValidacion = $.ValidarData('#form');
    switch (resulValidacion) {
        case 0:
            var oItem = {
                iOps: 1,
                IdArea: $('#_area').data('IdArea'),
                Denominacion: $('#txtDenominacion').val(),
                Estado: true
            };
            $.ajaxCall(urlApp + '/areaController/fnActualizarareaBean.htm', {poJsonItem: oItem}, false, function (response) {
                if (response) {
                    bootbox.alert(Mensajes.operacionCorrecta);
                    $("#btnNuevo").text('Nuevo');
                    $.DesabilitarForm('#form');
                    $.LimpiarForm('#form');
                    ConstruirGrid();
                } else {
                    bootbox.alert("Ocurrio Un Error al Momento de Registrar");
                }
            });
            break;
        case -1:
            bootbox.alert(Mensajes.camposRequeridos);
            break;
        case -2:
            bootbox.alert(Mensajes.camposIncorrectos);
            break;
    }
}
