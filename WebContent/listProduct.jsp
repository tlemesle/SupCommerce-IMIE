<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="fr.imie.supcommerce.model.*" %>
<%@page import="fr.imie.supcommerce.dao.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="./header.jsp" %>
<br/>
<h3 style="text-align: center">List of product</h3>
<div class="row">
<c:forEach items="${products}" var="p">
<div class="column end">
<div class="product-card">
  <div class="product-card-thumbnail">
    <a href="#"><img src="http://placehold.it/180x180"/></a>
  </div>
  <h2 class="product-card-title"><a href="/SupCommerce/showProduct?id=${p.id}">${p.name}</a></h2>
  <span class="product-card-desc">${p.description}</span>
  <span class="product-card-price">${p.price} €</span>
  <a href="/SupCommerce/auth/removeProduct?id=${p.id}">Remove</a>
</div>
</div>
</c:forEach>
</div>
<%-- }--%>
<%@include file="./footer.jsp" %>
</body>
</html>