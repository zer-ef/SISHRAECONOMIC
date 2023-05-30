<%-- 
    Document   : Login
    Created on : 11/11/2017, 02:39:33 PM
    Author     : Grimaldo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <meta charset="utf-8" />
        <title>Login - HRA</title>
        <meta name="description" content="User login page" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />        
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/bootstrap.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/font-awesome/4.2.0/css/font-awesome.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/fonts/fonts.googleapis.com.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/ace.min.css" />       
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/ace-rtl.min.css" />	
        <script>
            var urlApp = '${pageContext.request.contextPath}';
        </script>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/componentes/img/hospital.ico">
    </head>

    <body class="login-box">
        <div class="main-container">
            <div class="main-content">
                <div class="row">
                    <div class="col-sm-10 col-sm-offset-1">
                        <div class="login-container">
                            <div class="center">
                                <h1>
                                    <i class="ace-icon fa fa-home green"></i>
                                    <span class="red">HRA</span>
                                    <span class="white" id="id-text2">Application</span>
                                </h1>
                                <h4 class="light-blue" id="id-company-text">&copy; Hospital Regional de Ayacucho</h4>
                            </div>

                            <div class="space-6"></div>

                            <div class="position-relative">
                                <div id="login-box" class="login-box visible widget-box no-border">
                                    <div class="widget-body">
                                        <div class="widget-main">
                                            <h4 class="header blue lighter bigger">
                                                <i class="ace-icon fa fa-user danger"></i>
                                                Introduzca su información
                                            </h4>

                                            <div class="space-6"></div>

                                            <form>
                                                <fieldset>
                                                    <label class="block clearfix">
                                                        <span class="block input-icon input-icon-right">
                                                            <i class="ace-icon fa fa-user"></i>
                                                            <input id="txtUsuario" type="text" class="form-control" placeholder="Usuario" obligatorio/>

                                                        </span>
                                                    </label>

                                                    <label class="block clearfix">
                                                        <span class="block input-icon input-icon-right">
                                                            <i class="ace-icon fa fa-lock"></i>
                                                            <input id="txtPassword" type="password" class="form-control" placeholder="Password" obligatorio/>

                                                        </span>
                                                    </label>

                                                    <div class="space">

                                                    </div>
                                                    <div class="clearfix">                                                        
                                                        <button id="btnLogin" type="button" class="width-35 pull-right btn btn-sm btn-danger">
                                                            <i class="ace-icon fa fa-key"></i>
                                                            <span class="bigger-110">Login</span>
                                                        </button>
                                                    </div>                                                  

                                                    <div class="space-4"></div>
                                                </fieldset>
                                            </form>

                                            <div class="social-or-login center">
                                                <span class="bigger-110">Or Login Using</span>
                                            </div>
                                            <div class="space-6"></div>
                                            <div class="social-login center">
                                                <a href="https://www.facebook.com/HOSPITALAREGIONALDEAYACUCHO/" class="btn btn-primary">
                                                    <i class="ace-icon fa fa-facebook"></i>
                                                </a>

                                                <a class="btn btn-info">
                                                    <i class="ace-icon fa fa-twitter"></i>
                                                </a>

                                                <a class="btn btn-danger">
                                                    <i class="ace-icon fa fa-google-plus"></i>
                                                </a>
                                            </div>

                                        </div><!-- /.widget-main -->

                                        <div class="toolbar clearfix">


                                            <div>
                                                <a href="#"  class="user-signup-link">

                                                    <i class="ace-icon fa fa-arrow-right"></i>
                                                </a>
                                                <!--   <a href="#" data-target="#signup-box" class="user-signup-link">
                                                       Quiero registrarme
                                                       <i class="ace-icon fa fa-arrow-right"></i>
                                                   </a>-->
                                            </div>
                                        </div>
                                    </div><!-- /.widget-body -->
                                </div><!-- /.login-box -->                          


                            </div><!-- /.position-relative -->                            
                        </div>
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.main-content -->
        </div><!-- /.main-container -->
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.2.1.1.min.js"></script>
        <script type="text/javascript">
            window.jQuery || document.write("<script src='assets/js/jquery.min.js'>" + "<" + "/script>");
        </script>
        <script type="text/javascript">
            if ('ontouchstart' in document.documentElement)
                document.write("<script src='assets/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
        </script>
        <script src="${pageContext.request.contextPath}/componentes/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery-ui.custom.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery-ui-1.10.4.custom.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/bootbox.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/lib/app.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/lib/mensajes.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/lib/validator.js" type="text/javascript"></script>
        <script type="text/javascript">
            jQuery(function ($) {
                $(document).on('click', '.toolbar a[data-target]', function (e) {
                    e.preventDefault();
                    var target = $(this).data('target');
                    $('.widget-box.visible').removeClass('visible');//hide others
                    $(target).addClass('visible');//show target
                });
            });

            jQuery(function ($) {
                $("#btnLogin").click(function () {
                    var resulValidacion = 0;
                    resulValidacion = $.ValidarData('#login-box');
                    switch (resulValidacion) {
                        case 0:
                            var oUsuario = {
                                iOps: 4, //referencia get Usuario
                                NombUsuario: $('#txtUsuario').val(),
                                Contrasenia: $('#txtPassword').val()
                            };
                            LoginAdmin(oUsuario);
                            break;
                        case -1:
                            bootbox.alert(Mensajes.camposRequeridos);
                            break;
                        case -2:
                            bootbox.alert(Mensajes.camposIncorrectos);
                            break;
                    }
                });
            });

            function LoginAdmin(oItem) {
                $.ajaxCall(urlApp + '/usuarioController/fnGetusuarioBean.htm', {poJsonItem: oItem}, false, function (rowData) {
                    if (rowData !== null) {
                        if (rowData.IdTipoUsuario === 1 || rowData.IdTipoUsuario === 2) {
                            $(window).attr('location', urlApp + '/vistas/Index.jsp');
                        }
                        if (rowData.IdTipoUsuario === 3) {
                            $(window).attr('location', urlApp + '/vistas/PanelAdmin.jsp');
                        }
                    } else {
                        bootbox.alert(Mensajes.operacionErronea);
                    }
                });
            }

        </script>
    </body>
</html>
