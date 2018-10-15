<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body >
<div class="container">
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
 <ul class="navbar-nav">
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
<br>
<br>
<div class="container">
<div class="row">
<div class="col-sm-4">
<img src="resources/${pro.id}.jpg" width="350px" height="500px">
</div>
<div class="col-sm-8">
<div class="card-body">
<div class="card-deck">
  <div class="card bg-light">
<h2 class="text-center"  >Product-id:${pro.id }</h2>



<h2 class="text-center" >Product name:${pro.name }</h2>
<h2 class="text-center"  >Category name:${pro.categoryName }</h2>
<h2 class="text-center"  >Product description:${pro.productDescription }</h2>
<h2 class="text-center"  >Supplier name:${pro.supplierName}</h2>
<h2 class="text-center"  >Stock available:${pro.stock }</h2>
</div>
</div>
</div>
<form action="SendToCart">
<label class="col-sm-offset-2 control-label col-sm-2" for="quantity">Enter Quantity</label>
<div class="col-sm-4"> 
<input type="text" name="quantity" class="form-control">
<input type="hidden" name="id" value="${pro.id}">
</div>
<div class="col-sm-offset-8 col-sm-12 pt-4">
<input type="submit" class= "btn btn-success" value="AddToCart" >
</div>
</form>
</div>
</div>
</div>
</body>
</html>