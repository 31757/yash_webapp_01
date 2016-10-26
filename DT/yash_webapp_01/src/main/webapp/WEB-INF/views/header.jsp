<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<nav class="navbar navbar-inverse navbar-fixed-top">

	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">VanuShopping</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="<c:url value="/index"/>">Home</a></li>
			<li><a href="<c:url value="/about"/>">About</a></li>
			<li><a href="<c:url value="/Product"/>">Categories</a></li>
			<li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Categories
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Mobile</a></li>
          <li><a href="#">TV</a></li>
          <li><a href="#">Refrigerator</a></li>
          <li><a href="#">Laptop</a></li>
          <li><a href="#">Computer</a></li>
          <li><a href="#">Washing Machine</a></li>
          <li><a href="#">Refrigerator</a></li> 
          <li><a href="#">Home Appliance</a></li>
          <li><a href="#">Music Player</a></li>
        </ul>
			<li><a href="<c:url value="/contact"/>">Contact</a></li>
			<li><a href="<c:url value="/viewdetails"/>">Search Products</a></li>
			
		</ul>
		<ul class="nav navbar-nav navbar-right">
<sec:authorize access="isAnonymous()">
			<li><a href="<c:url value="/login"/>"><span
					class="glyphicon glyphicon-log-in"></span> Log In</a></li>
			<li><a href="<c:url value="/reg/new"/>"><span
					class="glyphicon glyphicon-user"></span> Sign Up</a></li>
			<li><a href="<c:url value="/cart/cartview"/>"><span
					class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
					
</sec:authorize>
			<sec:authorize access="hasRole('ROLE_ADMIN')">
				<li><a href="<c:url value="/logout"/>"><span
						class="glyphicon glyphicon-log-in"></span> Log Out</a></li>
						<li><a href="<c:url value="/pro/view"/>">Admin</a></li>
			</sec:authorize>

			<sec:authorize access="hasRole('ROLE_USER')">
				<li><a href="<c:url value="/index"/>"><span
						class="glyphicon glyphicon-log-in"></span> Log Out</a></li>
				<li><a href="<c:url value="/cart/cartview"/>"><span
						class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
			</sec:authorize>
		</ul>
	</div>
</nav>
