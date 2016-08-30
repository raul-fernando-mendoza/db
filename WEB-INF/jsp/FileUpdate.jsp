<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
<body>
<s:form action="FileUpdate" method="post" enctype="multipart/form-data">
	<s:hidden name="schema" value="24swim"/>
    <s:file name="upload" label="File"/>
    <s:textfield key="entityName" />
    <s:textfield key="propertyName" />
    <s:textfield key="id"/>
    <s:submit/>    
</s:form>
</body>
</html>