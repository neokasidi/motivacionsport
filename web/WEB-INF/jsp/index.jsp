<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Motivacion Sport</title>        
        <link href="/motivacionsport/assets/css/style.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <div class="body"></div>
        <div class="grad"></div>
        <div class="header">
            <div>Motivation<span>Sport</span></div>
        </div>
        <br>
        <f:form modelAttribute="usuario">
            <div class="login">
                <input type="text" placeholder="Usuario" name="${user}"><br>
                <input type="password" placeholder="Contraseña" name="${password}"><br>
                <input type="button" value="Login">
            </div>
        </f:form>
    </body>
</html>
