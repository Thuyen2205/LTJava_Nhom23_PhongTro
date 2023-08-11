<%-- 
    Document   : index
    Created on : Jul 25, 2023, 4:05:23 PM
    Author     : ThanhThuyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <c:forEach items="${baiviet}" var="p">
        Bài viết thứ ${p.id} -${p.tenBaiViet}- ${p.noiDung}

        <div>
            <img src="${p.hinhAnh}" alt="Không có ảnh"  style="width:300px;" class="rounded-pill"> 
        </div>
        <br></br>
    </c:forEach>
    <h1>Hello</h1>
</html>
