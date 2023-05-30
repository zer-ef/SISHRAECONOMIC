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
    $("#title").html("Administración de practicante");
    $("#title1").html("Administración de practicante");

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
    var oItem = {
        Estado: true,
        iOps: 2
    };
    $.CargarCombo(urlApp + '/institucionController/fnGetListinstitucionBean.htm', {poJsonItem: oItem}, '#txtIdInstitucion');
}
function ConstruirAutocomplete() {
    $("#txtItemAutocomplete").AutocompleteWithPobject(urlApp + "/practicanteController/fnAutocompletepracticanteBean.htm", {poJsonItem: $('#txtItemAutocomplete').val()}, "#txtItemAutocomplete", 200,
            function (item) {
                console.log(item);
                return {
                    label: item.IdPersona
                }
            },
            function (event, ui) {
                $('#txtItemAutocomplete').focus();
                $('#txtItemAutocomplete').val(ui.item.label);
            });
}
function ConstruirGrid() {
    $.ajaxCall(urlApp + '/practicanteController/fnGridpracticanteBean.htm', {poJsonItem: {iOps: 6, Estado: true}}, false, function (response) {
        oTable.fnClearTable();
        $.each(response, function (i, dat) {
            oTable.fnAddData(['<a class="btn btn-info" href="javascript:FnSelEditGrid(' + dat[0] + ');"><i class="glyphicon glyphicon-edit icon-white"></i>Editar</a>', '<a class="btn btn-danger" href="javascript:FnSelDelGrid(' + dat[0] + ');"><i class="glyphicon glyphicon-trash icon-white"></i>Eliminar</a>', dat[2], dat[4], dat[5], dat[6], dat[7], dat[8], dat[9], dat[10]]);
        });
    });
}
function FnSelEditGrid(id) {
    var oItem = {
        IdPracticante: id,
        Estado: true,
        iOps: 1
    };
    $.ajaxCall(urlApp + '/practicanteController/fnGetpracticanteBean.htm', {poJsonItem: oItem}, false, function (rowData) {
        if (rowData !== null) {
            $('#_practicante').data('IdPracticante', rowData.IdPracticante);
            $("#_practicante").data("IdPersona", rowData.IdPersona);
            /*$('#txtIdPersona').val(rowData.IdPersona);*/

            $('#txtNombre').val(rowData.Nombre);
            $('#txtApePaterno').val(rowData.ApePaterno);
            $('#txtApeMaterno').val(rowData.ApeMaterno);
            $('#txtNumDocumento').val(rowData.NumDocumento);
            $('#txtTeleMovil').val(rowData.TeleMovil);
            $('#txtEmail').val(rowData.Email);
            $('#txtDireccion').val(rowData.Direccion);

            $('#txtIdInstitucion').val(rowData.IdInstitucion);
            $('#txtCarreraProfesional').val(rowData.CarreraProfesional);
            $('#txtFechaInicio').val(rowData.FechaInicio);
            $('#txtFechaTernino').val(rowData.FechaTernino);
            $('#txtModulo').val(rowData.Modulo);
            $('#txtHorarioPractica').val(rowData.HorarioPractica);
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
        IdPracticante: id,
        Estado: true,
        iOps: 1
    };
    $.ajaxCall(urlApp + '/practicanteController/fnGetpracticanteBean.htm', {poJsonItem: oItem}, false, function (rowData) {
        if (rowData !== null) {
            eliminar(rowData);
        } else {
            bootbox.alert("Ocurrio un Error Inesperado");
        }
    });
}
function eliminar(rowData) {
    var eliminar = function () {
        var oItemPersona = {
            iOps: 1,
            IdPersona: rowData.IdPersona,
            Nombre: rowData.Nombre,
            ApePaterno: rowData.ApePaterno,
            ApeMaterno: rowData.ApeMaterno,
            NumDocumento: rowData.NumDocumento,
            TeleMovil: rowData.TeleMovil,
            Email: rowData.Email,
            Direccion: rowData.Direccion,
            Estado: false

        };
        var oItemPracticante = {
            IdPracticante: rowData.IdPracticante,
            IdPersona: rowData.IdPersona,
            IdInstitucion: rowData.IdInstitucion,
            CarreraProfesional: rowData.CarreraProfesional,
            FechaInicio: rowData.FechaInicio,
            FechaTernino: rowData.FechaTernino,
            Modulo: rowData.Modulo,
            HorarioPractica: rowData.HorarioPractica,
            Estado: false
        };
        $.ajaxCall(urlApp + '/practicanteController/fnEliminarpracticanteBean.htm', {
            poJsonItemPersona: oItemPersona,
            poJsonItemPreacticante: oItemPracticante
        }, false, function (response) {
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
            var oItemPersona = {
                iOps: 1,
                Nombre: $('#txtNombre').val(),
                ApePaterno: $('#txtApePaterno').val(),
                ApeMaterno: $('#txtApeMaterno').val(),
                NumDocumento: $('#txtNumDocumento').val(),
                TeleMovil: $('#txtTeleMovil').val(),
                Email: $('#txtEmail').val(),
                Direccion: $('#txtDireccion').val()
            };
            var oItemPracticante = {
                IdInstitucion: $('#txtIdInstitucion').val(),
                CarreraProfesional: $('#txtCarreraProfesional').val(),
                FechaInicio: $('#txtFechaInicio').val(),
                FechaTernino: $('#txtFechaTernino').val(),
                Modulo: $('#txtModulo').val(),
                HorarioPractica: $('#txtHorarioPractica').val()
            };
            $.ajaxCall(urlApp + '/practicanteController/fnInsertarpracticanteBean.htm', {
                poJsonItemPersona: oItemPersona,
                poJsonItemPreacticante: oItemPracticante
            }, false, function (response) {
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
            var oItemPersona = {
                iOps: 1,
                IdPersona: $('#_practicante').data('IdPersona'),
                Nombre: $('#txtNombre').val(),
                ApePaterno: $('#txtApePaterno').val(),
                ApeMaterno: $('#txtApeMaterno').val(),
                NumDocumento: $('#txtNumDocumento').val(),
                TeleMovil: $('#txtTeleMovil').val(),
                Email: $('#txtEmail').val(),
                Direccion: $('#txtDireccion').val(),
                Estado: true
            };
            var oItemPracticante = {
                IdPracticante: $('#_practicante').data('IdPracticante'),
                IdPersona: $('#_practicante').data('IdPersona'),
                IdInstitucion: $('#txtIdInstitucion').val(),
                CarreraProfesional: $('#txtCarreraProfesional').val(),
                FechaInicio: $('#txtFechaInicio').val(),
                FechaTernino: $('#txtFechaTernino').val(),
                Modulo: $('#txtModulo').val(),
                HorarioPractica: $('#txtHorarioPractica').val(),
                Estado: true
            };
            $.ajaxCall(urlApp + '/practicanteController/fnActualizarpracticanteBean.htm', {
                poJsonItemPersona: oItemPersona,
                poJsonItemPreacticante: oItemPracticante
            }, false, function (response) {
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
