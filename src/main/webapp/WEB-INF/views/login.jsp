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
  <style>
.bootstrap-iso .form-control:focus{border-color: #5cb85c;  box-shadow: none; -webkit-box-shadow: none;}
.bootstrap-iso .has-error .form-control:focus{box-shadow: none; -webkit-box-shadow: none;}

</style>
</head>
<body>
<form class="form-horizontal" action="checkLogin" method="post">
<div class="form-group">
<label class="col-sm-offset-2 control-label col-sm-2 pt-2" for="email">Enter UserName</label>
 <div class="col-sm-4"> 
<input type="text" name="username" class="form-control" placeholder="Enter Username"/>
</div>
</div>
<div class="form-group">
<label class="col-sm-offset-2 control-label col-sm-2" for="password">Enter Password</label>
 <div class="col-sm-4"> 
<input type="password"  name="password" class="form-control" placeholder="enter password "/>
</div>
</div>
<div class="col-sm-offset-6 col-sm-8 pt-2 pb-4">
<input  type="submit"  value="Login"  class="btn btn-dark"/>
</div>
</form>
</body>
</html>