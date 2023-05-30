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
    $("#title").html("Administración de documentoingresado");
    $("#title1").html("Administración de documentoingresado");

    $('.date-picker').datepicker({
        autoclose: true,
        todayHighlight: true
    })
            .next().on(ace.click_event, function () {
        $(this).prev().focus();
    });

    $('.input-daterange').datepicker({autoclose: true});
}
function initDropDownList() {
    var oItem1 = {
        Estado: true,
        iOps: 2
    };
    var oItem2 = {
        Estado: true,
        iOps: 2
    };
    var oItem3 = {
        Estado: true,
        iOps: 2
    };
    $.CargarCombo(urlApp + '/tipodocumentoController/fnGetListtipodocumentoBean.htm', {poJsonItem: oItem1}, '#txtIdTipoDocumento');
    $.CargarCombo(urlApp + '/areaController/fnGetListareaBean.htm', {poJsonItem: oItem2}, '#txtIdOregin');
    $.CargarCombo(urlApp + '/personaController/fnGetListpersonaBean.htm', {poJsonItem: oItem3}, '#txtIdRemitente');
}
function ConstruirAutocomplete() {
    $("#txtItemAutocomplete").AutocompleteWithPobject(urlApp + "/documentoingresadoController/fnAutocompletedocumentoingresadoBean.htm", {poJsonItem: $('#txtItemAutocomplete').val()}, "#txtItemAutocomplete", 200,
            function (item) {
                console.log(item);
                return {
                    label: item.NumeroRegistro
                }
            },
            function (event, ui) {
                $('#txtItemAutocomplete').focus();
                $('#txtItemAutocomplete').val(ui.item.label);
            });
}
function ConstruirGrid() {
    $.ajaxCall(urlApp + '/documentoingresadoController/fnGriddocumentoingresadoBean.htm', {poJsonItem: {iOps: 6, Estado: true}}, false, function (response) {
        oTable.fnClearTable();
        $.each(response, function (i, dat) {
            oTable.fnAddData(['<a class="btn btn-info" href="javascript:FnSelEditGrid(' + dat[0] + ');"><i class="glyphicon glyphicon-edit icon-white"></i>Editar</a>', '<a class="btn btn-danger" href="javascript:FnSelDelGrid(' + dat[0] + ');"><i class="glyphicon glyphicon-trash icon-white"></i>Eliminar</a>', dat[1], dat[3], dat[5], dat[6], dat[8], dat[9], dat[10], dat[11]]);
        });
    });
}
function FnSelEditGrid(id) {
    var oItem = {
        IdDocIngresado: id,
        Estado: true,
        iOps: 1
    };
    $.ajaxCall(urlApp + '/documentoingresadoController/fnGetdocumentoingresadoBean.htm', {poJsonItem: oItem}, false, function (rowData) {
        if (rowData !== null) {
            $('#_documentoingresado').data('IdDocIngresado', rowData.IdDocIngresado);
            $('#txtNumeroRegistro').val(rowData.NumeroRegistro);
            $('#txtIdTipoDocumento').val(rowData.IdTipoDocumento);
            $('#txtIdOregin').val(rowData.IdOregin);
            $('#txtAsunto').val(rowData.Asunto);
            $('#txtIdRemitente').val(rowData.IdRemitente);
            $('#txtDestino').val(rowData.Destino);
            $('#txtFechaDespacho').val(rowData.FechaDespacho);
            $('#txtObservacion').val(rowData.Observacion);
            $("#btnNuevo").text('Actualizar');
            $.HabilitarForm('#form');
        } else {
            bootbox.alert("Ocurrio un Error Inesperado");
        }
    });
}
function FnSelDelGrid(id) {
    var oItem = {
        IdDocIngresado: id,
        Estado: true,
        iOps: 1
    };
    $.ajaxCall(urlApp + '/documentoingresadoController/fnGetdocumentoingresadoBean.htm', {poJsonItem: oItem}, false, function (rowData) {
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
            IdDocIngresado: rowData.IdDocIngresado,
            NumeroRegistro: rowData.NumeroRegistro,
            IdTipoDocumento: rowData.IdTipoDocumento,
            IdOregin: rowData.IdOregin,
            Asunto: rowData.Asunto,
            IdRemitente: rowData.IdRemitente,
            Destino: rowData.Destino,
            FechaDespacho: rowData.FechaDespacho,
            Observacion: rowData.Observacion,
            Estado: false
        };
        $.ajaxCall(urlApp + '/documentoingresadoController/fnEliminardocumentoingresadoBean.htm', {poJsonItem: oItem}, false, function (response) {
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
                NumeroRegistro: $('#txtNumeroRegistro').val(),
                IdTipoDocumento: $('#txtIdTipoDocumento').val(),
                IdOregin: $('#txtIdOregin').val(),
                Asunto: $('#txtAsunto').val(),
                IdRemitente: $('#txtIdRemitente').val(),
                Destino: $('#txtDestino').val(),
                FechaDespacho: $('#txtFechaDespacho').val(),
                Observacion: $('#txtObservacion').val()
            };
            $.ajaxCall(urlApp + '/documentoingresadoController/fnInsertardocumentoingresadoBean.htm', {poJsonItem: oItem}, false, function (response) {
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
                IdDocIngresado: $('#_documentoingresado').data('IdDocIngresado'),
                NumeroRegistro: $('#txtNumeroRegistro').val(),
                IdTipoDocumento: $('#txtIdTipoDocumento').val(),
                IdOregin: $('#txtIdOregin').val(),
                Asunto: $('#txtAsunto').val(),
                IdRemitente: $('#txtIdRemitente').val(),
                Destino: $('#txtDestino').val(),
                FechaDespacho: $('#txtFechaDespacho').val(),
                Observacion: $('#txtObservacion').val(),
                Estado: true
            };
            $.ajaxCall(urlApp + '/documentoingresadoController/fnActualizardocumentoingresadoBean.htm', {poJsonItem: oItem}, false, function (response) {
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
