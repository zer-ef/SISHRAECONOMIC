<%-- 
  Descripcion       : Formulario  de medicoprofesional
  Creado por        : Quichua
  Fecha de Creacion : 05/01/2018 14:35:21
--%>

<div id="_medicoprofesional"></div>
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Lista de medicoprofesional
            </div>  
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <div class="table-responsive">
                        <table id="grid" class="table table-striped table-bordered bootstrap-datatable datatable responsive  ">
                            <thead>
                                <tr>
                                    <th style="width: 5px"></th>
                                    <th style="width: 5px"></th> 
                                    <th>Profesional</th>
                                    <th>NombreIstitucion</th>
                                    <th>CarreraProfesional</th>
                                    <th>ServicioProfesional</th>
                                    <th>Especialidad</th>
                                    <th>FechaInicioLabor</th>
                                    <th>Observacion</th>
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
                        <label>Servicio Profesional</label> 
                        <input id="txtServicioProfesional" class="form-control" placeholder="ServicioProfesional" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Especialidad</label> 
                        <input id="txtEspecialidad" class="form-control" placeholder="Especialidad" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3">
                        <label>Fecha Inicio de Servicio</label> 
                        <div class="input-group">
                            <input class="form-control date-picker" id="txtFechaInicioLabor" type="text" data-date-format="dd/mm/yyyy" placeholder="FechaInicioLabor" obligatorio UpperCase/>
                            <span class="input-group-addon">
                                <i class="fa fa-calendar bigger-110"></i>
                            </span>
                        </div>
                    </div>
                </div> 
                <div class="row"> 
                    <div class="col-lg-9"> 
                        <label>Observacion</label> 
                        <textarea id="txtObservacion" class="form-control" placeholder="Observacion" obligatorio UpperCase></textarea>
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
