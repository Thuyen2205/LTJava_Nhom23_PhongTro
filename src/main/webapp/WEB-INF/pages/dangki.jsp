<%-- 
    Document   : dangki
    Created on : Jul 26, 2023, 4:02:50 PM
    Author     : ThanhThuyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link href="<c:url value="/css/trangchu.css"/>"rel="stylesheet">
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>


<c:url value="/dangki" var="action"/>

<body>
    <div class="wrapper">
        <form:form method="post" action="${action}" modelAttribute="user">
            <h1>Đăng kí</h1>
            <div class="input-box">
                <input type="text" placeholder="Họ" required>
            </div>
             <div class="input-box">
                <input type="text" placeholder="Tên" required>
            </div>  
            <div class="input-box">
                <form:input type="text" placeholder="Tên tài khoản" path="tenTaiKhoan" />
            </div>
            <div class="input-box">
                <form:input type="password" placeholder="Mật khẩu" path="matKhau" />           
            </div>
            <div class="input-box">
                <form:input type="password" placeholder="Xác nhận lại mật khẩu" path="xacNhanMatKhau" />           
            </div>
          

            <button class="btn" type="submit" >Đăng kí</button>

        </form:form>

    </div>

</body>