<%-- 
  Descripcion       : Formulario  de ingresoeconomico
  Creado por        : Quichua
  Fecha de Creacion : 05/01/2018 14:35:21
--%>

<div id="_ingresoeconomico"></div>
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Lista de ingresoeconomico
            </div>  
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <div class="table-responsive">
                        <table id="grid" class="table table-striped table-bordered bootstrap-datatable datatable responsive  ">
                            <thead>
                                <tr>
                                    <th style="width: 5px"></th>
                                    <th style="width: 5px"></th> 
                                    <th>NumBoleta</th>
                                    <th>FechaPago</th>
                                    <th>Participante</th>
                                    <th>Institucion</th>
                                    <th>ConceptoPago</th>
                                    <th>Monto</th>
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
                        <label>NumBoleta</label> 
                        <input id="txtNumBoleta" class="form-control" placeholder="NumBoleta" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Fecha de Pago</label> 
                        <input id="txtFechaPago" class="form-control" placeholder="FechaPago" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Nombre del Participante</label> 
                        <select id="txtIdParticipante" obligatorio UpperCase class="chosen-select form-control"  data-placeholder="SELECCIONE PARTICIPANTE"> </select>
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Tipo de Institucion</label> 
                        <select id="txtIdTipoInstitucion" obligatorio UpperCase class="chosen-select form-control"  data-placeholder="SELECCIONE TIPO INSTITUCION"> </select>
                    </div> 
                </div> 
                <div class="row"> 
                    <div class="col-lg-3"> 
                        <label>Concepto de Pago</label> 
                        <input id="txtConceptoPago" class="form-control" placeholder="ConceptoPago" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Monto</label> 
                        <input id="txtMonto" class="form-control" placeholder="Monto" obligatorio UpperCase> 
                    </div> 
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
