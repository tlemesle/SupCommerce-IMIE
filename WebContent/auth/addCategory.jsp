<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="fr.imie.supcommerce.model.*" %>
<%@page import="fr.imie.supcommerce.dao.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add category | SupCommerce</title>
</head>
<body>
<%@include file="../header.jsp" %>
<br/>
<h3 style="text-align: center">Add a category</h3>
<form action="/SupCommerce/auth/addCategory" method="post">
  <div class="row">
    <div class="small-12 row">
      <div class="form-floating-label">
        <input type="text" id="name" name="name" placeholder="Category Name" required>
      </div>
    </div>
   <input type="submit" class="button expanded" value="Add a category" style="margin-left: -15px;">
  </div>
</form>

<%@include file="../footer.jsp" %>
</body>
</html>