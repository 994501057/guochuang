<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
String path = request.getContextPath(); 
// 获得项目完全路径
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>智代OA</title>
    <link rel="stylesheet" href="static/css/ui-box.css">
    <style>
        *{
            padding: 0;
            margin: 0;
            box-sizing: border-box;
        }
        html,body{
            font-size: 16px;
        }


        .view{
            width: 100vw;
            height: 100vh;
            background-color: #ffffff;
            position: relative;
        }
        #banner{
            width: 100vw;
            position: absolute;
            top: 0;
            left: 0;
            z-index: 1;
        }
        .login-box{
            width: 800px;
            height: 450px;
            background-color: #ffffff;
            position: relative;
            z-index: 2;
            box-shadow:3px 3px 3px 3px rgba(51,51,51,0.1);
            border-radius:10px;
        }
        .login-img{
            width: 380px;
            height: 450px;
            background-image: url("static/images/icon/login.png");
        }
        .login-con .title{
            font-size: 26px;
            color: #4D4D4D;
            margin-top: 69px;
            margin-bottom: 70px;
        }
        .login-con .input{
            width: 300px;
            height: 30px;
            border-bottom: 2px solid #E6E6E6;
            padding: 0 8px;
        }
        .icon-user{
            width: 18px;
            height: 21px;
            background-image: url("static/images/icon/user.png");
        }
        .icon-pass{
            width: 18px;
            height: 21px;
            background-image: url("static/images/icon/password.png");
        }
        .login-con .input input{
            height: 28px;
            margin-left: 10px;
            border: none;
            outline: none;
            font-size: 20px;
        }
        .login-con .btn{
            width:300px;
            height:50px;
            background:rgba(26,106,238,1);
            box-shadow:0px 2px 2px 2px rgba(90,131,248,0.42);
            border-radius:25px;
            margin-top: 50px;
            color: #ffffff;
            font-size: 20px;
            transition: transform 0.5s;
        }
        .btn:active{
            transform:scale(0.9,0.9);
        }
    </style>
</head>
<body>
    <div class="view ub ub-ac ub-pc">
        <img id="banner" src="images/icon/banner.png" style="width: 100vw;">
        <div class="login-box ub">
            <div class="login-img ub-img1"></div>
            <div class="ub ub-f1 ub-ver ub-ac login-con">
            <form action="${pageContext.request.contextPath }/login" method="post">
                <div class="title">智代恒通OA管理系统</div>
                <div class="input ub ub-ac">
                    <div class="icon-user ub-img"></div>
                    <input type="text" class="ub ub-f1" placeholder="账号" name="sn">
                </div>
                <div class="input ub ub-ac" style="margin-top: 40px">
                    <div class="icon-pass ub-img"></div>
                    <input type="password" class="ub ub-f1" placeholder="密码" name="password">
                </div>
                <div class="btn ub ub-ac ub-pc"><input type="submit">登录</div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>