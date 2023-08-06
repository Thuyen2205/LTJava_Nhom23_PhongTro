<%-- 
    Document   : DangBai
    Created on : Aug 6, 2023, 8:58:16 PM
    Author     : ThanhThuyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link href="<c:url value="/css/trangchu.css"/>"rel="stylesheet">
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
<html>


    <div>
        <h1>Đăng bài </h1>
        <form :form method="POST" modelAttribute="word" enctype="multipart/form-data">
            <table>

                <tr>
                    <td><spring:message code="label.image"/></td>
                <td><form:input id="imageId" path="img" type="file"/></td>
                    </tr>

            </table>


        </form:form>
    </div>

</html>
