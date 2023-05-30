jQuery.ajaxCall = function(purl, pdata, pAsync, psuccess) {
    $.ajax({
        type: "POST",
        url: purl,
        data: JSON.stringify(pdata),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        async: pAsync,
        success: psuccess,
        error: function(a, b, c) {

            console.log(jQuery.parseJSON(a.responseText).Message, location.href, purl, "");
        }
    });
};
jQuery.CargarCombo = function(purl, pdata, pDropDownList) {
    $(pDropDownList).html('');
    $.ajaxCall(purl, pdata, false, function(response) {
        $(pDropDownList).append('<option value="0" >SELECCIONE</option>');
        $.each(response, function(i, dat) {
            $(pDropDownList).append('<option value="' + dat[0] + '" title="' + dat[1] + '">' + dat[1] + '</option>');
        });
    });
}

jQuery.fn.Autocomplete = function(purl, pTextBoxControl, pWidth, pFunctionItem, pFunctionSelect) {
    $(pTextBoxControl).autocomplete({
        source: function(request, response) {
            var param = new Object();
            param.pnvDenominacion = request.term;
            $.ajaxCall(purl, param, true, function(respon) {
                var data = (typeof respon) == 'string' ? eval('(' + respon + ')') : respon;
                if (data != null) {
                    response($.map(data, pFunctionItem));
                }
            });
        },
        open: function(event, ui) {
            $(this).autocomplete("widget").css({
                "width": pWidth
            });
        },
        select: pFunctionSelect
    });
}
jQuery.fn.AutocompleteWithPobject = function(purl, pObject, pTextBoxControl, pWidth, pFunctionItem, pFunctionSelect) {
    $(pTextBoxControl).autocomplete({
        source: function(request, response) {
//  var pObject = GetObject();

            var param = {
                pObject: pObject,
                pnvDenominacion: request.term
            }

            $.ajaxCall(purl, param, true, function(respon) {
                var data = respon;//(typeof respon.d) == 'string' ? eval('(' + respon.d + ')') : respon.d;
                if (data != null) {
                    response($.map(data, pFunctionItem));
                }
            });
        },
        open: function(event, ui) {
            $(this).autocomplete("widget").css({
                "width": pWidth
            });
        },
        select: pFunctionSelect
    });
}

//************FUNCIONES CALENDARIO
jQuery.Calendario = function(control, mask) {
    $(control).datepicker({
        changeMonth: true,
        changeYear: true,
        autoSize: false,
        inline: true,
        showButtonPanel: true,
        dateFormat: 'dd/mm/yy',
        dayNames: ["Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"],
        dayNamesMin: ["Do", "Lu", "Ma", "Mi", "Ju", "Vi", "Sa"],
        dayNamesShort: ["Dom", "Lun", "Mar", "Mie", "Jue", "Vie", "Sab"],
        monthNames: ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"],
        monthNamesShort: ["Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Set", "Oct", "Nov", "Dic"],
        closeText: "Salir",
        currentText: "Hoy",
        nextText: "Siguiente",
        prevText: "Anterior"

    });
    $(control).datepicker($.datepicker.regional['es']);
    if (mask != undefined)
        $(control).mask("   99/99/9999");
};
jQuery.LimpiarFormulario = function(pNameForm) {
    var form = $("#" + pNameForm);
    $(":input", form).each(function() {
        var type = this.type;
        var tag = this.tagName.toLowerCase();
        if (type == "text" || type == "password" || tag == "textarea")
            this.value = "";
        else if (type == "checkbox" || type == "radio")
            this.checked = false;
        else if (tag == 'select')
            this.selectedIndex = -1;
    });
}

jQuery.DesabilitarForm = function(pNameForm) {
    var form = "#" + pNameForm;
    $(form + " :input").each(function() {
        var type = this.type;
        var tag = this.tagName.toLowerCase();
        if (type == "text" || type == "password" || tag == "textarea")
            this.disabled = true;
        else if (type == "checkbox" || type == "radio")
            this.disabled = true;
        else if (tag == 'select')
            this.disabled = true;
    });
}

jQuery.HabilitarFormulario = function(pNameForm) {
    var form = "#" + pNameForm;
    $(form + " :input").each(function() {
        var type = this.type;
        var tag = this.tagName.toLowerCase();
        if (type == "text" || type == "password" || tag == "textarea")
            this.disabled = false;
        else if (type == "checkbox" || type == "radio")
            this.disabled = false;
        else if (tag == 'select')
            this.disabled = false;
    });
}

jQuery.Preloading = function() {
//$('#div_precarga').hide().ajaxStart(function () {
    $('#div_precarga').ajaxStart(function() {
        $(this).show();
    }).ajaxStop(function() {
        $(this).hide();
    });
}


//funcion para establecer una hora
//FUNCION PARA LA CARGA DE ARCHIVOS
jQuery.time = function(idtxtTime) {
    $(idtxtTime).timepickr();
    /*Para ver la documentacion de estos velores
     http://code.google.com/p/jquery-utils/wiki/UiTimepickr
     */
}


jQuery.alertConfirm = function(title, functionSi, functionNO) {

    if (confirm(title)) {
        functionSi()
    }
    else {
        functionNO()
    }
}
//generar numero unico
function fGetNumUnico() {
    var Dia = new Date();
    var d = Dia.getDay();
    var n = Dia.getMonth();
    var a = Dia.getFullYear();
    var m = Dia.getMinutes();
    var h = Dia.getHours();
    var s = Dia.getSeconds();
    var Num = "" + a + n + d + h + m + s;
    return parseInt(Num);
}
function limpiarForm(div) {
//$(div + ' textarea').css({ 'background': '' });
    $(div + ' textarea').each(function() {
        $(this).val('');
    });
    //$(div + ' select').css({ 'background': '' });
    $(div + ' select').each(function() {
        $(this).selectedIndex = 0;
    });
    $(div + ' input').each(function() {
        $(this).val('');
        $(this).prop('checked', false)
    });
}

/*Inicio llenar con ceros a la izquierda*/
/*Permite rellenar con ceros a la izquierda de un numero, util para codigos de contribuyente,etc*/
jQuery.LlenarCerosIzquierda = function(pNumber, pLen) {
    pNumber = pNumber.toString();
    while (pNumber.length < pLen)
        pNumber = "0" + pNumber;
    return pNumber;
}
/*Fin llenar con ceros a la izquierda*/

/*Permite validar hora funciona con blur*/
jQuery.ValidarHora = function(control) {
    $(control).removeClass("error");
    var userInput = $(control).val().replace(/^([0-9])([0-9]):([0-9])_$/, "0$1:$2$3");
    if (!userInput.match(/([0-1][0-9]|2[0-3]):[0-5][0-9]/)) {
        $(control).val("");
        $(control).addClass("error");
    } else {
        $(control).val(userInput);
        return true;
    }
    ;
}
function  getDateNow() {
    var tdate = new Date();
    var dd = tdate.getDate(); //yields day
    var MM = tdate.getMonth(); //yields month
    var yyyy = tdate.getFullYear(); //yields year
    var now = dd + "/" + (MM + 1) + "/" + yyyy;
    return now;
}

function getFormatDate(itemDate) {
    return itemDate.split("-").reverse().join("/");
}

