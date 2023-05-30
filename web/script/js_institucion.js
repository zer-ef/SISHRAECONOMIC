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
    initDropDownList();
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
    $("#title").html("Administración de institucion");
    $("#title1").html("Administración de institucion");
}
function initDropDownList() {
    var oItem = {
        Estado: true,
        iOps: 2
    };
    $.CargarCombo(urlApp + '/tipoinstitucionController/fnGetListtipoinstitucionBean.htm', {poJsonItem: oItem}, '#txtIdTipoInstitucion');
}
function ConstruirAutocomplete() {
    $("#txtItemAutocomplete").AutocompleteWithPobject(urlApp + "/institucionController/fnAutocompleteinstitucionBean.htm", {poJsonItem: $('#txtItemAutocomplete').val()}, "#txtItemAutocomplete", 200,
            function (item) {
                console.log(item);
                return {
                    label: item.NombreIstitucion
                }
            },
            function (event, ui) {
                $('#txtItemAutocomplete').focus();
                $('#txtItemAutocomplete').val(ui.item.label);
            });
}
function ConstruirGrid() {
    $.ajaxCall(urlApp + '/institucionController/fnGridinstitucionBean.htm', {poJsonItem: {iOps: 6, Estado: true}}, false, function (response) {
        oTable.fnClearTable();
        $.each(response, function (i, dat) {
            oTable.fnAddData(['<a class="btn btn-info" href="javascript:FnSelEditGrid(' + dat[0] + ');"><i class="glyphicon glyphicon-edit icon-white"></i>Editar</a>', '<a class="btn btn-danger" href="javascript:FnSelDelGrid(' + dat[0] + ');"><i class="glyphicon glyphicon-trash icon-white"></i>Eliminar</a>', dat[1], dat[3], dat[4], dat[5]]);
        });
    });
}
function FnSelEditGrid(id) {
    var oItem = {
        IdInstitucion: id,
        Estado: true,
        iOps: 1
    };
    $.ajaxCall(urlApp + '/institucionController/fnGetinstitucionBean.htm', {poJsonItem: oItem}, false, function (rowData) {
        if (rowData !== null) {
            $('#_institucion').data('IdInstitucion', rowData.IdInstitucion);
            $('#txtNombreIstitucion').val(rowData.NombreIstitucion);
            $('#txtIdTipoInstitucion').val(rowData.IdTipoInstitucion);
            $('#txtLugar').val(rowData.Lugar);
            $("#btnNuevo").text('Actualizar');
            $.HabilitarForm('#form');
        } else {
            bootbox.alert("Ocurrio un Error Inesperado");
        }
    });
}
function FnSelDelGrid(id) {
    var oItem = {
        IdInstitucion: id,
        Estado: true,
        iOps: 1
    };
    $.ajaxCall(urlApp + '/institucionController/fnGetinstitucionBean.htm', {poJsonItem: oItem}, false, function (rowData) {
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
            IdInstitucion: rowData.IdInstitucion,
            NombreIstitucion: rowData.NombreIstitucion,
            IdTipoInstitucion: rowData.IdTipoInstitucion,
            Lugar: rowData.Lugar,
            Estado: false
        };
        $.ajaxCall(urlApp + '/institucionController/fnEliminarinstitucionBean.htm', {poJsonItem: oItem}, false, function (response) {
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
                NombreIstitucion: $('#txtNombreIstitucion').val(),
                IdTipoInstitucion: $('#txtIdTipoInstitucion').val(),
                Lugar: $('#txtLugar').val()
            };
            $.ajaxCall(urlApp + '/institucionController/fnInsertarinstitucionBean.htm', {poJsonItem: oItem}, false, function (response) {
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
                IdInstitucion: $('#_institucion').data('IdInstitucion'),
                NombreIstitucion: $('#txtNombreIstitucion').val(),
                IdTipoInstitucion: $('#txtIdTipoInstitucion').val(),
                Lugar: $('#txtLugar').val(),
                Estado: true
            };
            $.ajaxCall(urlApp + '/institucionController/fnActualizarinstitucionBean.htm', {poJsonItem: oItem}, false, function (response) {
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
