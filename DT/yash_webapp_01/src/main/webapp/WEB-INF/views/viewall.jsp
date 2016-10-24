

<!DOCTYPE html>
<html >
  <head>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    <meta charset="UTF-8">


      
    
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
 $http.get("/shop/displayallproduct")
  .then(function(response) {
      $scope.names= response.data;
  });
});
</script>

  </head>

  <body translate="no" >
  <jsp:include page="header.jsp"/>
  

<c:set var="req" value="${pageContext.request.contextPath}" />

<script src="${req}/resources/js/angular.js"></script>

<div ng-app="myApp" ng-controller="myCtrl" ng-init="test='${pid}'"> 

<p>Search:<input type="text" ng-model="test"></p>


<table border="1" width="50%" class="table table-hover table-responsive" >
<tr>
<th ng-click="orderByMe('pid')">Product ID</th>
<th ng-click="orderByMe('pcat')">Product Category</th>
<th ng-click="orderByMe('pbrand')">Product Brand</th>
<!-- <th ng-click="orderByMe('purl')">Product Image</th>-->
<th ng-click="orderByMe('pmodel')">Product Model</th>
<th ng-click="orderByMe('pos')">Product OS</th>
<th ng-click="orderByMe('pversion)">Product Version</th>
<th ng-click="orderByMe('pprice')">Product Price</th>
<th ng-click="">Image</th>
<th ng-click="">View</th>
<th ng-click="">Add To Cart</th>
</tr>

<tr ng-repeat="x in names | orderBy:myOrderBy | filter:test">
<td>{{x.pid}}</td>
<td>{{x.pcat}}</td>
<td>{{x.pbrand}}</td>
<td>{{x.pmodel}}</td>
<td>{{x.pos}}</td>
<td>{{x.pversion}}</td>
<td>{{x.pprice}}</td>
<td>{{x.purl}}</td>

<!-- <td><img src="/shop/resources/images/{{x.purl}}.jpg" width="50" height="50"></td> -->
<td><a href="/shop/displayallproduct/{{x.pid}}" class="btn btn-info" role="button">View</a></td>
<td> <a href="#" class="btn btn-info" role="button">Add to cart</a></td>
</tr>
</table>
</div>

<jsp:include page="footer.jsp" />
  </body>
  </html>