<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
   <meta charset="utf-8">
   
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
  
</head>
<body>
<img src="resources/pipe1.jpg"/ width="1350" height="350">
<br>
<br>
<div class="container">
<div class="jumbotron text-center"  style="margin-bottom:0">

  <div class="container">
  <div class="row">
  <div class="col-sm-4">
 <img src="resources/gif.webp"/>
  </div>
  <div class="col-sm-8">
  <br>
  <br>
  <p  class="text-primary">HARDWARE MART</p>
  
  <p class="text-danger">you can purchase all household hardware products here...!!</p> 
</div>
</div>
</div>
</div>
</div>
<br>
<div class="container">
<nav class="navbar navbar-inverse">
 <ul class="nav navbar-nav">
   <li class="nav-item active">
     
  <a class="nav-link" href="login"> Login</a>


</li>
<li class="nav-item active">
<a class="nav-link" href="register">Register</a>
  </li>
  <li class="nav-item active">
<a class="nav-link" href="user">Products</a>
  </li>
    <li class="nav-item active">
<a class="nav-link" href="logout">Logout</a>
  </li>
  
</ul>
</nav>
</div>

<div class="container">
 <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="500">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="resources/prayag3.jpg" alt="Chania" width="460" height="345">
        <div class="carousel-caption">
          <h3>Pipes And Fittings</h3>
          <p>used in washareas</p>
        </div>
      </div>

    
      <div class="item">
        <img src="resources/prayag1.jpg" alt="Flower" width="460" height="345">
        <div class="carousel-caption">
          <h3>Pipes And Fittings</h3>
          <p>All kinds of sanitary ware</p>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>


 
    </div>
    <div class="jumbotron text-center" style="margin-bottom:0">
  <H2>Our Values</H2>
  <p class="text-danger">TO Provide the best quality and stainless steel sanitary products and pipe fittings And we also make faucets,sink,sanitaryware,pipes and cockroach traps.</p>
<H2>Trust only the best..!!<img src="resources/smily2.png" width="70" height="70"/></H2>
</div>
</body>
</html>