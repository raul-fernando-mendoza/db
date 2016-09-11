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

	<h1 data-role="myheader">Create Property</h1>

	<s:if test="hasActionErrors()">
	   <div class="errors">
	      <s:actionerror/>
	   </div>
	</s:if>

	Create new property for: <s:property value="parentEntity.entityName"/>

	<s:form action="../signed/PropertyCreate.action" method="get" data-ajax="false" theme="simple">
		<s:hidden key="parentEntityID"/>
		<div class="ui-field-contain">
		  <label for="propertyName">PropertyName:</label>
		  <s:textfield key="propertyName" placeholder="propertyName"/>
		</div>		
		<div class="ui-field-contain">
		  <label for="label">Label:</label>
		  <s:textfield type="text" name="label" id="label"  placeholder="label"/>
		</div>
		<div class="ui-field-contain">
		  <label for="property.datatypeID" class="select">Type:</label>
		  <s:select key="datatypeID" list="datatypes" listKey="datatypeID" listValue="label" readonly="true"/>
		</div>		
		<div class="ui-field-contain">
		  <label for="label">Size:</label>
		  <s:textfield key="size" placeholder="size"/>
		</div>
		<div class="ui-field-contain">
		  <label for="select-choice-1" class="select">Is PK:</label>
		  <select name="idPK" id="select-choice-1">
		    <option value="1">N</option>
		    <option value="2">Y</option>
		  </select>
		</div>		
		
		<div class="ui-field-contain">
			<a href='../public/EntityEdit.action?<s:property value="entityID"/>' data-role="button"  data-inline="true"  rel="external">Cancel</a>
			<input type="submit" data-inline="true" value="Create"></input>
		</div>
	</s:form>	
	


		
    
    </div><!-- content -->
	<div class="WebAppFooter">

		<div class="ui-bar ui-bar-b">
			<span>Welcome</span>
		</div>	
	</div>    
    
   	 
</div> <!-- Welcome page -->

<!-- Initialize Swiper -->
<script>
	$(document).ready(function () {
	    //initialize swiper when document ready 
       // alert("login ready");
    
	 });    
</script>
</body>
</html>