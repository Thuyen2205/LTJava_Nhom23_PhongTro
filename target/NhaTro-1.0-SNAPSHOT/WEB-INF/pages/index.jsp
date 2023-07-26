<%-- 
    Document   : index
    Created on : Jul 25, 2023, 4:05:23 PM
    Author     : ThanhThuyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <c:forEach items="${phongtro}" var="p">
            Phòng số ${p.id} - ${p.diaChi} - ${p.dienTich} - ${p.soNguoi} - ${p.tinhTrang} - ${p.thongTinThem} 
            <br></br>
        </c:forEach>
    </body>
</html>
