<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Motivacion Sport</title>        
        <link href="/motivacionsport/assets/css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" type="image/jpeg" sizes="32x32" href="/motivacionsport/assets/img/favicon.jpg">
    </head>

    <body>
        <div class="body"></div>
        <div class="grad">
            <img src="/motivacionsport/assets/img/LOGO-03.jpg" style="width: 12%"/>
        </div>
        <div class="header">
            <div>Motivacion<span>Sport</span></div>
        </div>
        <br>
        <form action="home/dashboard.htm" method="post">
            <div class="login">
                <input type="text" placeholder="Usuario" name="user"><br>
                <input type="password" placeholder="Contraseña" name="password"><br>
                <input type="submit" value="Login" class>
            </div>
        </form>
    </body>
</html>
