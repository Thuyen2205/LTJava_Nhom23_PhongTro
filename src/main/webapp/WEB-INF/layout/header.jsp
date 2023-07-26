<%-- 
Document   : header
Created on : Jul 25, 2023, 9:33:27 PM
Author     : ThanhThuyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

    <nav class=" navbar navbar-expand-sm navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="javascript:void(0)">Phòng Trọ Sinh Viên</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="mynavbar">
                <ul class="navbar-nav me-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="<c:url value ="/trangchu"/>"> Đăng nhập </a>                       
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="javascript:void(0)">Đăng bài</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="javascript:void(0)">Thông báo</a>
                    </li>
                </ul>
                <form class="d-flex">
                    <input class="form-control me-2" type="text" placeholder="Tìm kiếm">
                    <button class="btn btn-primary" type="button">Tìm kiếm</button>
                </form>
            </div>
        </div>
    </nav>

