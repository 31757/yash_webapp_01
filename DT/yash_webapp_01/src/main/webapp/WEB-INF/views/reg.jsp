<!DOCTYPE html>
<html>
<head>
<style>
 
</style>

<!-- let's add nav css -->

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="./resources/my.css">
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/styles.css" rel="stylesheet">
<link rel="stylesheet" href="css/demo.css">
	<link rel="stylesheet" href="css/footer-basic-centered.css">
	<link rel="stylesheet" href="./resources/crunchify.css">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  

<!-- Finish adding tags -->
  
<title>Happy World</title>
<style type="text/css">
#footer{background:#336; padding-top:30px; padding-bottom:30px; text-align:center; border-top:solid 4px #303}
#footer p{padding:10px; color:#fff}
.dont-remove{color:#fff !important; text-decoration:none !important; font-weight:700}
.rights{display:inline-block; border-top:solid 1px rgba(103, 58, 183, 0.3)}
body {
	background-image: url('http://crunchify.com/bg.png');
}
</style>
</head>
<body>
  <jsp:include page="header.jsp" />
  
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<c:set var="cp" value="${pageContext.request.contextPath}" />
  
<div class="container"> <!-- container start -->
<div class="row"><!-- row Start -->

<div class="col-lg-3">
<!-- empty column for space from right -->
</div>
<div class="col-lg-6"><!-- col Start -->
    <article role="login">
                <h3 class="text-center"><i class="fa fa-lock"></i>NEW USER</h3>

<form:form method="POST" action="${cp}/yash_webapp_01/index" modelAttribute="user">
                
                 <div class="form-group">
                    <form:hidden path="uid"/>
                  </div>
                
                  <div class="form-group">
                    <form:input path="name" class="form-control"
							placeholder="User Name" required="required" />
							<form:errors path="name" style="color:red;" />
                  </div>
                  <div class="form-group">
                     <form:input path="email" type="email" class="form-control"
							placeholder="User email" required="required" />
							<form:errors path="email" style="color:red;" />
                  </div>
                        <div class="form-group">
                    <form:input path="password" type="password" class="form-control"
							placeholder="User Password" required="required" />
							<form:errors path="password" style="color:red;" />
                  </div>
                  <div class="form-group">
                    <form:input path="password" type="address" class="form-control"
							placeholder="Enter your address" required="required" />
							<form:errors path="address" style="color:red;" />
                  </div>
                  
                        <div class="form-group">
                    <form:hidden path="enabled" value="true"/>
                    <form:errors path="enabled" style="color:red;" />
                  </div>

      <div class="form-group">
                    <form:hidden path="role" value="ROLE_USER"/>
                    <form:errors path="role" style="color:red;" />
                  </div>
                  
                  
                  <div class="form-group">
                    <div class="checkbox">
                      <label>
                        <input type="checkbox"> Please accept the terms and conditions to proceed with your request.
                      </label>
                    </div>
                  </div>
                  <div class="form-group">
                    <input type="submit" class="btn btn-success btn-block"  value="REGISTER">
                  </div>
                
                </form:form>

                <footer role="signup" class="text-center">
                  <ul>
                    <li>
                      <a href="#">Terms of Use</a>
                    </li>
                    <li>
                      <a href="#">Privacy Statement</a>
                    </li>
                  </ul>
                </footer>

              </article>
    </div> <!-- col over -->
    
    <div class="col-lg-3">
<!-- empty column for space from left -->
</div>
    
    </div> <!-- Row over -->
    
    </div><!-- Contain over -->
  <jsp:include page="footer.jsp" />
  </body>
  </html>