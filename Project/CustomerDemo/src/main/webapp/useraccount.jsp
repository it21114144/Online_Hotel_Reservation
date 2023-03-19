<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Profile</title>
</head>
<body>
<div class = "head">
<p id="logo" align = "center"> Paradise <span class = "logonm"> Beach Resort </span> </p> <img src = "images/logo.jpg" class = "logo"> 

	<div class = "topnav"> 
		<a class = "active" href = "home.html"> Home </a>
		<a class = "active" href = "#"> News </a>
		<a class = "active" href = "#"> About </a>
		<a class = "active" href = "#"> Rooms </a>
		<a class = "active" href = "#"> Meal Packages </a>
		<a class = "active" href = "#"> Bill </a>
		<a class = "active" href = "#"> Feedback </a>
		<a class = "active" href = "#"> Blog </a>
		<a class = "active" href = "#"> Contact </a>
		<a class = "active" id = "log" href = "login.jsp"> Login </a>
	</div>
	
	
</div>

	
	<div class = "center" >
	<table>
	<c:forEach var="cus" items="${customerDetails}">
	
	<c:set var = "id" value = "${cus.id}"/>
	<c:set var = "name" value = "${cus.name}"/>
	<c:set var = "email" value = "${cus.email}"/>
	<c:set var = "phone" value = "${cus.phone}"/>
	<c:set var = "nic" value = "${cus.nic}"/>
	<c:set var = "username" value = "${cus.username}"/>
	
	<br>
	<u> <h2 align = "center"> My Profile </h2> </u><br><br>
	<div align = "left"> 
	<label class = "name"> Customer ID :  </label> <label class = "value"> ${cus.id} </label>  <br><br>
	<label class = "name"> Customer Name : </label> <label class = "value"> ${cus.name} </label> <br><br>
	<label class = "name"> Email Address : </label> <label class = "value"> ${cus.email}</label>  <br><br>
	<label class = "name"> Mobile Number : </label> <label class = "value">${cus.phone}</label> <br><br>
	<label class = "name"> NIC Number : </label> <label class = "value"> ${cus.nic} </label> <br><br>
	<label class = "name"> User Name : </label> <label class = "value"> ${cus.username} </label>  <br><br>
	</div>
	</c:forEach>
	</table>
	<c:url value = "updatecustomer.jsp" var = "updateprofile">
		<c:param name = "id" value = "${id}"/>
		<c:param name = "name" value = "${name}"/>
		<c:param name = "email" value = "${email}"/>
		<c:param name = "phone" value = "${phone}"/>
		<c:param name = "nic" value = "${nic}"/>
		<c:param name = "uname" value = "${username}"/>
	</c:url>
	<br> 
	<div align = "center">
	<a href = "changepassword.jsp" class = "text2"> <i> <b> Change My Password </b> </i> </a> <br> <br>
	<a href = "${updateprofile}">
	<input type = "button" name = "update" value = "Edit my Profile">
	</a>
	
	<c:url value = "deletecustomer.jsp" var = "deleteaccount"> 
		<c:param name = "id" value = "${id}"/>
		<c:param name = "name" value = "${name}"/>
		<c:param name = "email" value = "${email}"/>
		<c:param name = "phone" value = "${phone}"/>
		<c:param name = "nic" value = "${nic}"/>
		<c:param name = "uname" value = "${username}"/>
	
	</c:url>
	
	<a href = "${deleteaccount}">
	<br>
	<input type = "button" name = "delete" value = "Delete my Account">
	</a> 
	<br>
	</div>
	<a href = "logout.jsp" class="text1"> <div align = "center"> <b> Log Out </b> </div> </a> <br>
	</div>
	</div>
</body>
<footer>
<br>
	<div class = "icon">
		<p class = "p3">Follow Us !</p>
		<a href = "#"><img src = "images/facebook1.png" class = "img"> </a>
		<a href = "#"><img src = "images/instagram.png" class = "img"> </a>
		<a href = "#"><img src = "images/twitter.png" class = "img"></a>
		<a href = "#"><img src = "images/linkedin.png" class = "img"></a>
	</div>
	<div class = "contact">
		<p class = "c1"> Contact Us !</p> <p class = "c2"> +94 011 2 345 678 <br> paradisebeachresort@company.com <br> www.paradisebeachresort.lk </p>
	</div>
	<h3> Copyright &copy; 2022 Paradise Beach Resort. All right reserved </h3><br><br>
