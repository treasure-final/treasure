<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap"
          rel="stylesheet">
    <title>Treasure</title>
    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script type="application/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.2.js"
            charset="utf-8"></script>
    <style>
        @font-face {
            font-family: "GmarketSansMedium";
            src: url("https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.1/GmarketSansMedium.woff") format("woff");
            font-weight: normal;
            font-style: normal;
        }

        div.main {
            font-family: "GmarketSansMedium";
            font-size: 13px;
            padding: 0;
            margin: 0;
            border: none;
        }

        .wrapper {
            width: 100%;
            margin-bottom: 300px;
        }

        .container {
            width: 82%;
            height: 1200px;
            padding: 40px;
            box-sizing: border-box;
            margin-left: 0px;
            margin-top: 30px;
            float: left;
        }

        .side {
            width: 13%;
            height: 500px;
            margin-left: 45px;
            margin-top: 70px;
            float: left;
        }

        #side-top {
            margin-bottom: 30px;
            line-height: 30px;
        }

        #side-bottom {
            line-height: 30px;
        }

        .side-title {
            font-size: 20px;
            margin-bottom: 30px;
            font-weight: bold;
        }

        .sub-title {
            font-size: 16px;
            font-weight: bold;
        }

        .sub-menu {
            opacity: 0.5;
            cursor: pointer;
        }

        #profile-info {
            border: 1px solid #e3e3e3;
            border-radius: 10px;
            height: 150px;
            margin-bottom: 45px;
        }

        .list-box {
            height: 80px;
            margin-top: 16px;
            border-radius: 10px;
            margin-bottom: 40px;
            padding-top: 20px;
        }

        .list-box>div {
            padding: 1% 7%;
            margin-right: 20px;
            margin-left: 20px;
            font-size: 14px;
            opacity: 0.7;
            float: left;
        }

        .item-list {
            height: 200px;
            text-align: center;
            line-height: 200px;
            margin-bottom: 40px;
            opacity: 0.5;
        }

        .addView {
            margin-left: 775px;
            opacity: 0.5;
            cursor: pointer;
        }

        #profile-img {
            margin-top: 20px;
            margin-left: 25px;
            width: 110px;
            float: left;
        }

        #profile-content {
            margin-left: 20px;
            margin-top: 35px;
            float: left;
            font-size: 12px;
            line-height: 20px;
        }

        .profile-btn {
            border: 1px solid #e3e3e3;
            background-color: #fff;
            border-radius: 10px;
            width: 100px;
            height: 35px;
            margin-top: 8px;
            padding-left: 14px;
            font-size: 12px;
            color: black;
            cursor: pointer;
        }

        .profile-btn:hover {
            background-color: #f3f3f3;
        }

        .box2 >div {
            margin-left: 45px;
        }
    </style>

    </script>
</head>
<body>
<div class="wrapper">
    <div class="side">
        <div class="side-title">마이 페이지</div>
        <div id="side-top">
            <div class="sub-title">쇼핑 정보</div>
            <div class="sub-menu">
                <div>구매 내역</div>
                <div>판매 내역</div>
                <div>보관 판매</div>
                <div>관심 상품</div>
            </div>
        </div>
        <div id="side-bottom">
            <div class="sub-title">내 정보</div>
            <div class="sub-menu">
                <div>프로필 정보</div>
                <div>주소록</div>
                <div>결제 정보</div>
                <div>판매 정산 계좌</div>
                <div>현금영수증 정보</div>
                <div>포인트</div>
            </div>
        </div>
    </div>

    <div class="container">
        <div id="profile-info">
            <div><img src="../../img/profile.png" id="profile-img"></div>
            <div id="profile-content"><b style="font-size: 16px; opacity: 1">tenta3802</b>
                <br><span style="opacity: 0.5">t*******2@naver.com</span>
                <br><input type="button" class="profile-btn" value="프로필 수정" align="left">
                <input type="button" class="profile-btn" value="내 스타일" align="left" style="width: 80px">
            </div>
        </div>
        <div style="clear: left"></div>
        <span style="font-size: 16px; font-weight: bold">보관 판매 내역</span>
        <span class="addView">더보기 ></span>
        <div class="list-box " style="background-color: #f2f9f6;">
            <div align="center" style="margin-left: 45px">발송요청<br><b style="color: green">0</b></div>
            <div align="center" style="border-left: 2px solid #e3e3e3; ">검수대기<br>0</div>
            <div align="center">검수 중<br>0</div>
            <div align="center">검수완료<br>0</div>
        </div>

        <span style="font-size: 16px; font-weight: bold">구매 내역</span>
        <span class="addView" style="margin-left: 815px">더보기 ></span>
        <div class="list-box box2" style="background-color: #fafafa;">
            <div align="center" style="margin-left: 45px">전체<br><b style="color: red">0</b></div>
            <div align="center" style="border-left: 2px solid #e3e3e3; ">입찰 중<br>0</div>
            <div align="center" style="margin-left: 30px">진행 중<br>0</div>
            <div align="center" style="margin-left: 30px">종료<br>0</div>
        </div>
        <div class="item-list">거래 내역이 없습니다.</div>

        <span style="font-size: 16px; font-weight: bold">판매 내역</span>
        <span class="addView" style="margin-left: 815px">더보기 ></span>
        <div class="list-box box2" style="background-color: #fafafa;">
            <div align="center" style="margin-left: 45px">전체<br><b style="color: red">0</b></div>
            <div align="center" style="border-left: 2px solid #e3e3e3; ">입찰 중<br>0</div>
            <div align="center" style="margin-left: 30px">진행 중<br>0</div>
            <div align="center" style="margin-left: 30px">종료<br>0</div>
        </div>
        <div class="item-list">거래 내역이 없습니다.</div>

    </div>

    <div style="clear: left"></div>
</div>
</div>
</body>
</html>
