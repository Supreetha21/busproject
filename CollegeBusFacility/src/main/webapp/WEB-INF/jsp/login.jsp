<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="style.css">
<!---we had linked our css file----->



<style>
*
{
margin: 0;
padding: 0;
box-sizing: border-box;
}
.full-page
{
height: 100%;
width: 100%;
background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(college.JPG);
background-position: center;
background-size: cover;
position: absolute;



}
.navbar
{
display: flex;
align-items: center;
padding: 20px;
padding-left: 50px;
padding-right: 30px;
padding-top: 50px;
}
nav
{
flex: 1;
text-align: right;
}
nav ul
{
display: inline-block;
list-style: none;
}
nav ul li
{
display: inline-block;
margin-right: 70px;
}
nav ul li a
{
text-decoration: none;
font-size: 20px;
color: white;
font-family: sans-serif;
}
nav ul li button
{
font-size: 20px;
color: white;
outline: none;
border: none;
background: transparent;
cursor: pointer;
font-family: sans-serif;
}
nav ul li button:hover
{
color: aqua;
}
nav ul li a:hover
{
color: aqua;
}
a
{
text-decoration: none;
color: rgba(240, 229, 233, 0.973);
font-size: 28px;
}
#login-form
{
display: none;
}
.form-box
{
width:380px;
height:480px;
position:relative;
margin:2% auto;
background:rgba(0,0,0,0.3);
padding:10px;
overflow: hidden;
}
.button-box
{
width:220px;
margin:35px auto;
position:relative;
box-shadow: 0 0 20px 9px #ff61241f;
border-radius: 30px;
}
.toggle-btn
{
padding:10px 30px;
cursor:pointer;
background:transparent;
border:0;
outline: none;
position: relative;
}
#btn
{
top: 0;
left:0;
position: absolute;
width: 110px;
height: 100%;
background: #F3C693;
border-radius: 30px;
transition: .5s;
}
.input-group-login
{
top: 150px;
position:absolute;
width:280px;
transition:.5s;
}
.input-group-register
{
top: 120px;
position:absolute;
width:280px;
transition:.5s;
}
.input-field
{
width: 100%;
padding:10px 0;
margin:5px 0;
border-left:0;
border-top:0;
border-right:0;
border-bottom: 1px solid #999;
outline:none;
background: transparent;
}
.submit-btn
{
width: 85%;
padding: 10px 30px;
cursor: pointer;
display: block;
margin: auto;
background: #F3C693;
border: 0;
outline: none;
border-radius: 30px;
}
.check-box
{
margin: 30px 10px 34px 0;
}
span
{
color:#777;
font-size:12px;
bottom:68px;
position:absolute;
}
#login
{
left:50px;
}
#login input
{
color:white;
font-size:15;
}
#register
{
left:450px;
}
#register input
{
color:white;
font-size: 15;
}
</style>

</head>
<body style="background-image: url(https://media.istockphoto.com/photos/hands-protecting-personal-data-information-on-tablet-information-and-picture-id1325214557?b=1&k=20&m=1325214557&s=170667a&w=0&h=VV9UeVy2lFtf6Zc5Q128JUoOOmCrl4KhJVDMFSdMn_8=);
background-repeat: no-repeat;
background-attachment: fixed;
background-size: cover;">





<div class="full-page">
<div class="navbar">
<div action="login">
<a  >College Bus Management System</a>

</div>
<nav>
<div class="container-fluid">
		<a class="navbar-brand" href="adminlogin">Admin</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a class="navbar-brand" href="studentfaclogin">Student/faculty</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a class="navbar-brand" href="register">Register</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
	</div>
</nav>
</div>
</div>


</body>
</html>