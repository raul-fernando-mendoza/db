<!DOCTYPE html> 
<html ng-app="websiteApp">
<head>
    <title>DBLogin</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
	
	<meta http-equiv="EXPIRES" content="0"/>
	<meta name="description" content="Login page" />
	<meta name="keywords" content="db login." />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<script type="text/javascript" src="../jquery-2.1.4/jquery-2.1.4.js"></script>

	<link rel="stylesheet" href="../themes/white.min.css" />
	<link rel="stylesheet" href="../themes/jquery.mobile.icons.min.css" />
  	<link rel="stylesheet" href="../jquery.mobile-1.4.5/jquery.mobile.structure-1.4.5.min.css" />
	<script type="text/javascript" src="../jquery.mobile-1.4.5/jquery.mobile-1.4.5.min.js"></script>

	
    <style>

	html,
	body {
	  min-height: 100%;
	  /*background-color: yellow;*/
	}
    
	#LoginPage{
		position: relative;
		padding: 0px;
		overflow-y: visible;
		min-height: 100%;
		/*background: pink;*/
	}
	
	#LoginPageContent {
		position:relative;  /*static is the default position */
		margin-bottom: 3em;
		min-height: 100%;
		/*background:green;*/
	}
	
	.footer {
		position: absolute;  /*relative to its not static ancestor */
		bottom: 0; /*this is what set the footer to the bootom */
		width: 100%;
	}
	
	#LandingToolbar{
		margin:0.5em;
	}
	
	
    .swiper-slide .message {
		max-width:40%;
		padding:1em;
		position:relative;
		top:1em;
		left:1em;
    }
    .swiper-slide1 h3 {
        font-size: 21px;
    }
    .swiper-slide1 p {
		top:margin:0.5em;
        font-size: 14px;
        line-height: 1.3;
    }
	
    </style>
    
     
</head>
<body>
<div id="LoginPage" data-role="page" data-theme="a" >
	<div id="LandingPageContent" role="main"  class="ui-content"> 

	<h1 data-role="myheader">Login</h1>



	<form action="#" method="post">
		<div class="ui-field-contain">
		  <label for="userid">email:</label>
		  <input type="text" name="userid" id="userid" value="email">
		</div>		
		<div class="ui-field-contain">
		  <label for="password">password:</label>
		  <input type="password" name="password" id="password" value="password">
		</div>		
		<div class="ui-field-contain">
			<input type="button" data-mini="true" data-inline="true". value="Cancel"></input>
			<input type="submit" data-mini="true" data-inline="true". value="Login"></input>
		</div>
	</form>	
	


		
    
    </div><!-- content -->
	<div class="footer">

		<div class="ui-bar ui-bar-b">
			<a href="https://www.google.com.mx/maps/place/Av+Juan+Jos%C3%A9+Hinojosa+4905,+Los+Cedros,+64370+Monterrey,+N.L./@25.720353,-100.3754806,17z/data=!4m2!3m1!1s0x866296f51f1ff629:0xd354d1f254edd733?hl=en" data-role="button" data-icon="location" data-iconpos="left" data-inline="true" data-mini="true" rel="external">Mapa</a>
		</div>	
	</div>    
    
   	 
</div> <!-- Welcome page -->

<!-- Initialize Swiper -->
<script>
	$(document).ready(function () {
	    //initialize swiper when document ready 

    
	 });    
</script>
</body>
</html>