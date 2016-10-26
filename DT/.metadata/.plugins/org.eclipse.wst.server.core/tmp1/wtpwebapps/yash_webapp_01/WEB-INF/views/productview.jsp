<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources/images/product" var="productImages" />
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="req" value="${pageContext.request.contextPath}" />
<c:set var="f"
	value="file:///C:/ms_web_app/shop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shop/resources/images/product" />


<c:set var="fp" value="shop/resources/images/product/" />

<link rel="stylesheet" type="text/css" href="${css}/style.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="./resources/my.css">
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/styles.css" rel="stylesheet">
<link rel="stylesheet" href="css/demo.css">
<link rel="stylesheet" href="css/footer-basic-centered.css">
<link rel="stylesheet" href="./resources/crunchify.css">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700'
	rel='stylesheet'>
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700'
	rel='stylesheet'>
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700'
	rel='stylesheet'>
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css"
	rel="stylesheet">
<!--[if lt IE 9]>
<script src=https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js></script>
<script src=https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js></script>
<![endif]-->
<script>
	!function(e, a, t, n, c, o, s) {
		e.GoogleAnalyticsObject = c, e[c] = e[c] || function() {
			(e[c].q = e[c].q || []).push(arguments)
		}, e[c].l = 1 * new Date, o = a.createElement(t), s = a
				.getElementsByTagName(t)[0], o.async = 1, o.src = n,
				s.parentNode.insertBefore(o, s)
	}(window, document, "script", "//www.google-analytics.com/analytics.js",
			"ga"), ga("create", "UA-47210639-2", "auto"),
			ga("send", "pageview")
</script>
<script type=application/ld+json>{ "@context": "http://schema.org/","@type": "Review","itemReviewed": {"@type": "Thing","name": "Article"},"author": {"@type": "Person","name": "Md Ashraf Malik"}, "reviewRating": {"@type": "Rating","ratingValue": "5","bestRating": "5"}, "publisher": { "@type": "Organization", "name": "Web Developer Bareilly" } }</script>
<style>

/* header */
html, body {
	height: 100%;
	width: 100%
}

h1, h2, h3 {
	font-weight: 700
}

header {
	position: relative;
	width: 100%;
	background-size: cover;
	background-position: center;
	background-image: url(images/header.jpg);
	text-align: center
}

header .wel {
	position: relative;
	text-align: center;
	padding: 100px 15px 100px;
	width: 100%;
	color: #eee
}

.wel h1 {
	font-weight: 700;
	color: #fff
}

.brk {
	height: 4px;
	border-radius: 4px;
	background: #d9534f;
	margin: 25px auto;
	display: block;
	width: 60px
}

.abs-back {
	background: rgba(29, 21, 24, 0.4);
	position: absolute;
	height: 100%;
	width: 100%;
	left: 0;
	top: 0
}
/* who we */
.who-we {
	margin-top: 50px;
	margin-bottom: 50px
}

.who-we h2 {
	color: #d9534f;
}
/* cards*/
.cards-row {
	padding-top: 70px;
	padding-bottom: 50px;
	background: #eee
}

.thumbnail {
	padding: 0;
	border-radius: 0;
	border: none;
	box-shadow: 0 2px 2px 0 rgba(0, 0, 0, .14), 0 3px 1px -2px
		rgba(0, 0, 0, .2), 0 1px 5px 0 rgba(0, 0, 0, .12)
}

.thumbnail>img {
	width: 100%;
	display: block
}

.thumbnail h3 {
	font-size: 26px;
	color: #336
}

.thumbnail h3, .card-description {
	margin: 0;
	padding: 8px 0;
	border-bottom: solid 1px #eee;
	text-align: center
}

.thumbnail p {
	padding-top: 8px;
	font-size: 20px
}

.thumbnail .btn {
	border-radius: 0;
	box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px 0
		rgba(0, 0, 0, .12);
	font-size: 20px
}

.team-pic {
	height: 150px !important;
	width: 150px !important;
	border-radius: 50%;
	margin-top: -75px;
	box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .4), 0 2px 10px 0
		rgba(0, 0, 0, .5);
	transition: all .2s ease-out
}

