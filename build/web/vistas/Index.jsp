<%-- 
    Document   : Index
    Created on : 05/01/2018, 02:40:40 PM
    Author     : Grimaldo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>       
        <meta charset="utf-8" />
        <title>Hospital Regional Ayacucho</title>      
        <!-- bootstrap & fontawesome -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/bootstrap.min.css" type="text/css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/font-awesome/4.2.0/css/font-awesome.min.css" type="text/css"/>        
        <!-- page specific plugin styles -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/jquery-ui.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/datepicker.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/ui.jqgrid.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/fullcalendar.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/dropzone.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/bootstrap-duallistbox.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/bootstrap-multiselect.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/select2.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/jquery-ui.custom.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/chosen.min.css" type="text/css"/>	
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/bootstrap-timepicker.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/daterangepicker.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/bootstrap-datetimepicker.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/colorpicker.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/colorbox.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/jquery.gritter.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/datepicker.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/bootstrap-editable.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/prettify.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/js/datatables/jquery.dataTables.css" type="text/css"/>
        <!-- text fonts -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/fonts/fonts.googleapis.com.css" type="text/css"/>
        <!-- ace styles -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/componentes/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" type="text/css"/>
        <!-- ace settings handler -->
        <script src="${pageContext.request.contextPath}/componentes/js/ace-extra.min.js"></script>     
        <script>
            var urlApp = '${pageContext.request.contextPath}';
        </script>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/componentes/img/hospital.ico">
    </head>
    <body class="no-skin">
        <div id="navbar" class="navbar navbar-default">
            <script type="text/javascript">
                try {
                    ace.settings.check('navbar', 'fixed')
                } catch (e) {
                }
            </script>

            <div class="navbar-container" id="navbar-container">
                <button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="javascript:void(0);sidebar">
                    <span class="sr-only"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>

                <div class="navbar-header pull-left">
                    <a href="${pageContext.request.contextPath}/vistas/Index.jsp" class="navbar-brand">
                        <small>
                            <i class="fa fa-home"></i>
                            Hospital Regional Ayacucho
                        </small>
                    </a>
                </div>                        
                <div class="navbar-buttons navbar-header pull-right" role="navigation">
                    <ul class="nav ace-nav">
                        <!-- Ini Paginas de Template Bootstrap -->

                        <!-- End Paginas de Template Bootstrap -->
                        <li class="light-blue">
                            <a data-toggle="dropdown" href="javascript:void(0);" class="dropdown-toggle">
                                <img class="nav-user-photo" src="${pageContext.request.contextPath}/componentes/avatars/avatar2.png" alt="Usuario" />
                                <span class="user-info">
                                    <small>Bienvenido,</small>
                                    <p id="Currentuser">Hospiatl Regional</p>
                                </span>
                                <i class="ace-icon fa fa-caret-down"></i>
                            </a>
                            <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                                <li>
                                    <a href="javascript:void(0);">
                                        <i class="ace-icon fa fa-cog"></i>
                                        Configuracion
                                    </a>
                                </li>

                                <li>
                                    <a id="Item100" href="javascript:void(0);">
                                        <i class="ace-icon fa fa-user"></i>
                                        Perfil
                                    </a>
                                </li>

                                <li class="divider"></li>

                                <li>
                                    <a id="btnCerrarSession" href="javascript:void(0);">
                                        <i class="ace-icon fa fa-power-off"></i>
                                        Cerrar Session
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>                
            </div><!-- /.navbar-container -->
        </div>

        <div class="main-container" id="main-container">
            <script type="text/javascript">
                try {
                    ace.settings.check('main-container', 'fixed')
                } catch (e) {
                }
            </script>

            <div id="sidebar" class="sidebar responsive">
                <script type="text/javascript">
                    try {
                        ace.settings.check('sidebar', 'fixed')
                    } catch (e) {
                    }
                </script>
                <ul id="ltsElementos" class="nav nav-list">
                    <li class="">
                        <a href="${pageContext.request.contextPath}/vistas/Index.jsp">
                            <i class="menu-icon fa fa-tachometer"></i>
                            <span class="menu-text"> Modulos </span>
                        </a>

                        <b class="arrow"></b>
                    </li>                  

                    <li value="1" class="activOpen">
                        <a href="javascript:void(0);" class="dropdown-toggle">
                            <i class="menu-icon fa fa-user"></i>
                            <span class="menu-text"> Personal 
                                <span class="badge badge-primary">4</span>
                            </span>
                            <b class="arrow fa fa-angle-down"></b>
                        </a>
                        <b class="arrow"></b>
                        <ul class="submenu">  
                            <li class="activItem">
                                <a id="vista_5" href="javascript:void(0);">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    Internos
                                </a>
                                <b class="arrow"></b>
                            </li>
                            <li class="activItem">
                                <a id="vista_9" href="javascript:void(0);">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    Practicantes
                                </a>
                                <b class="arrow"></b>
                            </li>
                            <li class="activItem">
                                <a id="vista_6" href="javascript:void(0);">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    Profesiones del HRA
                                </a>
                                <b class="arrow"></b>
                            </li>
                            <li class="activItem">
                                <a id="vista_8#" href="javascript:void(0);">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    Personal Administrativo
                                </a>
                                <b class="arrow"></b>
                            </li>
                        </ul>
                    </li> 

                    <li  value="3"  class="activOpen">
                        <a href="javascript:void(0);" class="dropdown-toggle">
                            <i class="menu-icon fa  fa-eye"></i>
                            <span class="menu-text">
                                Maestros 
                                <span class="badge badge-primary">1</span>
                            </span>
                            <b class="arrow fa fa-angle-down"></b>
                        </a>
                        <b class="arrow"></b>
                        <ul class="submenu">
                            <li  class="activItem">
                                <a id="vista_4" href="javascript:void(0);">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    Institucion
                                </a>
                                <b class="arrow"></b>
                            </li>
                        </ul>
                    </li>

                    <li  value="4"  class="activOpen">
                        <a href="javascript:void(0);" class="dropdown-toggle">
                            <i class="menu-icon fa fa-credit-card"></i>
                            <span class="menu-text">
                                HRA
                                <span class="badge badge-primary">3</span>
                            </span>
                            <b class="arrow fa fa-angle-down"></b>
                        </a>
                        <b class="arrow"></b>
                        <ul class="submenu">                   
                            <li class="activItem">
                                <a id="vista_1" href="javascript:void(0);">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    Area
                                </a>
                                <b class="arrow"></b>
                            </li>  
                            <li class="activItem">
                                <a id="vista_3" href="javascript:void(0);">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    Ingreso Economico
                                </a>
                                <b class="arrow"></b>
                            </li>  
                            <li class="activItem">
                                <a id="vista_2" href="javascript:void(0);">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    Documento Ingresado
                                </a>
                                <b class="arrow"></b>
                            </li>  
                        </ul>
                    </li>
                </ul><!-- /.nav-list -->

                <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
                    <i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
                </div>

                <script type="text/javascript">
                    try {
                        ace.settings.check('sidebar', 'collapsed')
                    } catch (e) {
                    }
                </script>
            </div>

            <div class="main-content">
                <div class="main-content-inner">
                    <div class="breadcrumbs" id="breadcrumbs">
                        <script type="text/javascript">
                            try {
                                ace.settings.check('breadcrumbs', 'fixed')
                            } catch (e) {
                            }
                        </script>

                        <ul class="breadcrumb">
                            <li>
                                <i class="ace-icon fa fa-home home-icon"></i>
                                <a href="javascript:void(0);">Hospital</a>
                            </li>
                            <li>
                                <a href="javascript:void(0);">Regional</a>
                            </li>
                            <li>
                                <a href="javascript:void(0);">Ayacucho</a>
                            </li>
                            <li class="active"><span id="title"></span></li>
                        </ul><!-- /.breadcrumb -->

                        <div class="nav-search" id="nav-search">
                            <form class="form-search">
                                <span class="input-icon">
                                    <input type="text" placeholder="Buscar ..." class="nav-search-input" id="nav-search-input" autocomplete="on" />
                                    <i class="ace-icon fa fa-search nav-search-icon"></i>
                                </span>
                            </form>
                        </div>
                    </div>

                    <div class="page-content">             
                        <div class="row">
                            <div class="col-xs-12">                               
                                <div id="_contenido">

                                </div>                              
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.page-content -->
                </div>
            </div><!-- /.main-content -->

            <div class="footer">
                <div class="footer-inner">
                    <div class="footer-content">
                        <span class="bigger-120">
                            <span class="blue bolder">Hospital-Regional</span>
                            Application &copy; 2018
                        </span>

                        &nbsp; &nbsp;
                        <span class="action-buttons">
                            <a href="javascript:void(0);">
                                <i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
                            </a>

                            <a href="#">
                                <i class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
                            </a>

                            <a href="javascript:void(0);">
                                <i class="ace-icon fa fa-rss-square orange bigger-150"></i>
                            </a>
                        </span>
                    </div>
                </div>
            </div>

            <a href="javascript:void(0);" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
                <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
            </a>
        </div>

        <script src="${pageContext.request.contextPath}/componentes/js/jquery.2.1.1.min.js"></script>  
        <script type="text/javascript">
                            if ('ontouchstart' in document.documentElement)
                                document.write("<script src='${pageContext.request.contextPath}/componentes/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
        </script>        
        <script type="text/javascript">



            jQuery(function ($) {
                $("#btnCerrarSession").click(function () {
                    $(window).attr('location', urlApp + '/vistas/Login.jsp');
                });



            });

        </script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery-ui.custom.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery-ui-1.10.4.custom.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/bootstrap.min.js"></script>
        <!-- page specific plugin scripts -->
        <script src="${pageContext.request.contextPath}/componentes/js/bootstrap-datepicker.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.ui.touch-punch.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/moment.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/fullcalendar.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/bootbox.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/dropzone.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.easypiechart.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.gritter.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/spin.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.bootstrap-duallistbox.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.raty.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/bootstrap-multiselect.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/select2.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/typeahead.jquery.min.js"></script>  
        <script src="${pageContext.request.contextPath}/componentes/js/chosen.jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/fuelux.spinner.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/bootstrap-timepicker.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/daterangepicker.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/bootstrap-datetimepicker.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/bootstrap-colorpicker.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.knob.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.autosize.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.inputlimiter.1.3.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.maskedinput.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/bootstrap-tag.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/fuelux.wizard.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.validate.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/additional-methods.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.colorbox.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.hotkeys.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/bootstrap-wysiwyg.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.nestable.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/bootstrap-editable.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/ace-editable.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.dataTables.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/jquery.dataTables.bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/dataTables.tableTools.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/dataTables.colVis.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/fuelux.tree.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/prettify.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/markdown.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/bootstrap-markdown.min.js"></script>
        <!-- app scripts -->
        <script src="${pageContext.request.contextPath}/componentes/js/ace-elements.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/ace.min.js"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/lib/app.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/lib/mensajes.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/componentes/js/lib/menu.js" type="text/javascript"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                getSessionUser();
            });

            function getSessionUser() {
                $.ajaxCall(urlApp + '/usuarioController/fnIsUsuarioAdminBean.htm', {poJsonItem: {}}, false, function (rowData) {
                    if (rowData === null) {
                        $(window).attr('location', urlApp + '/vistas/Login.jsp');
                    } else {
                        if (rowData.IdTipoUsuario === 3) {
                            $(window).attr('location', urlApp + '/vistas/Login.jsp');
                        }
                        $("#Currentuser").empty();
                        $("#Currentuser").html(rowData.Observacion);
                    }
                });
            }

        </script>
    </body>


</html>
