

<!DOCTYPE html>
<html >
  <head>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <script src="${req}/resources/js/angular.js"></script>
     <script src="http://code.angularjs.org/snapshot/angular.js"></script>
    <meta charset="UTF-8"> 


      <title>VanuShopping-Search your product</title>
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="./resources/my.css">
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/styles.css" rel="stylesheet">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
    
<link rel='stylesheet prefetch' href='//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css'>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
<!--[if lt IE 9]>
<script src=https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js></script>
<script src=https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js></script>
<![endif]-->
<script>!function(e,a,t,n,c,o,s){e.GoogleAnalyticsObject=c,e[c]=e[c]||function(){(e[c].q=e[c].q||[]).push(arguments)},e[c].l=1*new Date,o=a.createElement(t),s=a.getElementsByTagName(t)[0],o.async=1,o.src=n,s.parentNode.insertBefore(o,s)}(window,document,"script","//www.google-analytics.com/analytics.js","ga"),ga("create","UA-47210639-2","auto"),ga("send","pageview")</script><script type=application/ld+json>{ "@context": "http://schema.org/","@type": "Review","itemReviewed": {"@type": "Thing","name": "Article"},"author": {"@type": "Person","name": "Md Ashraf Malik"}, "reviewRating": {"@type": "Rating","ratingValue": "5","bestRating": "5"}, "publisher": { "@type": "Organization", "name": "Web Developer Bareilly" } }</script>
<style>

