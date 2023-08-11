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

        <c:if test="${p.loaiBaiViet.id==1}" >
            Chủ trọ ${p.tenBaiViet}
            <div>
                <img src="${p.hinhAnh}" alt="Không có ảnh"  style="width:300px;" class="rounded-pill"> 
            </div>
        </c:if>

        <c:if test="${p.loaiBaiViet.id==2}" >
            Chủ trọ ${p.noiDung}
            <div>
                <img src="${p.hinhAnh}" alt="Không có ảnh"  style="width:300px;" class="rounded-pill"> 
            </div>
        </c:if>
        <br></br>
    </c:forEach>
    <h1>Hello</h1>
</html>
