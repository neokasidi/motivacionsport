<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<%@include file="../layout/head.jsp" %>
<div class="box">
    <div class="box-header">
        <h3 class="box-title">Lista de Clases</h3>
    </div>
    <!-- /.box-header -->
    <div class="box-body">
        <table id="example1" class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th></th>
                    <th>Nombre</th>
                    <th>User</th>
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
                    <td><a class="btn btn-primary" href="/motivacionsport/clases/editar.htm">Editar</a></td>
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