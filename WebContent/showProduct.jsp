<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="fr.imie.supcommerce.model.*" %>
<%@page import="fr.imie.supcommerce.dao.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="./header.jsp" %>
<br/>
<div class="row" style="margin-left: 30%;">
      <div class="medium-6 columns">
        <img class="thumbnail" src="http://placehold.it/350x350">
        <%--<div class="row small-up-4">
          <div class="column">
            <img class="thumbnail" src="http://placehold.it/250x200">
          </div>
          <div class="column">
            <img class="thumbnail" src="http://placehold.it/250x200">
          </div>
          <div class="column">
            <img class="thumbnail" src="http://placehold.it/250x200">
          </div>
          <div class="column">
            <img class="thumbnail" src="http://placehold.it/250x200">
          </div>
        </div>--%>
      </div>
      <div class="medium-6 large-5 columns">
        <h3>${product.name}</h3>
        <p>${product.description}</p>
		<p>${product.price}€</p>
		<p>Category : ${product.category.name}</p>
        <%--<label>Size
        <select>
          <option value="husker">Small</option>
          <option value="starbuck">Medium</option>
          <option value="hotdog">Large</option>
          <option value="apollo">Yeti</option>
        </select>
        </label>--%>

       <%-- <div class="row">
          <div class="small-3 columns">
            <label for="middle-label" class="middle">Quantity</label>
          </div>
          <div class="small-9 columns">
            <input type="text" id="middle-label" placeholder="One fish two fish">
          </div>
        </div>
       --%> 
        <a href="#" class="button large expanded">Buy Now</a>

       <%--<div class="small secondary expanded button-group">
            <a class="button">Facebook</a>
            <a class="button">Twitter</a>
            <a class="button">Yo</a>
          </div>--%> 
        </div>
    </div>


<%--<table>
<tr>
<td><c:out value="${product.name}"></c:out></td>
</tr>
<td><c:out value="${product.description}"></c:out></td>
</tr>
<td><c:out value="${product.price}"></c:out></td>
</tr>
<td><c:out value="${product.category.name}"></c:out></td>
</tr>
</table>--%>
<%@include file="./footer.jsp" %>
</body>
</html>