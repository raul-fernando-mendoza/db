<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
<body>
<s:form action="FileUpload" method="post" enctype="multipart/form-data">
	<s:hidden name="schema" value="24swim"/>
    <s:file name="upload" label="File"/>
    <s:submit/>
</s:form>
</body>
</html>