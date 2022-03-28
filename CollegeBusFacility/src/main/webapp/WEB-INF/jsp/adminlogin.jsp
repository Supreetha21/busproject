<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1" />
<style>
* {
box-sizing: border-box;
}





body {
width: 100%;
height: 100vh;
margin: 0;
font-family: Arial, Helvetica, sans-serif;
background-image: url("https://www.n-able.com/wp-content/uploads/2021/04/blog-local_admin_rights.jpeg");
background-size: 110%;
background-position: -150px 0px;



}





.header {
overflow: hidden;
background-color: #141414;
padding: 10px 10px;
color: #fff;
}





.header a {
float: left;
color: black;
text-align: center;
padding: 12px;
text-decoration: none;
font-size: 18px;
line-height: 25px;
border-radius: 4px;
}
.header a:hover {
color: white;
}





.header a.active {
color: white;
}





.header-right {
float: right;
}
form {
border: 3px solid #f1f1f1;
margin: 0 500px;
margin-top: 10%;
background: linear-gradient(#12f7b2b6, #bdf006be);
position:"absolute";
}





input[type="text"],
input[type="password"],
select {
padding: 12px 20px;
margin: 8px 0;
display: inline-block;
border: 1px solid #ccc;
box-sizing: border-box;
-moz-box-align: center;
}





input[type="submit"] {
background-color: #04aa6d;
color: white;
padding: 14px 20px;
margin: 5% 40%;
border: none;
cursor: pointer;
}





button:hover {
opacity: 0.8;
}





.cancelbtn {
width: auto;
padding: 10px 18px;
background-color: #f44336;
}





.container {
padding: 16px;
}





.head {
text-align: center;
}
</style>
</head>
<body>



<form method="post" action="adminlogin">
<h2 class="head" href="">Admin Login</h2>
<div class="container">
<label for="fname" style="padding-right: 10px"><b>Userid : </b></label><br>
<input name="userid" type="text" placeholder="Enter Userid" id="id" required /><br />
<label for="psw" style="padding-right: 10px"><b>Password : </b></label><br>
<input type="password" placeholder="Enter Password" name="password" required /><br />
<input type="submit" value="Login">



<font color="red"  >${msg}</font>
</div>



</form>



</body>
</html>