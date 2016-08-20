<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!--
	Helios by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>Sing In</title>
		<meta charset="utf-8" />
		<script src="assets/js/myjs.js"></script>
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<link rel="stylesheet" href="assets/css/style.css" />
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
		<link rel="shortcut icon" href="http://itea.ua/wp-content/themes/new-it/favicon.ico" type="image/x-icon" />
	</head>
	<body class="right-sidebar">
		<div id="page-wrapper">

			<!-- Header -->
				<div id="header">

					<!-- Inner -->
						<div class="inner">
							<header>
								<h1><a href="indexP.html" id="logo">FindJob</a></h1>
							</header>
						</div>

					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li><a href="indexP.html">Home</a></li>
								<li><a href="reg.jsp">Registration</a>
								<li><a href="AboutUs.html">About Us</a></li>
								<li><a href="singIn.jsp">Sing In</a></li>
							</ul>
						</nav>

				</div>
				<div >
					<section class="container">
						<div class="login">
						  <h1>Войти в личный кабинет</h1>
						  <form method="post" action="LoginUser">
							<p><input type="text" name="login" value="" style ="opacity: 0.5" placeholder="Email"></p>
							<p><input type="password" name="password" value="" style ="opacity: 0.5" placeholder="Пароль"></p>
							<p class="remember_me">
							  <label>
								<input type="checkbox" name="remember_me" id="remember_me">
								Запомнить меня
							  </label>
							</p>
							<p class="submit"><input type="submit" name="commit" value="Войти"></p>
						  </form>
						</div>

						<div class="login-help">
						  <a href="index.html">Забыли пароль?</a> 
						</div>
					  </section>
					
				</div>
			<!-- Footer -->
				<div id="footer">
					<div class="container">
						<hr />
						<div class="row">
							<div class="12u">

								<!-- Contact -->
									<section class="contact">
										<header>
											<h3>Nisl turpis nascetur interdum?</h3>
										</header>
										<p>Urna nisl non quis interdum mus ornare ridiculus egestas ridiculus lobortis vivamus tempor aliquet.</p>
										<ul class="icons">
											<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
											<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
											<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
											<li><a href="#" class="icon fa-pinterest"><span class="label">Pinterest</span></a></li>
											<li><a href="#" class="icon fa-dribbble"><span class="label">Dribbble</span></a></li>
											<li><a href="#" class="icon fa-linkedin"><span class="label">Linkedin</span></a></li>
										</ul>
									</section>

								<!-- Copyright -->
									<div class="copyright">
										<ul class="menu">
											<li>&copy; Mini Project. Artemenko Valerii.</li><li>Design: Artemenko Valeriy</a></li>
										</ul>
									</div>

							</div>

						</div>
					</div>
				</div>

		</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/jquery.onvisible.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>

	</body>
</html>