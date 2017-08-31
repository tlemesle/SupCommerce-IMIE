<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SupCommerce</title>
<script
			  src="http://code.jquery.com/jquery-3.2.1.min.js"
			  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
			  crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/g/foundation@6.2.4(foundation.min.js+js/foundation.abide.js+js/foundation.accordion.js+js/foundation.accordionMenu.js+js/foundation.core.js+js/foundation.drilldown.js+js/foundation.dropdown.js+js/foundation.dropdownMenu.js+js/foundation.equalizer.js+js/foundation.interchange.js+js/foundation.magellan.js+js/foundation.offcanvas.js+js/foundation.orbit.js+js/foundation.responsiveMenu.js+js/foundation.responsiveToggle.js+js/foundation.reveal.js+js/foundation.slider.js+js/foundation.sticky.js+js/foundation.tabs.js+js/foundation.toggler.js+js/foundation.tooltip.js+js/foundation.util.box.js+js/foundation.util.keyboard.js+js/foundation.util.mediaQuery.js+js/foundation.util.motion.js+js/foundation.util.nest.js+js/foundation.util.timerAndImageLoader.js+js/foundation.util.touch.js+js/foundation.util.triggers.js)"></script>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/foundation/6.2.4/foundation.min.css">
<style type="text/css">
.hover-underline-menu {
  width: 100%;
}

.hover-underline-menu .menu {
  background-color: #2C3840;
}

.hover-underline-menu .menu a {
  color: #fefefe;
  padding: 1.2rem 1.5rem;
}

.hover-underline-menu .menu .underline-from-center {
  position: relative;
}

.hover-underline-menu .menu .underline-from-center::after {
  content: "";
  position: absolute;
  top: calc(100% - 0.125rem);
  border-bottom: 0.125rem solid #fefefe;
  left: 50%;
  right: 50%;
  transition: all 0.5s ease;
}

.hover-underline-menu .menu .underline-from-center:hover::after {
  left: 0;
  right: 0;
  transition: all 0.5s ease;
}

.column, .columns {
    padding-left: .625rem;
    padding-right: .625rem;
    display: block;
    width: auto;
}
.medium-6 columns{
	width: auto;
}
.column:last-child:not(:first-child), .columns:last-child:not(:first-child) {
	float: left;
}


.product-card {
  background-color: #fefefe;
  border: 1px solid #e6e6e6;
  padding: 1rem;
  margin-bottom: 1.5rem;
}

.product-card-thumbnail {
  display: block;
  position: relative;
}

.product-card-title {
  font-family: 'Open sans', sans-serif;
  font-size: 0.9rem;
  font-weight: 600;
  line-height: 1.45rem;
  margin-top: 1rem;
  margin-bottom: 0;
}

.product-card-desc {
  color: #8a8a8a;
  display: block;
  font-family: 'Open sans', sans-serif;
  font-size: 0.85rem;
}

.product-card-price {
  color: #3e3e3e;
  display: inline-block;
  font-size: 0.85rem;
  font-weight: 600;
  margin-top: 0.8rem;
}

.product-card-sale {
  color: #cacaca;
  display: inline-block;
  font-size: 0.85rem;
  margin-left: 0.3rem;
  text-decoration: line-through;
}

.product-card-colors {
  display: block;
  margin-top: 0.8rem;
}

.product-card-color-option {
  display: inline-block;
  height: 25px;
  width: 25px;
}


form .form-icons {
  text-align: center;
}

form .form-icons h4 {
  margin-bottom: 1rem;
}

form .form-icons .input-group-label {
  background-color: #1779ba;
  border-color: #1779ba;
}

form .form-icons .input-group-field {
  border-color: #1779ba;
}

form .form-icons .fa {
  color: white;
  width: 1rem;
}


</style>
</head>
<body>
<header>
<nav class="hover-underline-menu" data-menu-underline-from-center>
  <ul class="menu align-center">
      <li><a href="/SupCommerce/listProduct">List of product</a></li>
    <% if(request.getSession().getAttribute("username") != null) { %>
		<li><a href="/SupCommerce/auth/addProduct">Add product</a></li>
		<li><a href="/SupCommerce/auth/addCategory">Add category</a>
		<li><a href="/SupCommerce/logout">Logout</a></li>
		<%}else{ %>
		<li><a href="/SupCommerce/login">Login</a></li>
		<%} %>
  </ul>
</nav>
</header>
