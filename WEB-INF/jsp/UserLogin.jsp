<%@ taglib prefix="s" uri="/struts-tags" %>
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

	
    <link rel="stylesheet" href="../css/styles.css?a=b">
    
     
</head>
<body class="WebAppBody">
<div id="UserLoginPage" class="WebAppPage" data-role="page" data-theme="a" >
	<div id="UserLoginContent" role="main"  class="WebAppContent ui-content"> 

	<h1 data-role="myheader">Login</h1>

	<s:if test="hasActionErrors()">
	   <div class="errors">
	      <s:actionerror/>
	   </div>
	</s:if>

	<form action="../public/UserLogin.action" method="post" data-ajax="false">
		<div class="ui-field-contain">
		  <label for="userid">email:</label>
		  <input type="text" name="email" id="email" value="raul.mendoza@excite.com" placeholder="raul.mendoza@excite.com">
		</div>		
		<div class="ui-field-contain">
		  <label for="password">password:</label>
		  <input type="password" name="password" id="password" value="mendozra" placeholder="password">
		</div>		
		<div class="ui-field-contain">
			<a href="../public/Welcome.action" data-role="button"  data-inline="true"  rel="external">Cancel</a>
			<input type="submit" data-inline="true" value="Login"></input>
		</div>
	</form>	
	


		
    
    </div><!-- content -->
	<div class="WebAppFooter">

		<div class="ui-bar ui-bar-b">
			<a href="https://www.google.com.mx/maps/place/Av+Juan+Jos%C3%A9+Hinojosa+4905,+Los+Cedros,+64370+Monterrey,+N.L./@25.720353,-100.3754806,17z/data=!4m2!3m1!1s0x866296f51f1ff629:0xd354d1f254edd733?hl=en" data-role="button" data-icon="location" data-iconpos="left" data-inline="true" data-mini="true" rel="external">Mapa</a>
		</div>	
	</div>    
    
   	 
</div> <!-- Welcome page -->

<!-- Initialize Swiper -->
<script>
	$(document).ready(function () {
	    //initialize swiper when document ready 
        alert("login ready");
    
	 });    
</script>
</body>
</html>