</footer>
	<style>
		.logo{
			width:20%;
			height:60%;
			border-radius:50%;
			top:40px;
			position:absolute;
			left:5%;
		}
		
		.logonm{
			top:100px;
			font-size:70px;
			font-family:Freestyle Script;
			left:50%;
			position:absolute;
		}
		
		#logo{
			top:-60px;
			font-size:90px;
			transform:translate(-50% -50%);
			font-family:Jokerman;
			position:relative;
		}
	
		body{
			background-image:url("images/image1.jpg");
			background-position:center;
			background-size:cover;
			width:400px;
			height:1500px;
		}
		
		.center {
			box-shadow:0 5px 30px black;
			width:525px;
			height:625px;
			background-color:rgba(200 , 200 , 200 , 0.5);
			color:#000137;
			top:125%;
			left:50%;
			position:absolute;
			transform:translate(-50% , -50%);
			box-sizing:border-box;
			padding:0px 45px;
		
		}
		
		.name{
			font-size:20px;
			font-weight:bold;
			grid-row:auto;
		}
		
		.value{
			font-size:20px;
			font-weight:bold;
			grid-row:auto;
			float:right;
		}
		
		input[type = "text"] , [type = "password"]
		{
			width : 50% ;
			padding: 6px ;
			float:right;
			font-size:14px;
			border:2px solid;
			border-radius:16px;
		 	text-align: center;
		 	border-style:none;
		}
		
		
		input[type = "button"] {
		  background-color: #070b24;
		  color: white;
		  padding: 10px 20px;
		  margin: 8px 0;
		  border: none;
		  cursor: pointer;
		  font-size:16px;
		  border-radius:12px;
		  width: 45%;
		  font-weight:bold;
		  opacity:0.8;
		}
		
		
		.text {
			font-size:20px;
			color:black;
			display:inline-block;
			
		}
			
		.text1 {
			font-size:20px;
			color:#02023f;
		}
		
		.text2{
			font-size:20px;
			color:#090825;
			font-family:calibri;
			
		}
		
		
		a{
			text-decoration:none;
			color:white;
			font-size:18px;
			padding: 0px 3px;
		}
		
		.topnav{
			background-color:#333;
			overflow:hidden;
			width:100%;
			
		}
		
		.topnav a{
			float:left;
			color:#f2f2f2;
			text-align:center;
			padding:14px 18px;
			text-decoration:none;
			font-size:16px;
			font-family:calibri;
		}
		
		.topnav a:hover{
			background-color:#ddd;
			color:black;
		
		}
		
		#log{
			float:right;
			background-color:#090825;
			color:white;
		}
		
		.head{
			background-color:#090825;
			background:rgba(100 , 100 , 100 , 0.7);
			position: absolute;
			top:0;
		  	left:0;
		  	right:0;
		  	width:100%;
		  	height:auto;
		  	padding-top:40px;
		  	color:#fff;
		 
		}
		
		
		footer {
			  position: absolute;
			  right:0;
			  left:0;
			  bottom: -900px;
			  height:60%;
			  width: 100%;
			  background: #111;
			  color:#fff;
			  background:rgba(0 , 0 , 0 , 0.9);
		
			}
		
		footer  h3{
		   color: grey;
		   text-align:left;
		   float:right;
		   font-family:calibri;
		   padding:50px;
		}

		
		.body{
			background-color:#333;
			overflow:hidden;
			width:50%;
			right:20px;
		}
		
		.body a{
			float:left;
			color:#f2f2f2;
			text-align:center;
			padding:14px 20px;
			text-decoration:none;
			font-size:18px;
			font-family:calibri;
		}
		
		.body a:hover{
			background-color:#ddd;
			color:black;
		
		}
		
		#aval{
			background-color:#090825;
			color:white;
			float:right;
		}
		
		.p2{
			font-family:sans-serif;
			color:#FFFDE7;
			font-size :20px;
		}
		
		.p1{
			 font-size :60px;
			 color:#FFFDDD;
			 font-weight:bold;
		}
		
		.img{
			width:10%;
		}

		.icon{
			float:right;
			
		}
		
		.p3{
			padding:0px 40px;
			font-size:22px;
			font-weight:bold;
		}
		
		.contact{
			 padding:10px 10px 10px 50px;
		}
		
		.c1{
			font-size:22px;
			font-weight:bold;
		}
		
		.c2{
			font-size:20px;
			line-height:1.5;
			font-family:calibri;
		}
		
		
		
		
	</style>

</html>