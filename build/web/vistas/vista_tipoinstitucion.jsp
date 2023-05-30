<%-- 
  Descripcion       : Formulario  de tipoinstitucion
  Creado por        : Quichua
  Fecha de Creacion : 05/01/2018 14:35:21
--%>

<div id="_tipoinstitucion"></div>
<div class="row">
 <div class="col-lg-12">
 <div class="panel panel-default">
  <div class="panel-heading">
 Lista de tipoinstitucion
 </div>  
 <div class="panel-body">
 <div class="dataTable_wrapper">
 <div class="table-responsive">
 <table id="grid" class="table table-striped table-bordered bootstrap-datatable datatable responsive  ">
  <thead>
 <tr>
  <th style="width: 5px"></th>
  <th style="width: 5px"></th> 
 <th>Abreviatura</th>
 <th>Denominacion</th>
 <th>Observacion</th>
 <th>FechRegistra</th>
 <th>FechModifica</th>
 <th>Estado</th>
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
   <label>Abreviatura</label> 
   <input id="txtAbreviatura" class="form-control" placeholder="Abreviatura" obligatorio UpperCase> 
   </div> 
   <div class="col-lg-3"> 
   <label>Denominacion</label> 
   <input id="txtDenominacion" class="form-control" placeholder="Denominacion" obligatorio UpperCase> 
   </div> 
   <div class="col-lg-3"> 
   <label>Observacion</label> 
   <input id="txtObservacion" class="form-control" placeholder="Observacion" obligatorio UpperCase> 
   </div> 
   <div class="col-lg-3"> 
   <label>FechRegistra</label> 
   <input id="txtFechRegistra" class="form-control" placeholder="FechRegistra" obligatorio UpperCase> 
   </div> 
  </div> 
  <div class="row"> 
   <div class="col-lg-3"> 
   <label>FechModifica</label> 
   <input id="txtFechModifica" class="form-control" placeholder="FechModifica" obligatorio UpperCase> 
   </div> 
   <div class="col-lg-3"> 
   <label>Estado</label> 
   <input id="txtEstado" class="form-control" placeholder="Estado" obligatorio UpperCase> 
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
