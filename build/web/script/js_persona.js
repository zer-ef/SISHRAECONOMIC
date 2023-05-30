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
    $("#title").html("Administración de persona");
    $("#title1").html("Administración de persona");
}
function initDropDownList() {
    $.CargarCombo(urlApp + '/personaController/fnGetListpersonaBean.htm', {poJsonItem: {}}, '#drpItem');
}
function ConstruirAutocomplete() {
    $("#txtItemAutocomplete").AutocompleteWithPobject(urlApp + "/personaController/fnAutocompletepersonaBean.htm", {poJsonItem: $('#txtItemAutocomplete').val()}, "#txtItemAutocomplete", 200,
            function (item) {
                console.log(item);
                return {
                    label: item.Nombre
                }
            },
            function (event, ui) {
                $('#txtItemAutocomplete').focus();
                $('#txtItemAutocomplete').val(ui.item.label);
            });
}
function ConstruirGrid() {
    $.ajaxCall(urlApp + '/personaController/fnGridpersonaBean.htm', {poJsonItem: {iOps: 6, Estado: true}}, false, function (response) {
        oTable.fnClearTable();
        $.each(response, function (i, dat) {
            oTable.fnAddData(['<a class="btn btn-info" href="javascript:FnSelEditGrid(' + dat[0] + ');"><i class="glyphicon glyphicon-edit icon-white"></i>Editar</a>', '<a class="btn btn-danger" href="javascript:FnSelDelGrid(' + dat[0] + ');"><i class="glyphicon glyphicon-trash icon-white"></i>Eliminar</a>', dat[1], dat[2], dat[3], dat[4], dat[5], dat[6], dat[7], dat[8], dat[9], dat[10]]);
        });
    });
}
function FnSelEditGrid(id) {
    var oItem = {
        IdPersona: id,
        Estado: true,
        iOps: 1
    };
    $.ajaxCall(urlApp + '/personaController/fnGetpersonaBean.htm', {poJsonItem: oItem}, false, function (rowData) {
        if (rowData !== null) {
            $('#_persona').data('IdPersona', rowData.IdPersona);
            $('#txtNombre').val(rowData.Nombre);
            $('#txtApePaterno').val(rowData.ApePaterno);
            $('#txtApeMaterno').val(rowData.ApeMaterno);
            $('#txtNumDocumento').val(rowData.NumDocumento);
            $('#txtTeleMovil').val(rowData.TeleMovil);
            $('#txtEmail').val(rowData.Email);
            $('#txtDireccion').val(rowData.Direccion);
            $('#txtFechRegistra').val(rowData.FechRegistra);
            $('#txtFechModifica').val(rowData.FechModifica);
            $('#txtEstado').val(rowData.Estado);
            $("#btnNuevo").text('Actualizar');
            $.HabilitarForm('#form');
        } else {
            bootbox.alert("Ocurrio un Error Inesperado");
        }
    });
}
function FnSelDelGrid(id) {
    var oItem = {
        IdPersona: id,
        Estado: true,
        iOps: 1
    };
    $.ajaxCall(urlApp + '/personaController/fnGetpersonaBean.htm', {poJsonItem: oItem}, false, function (rowData) {
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
            IdPersona: rowData.IdPersona,
            Nombre: rowData.Nombre,
            ApePaterno: rowData.ApePaterno,
            ApeMaterno: rowData.ApeMaterno,
            NumDocumento: rowData.NumDocumento,
            TeleMovil: rowData.TeleMovil,
            Email: rowData.Email,
            Direccion: rowData.Direccion,
            FechRegistra: rowData.FechRegistra,
            FechModifica: rowData.FechModifica,
            Estado: false
        };
        $.ajaxCall(urlApp + '/personaController/fnEliminarpersonaBean.htm', {poJsonItem: oItem}, false, function (response) {
            if (response > 0) {
                bootbox.alert(Mensajes.operacionCorrecta);
                $("#btnNuevo").text('Nuevo');
                $.DesabilitarForm('#form');
                $.LimpiarForm('#form');
                ConstruirGrid();
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
                Nombre: $('#txtNombre').val(),
                ApePaterno: $('#txtApePaterno').val(),
                ApeMaterno: $('#txtApeMaterno').val(),
                NumDocumento: $('#txtNumDocumento').val(),
                TeleMovil: $('#txtTeleMovil').val(),
                Email: $('#txtEmail').val(),
                Direccion: $('#txtDireccion').val(),
                FechRegistra: $('#txtFechRegistra').val(),
                FechModifica: $('#txtFechModifica').val(),
                Estado: $('#txtEstado').val()
            };
            $.ajaxCall(urlApp + '/personaController/fnInsertarpersonaBean.htm', {poJsonItem: oItem}, false, function (response) {
                if (response > 0) {
                    bootbox.alert(Mensajes.operacionCorrecta);
                    $("#btnNuevo").text('Nuevo');
                    $.DesabilitarForm('#form');
                    $.LimpiarForm('#form');
                    ConstruirGrid();
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
                IdPersona: $('#_persona').data('IdPersona'),
                Nombre: $('#txtNombre').val(),
                ApePaterno: $('#txtApePaterno').val(),
                ApeMaterno: $('#txtApeMaterno').val(),
                NumDocumento: $('#txtNumDocumento').val(),
                TeleMovil: $('#txtTeleMovil').val(),
                Email: $('#txtEmail').val(),
                Direccion: $('#txtDireccion').val(),
                FechRegistra: $('#txtFechRegistra').val(),
                FechModifica: $('#txtFechModifica').val(),
                Estado: $('#txtEstado').val()
            };
            $.ajaxCall(urlApp + '/personaController/fnActualizarpersonaBean.htm', {poJsonItem: oItem}, false, function (response) {
                if (response > 0) {
                    bootbox.alert(Mensajes.operacionCorrecta);
                    $("#btnNuevo").text('Nuevo');
                    $.DesabilitarForm('#form');
                    $.LimpiarForm('#form');
                    ConstruirGrid();
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
