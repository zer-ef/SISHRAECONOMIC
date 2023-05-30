<%-- 
  Descripcion       : Formulario  de practicante
  Creado por        : Quichua
  Fecha de Creacion : 05/01/2018 14:35:21
--%>

<div id="_practicante"></div>
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Lista de practicante
            </div>  
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <div class="table-responsive">
                        <table id="grid" class="table table-striped table-bordered bootstrap-datatable datatable responsive  ">
                            <thead>
                                <tr>
                                    <th style="width: 5px"></th>
                                    <th style="width: 5px"></th> 
                                    <th>Practicante</th>
                                    <th>NombreIstitucion</th>
                                    <th>CarreraProfesional</th>
                                    <th>FechaInicio</th>
                                    <th>FechaTernino</th>
                                    <th>Modulo</th>
                                    <th>HorarioPractica</th>
                                    <th>FechRegistra</th>
                                </tr> 
                            </thead> 
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<br>
<div class="row">
    <div class="col-lg-12">
        <div id="form">
            <form role="form">
                <div class="row"> 
                    <div class="col-lg-3"> 
                        <label>Nombre</label> 
                        <input id="txtNombre" class="form-control" placeholder="Nombre" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3"> 
                        <label>ApePaterno</label> 
                        <input id="txtApePaterno" class="form-control" placeholder="ApePaterno" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3"> 
                        <label>ApeMaterno</label> 
                        <input id="txtApeMaterno" class="form-control" placeholder="ApeMaterno" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3"> 
                        <label>NumDocumento</label> 
                        <input id="txtNumDocumento" class="form-control" placeholder="NumDocumento" obligatorio UpperCase> 
                    </div> 
                </div> 
                <div class="row"> 
                    <div class="col-lg-3"> 
                        <label>TeleMovil</label> 
                        <input id="txtTeleMovil" class="form-control" placeholder="TeleMovil" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Email</label> 
                        <input id="txtEmail" class="form-control" placeholder="Email" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Direccion</label> 
                        <input id="txtDireccion" class="form-control" placeholder="Direccion" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Institucion</label> 
                        <select id="txtIdInstitucion" obligatorio UpperCase class="chosen-select form-control"  data-placeholder="SELECCIONE INSTITUCION"> </select>
                    </div> 
                </div>
                <div class="row"> 
                    <div class="col-lg-3"> 
                        <label>Carrera Profesional</label> 
                        <input id="txtCarreraProfesional" class="form-control" placeholder="CarreraProfesional" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3">
                        <label>Fecha de Inicio</label> 
                        <div class="input-group">
                            <input class="form-control date-picker" id="txtFechaInicio" type="text" data-date-format="dd/mm/yyyy" placeholder="FechaInicio" obligatorio UpperCase/>
                            <span class="input-group-addon">
                                <i class="fa fa-calendar bigger-110"></i>
                            </span>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <label>Fecha Ternino Practica</label> 
                        <div class="input-group">
                            <input class="form-control date-picker" id="txtFechaTernino" type="text" data-date-format="dd/mm/yyyy" placeholder="FechaTernino" obligatorio UpperCase/>
                            <span class="input-group-addon">
                                <i class="fa fa-calendar bigger-110"></i>
                            </span>
                        </div>
                    </div>
                    <div class="col-lg-3"> 
                        <label>Modulo</label> 
                        <input id="txtModulo" class="form-control" placeholder="Modulo" obligatorio UpperCase> 
                    </div>
                </div> 
                <div class="row">  
                    <div class="col-lg-3"> 
                        <label>Horario de Practica</label> 
                        <input id="txtHorarioPractica" class="form-control" placeholder="HorarioPractica" obligatorio UpperCase> 
                    </div>  
                </div> 
                <br> 
                <div class="col-lg-12"></div> 
                <div class="col-lg-12">          
                    <button id="btnNuevo" type="button" class="btn btn-primary">Nuevo</button> 
                    <button id="btnCancelar" type="reset" class="btn btn-default">Cancelar</button> 
                </div> 
        </div> 
    </div> 
