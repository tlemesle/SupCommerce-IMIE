<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="./header.jsp" %>
<br/>
<form data-abide action="/SupCommerce/login" method="POST" style="margin-left: 20%;margin-right: 20%;">
  <div class="form-icons">
    <h4>Login</h4>

    <div class="input-group">
      <span class="input-group-label">
        <i class="fa fa-user"></i>
      </span>
      <input class="input-group-field" type="text" name="username" placeholder="Username" pattern="[a-zA-Z]+" required>
    </div>

  </div>

  <button class="button expanded">Sign In</button>
</form>
</body>
</html>