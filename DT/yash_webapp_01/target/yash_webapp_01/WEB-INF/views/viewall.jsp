

<!DOCTYPE html>
<html >
  <head>
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

  </head>

  <body translate="no" >
  <jsp:include page="header.jsp"/>
  <div class="form-group">
    &nbsp;
</div>
  
<h4 align="center">Search for the products you are looking for</h4>
    <div class="container" ng-app="sortApp" ng-controller="mainController">
  
  
  
  <form>
    <div class="form-group">
      <div class="input-group">
        <div class="input-group-addon"><i class="fa fa-search"></i></div>


        <input type="text" class="form-control" placeholder="Search Your products" ng-model="searchBrand">
      </div>      
    </div>
  </form>
  
  
  
  <table class="table table-bordered table-striped">
    
<thead>
      <tr>
        <td>
          <a href="#" ng-click="sortType = 'brand'; sortReverse = !sortReverse">
            Brand
            <span ng-show="sortType == 'brand' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'brand' && sortReverse" class="fa fa-caret-up"></span>
            <span ng-show="sortType == 'brand' && sortReverse" class="fa fa-caret-up"></span>
            <span ng-show="sortType == 'brand' && sortReverse" class="fa fa-caret-up"></span>
            <span ng-show="sortType == 'brand' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
       
        <td>
          <a href="#" ng-click="sortType = 'model'; sortReverse = !sortReverse">
          Model 
            <span ng-show="sortType == 'model' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'model' && sortReverse" class="fa fa-caret-up"></span>
            </a>
        </td>
        
        <td>
          <a href="#" ng-click="sortType = 'os'; sortReverse = !sortReverse">
          OS
            <span ng-show="sortType == 'os' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'os' && sortReverse" class="fa fa-caret-up"></span>
          
          </a>
        </td>
       
        <td>
          <a href="#" ng-click="sortType = 'version'; sortReverse = !sortReverse">
          Version
            <span ng-show="sortType == 'version' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'version' && sortReverse" class="fa fa-caret-up"></span>
            
          </a>
        </td>
        
        <td>
          <a href="#" ng-click="sortType = 'peice'; sortReverse = !sortReverse">
          Price
            <span ng-show="sortType == 'peice' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'peice' && sortReverse" class="fa fa-caret-up"></span>
            
          </a>
        </td>
        <td><a href="#" ng-click="sortType = 'peice'; sortReverse = !sortReverse"></a>
         Details
         
        </td>
      </tr>
    </thead>
    
    <tbody>
      <tr ng-repeat="roll in sushi | orderBy:sortType:sortReverse | filter:searchBrand">
        <td>{{ roll.brand }}</td>
        <td>{{ roll.model }}</td>
        <td>{{ roll.os }}</td>
        <td>{{ roll.version }}</td>
        <td>{{ roll.price }}</td>
        <td><button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
        View
    </button></td>
        
      </tr>
    </tbody>
    
  </table>
  <!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
            </div>
            <div class="modal-body">
             
      
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Add to cart</button>
                <button type="button" class="btn btn-primary">Wishlist</button>
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

        <script>
      angular.module('sortApp', []).controller('mainController', function ($scope) {
    $scope.sortType = 'brand';
    $scope.sortReverse = false;
    $scope.searchBrand = '';
    $scope.sushi = [
        {
            brand: 'Samsung',
            model: 'Galaxy',
            os: 'Android',
            version: '4.6.4',
            price:'25000',
        },
        {
        	brand: 'Micromax',
            model: 'A111',
            os: 'Android',
            version: '4.4',
            price:'11000',
        },
        {
        	brand: 'Nokia',
            model: '800',
            os: 'Windows',
            version: '8',
            price:'25000',
        },
        {
        	brand: 'HTC',
            model: 'Desire Eye',
            os: 'Android',
            version: '4.5.7',
            price:'39000',
        }
    ];
});
      //# sourceURL=pen.js
    </script>
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

    <jsp:include page="footer.jsp"/>
  </body>
</html>