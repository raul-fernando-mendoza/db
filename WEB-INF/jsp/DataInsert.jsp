<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
<body>
<s:form action="insert" method="post" enctype="multipart/form-data">
    <s:textfield name="id" label="id" />
    <s:file name="upload" label="File"/>
    <s:file name="upload" label="File2"/>
    <s:submit/>
</s:form>
</body>
</html>