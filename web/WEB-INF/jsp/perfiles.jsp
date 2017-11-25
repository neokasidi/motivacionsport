<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<%@include file="../layout/head.jsp" %>
<div class="box">
    <div class="box-header">
        <h3 class="box-title">Lista de Perfiles</h3>
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
                <c:forEach items="perfiles" var="p">
                    <tr>
                        <td>{p.id}</td>
                        <td>{p.name}</td>
                        <td>{p.createAt}</td>
                        <td>{p.active}</td>
                        <td><a class="btn btn-primary" href="/motivacionsport/perfiles/{p.id}/editar.htm">Editar</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <!-- /.box-body -->
    <%@include file="../layout/footer.jsp"  %>