<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html ng-app="dbModule">
<head>
<title>DB</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">

<meta http-equiv="EXPIRES" content="0" />
<meta name="description" content="The web database" />
<meta name="keywords" content="web database." />
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="../jquery-2.1.4/jquery-2.1.4.js"></script>

<script type="text/javascript" src="../angular-1.3.15/angular.js"></script>



<link rel="stylesheet" href="../themes/white.min.css" />
<link rel="stylesheet" href="../themes/jquery.mobile.icons.min.css" />
<link rel="stylesheet"
	href="../jquery.mobile-1.4.5/jquery.mobile.structure-1.4.5.min.css" />
<script type="text/javascript"
	src="../jquery.mobile-1.4.5/jquery.mobile-1.4.5.min.js"></script>

<script type="text/javascript" src="../jscripts/DBModule.js"></script>
<script type="text/javascript" src="../jscripts/DBjquery.js"></script>


<link rel="stylesheet" href="../jscripts/Toolbar.css" />
<script type="text/javascript" src="../jscripts/ToolbarWidget.js?a=1"></script>

<script type="text/javascript" src="../iscroll-5.1.3/build/iscroll.js"></script>
<!-- Swiper JS -->
<script src="../Swiper-master/dist/js/swiper.jquery.min.js"></script>

<!-- Link Swiper's CSS -->
<link rel="stylesheet" href="../Swiper-master/dist/css/swiper.min.css">

<link rel="stylesheet" href="../jscripts/ImageGallery.css" />
<script type="text/javascript" src="../jscripts/ImageGalleryWidget.js?1"></script>


<link rel="stylesheet" href="../jscripts/SelectableTable.css" />
<script type="text/javascript"
	src="../jscripts/SelectableTableController.js?a=2"></script>
<script type="text/javascript"
	src="../jscripts/SelectableTableWidget.js?a=1"></script>

<s:include value="/css/styles.css" />

</head>
<body class="WebAppBody">
	<div id="p" class="WebAppPage" data-role="page" data-theme="a">
		<div id="c" role="main" class="WebAppContent ui-content">

			<div class="webAppHeader">
				<a href="/db" data-role="button" data-icon="home"
					data-iconpos="notext" data-inline="true" rel="external"></a>
				<h1 data-inline="true">
					<a href="/db" data-inline="true" data-mini="true" rel="external">DB
						The web database</a>
				</h1>

				<s:if test="#session.user">
					<div class="actions">
						<s:property value="#session.user.email" />
						<a href="../public/UserLogout.action" data-role="button"
							data-icon="action" data-iconpos="notext" data-inline="true"
							rel="external"></a>
					</div>
				</s:if>
				<s:else>
					<div class="actions">
						<a href="../public/UserLoginInitialize.action" data-role="button"
							data-icon="user" data-iconpos="notext" data-inline="true"
							data-mini="true" rel="external"></a> <a
							href="../public/UserLoginInitialize.action">Login</a>
					</div>
				</s:else>
			</div>

			<s:if test="#session.user">

				<div id="LandingToolbar">
					<div class="scrollwrapper">
						<div class="scroller">
							<ul id="firstToolbar" data-role="mynavbar">
								<li><a
									href='../signed/PropertyCreateInitialize.action?parentEntityID=<s:property value="entityID"/>'
									data-role="button" data-icon="plus" data-iconpos="notext"
									data-inline="true" data-mini="true" rel="external"></a> <a
									href='../signed/PropertyCreateInitialize.action?parentEntityID=<s:property value="entityID"/>'
									rel="external">Add</a></li>
								<li><a id="PropertyRemoveBtn" href="#" data-role="button"
									data-icon="delete" data-iconpos="notext" data-inline="true"
									rel="external"></a> <a id="PropertyRemovelink" href="#"
									rel="external">Property Remove</a></li>
								<li><a id="PropertyEditBtn" href="#" data-role="button"
									data-icon="edit" data-iconpos="notext" data-inline="true"
									rel="external"></a> <a id="PropertyEditlink" href="#"
									rel="external">Property Edit</a></li>

							</ul>
						</div>
					</div>
				</div>

			</s:if>

			<s:property value="entity.entityName" />
			DataList:
											
				
					
				
				<form>
					<input type="text" data-type="search" id="filterable-input">
				</form>
					<table data-role="table" id="DataTable" data-mode="reflow"
						class="ui-responsive">
						<thead>
							<tr>
								<th>ID</th>
								<s:iterator value="properties" var="property">
									<th><s:property value="propertyName" /></th>
								</s:iterator>
							</tr>
						</thead>
						<tbody id="DataList" data-filter="true"  data-input="#filterable-input" data-role="selectableTable" ng-controller="SelectableTableController as tableController"
				url='../signed/DataListJSON.action?entityID=<s:property value="entityID"/>'
				urlSchema='../signed/PropertyListJSON.action?entityID=<s:property value="entityID"/>'>
							<tr
								id='{{<s:property value="entity.entityName"/>.<s:property value="entity.entityName"/>ID}}'
								ng-repeat='<s:property value="entity.entityName"/> in data track by <s:property value="entity.entityName"/>.<s:property value="entity.entityName"/>ID'>
								<td>{{<s:property value="entity.entityName" />.<s:property
										value="entity.entityName" />ID}}
								</td>
								<s:iterator value="properties" var="property">
									<td>{{<s:property value="entity.entityName" />.<s:property
											value="propertyName" />}}
									</td>
								</s:iterator>
							</tr>
							<tr id="newData">
							    <td>
							    <a href="" ng-click="add()">add</a> 
								<s:iterator value="properties" var="property">
								<td>
									<input
										name="<s:property value="entity.entityName"/>.<s:property value="propertyName"/>"
										id="<s:property value="entity.entityName"/>.<s:property value="propertyName"/>"
										value="">
								</td>		
								</s:iterator>
							</tr>
							
						</tbody>
					</table>

		</div>
		<!-- content -->
		<div class="WebAppFooter">
			<div class="ui-bar ui-bar-b">
				<s:if test="!(#session.user)">

					<a href="../public/UserCreateInitialize.action" data-role="button"
						data-icon="location" data-iconpos="left" data-inline="true"
						data-mini="true" rel="external">Create User</a>
				</s:if>

			</div>
		</div>


	</div>
	<!-- Welcome page -->

	<!-- Initialize Swiper -->
	<script>
		$(document)
				.ready(
						function() {
							//initialize swiper when document ready 
							$("#PropertyRemoveBtn, #PropertyRemovelink")
									.click(
											function(e) {
												e.stopImmediatePropagation();
												e.preventDefault();
												var propertyID = $(
														"#PropertyList")
														.selectableTable(
																"getSelectedID");
												location
														.replace('../signed/PropertyDropInitialize.action?propertyID='
																+ propertyID);
											});

						});
	</script>
</body>
</html>