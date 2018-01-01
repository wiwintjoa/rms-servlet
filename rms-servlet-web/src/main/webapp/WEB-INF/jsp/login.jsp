<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">

  <title>RMS</title>
  <meta name="description" content="Index">
  <meta name="author" content="Mitrais">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href='https://fonts.googleapis.com/css?family=Work+Sans:400,300,700' rel='stylesheet' type='text/css'>  
  <link rel="stylesheet" href="css/styles.css?v=1.0">

  <!--[if lt IE 9]>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.js"></script>
  <![endif]-->
</head>

<body>     
	<div class="container">
	<form method="post">
	  <div class="profile">
		<form action="#">
		    <div class="profile__form">
		      <div class="profile__fields">
		        <div class="field">
		          <input type="text" id="username" name="userName" class="input" required />
		          <label for="fieldUser" class="label">Username</label>
		        </div>
		        <div class="field">
		          <input type="password" id="userpass" name="userPass" class="input" required />
		          <label for="fieldPassword" class="label">Password</label>
		        </div>
		        <div class="profile__footer">
		          <button class="btn">Login</button>
		        </div>
		      </div>
		     </div>
		</form>
	  </div>
	</form>
	</div>  
  
  
</body>
</html>
