<%-- 
  Descripcion       : Formulario  de documentoingresado
  Creado por        : Quichua
  Fecha de Creacion : 05/01/2018 14:35:21
--%>

<div id="_documentoingresado"></div>
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Lista de documentoingresado
            </div>  
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <div class="table-responsive">
                        <table id="grid" class="table table-striped table-bordered bootstrap-datatable datatable responsive  ">
                            <thead>
                                <tr>
                                    <th style="width: 5px"></th>
                                    <th style="width: 5px"></th> 
                                    <th>NumeroRegistro</th>
                                    <th>TipoDocumento</th>
                                    <th>Oregin</th>
                                    <th>Asunto</th>
                                    <th>Remitente</th>
                                    <th>Destino</th>
                                    <th>FechaDespacho</th>
                                    <th>Observacion</th>
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
                        <label>Numero de Registro</label> 
                        <input id="txtNumeroRegistro" class="form-control" placeholder="NumeroRegistro" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Tipo de Documento</label> 
                        <select id="txtIdTipoDocumento" obligatorio UpperCase class="chosen-select form-control"  data-placeholder="SELECCIONE TIPO DOC."> </select>
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Oregin</label> 
                        <select id="txtIdOregin" obligatorio UpperCase class="chosen-select form-control"  data-placeholder="SELECCIONE ORIGEN"> </select>
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Asunto</label> 
                        <input id="txtAsunto" class="form-control" placeholder="Asunto" obligatorio UpperCase> 
                    </div> 
                </div> 
                <div class="row">   
                    <div class="col-lg-3"> 
                        <label>Remitente</label> 
                        <select id="txtIdRemitente" obligatorio UpperCase class="chosen-select form-control"  data-placeholder="SELECCIONE REMITENTE"> </select>
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Destino</label> 
                        <input id="txtDestino" class="form-control" placeholder="Destino" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3">
                        <label>FechaDespacho</label> 
                        <div class="input-group">
                            <input class="form-control date-picker" id="txtFechaDespacho" type="text" data-date-format="dd/mm/yyyy" placeholder="FechaDespacho" obligatorio UpperCase/>
                            <span class="input-group-addon">
                                <i class="fa fa-calendar bigger-110"></i>
                            </span>
                        </div>
                    </div>
                </div> 
                <div class="row">
                    <div class="col-lg-6"> 
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
