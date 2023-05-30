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
    $("#title").html("Administración de ingresoeconomico");
    $("#title1").html("Administración de ingresoeconomico");
}
function initDropDownList() {
    var oItem = {
        Estado: true,
        iOps: 2
    };
    var oItem1 = {
        Estado: true,
        iOps: 2
    };
    $.CargarCombo(urlApp + '/personaController/fnGetListpersonaBean.htm', {poJsonItem: oItem}, '#txtIdParticipante');
    $.CargarCombo(urlApp + '/tipoinstitucionController/fnGetListtipoinstitucionBean.htm', {poJsonItem: oItem1}, '#txtIdTipoInstitucion');
}
function ConstruirAutocomplete() {
    $("#txtItemAutocomplete").AutocompleteWithPobject(urlApp + "/ingresoeconomicoController/fnAutocompleteingresoeconomicoBean.htm", {poJsonItem: $('#txtItemAutocomplete').val()}, "#txtItemAutocomplete", 200,
            function (item) {
                console.log(item);
                return {
                    label: item.NumBoleta
                }
            },
            function (event, ui) {
                $('#txtItemAutocomplete').focus();
                $('#txtItemAutocomplete').val(ui.item.label);
            });
}
function ConstruirGrid() {
    $.ajaxCall(urlApp + '/ingresoeconomicoController/fnGridingresoeconomicoBean.htm', {poJsonItem: {iOps: 6, Estado: true}}, false, function (response) {
        oTable.fnClearTable();
        $.each(response, function (i, dat) {
            oTable.fnAddData(['<a class="btn btn-info" href="javascript:FnSelEditGrid(' + dat[0] + ');"><i class="glyphicon glyphicon-edit icon-white"></i>Editar</a>', '<a class="btn btn-danger" href="javascript:FnSelDelGrid(' + dat[0] + ');"><i class="glyphicon glyphicon-trash icon-white"></i>Eliminar</a>', dat[1], dat[2], dat[4], dat[6], dat[7], dat[8], dat[9], dat[10]]);
        });
    });
}
function FnSelEditGrid(id) {
    var oItem = {
        IdIngresoEco: id,
        Estado: true,
        iOps: 1
    };
    $.ajaxCall(urlApp + '/ingresoeconomicoController/fnGetingresoeconomicoBean.htm', {poJsonItem: oItem}, false, function (rowData) {
        if (rowData !== null) {
            $('#_ingresoeconomico').data('IdIngresoEco', rowData.IdIngresoEco);
            $('#txtNumBoleta').val(rowData.NumBoleta);
            $('#txtFechaPago').val(rowData.FechaPago);
            $('#txtIdParticipante').val(rowData.IdParticipante);
            $('#txtIdTipoInstitucion').val(rowData.IdTipoInstitucion);
            $('#txtConceptoPago').val(rowData.ConceptoPago);
            $('#txtMonto').val(rowData.Monto);
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
        IdIngresoEco: id,
        Estado: true,
        iOps: 1
    };
    $.ajaxCall(urlApp + '/ingresoeconomicoController/fnGetingresoeconomicoBean.htm', {poJsonItem: oItem}, false, function (rowData) {
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
            IdIngresoEco: rowData.IdIngresoEco,
            NumBoleta: rowData.NumBoleta,
            FechaPago: rowData.FechaPago,
            IdParticipante: rowData.IdParticipante,
            IdTipoInstitucion: rowData.IdTipoInstitucion,
            ConceptoPago: rowData.ConceptoPago,
            Monto: rowData.Monto,
            Observacion: rowData.Observacion,
            Estado: false
        };
        $.ajaxCall(urlApp + '/ingresoeconomicoController/fnEliminaringresoeconomicoBean.htm', {poJsonItem: oItem}, false, function (response) {
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
                NumBoleta: $('#txtNumBoleta').val(),
                FechaPago: $('#txtFechaPago').val(),
                IdParticipante: $('#txtIdParticipante').val(),
                IdTipoInstitucion: $('#txtIdTipoInstitucion').val(),
                ConceptoPago: $('#txtConceptoPago').val(),
                Monto: $('#txtMonto').val(),
                Observacion: $('#txtObservacion').val()
            };
            $.ajaxCall(urlApp + '/ingresoeconomicoController/fnInsertaringresoeconomicoBean.htm', {poJsonItem: oItem}, false, function (response) {
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
                IdIngresoEco: $('#_ingresoeconomico').data('IdIngresoEco'),
                NumBoleta: $('#txtNumBoleta').val(),
                FechaPago: $('#txtFechaPago').val(),
                IdParticipante: $('#txtIdParticipante').val(),
                IdTipoInstitucion: $('#txtIdTipoInstitucion').val(),
                ConceptoPago: $('#txtConceptoPago').val(),
                Monto: $('#txtMonto').val(),
                Observacion: $('#txtObservacion').val(),
                Estado: true
            };
            $.ajaxCall(urlApp + '/ingresoeconomicoController/fnActualizaringresoeconomicoBean.htm', {poJsonItem: oItem}, false, function (response) {
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
