var arrayScript = new Array();
function cargarJS(url) {
    var newscript = document.createElement('script');
    newscript.type = 'text/javascript';
    newscript.async = false;
    newscript.id = arrayScript.length + 1;
    newscript.src = url;
    (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(newscript);
    arrayScript.push(arrayScript.length + 1);
}
function removeFilesLoad() {
    $.each(arrayScript, function (key, value) {
        $("#" + value).remove();
    });
    arrayScript = [];
}
function cargarPaginaFunction(idDiv, href, fn) {
    $('body').addClass("loading");
    $("#" + idDiv).empty();
    $("#" + idDiv).load(href, function () {
        fn();
        $('body').removeClass("loading");
    });
}
function cargarPagina(idDiv, href) {
    $('body').addClass("loading");
    $("#" + idDiv).empty();
    $("#" + idDiv).load(href, function () {
        $('body').removeClass("loading");
    });
}
$("#vista_1").click(function (evento) {
    removeFilesLoad();
    var funtionCallJS = function () {
        cargarJS(urlApp + '/componentes/js/lib/validator.js');
        cargarJS(urlApp + '/script/js_area.js');
    };
    cargarPaginaFunction('_contenido', urlApp + '/vistas/vista_area.jsp', funtionCallJS);
});


$("#vista_2").click(function (evento) {
    removeFilesLoad();
    var funtionCallJS = function () {
        cargarJS(urlApp + '/componentes/js/lib/validator.js');
        cargarJS(urlApp + '/script/js_documentoingresado.js');
    };
    cargarPaginaFunction('_contenido', urlApp + '/vistas/vista_documentoingresado.jsp', funtionCallJS);
});


$("#vista_3").click(function (evento) {
    removeFilesLoad();
    var funtionCallJS = function () {
        cargarJS(urlApp + '/componentes/js/lib/validator.js');
        cargarJS(urlApp + '/script/js_ingresoeconomico.js');
    };
    cargarPaginaFunction('_contenido', urlApp + '/vistas/vista_ingresoeconomico.jsp', funtionCallJS);
});


$("#vista_4").click(function (evento) {
    removeFilesLoad();
    var funtionCallJS = function () {
        cargarJS(urlApp + '/componentes/js/lib/validator.js');
        cargarJS(urlApp + '/script/js_institucion.js');
    };
    cargarPaginaFunction('_contenido', urlApp + '/vistas/vista_institucion.jsp', funtionCallJS);
});


$("#vista_5").click(function (evento) {
    removeFilesLoad();
    var funtionCallJS = function () {
        cargarJS(urlApp + '/componentes/js/lib/validator.js');
        cargarJS(urlApp + '/script/js_interno.js');
    };
    cargarPaginaFunction('_contenido', urlApp + '/vistas/vista_interno.jsp', funtionCallJS);
});


$("#vista_6").click(function (evento) {
    removeFilesLoad();
    var funtionCallJS = function () {
        cargarJS(urlApp + '/componentes/js/lib/validator.js');
        cargarJS(urlApp + '/script/js_medicoprofesional.js');
    };
    cargarPaginaFunction('_contenido', urlApp + '/vistas/vista_medicoprofesional.jsp', funtionCallJS);
});


$("#vista_7").click(function (evento) {
    removeFilesLoad();
    var funtionCallJS = function () {
        cargarJS(urlApp + '/componentes/js/lib/validator.js');
        cargarJS(urlApp + '/script/js_persona.js');
    };
    cargarPaginaFunction('_contenido', urlApp + '/vistas/vista_persona.jsp', funtionCallJS);
});


$("#vista_8").click(function (evento) {
    removeFilesLoad();
    var funtionCallJS = function () {
        cargarJS(urlApp + '/componentes/js/lib/validator.js');
        cargarJS(urlApp + '/script/js_personaladministrativo.js');
    };
    cargarPaginaFunction('_contenido', urlApp + '/vistas/vista_personaladministrativo.jsp', funtionCallJS);
});


$("#vista_9").click(function (evento) {
    removeFilesLoad();
    var funtionCallJS = function () {
        cargarJS(urlApp + '/componentes/js/lib/validator.js');
        cargarJS(urlApp + '/script/js_practicante.js');
    };
    cargarPaginaFunction('_contenido', urlApp + '/vistas/vista_practicante.jsp', funtionCallJS);
});


$("#vista_10").click(function (evento) {
    removeFilesLoad();
    var funtionCallJS = function () {
        cargarJS(urlApp + '/componentes/js/lib/validator.js');
        cargarJS(urlApp + '/script/js_tipodocumento.js');
    };
    cargarPaginaFunction('_contenido', urlApp + '/vistas/vista_tipodocumento.jsp', funtionCallJS);
});


$("#vista_11").click(function (evento) {
    removeFilesLoad();
    var funtionCallJS = function () {
        cargarJS(urlApp + '/componentes/js/lib/validator.js');
        cargarJS(urlApp + '/script/js_tipoinstitucion.js');
    };
    cargarPaginaFunction('_contenido', urlApp + '/vistas/vista_tipoinstitucion.jsp', funtionCallJS);
});


$("#vista_12").click(function (evento) {
    removeFilesLoad();
    var funtionCallJS = function () {
        cargarJS(urlApp + '/componentes/js/lib/validator.js');
        cargarJS(urlApp + '/script/js_tipousuario.js');
    };
    cargarPaginaFunction('_contenido', urlApp + '/vistas/vista_tipousuario.jsp', funtionCallJS);
});


$("#vista_13").click(function (evento) {
    removeFilesLoad();
    var funtionCallJS = function () {
        cargarJS(urlApp + '/componentes/js/lib/validator.js');
        cargarJS(urlApp + '/script/js_usuario.js');
    };
    cargarPaginaFunction('_contenido', urlApp + '/vistas/vista_usuario.jsp', funtionCallJS);
});


