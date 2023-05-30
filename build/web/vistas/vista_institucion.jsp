<%-- 
  Descripcion       : Formulario  de institucion
  Creado por        : Quichua
  Fecha de Creacion : 05/01/2018 14:35:21
--%>

<div id="_institucion"></div>
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Lista de institucion
            </div>  
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <div class="table-responsive">
                        <table id="grid" class="table table-striped table-bordered bootstrap-datatable datatable responsive  ">
                            <thead>
                                <tr>
                                    <th style="width: 5px"></th>
                                    <th style="width: 5px"></th> 
                                    <th>NombreIstitucion</th>
                                    <th>Denominacion</th>
                                    <th>Lugar</th>
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
                        <label>Nombre de la Istitucion</label> 
                        <input id="txtNombreIstitucion" class="form-control" placeholder="NombreIstitucion" obligatorio UpperCase> 
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Tipo de Institucion</label> 
                        <select id="txtIdTipoInstitucion" obligatorio UpperCase class="chosen-select form-control"  data-placeholder="SELECCIONE INSTITUCION"> </select>
                    </div> 
                    <div class="col-lg-3"> 
                        <label>Ciudad</label> 
                        <input id="txtLugar" class="form-control" placeholder="Ciudad" obligatorio UpperCase> 
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
