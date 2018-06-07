<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE >
<html>
  <head>
    <title>图片上传</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  <body>
   		<h2>图片文件上传</h2>
    	<mvc:form modelAttribute="user" action="${pageContext.request.contextPath }/upload" enctype="multipart/form-data">
        <table>
            <tr>
                <td>用户名：</td>
                <td><mvc:input path="uname" /></td>
            </tr>
            <tr>
                <td>选择头像：</td>
                <td><input type="file" name="file" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Submit" /></td>
            </tr>
        </table>
    </mvc:form>
     
    <c:if test="${u !=null }">
        <h2>上传结果</h2>
        <table>
            <c:if test="${u.userName != null }">
                <tr>
                    <td>用户名：</td>
                    <td>${u.userName}</td>
                </tr>
            </c:if>
            <c:if test="${u.logoSrc != null }">
                <tr>
                    <td>头像：</td>
                    <td><img src="${u.logoSrc}" width="100px" height="100px"></td>
                </tr>
            </c:if>
             
        </table>
    </c:if>
  </body>
</html>
