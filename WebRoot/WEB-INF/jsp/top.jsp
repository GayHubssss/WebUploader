<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>后台页面头部</title>
<link href="${pageContext.request.contextPath }/css/css.css" type="text/css" rel="stylesheet" />
</head>
<body onselectstart="return false" oncontextmenu=return(false) style="overflow-x:hidden;">
<!--禁止网页另存为-->
<noscript><iframe scr="*.jsp"></iframe></noscript>
<!--禁止网页另存为-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" id="header">
  <tr>
    <td rowspan="2" align="left" valign="top" id="logo"><img src="${pageContext.request.contextPath }/images/main/logo.jpg" width="74" height="64"></td>
    <td align="left" valign="bottom">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td align="left" valign="bottom" id="header-name">医院药品</td>
        <td align="right" valign="top" id="header-right">
        	<a href="${pageContext.request.contextPath }/index" target="topFrame" onFocus="this.blur()" class="admin-out">注销</a>
            <a href="${pageContext.request.contextPath }/index" target="top" onFocus="this.blur()" class="admin-home">管理首页</a>
        	<a href="${pageContext.request.contextPath }/index" target="_blank" onFocus="this.blur()" class="admin-index">网站首页</a>       	
            <span>
<!-- 日历 -->
<SCRIPT type=text/javascript src="${pageContext.request.contextPath }/js/clock.js"></SCRIPT>
<SCRIPT type=text/javascript>showcal();</SCRIPT>
            </span>
        </td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td align="left" valign="bottom">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td align="left" valign="top" id="header-admin">后台管理系统</td>
        <td align="left" valign="bottom" id="header-menu">
        <a href="${pageContext.request.contextPath }/index" target="left" onFocus="this.blur()" id="menuon">后台首页</a>
        <a href="${pageContext.request.contextPath }/index" target="left" onFocus="this.blur()">出库管理</a>
        <a href="${pageContext.request.contextPath }/index" target="left" onFocus="this.blur()">药品信息管理</a>
        <a href="${pageContext.request.contextPath }/index" target="left" onFocus="this.blur()">入库管理</a>
        <a href="${pageContext.request.contextPath }/index" target="left" onFocus="this.blur()">供应商查询</a>
        <a href="${pageContext.request.contextPath }/index" target="left" onFocus="this.blur()">过期药品管理</a>
        <a href="${pageContext.request.contextPath }/index" target="left" onFocus="this.blur()">用户管理</a>
        </td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
