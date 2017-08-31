<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../header.jsp" %>
<br/>
<h3 style="text-align: center">Add product</h3>
<form action="/SupCommerce/auth/addProduct" method="post" data-abide>
  <div class="row">
    <div class="small-12 row">
      <div class="form-floating-label">
        <input type="text" id="name" name="name" placeholder="Product Name" required>
      </div>
    </div>
    <div class="small-12 row">
      <div class="form-floating-label">
        <input type="text" id="description" name="description" placeholder="Description" required>
      </div>
    </div>
    <div class="small-12 row">
      <div class="form-floating-label">
        <input type="text" id="price" name="price" placeholder="Price" required>
      </div>
    </div>
    <div class="small-12 row">
      <div class="form-floating-label">
        <select name="category">
        	<optgroup label="Select a category">
	        <c:forEach items="${categories}" var="ca">
			<option value="${ca.id}">${ca.name}</option>
			</c:forEach>
			</optgroup>
        </select>
      </div>
    </div>
   <input type="submit" class="button expanded" value="Add a product" style="margin-left: -15px;">
  </div>
</form>

<%--<form action="/SupCommerce/auth/addProduct" method="post">
	Name : <input type="text"  name="name" required><br/>
	Description : <input type="text" name="description" required><br/>
	Price : <input type="text" name="price" required><br/>
	Category : <select name="category" required >
	<c:forEach items="${categories}" var="ca">
		<option value="${ca.id}">${ca.name}</option>
	</c:forEach>
	</select><br/>
	<input type="submit" value="Add a product">
</form>--%>
<%@include file="../footer.jsp" %>
<script>
$('.form-floating-label input, .form-floating-label textarea').focusin(function(){
	  $(this).parent().addClass('has-value');
	});

	$('.form-floating-label input, .form-floating-label textarea').blur(function(){
	  if(!$(this).val().length > 0) {
	    $(this).parent().removeClass('has-value');
	  }
	});
</script>
</body>
</html>