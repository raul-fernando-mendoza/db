<!DOCTYPE html> 
<html ng-app="websiteApp">
<head>
    <title>DB</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
	
	<meta http-equiv="EXPIRES" content="0"/>
	<meta name="description" content="The web database" />
	<meta name="keywords" content="web database." />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<script type="text/javascript" src="../jquery-2.1.4/jquery-2.1.4.js"></script>

	<script type="text/javascript" src="../iscroll-5.1.3/build/iscroll.js"></script>

	<link rel="stylesheet" href="../themes/white.min.css" />
	<link rel="stylesheet" href="../themes/jquery.mobile.icons.min.css" />
  	<link rel="stylesheet" href="../jquery.mobile-1.4.5/jquery.mobile.structure-1.4.5.min.css" />
	<script type="text/javascript" src="../jquery.mobile-1.4.5/jquery.mobile-1.4.5.min.js"></script>



	<link rel="stylesheet" href="../jscripts/Toolbar.css" />
	<script type="text/javascript" src="../jscripts/ToolbarWidget.js?a=1"></script>	


    <!-- Swiper JS -->
    <script src="../Swiper-master/dist/js/swiper.jquery.min.js"></script>
	
    <!-- Link Swiper's CSS -->
    <link rel="stylesheet" href="../Swiper-master/dist/css/swiper.min.css">

	<link rel="stylesheet" href="../jscripts/ImageGallery.css" />
	<script type="text/javascript" src="../jscripts/ImageGalleryWidget.js?1"></script>	
 
    
    
    <style>

	html,
	body {
	  min-height: 100%;
	  /*background-color: yellow;*/
	}
    
	#LandingPage{
		position: relative;
		padding: 0px;
		overflow-y: visible;
		min-height: 100%;
		/*background: pink;*/
	}
	
	#LandingPageContent {
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
<div id="LandingPage" data-role="page" data-theme="a" >
	<div id="LandingPageContent" role="main"  class="ui-content"> 

	<h1 data-role="myheader">DB The web database</h1>

	<div id="LandingToolbar">			
		<div class="scrollwrapper">
			<div class="scroller">
				<ul id="firstToolbar" data-role="mynavbar" >
					<li>
						<a href="../html/PoolWelcome.html" data-role="button" data-icon="home" data-iconpos="notext" data-inline="true" data-mini="true" rel="external"></a>
						<a href="../html/PoolWelcome.html" rel="external">Bienvenido</a> 
					</li>
					<li>
						<a href="../html/PoolPromotion.html" data-role="button" data-icon="tag" data-iconpos="notext" data-inline="true" data-mini="true" rel="external"></a>
						<a href="../html/PoolPromotion.html" rel="external">Promociones</a> 
					</li>					
					<li>
						<a href="../html/Images.html" data-role="button" data-icon="camera" data-iconpos="notext" data-inline="true" data-mini="true" rel="external"></a>
						<a href="../html/Images.html" rel="external">Imagenes</a> 
					</li>					
					<li>
						<a href="../public/LoginInitialize.action" data-role="button" data-icon="user" data-iconpos="notext" data-inline="true" data-mini="true" rel="external"></a>
						<a href="../public/LoginInitialize.action" rel="external">Login</a> 
					</li>					
					
			    </ul>
			</div> 
		</div> 
	</div>	


    <div id="imageGallery" class="swiper-container" data-role="mygallery">
        <div class="swiper-wrapper">
            <div class="swiper-slide" style="background-image:url(../images/lqc0.jpg)" >
				<div class="message ui-corner-all ui-overlay-a">
					<h3>Fiestas</h3>
				</div>	
			</div>
            <div class="swiper-slide" style="background-image:url(../images/promotions.jpg)" >
				<div class="message ui-corner-all ui-overlay-a">
					<h3>Paquetes</h3>
				</div>	
			</div>
            <div class="swiper-slide" style="background-image:url(../images/lqc3.jpg)" >
				<div class="message ui-corner-all ui-overlay-a">
					<h3>Promociones</h3>
                    <h4>Promociones por apertura.</h4>
				</div>	
			
			</div>
        </div>
        <!-- Add Pagination -->
        <div class="swiper-pagination swiper-pagination-white"></div>
        <!-- Add Arrows -->
        <div class="swiper-button-next swiper-button-white"></div>
        <div class="swiper-button-prev swiper-button-white"></div>
    </div>
	
	
		<h3>Fiestas</h3>
		<h4>Buscas un lugar para hacer tus fiestas, reuniones o simplemente refrescarte dandote un chapuzón? La Quinta Cumbres es un espacio con alberca en una excelente ubicación.
		a 5 minutos de Avenida Paseo de Los Leones en Monterrey, Nuevo León. a unas cuadras del Chilis de Leones. con capacidad para 60 personas.
		La renta básica incluye: </h4>
		<ul>
		<li>Un area al aire libre.</li>
		<li>Alberca de 7 x 4 metros.</li>
		<li>Un área techada.</li>
		<li>Baño-vestidor.</li>
		<li>Regadera exterior.</li>
		<li>Asador.</li>
		<li>Banca jardinera para 5 personas.</li>
		<li>Mesa de concreto tipo bar.</li>
		<li>Wifi.</li>
		</ul>

		<h3>Paquetes</h3>
		<h4>Pregunta por nuestros paquetes que incluyen:</h4>
		<ul>
			<li>Sillas.</li>
			<li>Mesas.</li>
			<li>Rockola.</li>
			<li>Mantelería.</li>
			<li>Banquetes.</li>
			<li>Taquizas.</li>
			<li>hotdogs.</li>
			<li>Mesa dulce.</li>
			<li>Inflables.</li>
			<li>etc...</li>
		</ul>
		<h4>Lo que necesites te lo conseguimos para que tu fiesta o reunión sea memorable.</h4>


		
    
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