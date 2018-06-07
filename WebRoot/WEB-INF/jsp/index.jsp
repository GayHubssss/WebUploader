<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>药店后台管理系统</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath }/images/favicon.ico" />
<link href="${pageContext.request.contextPath }/css/css.css" type="text/css" rel="stylesheet" />
</head>
<!--框架样式-->
<frameset rows="95,*,30" cols="*" frameborder="no" border="0" framespacing="0">
<!--top样式-->
	<frame src="${pageContext.request.contextPath }/top" name="topframe" scrolling="no" noresize id="topframe" title="topframe" />
<!--contact样式-->
	<frameset id="attachucp" framespacing="0" border="0" frameborder="no" cols="194,12,*" rows="*">
		<frame scrolling="auto" noresize="" frameborder="no" name="leftFrame" src="${pageContext.request.contextPath }/left"></frame>
		<frame id="leftbar" scrolling="no" noresize="" name="switchFrame" src="${pageContext.request.contextPath }/swich"></frame>
		<frame id="mainbar" scrolling="auto" noresize="" border="0" name="mainFrame" src="${pageContext.request.contextPath }/main"></frame>
	</frameset>
<!--bottom样式-->
	<frame src="${pageContext.request.contextPath }/bottom" name="bottomFrame" scrolling="No" noresize="noresize" id="bottomFrame" title="bottomFrame" />
</frameset><noframes></noframes>
<!--不可以删除-->
</html>