/* header */
html,body{height:100%; width:100%}
h1,h2,h3{font-weight:700}
header{position:relative; width:100%; background-size:cover; background-position:center; background-image:url(images/header.jpg); text-align:center}
header .wel{position: relative;text-align: center;padding: 100px 15px 100px;width: 100%; color:#eee}
.wel h1{font-weight:700; color:#fff}.brk{height:4px; border-radius:4px; background:#d9534f; margin:25px auto; display:block; width:60px}
.abs-back{background:rgba(29, 21, 24, 0.4); position:absolute; height:100%; width:100%; left:0; top:0}
/* who we */
.who-we{margin-top:50px; margin-bottom:50px}
.who-we h2{color:#d9534f;}
/* cards*/
.cards-row{padding-top:70px; padding-bottom:50px; background:#eee}
.thumbnail{padding:0; border-radius:0; border:none; box-shadow:0 2px 2px 0 rgba(0,0,0,.14),0 3px 1px -2px rgba(0,0,0,.2),0 1px 5px 0 rgba(0,0,0,.12)}
.thumbnail>img{width:100%; display:block}
.thumbnail h3{font-size:26px; color:#336}
.thumbnail h3,.card-description{margin:0; padding:8px 0; border-bottom:solid 1px #eee; text-align:center}
.thumbnail p{padding-top:8px; font-size:20px}
.thumbnail .btn{border-radius:0; box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12); font-size:20px}
.team-pic{height:150px !important; width:150px !important; border-radius:50%; margin-top:-75px; box-shadow:0 2px 5px 0 rgba(0,0,0,.4),0 2px 10px 0 rgba(0,0,0,.5); transition:all .2s ease-out}
.thumbnail:hover .team-pic{height:200px !important; width:200px !important; margin-top:-100px}
.thumbnail p.social{padding-top:15px; text-align:center}
.social a{color:#FFF; font-size:18px !important}
.social i.fa{height:36px; width:36px; text-align:center; line-height:36px; background:#069; border-radius:50%}
.social i.fa.fa-facebook{background:#43609C}
.social i.fa.fa-twitter{background:#2CA8D2}
.social i.fa.fa-linkedin{background:#428099}
.social i.fa.fa-google-plus{background:#ce4d39}


/* media */
@media (min-width:768px) { 


</style>
        <style>
      /*
  were using Bootstrap and Font Awesome
  http://bootstrapcdn.com
  
*/
.spacer { margin:0; padding:0; height:50px; }
 .popup-trigger { display: block; margin: 0 auto; padding: 20px; max-width: 260px; background: #4EBD79; color: #fff;
                 font-size: 18px; font-weight: 700; text-align: center; text-transform: uppercase; line-height: 24px; cursor: pointer; }
        .popup {display: none; position: absolute; top: 100px; left: 50%; width: 700px; margin-left: -350px; padding: 50px 30px;
            background: #fff; color: #333; font-size: 19px; line-height: 30px; border: 10px solid #150E2D; z-index: 9999;}
        .popup-mobile {position: relative; top: 0; left: 0; margin: 30px 0 0; width: 100%;}   
          .popup-btn-close {position: absolute; top: 8px; right: 14px; color: #4EBD79; font-size: 14px; font-weight: bold; text-transform: uppercase; cursor: pointer;} 

body { padding-top:50px; }
#footer{background:#336; padding-top:30px; padding-bottom:30px; text-align:center; border-top:solid 4px #303}
#footer p{padding:10px; color:#fff}
.dont-remove{color:#fff !important; text-decoration:none !important; font-weight:700}
.rights{display:inline-block; border-top:solid 1px rgba(103, 58, 183, 0.3)}
#footer{background:#336; padding-top:30px; padding-bottom:30px; text-align:center; border-top:solid 4px #303}
#footer p{padding:10px; color:#fff}
.dont-remove{color:#fff !important; text-decoration:none !important; font-weight:700}
.rights{display:inline-block; border-top:solid 1px rgba(103, 58, 183, 0.3)}
    </style>

    <script>
  window.console = window.console || function(t) {};
</script>

    
    
    <script>
  if (document.location.search.match(/type=embed/gi)) {
    window.parent.postMessage("resize", "*");
  }
</script>
  
  

      <style>
      /*
  were using Bootstrap and Font Awesome
  http://bootstrapcdn.com
*/

body { padding-top:50px; }
    </style>

    <script>
  window.console = window.console || function(t) {};
</script>

    
    
    <script>
  if (document.location.search.match(/type=embed/gi)) {
    window.parent.postMessage("resize", "*");
  }
</script>
<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
 $http.get("/pro/view")
  .then(function(response) {
      $scope.names= response.data;
  });
});
</script>

  </head>

  <body translate="no" >
  <jsp:include page="header.jsp"/>
  <h3 align="center">Search for the products you are looking for</h3>
  <div class="container">
    &nbsp;
  </div>
  

<c:set var="req" value="${pageContext.request.contextPath}" />
<spring:url value="/resources/images/product" var="productImages" />

<script src="${req}/resources/js/angular.js"></script>

<div ng-app="myApp" ng-controller="myCtrl" ng-init="test='${pid}'">

	<p>
		Search:<input type="text" ng-model="test" class="form-control" id="usr" />
	</p>

	<table border="1" width="50%"
		class="table table-hover table-responsive">
		<tr>
			<th ng-click="orderByMe('pid')">Product ID</th>
			<th ng-click="orderByMe('pbrand')">Product Brand</th>
			<th ng-click="orderByMe('pmodel')">Product Model</th>
			<th ng-click="orderByMe('pos')">Product Os</th>
			<th ng-click="orderByMe('pversion')">Product Version</th>
			<!-- <th ng-click="orderByMe('purl')">Product Image</th>-->
			<th ng-click="orderByMe('pprice')">Product Price</th>
			<th ng-click="">Image</th>
			<th ng-click=""></th>
		</tr>

		<tr ng-repeat="x in names | orderBy:myOrderBy | filter:test">
			<td>{{x.pid}}</td>
			<td>{{x.pbrand}}</td>
			<td>{{x.pmodel}}</td>
			<td>{{x.pos}}</td>
			<td>{{x.pversion}}</td>
			<td>{{x.pprice}}</td>
			<td><img ng-src="${productImages}/{{x.pid}}.jpg" width="50"
					height="50"></td>
			<td><a ng-href="/yash_webapp_01/pro/view/{{x.pid}}"
				class="btn btn-info" role="button" data-toggle="modal" data-target="#myModal">View</a></td>
		</tr>
	</table>
</div>
<script>
	var app = angular.module('myApp', []);
	app.controller('myCtrl', function($scope, $http) {
		$http.get("/yash_webapp_01/viewdetails").then(function(response) {
			$scope.names = response.data;
		});
		$scope.orderByMe = function(x) {
			$scope.myOrderBy = x;
		}
	});
</script>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
            </div>
            <div class="modal-body">
             
      <div class="panel pannel-default">
	<div class="panel-header" align="center">Product Form</div>
	<div class="panel-body">
 
		<form:form action="" method="post" modelAttribute="product" enctype="multipart/form-data">
			<table border="1" width="600" align="center">
				<tr>
					<td></td>
					<td><form:hidden path="pid" /></td>
				</tr>
				<tr>
					<td>Product Category</td>
					<td><form:input path="pcat" cssClass="form-control" disabled="true"/><error path="pcat" cssclass="error" />
					<span><form:errors  path="pcat" cssclass="error" disabled="true" /> </span></td>
				</tr>
				<tr>
					<td>Product Brand</td>
					<td><form:input path="pbrand" cssClass="form-control" disabled="true"/></td>

				</tr>
				<tr>
					<td>Product Model</td>
					<td><form:input path="pmodel" cssClass="form-control" disabled="true"/></td>

				</tr>
				<tr>
					<td>Product Os</td>
					<td><form:input path="pos" cssClass="form-control" disabled="true"/></td>

				</tr>
				<tr>
					<td>Product Version>
					<td><form:input path="pversion" cssClass="form-control" disabled="true"/></td>

				</tr>
				<tr>
					<td>Product Price</td>
					<td><form:input path="pprice" cssClass="form-control"  disabled="true"/></td>
				</tr>
				
				<tr>
					<td colspan=2 align="center">
					<form:hidden path="purl" />
					<img ng-src="${productImages}/${product.pid}.jpg" /></td>
				</tr>

			</table>
		</form:form>
	</div>
</div>
</table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <td><a ng-href="/yash_webapp_01/pro/displayone/{{x.pid}}"
				class="btn btn-info" <a  href="/yash_webapp_01/cart">Add to Cart</a>></a></td>
                
                            </div>
        </div>
    </div>
</div>
  
  <p class="text-center text-muted">

    
  </p>
  
  <p class="text-center">

  </p>
  
</div>
      <script src="//assets.codepen.io/assets/common/stopExecutionOnTimeout-53beeb1a007ec32040abaf4c9385ebfc.js"></script>

    <script src='//ajax.googleapis.com/ajax/libs/angularjs/1.3.2/angular.min.js'></script>


     <div class="popup">
     
      <span class="popup-btn-close">close</span>
    </div>
    
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    
    <script>
    // Popup Window
    var scrollTop = '';
    var newHeight = '100';

    $(window).bind('scroll', function() {
       scrollTop = $( window ).scrollTop();
       newHeight = scrollTop + 100;
    });
    
    $('.popup-trigger').click(function(e) {
       e.stopPropagation();
     if(jQuery(window).width() < 767) {
       $(this).after( $( ".popup" ) );
       $('.popup').show().addClass('popup-mobile').css('top', 0);
       $('html, body').animate({
        scrollTop: $('.popup').offset().top
      }, 500);   
     } else {
       $('.popup').removeClass('popup-mobile').css('top', newHeight).toggle();
     };
    });
    
    $('html').click(function() {
     $('.popup').hide();
    });

    $('.popup-btn-close').click(function(e){
      $('.popup').hide();
    });

    $('.popup').click(function(e){
      e.stopPropagation();
    });
    </script>
 <div class="container">
  <div class="container">
    &nbsp;
  </div>
   <div class="container">
    &nbsp;
  </div>
   <div class="container">
    &nbsp;
  </div>
   <div class="container">
    &nbsp;
  </div>
   <div class="container">
    &nbsp;
  </div>
   <div class="container">
    &nbsp;
  </div>
   <div class="container">
    &nbsp;
  </div>
   <div class="container">
    &nbsp;
  </div>
   <div class="container">
    &nbsp;
  </div>
   <div class="container">
    &nbsp;
  </div>
   <div class="container">
    &nbsp;
  </div>
    &nbsp;
  </div>
<jsp:include page="footer.jsp" />
  </body>
  </html>