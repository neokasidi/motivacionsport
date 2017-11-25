<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<%@include file="../layout/head.jsp" %>
<div class="box">
    <div class="box-header">
        <h4>Nuevo Perfil</h4>
    </div>
    <!-- /.box-header -->
    <div class="box-body">
        <form>
            <div class="form-group">
                <label for="exampleInputEmail1">Nombre del Perfil</label>
                <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Ingrese email">
                <small id="emailHelp" class="form-text text-muted">Debe ingresar un nombre al Perfil</small>
            </div>
            <div class="form-group">
                <label for="exampleFormControlSelect1">Estado</label>
                <select class="form-control" id="exampleFormControlSelect1">
                    <option value="1">Activo</option>
                    <option value="2">Desactivo</option>                    
                </select>
            </div>

            <button type="submit" class="btn btn-success">Crear</button>
        </form>       
    </div>
</div>
<%@include file="../layout/footer.jsp"  %>