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
		<title>Form</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link href="assets/css/style.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
		<link rel="shortcut icon" href="http://itea.ua/wp-content/themes/new-it/favicon.ico" type="image/x-icon" />

		
		<script>
		function validate(form) {
		
			var x = form.name.value;
			var j = form.surname.value;
			var q = form.password.value;
			var k = form.password1.value;
			var y = form.email.value;
			var g = form.age.value;
			var u = form.specialty.value;
			
			var errors = "";
	
			var true_name = new RegExp("[a-zA-Zа-яА-ЯіІ]");
			var true_phone = new RegExp("[0-9]");
			var true_age = new RegExp("[0-9]");
			

			if (x =="" || q =="" || k =="" || q =="" || y == "" || j == "")
			{
				alert("Все поля должны быть заполнены");
			}

			if(!x.match(true_name) || x.match("[0-9]","!@#$%^&*|\/?;:№]+") != null || x.length < 3)
			{
				errors += "Неправельное имя\n";
			}
			if(!j.match(true_name) || j.match("[0-9]","!@#$%^&*|\/?;:№]+") != null || j.length < 3)
			{
				errors += "Неправельноя Фамилия\n";
			}
			if ( q != k ) 
			{
				errors += "Пароли не совпадают\n";
			}
			if (q.length < 6)
			{
				errors += "Пароль слишком короткий\n";
			}
			if(!/^[a-zA-Z0-9_\-\.]+@[a-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/.test(y))
			{
				errors +="Неправельный e-mail\n";
			}
			if(!g.match(true_age) || g.match("[a-zA-Zа-яА-ЯіІ]","!@#$%^&*|\/?;:№]+") != null || g.length > 3 || g<0)
			{
				errors += "Неправельный возраст\n";
			}
			if(u == "")
			{
				errors += "Пожалуйста укажите ваш профиль\n";
			}
				
			if (errors == "")
				return true;
			else
			{
				alert(errors);
				return false;
			} 
		}
	</script>
	</head>
	<body class="no-sidebar">
		<div id="page-wrapper">

			<!-- Header -->
				<div id="header">

					<!-- Inner -->
						<div class="inner">
							<header>
								<h1><a href="indexP.html" id="logo">Registration</a></h1>
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

			<!-- Main -->
				<div class="wrapper style1">

					<div class="container">
						<form method='POST' name='AddUser' action='AddUser'  onSubmit='return validate(this)'>
							<input type="hidden" name="command" value="AddUser"/>
								<div>
									<label style="color:#7D055D; font-weight:bold; font-size: 20pt;">Name: </label>
									<input type='text' id='name' name='name' style ="opacity: 0.5" placeholder="Введить имя">
								</div>

								<div>
									<label style="color:#7D055D; font-weight:bold; font-size: 20pt;">Surname: </label>
									<input type='text' id='surname' name='surname' style ="opacity: 0.5" placeholder="Введить Фамилию">
								</div>

								<div >
									<label style="color:#7D055D; font-weight:bold; font-size: 20pt;">Email: </label>
									<input type='email' id='email' name='email' style ="opacity: 0.5" placeholder="Введіть ваш емейл">
								</div>

								<div >
									<label style="color:#7D055D; font-weight:bold; font-size: 20pt;">Password </label>
									<input type='password' id='password' name='password' style ="opacity: 0.5" placeholder="Введить пароль">
								</div>
								<div >
									<label style="color:#7D055D; font-weight:bold; font-size: 20pt;">Repite password </label>
									<input type='password' name='password1' style ="opacity: 0.5" placeholder="Введить пароль еще раз">
								</div>
								<div >
									<label style="color:#7D055D; font-weight:bold; font-size: 20pt;">Age </label>
									<input type='text' id='age' name='age' style ="opacity: 0.5" placeholder="Введить возраст">
								</div>
								<div >
									<label style="color:#7D055D; font-weight:bold; font-size: 20pt;">Specialy: </label>
									<textarea id='specialty' name='specialty' style ="opacity: 0.5" placeholder="Опешите ваши умения"></textarea>
								</div>

								<div>
									<input type="submit" value='Add'>
							</div>

						</form>
					</div>

				</div>

			<!-- Footer -->
				<div id="footer">
					<div class="container">
						<div class="row">
							<div class="12u">
								<!-- Contact -->
									<section class="contact">
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
											<li>&copy; Mini Project. Artemenko Valerii.</li><li>Design: Artemenko Valeriy</li>
		
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