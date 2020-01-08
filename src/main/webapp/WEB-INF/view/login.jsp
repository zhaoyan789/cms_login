<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path=request.getContextPath();
%>    

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v3.8.6">
    <title>Signin Template · Bootstrap</title>

    <link  href="/js/bootstrap-4.3.1/css/signin.css" rel="stylesheet">

    <!-- Bootstrap core CSS -->
	<link href="/js/bootstrap-4.3.1/css/bootstrap.css" rel="stylesheet">
	<script type="text/javascript" src="/js/js/jquery-3.2.1/jquery.js"></script>
	<script type="text/javascript" src="/js/js/jqueryvalidate/jquery.validate.js"></script>
	<script type="text/javascript" src="/js/jqueryvalidate/localization/messages_zh.js"></script>
	

    <!-- Favicons -->
	<link rel="apple-touch-icon" href="/docs/4.3/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
	<link rel="icon" href="/docs/4.3/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
	<link rel="icon" href="/docs/4.3/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
	<link rel="manifest" href="/docs/4.3/assets/img/favicons/manifest.json">
	<link rel="mask-icon" href="/docs/4.3/assets/img/favicons/safari-pinned-tab.svg" color="#563d7c">
	<link rel="icon" href="/docs/4.3/assets/img/favicons/favicon.ico">
	<meta name="msapplication-config" content="/docs/4.3/assets/img/favicons/browserconfig.xml">
	<meta name="theme-color" content="#563d7c">
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
      form span{
      	color:#ff0000;
      }
      
    </style>
    <!-- Custom styles for this template -->
  
 </head>
  <body class="text-center">

	<%-- <f:form action="register" method="post" modelAttribute="user" class="form-signin">
		<img class="mb-4" src="/js/images/logo.png" alt="" width="72" height="72">
		<f:input path="username"/><f:errors path = "username"></f:errors><br/>
		<f:input path="password"/><f:errors path = "password"></f:errors><br/>
		 <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
		 <p class="mt-5 mb-3 text-muted">&copy; 2017-2020</p>
	</f:form> --%>
	
	<body class="text-center">

	 	<f:form action="login" method="post" modelAttribute="user" class="form-signin">
		<img class="mb-4" src="/js/images/logo.png" alt="" width="72" height="72">
		  <h1 class="h3 mb-3 font-weight-normal">请登陆</h1>
		<f:input path="username" class="form-control"/><f:errors path = "username"></f:errors><br/>
		<f:input path="password" class="form-control"/><f:errors path = "password"></f:errors><br/>
		 <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
		 <p class="mt-5 mb-3 text-muted">&copy; 2017-2020</p>
	</f:form> 
    
</body>
</html>
