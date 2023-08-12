<%-- 
    Document   : chutro
    Created on : Jul 31, 2023, 12:45:22 PM
    Author     : ThanhThuyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>


    <c:forEach  items="${baiviet}" var="p">

        <div>
            <c:if test="${p.loaiBaiViet.id==1}" >
                Chủ trọ ${p.idNguoiDung.tenNguoiDung} <br></br>
                ${p.tenBaiViet} -${p.noiDung}-${p.soNguoi}-${p.giaThue}-${p.dienTich}-${p.diaChiCt}
                <div>
                    <img src="${p.hinhAnh}" alt="Không có ảnh"  style="width:300px;" class="rounded-pill"> 
                </div>
            </c:if>
        </div>

        <div>
            <c:if test="${p.loaiBaiViet.id==2}" >
                Nguoi thue tro ${p.idNguoiDung.tenNguoiDung} <br></br>
                ${p.tenBaiViet}-${p.noiDung}-${p.phamViCanTim}

            </c:if>
        </div>

    </c:forEach>

</html>
