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
<div id="EntityCreatePage" class="WebAppPage" data-role="page" data-theme="a" >
	<div id="EntityCreateContent" role="main"  class="WebAppContent ui-content"> 

	<h1 data-role="myheader">DROP Entity</h1>

	<s:if test="hasActionErrors()">
	   <div class="errors">
	      <s:actionerror/>
	   </div>
	</s:if>

	<s:form action="../signed/EntityDrop.action" method="post" data-ajax="false" theme="simple">
		<div class="ui-field-contain">
		  <label for="entityID">EntityID:</label>
		  <s:textfield  key="entityID" readonly="true"/>
		</div>		

		<div class="ui-field-contain">
		  <label for="entityName">EntityName:</label>
		  <s:textfield  key="entity.entityName" readonly="true"/>
		</div>		
		<div class="ui-field-contain">
		  <label for="label">Label:</label>
		  <s:textfield  key="entity.label" readonly="true"/>
		</div>		
		<div class="ui-field-contain">
		  <label for="description">Description:</label>
		  <s:textfield  key="entity.description" readonly="true"/>
		</div>		

		<div class="ui-field-contain">
			<a href="../public/Welcome.action" data-role="button"  data-inline="true"  rel="external">Cancel</a>
			<s:submit data-inline="true" value="Drop" rel="external" />
		</div>
	</s:form>	
	


		
    
    </div><!-- content -->
	<div class="WebAppFooter">

		<div class="ui-bar ui-bar-b">
			<span>Welcome</span>
		</div>	
	</div>    
   	 
</div> <!-- Welcome page -->

<script>
	$(document).ready(function () {
       // alert("login ready");
    
	 });    
</script>
</body>
</html>