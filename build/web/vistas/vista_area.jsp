<%-- 
  Descripcion       : Formulario  de area
  Creado por        : Quichua
  Fecha de Creacion : 05/01/2018 14:35:21
--%>

<div id="_area"></div>
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Lista de area
            </div>  
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <div class="table-responsive">
                        <table id="grid" class="table table-striped table-bordered bootstrap-datatable datatable responsive  ">
                            <thead>
                                <tr>
                                    <th style="width: 5px"></th>
                                    <th style="width: 5px"></th> 
                                    <th>Denominacion</th>
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
                        <label>Denominacion</label> 
                        <input id="txtDenominacion" class="form-control" placeholder="Denominacion" obligatorio UpperCase> 
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
