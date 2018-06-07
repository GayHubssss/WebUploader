<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>医院药店后台管理系统</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" tppabs="css/style.css" />
<style>
body{height:100%;background:#16a085;overflow:hidden;}
canvas{z-index:-1;position:absolute;}
</style>
<script src="${pageContext.request.contextPath }/js/jquery-2.2.4.min.js"></script>
<script src="${pageContext.request.contextPath }/js/verificationNumbers.js" tppabs="${pageContext.request.contextPath }/js/verificationNumbers.js"></script>
<script src="${pageContext.request.contextPath }/js/Particleground.js" tppabs="${pageContext.request.contextPath }/js/Particleground.js"></script>
<script>
$(document).ready(function() {
  //粒子背景特效
  $('body').particleground({
    dotColor: '#5cbdaa',
    lineColor: '#5cbdaa'
  });
  //验证码
  createCode();
});
</script>
</head>
<body>
<dl class="admin_login">
 <dt>
  <strong>医院药店后台管理系统</strong>
  <em>Pharmacy-Manager</em>
 </dt>
 <form action="${pageContext.request.contextPath }/tologin" method="post" onsubmit="return validate()">
 <dd class="user_icon">
  <input type="text" placeholder="账号" class="login_txtbx" name="uname"/>
 </dd>
 <dd class="pwd_icon">
  <input type="password" placeholder="密码" class="login_txtbx" name="upassword"/>
 </dd>
 <dd class="val_icon">
  <div class="checkcode">
    <input type="text" id="J_codetext" placeholder="验证码" maxlength="4" class="login_txtbx">
    <canvas class="J_codeimg" id="myCanvas" onclick="createCode()">对不起，您的浏览器不支持canvas，请下载最新版浏览器!</canvas>
  </div>
  <input type="button" value="验证码核验" class="ver_btn" onClick="validate();">
 </dd>
 <dd>
  <input type="submit" value="立即登陆" class="submit_btn"/>
 </dd>
 <dd>
  <p>© 2017-2016 Pharmacy-Manager 版权归开发者个人所有</p>
  <p>豫B2-8998988-1</p>
 </dd>
 </form>
</dl>
</body>
</html>

