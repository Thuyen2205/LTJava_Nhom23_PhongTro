<%-- 
    Document   : DangBai
    Created on : Aug 6, 2023, 8:58:16 PM
    Author     : ThanhThuyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
<html>
    <h1 class="text-center text-danger">Đăng bài </h1>
    <c:url value="/dangbai" var="action"/>
    <div>

        <form:form method="post" action="${action}" modelAttribute="baiviet" enctype="multipart/form-data" >
            <div>
                <label for="file">Ảnh nhà trọ: </label>
                <br></br>
                <form:input type="file" id="file" path="file" cssClass="form -control"/>
            </div>
            <div>
                <label for="file">Tên bài viết </label>
                <br></br>
                <form:input type="text"  path="tenBai" cssClass="form -control"/>
            </div>
            <br></br>
            <div>
                <label for="file">Tác giả </label>
                <br></br>
                <form:input type="text"  path="tacGia" cssClass="form -control"/>
            </div>
            <div class="form-group">
                <input type="submit" value="Them Bai Viet" class="btn btn-danger"/>
            </div>
        </form:form>
    </div>

</html>
