<%-- 
  Descripcion       : Formulario  de usuario
  Creado por        : Quichua
  Fecha de Creacion : 05/01/2018 14:35:21
--%>

<div id="_usuario"></div>
<div class="row">
 <div class="col-lg-12">
 <div class="panel panel-default">
  <div class="panel-heading">
 Lista de usuario
 </div>  
 <div class="panel-body">
 <div class="dataTable_wrapper">
 <div class="table-responsive">
 <table id="grid" class="table table-striped table-bordered bootstrap-datatable datatable responsive  ">
  <thead>
 <tr>
  <th style="width: 5px"></th>
  <th style="width: 5px"></th> 
 <th>IdPersonal</th>
 <th>IdTipoUsuario</th>
 <th>NombUsuario</th>
 <th>Contrasenia</th>
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
   <label>IdPersonal</label> 
   <input id="txtIdPersonal" class="form-control" placeholder="IdPersonal" obligatorio UpperCase> 
   </div> 
   <div class="col-lg-3"> 
   <label>IdTipoUsuario</label> 
   <input id="txtIdTipoUsuario" class="form-control" placeholder="IdTipoUsuario" obligatorio UpperCase> 
   </div> 
   <div class="col-lg-3"> 
   <label>NombUsuario</label> 
   <input id="txtNombUsuario" class="form-control" placeholder="NombUsuario" obligatorio UpperCase> 
   </div> 
   <div class="col-lg-3"> 
   <label>Contrasenia</label> 
   <input id="txtContrasenia" class="form-control" placeholder="Contrasenia" obligatorio UpperCase> 
   </div> 
  </div> 
  <div class="row"> 
   <div class="col-lg-3"> 
   <label>Observacion</label> 
   <input id="txtObservacion" class="form-control" placeholder="Observacion" obligatorio UpperCase> 
   </div> 
   <div class="col-lg-3"> 
   <label>FechRegistra</label> 
   <input id="txtFechRegistra" class="form-control" placeholder="FechRegistra" obligatorio UpperCase> 
   </div> 
   <div class="col-lg-3"> 
   <label>FechModifica</label> 
   <input id="txtFechModifica" class="form-control" placeholder="FechModifica" obligatorio UpperCase> 
   </div> 
   <div class="col-lg-3"> 
   <label>Estado</label> 
   <input id="txtEstado" class="form-control" placeholder="Estado" obligatorio UpperCase> 
   </div> 
  </div> 
  </form> 
  </div> 
 <br> 
 <div class="col-lg-12"></div> 
 <div class="col-lg-12">          
 <button id="btnNuevo" type="button" class="btn btn-primary">Nuevo</button> 
 <button id="btnCancelar" type="reset" class="btn btn-default">Cancelar</button> 
 </div> 
</div> 
</div> 