.thumbnail:hover .team-pic {
	height: 200px !important;
	width: 200px !important;
	margin-top: -100px
}

.thumbnail p.social {
	padding-top: 15px;
	text-align: center
}

.social a {
	color: #FFF;
	font-size: 18px !important
}

.social i.fa {
	height: 36px;
	width: 36px;
	text-align: center;
	line-height: 36px;
	background: #069;
	border-radius: 50%
}

.social i.fa.fa-facebook {
	background: #43609C
}

.social i.fa.fa-twitter {
	background: #2CA8D2
}

.social i.fa.fa-linkedin {
	background: #428099
}

.social i.fa.fa-google-plus {
	background: #ce4d39
}

/* media */
@media ( min-width :768px) {
</style>
<body>

	<jsp:include page="header.jsp" />
	<div class="form-group">&nbsp;</div>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<c:set var="req" value="${pageContext.request.contextPath}" />


	<div class="panel panel-primary">
		<div class="panel-heading" align="center">
			<h3>Product Form</h3>
		</div>
		<div class="panel-body">


			<form:form action="${req}/pro/save" method="POST"
				modelAttribute="product" enctype="multipart/form-data">
				<table border="5" width="800" align="center">
					<tr class="success">
						<td class="table-active"></td>
						<td class="table-info"><form:hidden path="pid" /></td>
					</tr>
					<tr class="success">
						<td class="info">Product Category</td>
						<td class="table-info"><form:input path="pcat"
								cssClass="form-control"/></td>
					</tr>

					<tr class="success">
						<td class="info">Product Brand</td>
						<td class="table-info"><form:input path="pbrand"
								cssClass="form-control" /></td>
	

					</tr>
					<tr class="success">
						<td class="info">Product Model</td>
						<td class="table-info"><form:input path="pmodel"
								cssClass="form-control" /></td>

					</tr>

					
					<tr class="success">
						<td class="info">Product Price</td>
						<td class="table-info"><form:input path="pprice"
								cssClass="form-control" /></td>
					</tr>
					<tr class="success">
						<td class="info">Product Description</td>
						<td class="table-info"><form:input path="pdesc"
								cssClass="form-control" /></td>

					</tr>
					<tr class="success">
						<td colspan=2 align="center"><form:hidden path="purl" /> <form:input
								path="file" type="file" cssClass="form-control"
								placeholder="Select File" required="required" /> <img
							src="${req}/resources/images/${p.purl}" /></td>
					</tr>

					<tr align="center" class="table-active">
						<td align="center"><input type="submit"
							class="btn btn-success" value="Save" /></td>
						<td align="center"><input type="reset" class="btn btn-info"
							value="Reset" /></td>
					</tr>
				</table>
			</form:form>

		</div>
	</div>

	<table class="table table-striped">
		<tr>
			<th>Category</th>
			<th>Brand</th>
			<th>Model</th>
			<th>Price</th>
			<th>Description</th>
			<th>Image</th>
			<th>&#160;</th>
		</tr>

		<c:forEach items="${products}" var="product">
			<tr>
				<td>${product.pcat}</td>
				<td>${product.pbrand}</td>
				<td>${product.pmodel}</td>
				<td>${product.pprice}</td>
				<td>${product.pdesc}</td>
				<td>${product.purl}</td>
				<td><a href="${req}/pro/view/${product.pid}"
					class="btn btn-sm btn-primary">Edit <span
						class="glyphicon glyphicon-pencil"></span></a>&#160; <a
					href="${req}/pro/delete/${product.pid}"
					class="btn btn-sm btn-primary">Delete <span
						class="glyphicon glyphicon-trash"></span></a></td>
			</tr>
		</c:forEach>
	</table>
	<div class="form-group">&nbsp;</div>
	<div class="form-group">&nbsp;</div>
	<div class="form-group">&nbsp;</div>

	<jsp:include page="footer.jsp" />
</body>
</html>