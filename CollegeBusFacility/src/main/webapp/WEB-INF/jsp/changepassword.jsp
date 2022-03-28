<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Change Password</title>
<style>
body {
background-image:url(https://cdn.publish0x.com/prod/fs/images/3e87343e8bd9bcd96b5bae962723405945e4f68551bc312d8bfba7e0574a092c.jpeg);

background-size: cover;
display: flex;
justify-content: center;
align-items: center;
height: 100vh;
flex-direction: column;
}



*{
font-family: sans-serif;
box-sizing: border-box;
}



form {
width: 500px;
border: 2px solid #ccc;
padding: 30px;
background: #fff;
border-radius: 15px;
}



h2 {
text-align: center;
margin-bottom: 40px;
}



input {
display: block;
border: 2px solid #ccc;
width: 95%;
padding: 10px;
margin: 10px auto;
border-radius: 5px;
}
label {
color: rgb(12, 11, 11);
font-size: 18px;
padding: 10px;
}



button {
float:left;
background: rgb(46, 241, 62);
padding: 10px 15px;
color: rgb(14, 13, 13);
border-radius: 5px;
margin-right: 10px;
border: none;
}
button:hover{
opacity: .7;
}





</style>
</head>
<body>
<form action="forgetpassword" method="get">
<h2>Change Password</h2>
<label>Old Password:</label>
<input type="password" name="password" placeholder="Old Password"> <br>
<label>New Password:</label>
<input type="password" name="np" placeholder="New Password"></input><br>
<label>Confirm New Password:</label>
<input type="password" name="c_np" placeholder="Confirm New Password"><br>
<button type="submit" >UPDATE`</button>
</form>
</body>
</html>