<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>左侧导航menu</title>

<link href="${pageContext.request.contextPath }/css/css.css" type="text/css" rel="stylesheet" />
<script src="${pageContext.request.contextPath }/js/jquery-2.2.4.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/js/ajaxfileupload.js" type="text/javascript"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/sdmenu.js"></script>
<script type="text/javascript">

	//<![CDATA[
	var myMenu;
	window.onload = function() {
		myMenu = new SDMenu("my_menu");
		myMenu.init();
	};
	// ]]>
</script>
<script type="text/javascript">
	function change() {
		$.ajaxFileUpload({
			url:"${pageContext.request.contextPath}/upload",
			secureuri:false,
			fileElementId:"fileName",
			success:function(){
				alert(1);
			},
			error:function(){
				alert(2);
			}
		})
	}
</script>
<style type=text/css>
	html{ SCROLLBAR-FACE-COLOR: #538ec6; SCROLLBAR-HIGHLIGHT-COLOR: #dce5f0; SCROLLBAR-SHADOW-COLOR: #2c6daa; SCROLLBAR-3DLIGHT-COLOR: #dce5f0; SCROLLBAR-ARROW-COLOR: #2c6daa;  SCROLLBAR-TRACK-COLOR: #dce5f0;  SCROLLBAR-DARKSHADOW-COLOR: #dce5f0; overflow-x:hidden;}
	body{ overflow-x:hidden; background:url(${pageContext.request.contextPath }/images/main/leftbg.jpg) left top repeat-y #f2f0f5; width:194px;}
</style>
</head>
<body onselectstart="return false;" ondragstart="return false;" oncontextmenu="return false;">
	<div id="left-top">
		<div>
		<img id="executeImage" src="<c:if test="${user.image!=null}">${pageContext.request.contextPath }/resources/img/${user.image}</c:if><c:if test="${user.image==null}">${pageContext.request.contextPath }/images/main/member.gif </c:if>" width="44" height="44" />
		</div>
	    <span>用户：${user.uname }<br>角色：<c:choose><c:when test="${user.isadmin=='true'}">超级管理员</c:when><c:otherwise>普通管理员</c:otherwise></c:choose></span>
	</div>
		<input style="margin-left:8px; width:137px;" type="file"  id="fileName"/>
		<input  type="button" onclick="change()" value="更换"/>
    <div style="float:left" id="my_menu" class="sdmenu">
      <div class="collapsed">
        <span>出库管理</span>
        <a href="${pageContext.request.contextPath }/main" target="mainFrame" onFocus="this.blur()">后台首页</a>
        <a href="${pageContext.request.contextPath }/main_druglist" target="mainFrame" onFocus="this.blur()">药品信息查询</a>
        <a href="${pageContext.request.contextPath }/main_list" target="mainFrame" onFocus="this.blur()">药品信息报表</a>
        <span id="test"></span>
      </div>
      <div>
        <span>药品信息管理</span>
        <a href="${pageContext.request.contextPath }/main_list" target="mainFrame" onFocus="this.blur()">取药记录查询</a>
        <a href="${pageContext.request.contextPath }/main_list" target="mainFrame" onFocus="this.blur()">取药记录报表</a>
        <a href="${pageContext.request.contextPath }/main_list" target="mainFrame" onFocus="this.blur()">取药记录计费</a>
      </div>
      <div>
        <span>入库管理</span>
        <a href="${pageContext.request.contextPath }/main_list" target="mainFrame" onFocus="this.blur()">入库登记</a>
        <a href="${pageContext.request.contextPath }/main_list" target="mainFrame" onFocus="this.blur()">库存查询</a>
        <a href="${pageContext.request.contextPath }/main_list" target="mainFrame" onFocus="this.blur()">修改库存</a>
      </div>
      <div>
        <span>供应商查询</span>
        <a href="${pageContext.request.contextPath }/main_list" target="mainFrame" onFocus="this.blur()">供应商信息查询</a>
        <a href="${pageContext.request.contextPath }/main_list" target="mainFrame" onFocus="this.blur()">药库清理</a>
      </div>
      <div>
        <span>过期药品管理</span>
        <a href="${pageContext.request.contextPath }/main_list" target="mainFrame" onFocus="this.blur()">删除过期药品</a>
        <a href="${pageContext.request.contextPath }/main_list" target="mainFrame" onFocus="this.blur()">免费药品清理</a>
      </div>
      <div>
        <span>用户管理</span>
        <a href="${pageContext.request.contextPath }/login" target="mainFrame" onFocus="this.blur()">添加用户</a>
        <a href="${pageContext.request.contextPath }/main_list" target="mainFrame" onFocus="this.blur()">修改权限</a>
        <a href="${pageContext.request.contextPath }/main_list" target="mainFrame" onFocus="this.blur()">编辑信息</a>
        <a href="${pageContext.request.contextPath }/uploadImage" target="mainFrame" onFocus="this.blur()">上传头像</a>
      </div>
    </div>
</body>
</html>
