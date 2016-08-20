<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Form</title>
  <link href='style.css' rel='stylesheet' type='text/css'>
</head>
<body>
<form method='POST' name='AddWorker' action='AddWorker' class='reg-form'>
	<input type="hidden" name="command" value="AddWorker"/>
		<div class='form-row'>
			<label for='form_fname'>Name: </label>
    		<input type='text' id='name' name='name'>
  		</div>

  		<div class='form-row'>
    		<label for='form_sname'>Surname: </label>
    		<input type='text' id='surname' name='surname'>
		</div>

		<div class='form-row'>
			<label for='form_email'>Email: </label>
			<input type='email' id='email' name='email'>
		</div>

		<div class='form-row'>
			<label for='form_phone'>Password </label>
			<input type='password' id='password' name='password'>
		</div>
		<div class='form-row'>
			<label for='form_about'>Company: </label>
			<textarea id='company' name='company'></textarea>
		</div>
		<div class="form-row">
			<input type="submit" value='Add'>
		</div>

	</form>

</body>
</html>