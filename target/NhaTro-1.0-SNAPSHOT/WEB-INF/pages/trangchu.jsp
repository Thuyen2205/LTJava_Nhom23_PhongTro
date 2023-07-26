<%-- 
    Document   : trangchu
    Created on : Jul 26, 2023, 12:46:58 PM
    Author     : ThanhThuyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="<c:url value="/css/trangchu.css"/>"rel="stylesheet">
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>



<body>
    <div class="wrapper">
        <form action="">
            <h1>Login</h1>
            <div class="input-box">
                <input type="text" placeholder="Username" required>
                <box-icon type='solid' name='user'></box-icon>
            </div>
            <div class="input-box">
                <input type="password" placeholder="Password" required>
                <box-icon name='lock-alt' type='solid' ></box-icon>
            </div>
            
            <div class="remember-forgot">
                <label>
                    <input type="checkbox">
                </label>
                <a href="#">Forgot password?</a>
            </div>
            <button class="btn" type="submit" >Login</button>
            <div class="register-link">
                <p>
                    Don't have an account?<a href="<c:url value ="/dangki"/>"> Register </a>
                </p>
                
            </div>
        </form>
       
        
    </div>
    
</body>