<%-- 
    Document   : dangki
    Created on : Jul 26, 2023, 4:02:50 PM
    Author     : ThanhThuyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="<c:url value="/css/trangchu.css"/>"rel="stylesheet">
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
<body>
    <div class="wrapper">
        <form action="">
            <h1>Đăng kí</h1>
             <div class="input-box">
                <input type="text" placeholder="HoTen" required>
                <box-icon name='lock-alt' type='solid' ></box-icon>
            </div>           
            <div class="input-box">
                <input type="text" placeholder="Username" required>
               
            </div>
            <div class="input-box">
                <input type="password" placeholder="Password" required>               
            </div>
             <div class="input-box">
                <input type="password" placeholder="Số điện thoại" required>
                <box-icon name='lock-alt' type='solid' ></box-icon>
            </div>    
 
            <button class="btn" type="submit" >Đăng kí</button>
            
        </form>
        
    </div>
    
</body>