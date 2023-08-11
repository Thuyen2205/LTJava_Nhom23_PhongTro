<%-- 
    Document   : chutro
    Created on : Jul 31, 2023, 12:45:22 PM
    Author     : ThanhThuyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <body>
    <c:forEach items="${baiviet}" var="p">
        Chủ trọ ${p.id} -${p.tenBaiViet}- ${p.noiDung}
        <br></br>
    </c:forEach>
</body>
</html>
