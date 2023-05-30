<%-- 
  Descripcion       : Formulario  de persona
  Creado por        : Quichua
  Fecha de Creacion : 05/01/2018 14:35:21
--%>

<div id="_persona"></div>
<div class="row">
 <div class="col-lg-12">
 <div class="panel panel-default">
  <div class="panel-heading">
 Lista de persona
 </div>  
 <div class="panel-body">
 <div class="dataTable_wrapper">
 <div class="table-responsive">
 <table id="grid" class="table table-striped table-bordered bootstrap-datatable datatable responsive  ">
  <thead>
 <tr>
  <th style="width: 5px"></th>
  <th style="width: 5px"></th> 
 <th>Nombre</th>
 <th>ApePaterno</th>
 <th>ApeMaterno</th>
 <th>NumDocumento</th>
 <th>TeleMovil</th>
 <th>Email</th>
 <th>Direccion</th>
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
