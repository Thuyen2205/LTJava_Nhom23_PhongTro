<%-- 
    Document   : index
    Created on : Jul 25, 2023, 4:05:23 PM
    Author     : ThanhThuyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
<!DOCTYPE html>
<html>
    <c:forEach items="${baiviet}" var="p">
        <div style="background-color:cornflowerblue; width: 500px; margin: 10px; border-radius: 10px ">
            <c:if test="${p.loaiBaiViet.id==1}" >
                Chủ trọ: ${p.idNguoiDung.tenNguoiDung} <br></br>
                ${p.tenBaiViet} -${p.noiDung}-${p.soNguoi}-${p.giaThue}-${p.dienTich}-${p.diaChiCt}
                <div>
                    <img src="${p.hinhAnh}" alt="Không có ảnh"  style="width:300px; border-radius: 10px; margin: 10% 5% 10% 15%" > 
                </div><br></br>
                <button style="margin-left: 40%; margin-bottom:10px;background-color: coral ">Bình luận</button>
            </c:if>

        </div>


        <div style="background-color:cadetblue; width: 500px; margin: 10px; border-radius: 10px ">

            <c:if test="${p.loaiBaiViet.id==2}" >
                Nguoi tìm trọ: ${p.idNguoiDung.tenNguoiDung} <br></br>
                ${p.tenBaiViet}-${p.noiDung}-${p.phamViCanTim}<br></br>
                <button style="margin-left: 40%; margin-bottom:10px; background-color: chartreuse ">Bình luận</button>
                
            </c:if>

        </div>


        <br></br>
    </c:forEach>

</html>
