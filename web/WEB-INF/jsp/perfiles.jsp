<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<%@include file="../layout/head.jsp" %>
<div class="box">
    <div class="box-header">
        <h4>Nuevo Perfil</h4>
    </div>
    <!-- /.box-header -->
    <div class="box-body">
        <f:form method="post" action="/motivacionsport/perfiles/crear.htm" commandName="perfile">
            <div class="form-group">
                <f:label path="name">Nombre:</f:label>
                <f:input cssClass="form-control" path="name"/>
            </div>          
            <button type="submit" class="btn btn-success">Nuevo Perfil</button>           
        </f:form>
    </div>
</div>
<div class="box">
    <div class="box-header">
        <h3 class="box-title">Data Table With Full Features</h3>
    </div>
    <!-- /.box-header -->
    <div class="box-body">
        <table id="example1" class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th></th>
                    <th>Tipo</th>
                    <th>Creado</th>
                    <th>Activo</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                
                    <tr>
                        <td>1</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td><a class="btn btn-primary" href="/motivacionsport/perfiles/editar.htm">Editar</a></td>
                    </tr>
                        
            </tbody>
            <tfoot>
                <tr>
                    <th>Rendering engine</th>
                    <th>Browser</th>
                    <th>Platform(s)</th>
                    <th>Engine version</th>
                    <th>CSS grade</th>
                </tr>
            </tfoot>
        </table>
    </div>
    <!-- /.box-body -->
    <%@include file="../layout/footer.jsp"  %>