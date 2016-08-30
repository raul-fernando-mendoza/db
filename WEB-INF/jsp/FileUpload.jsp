<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
<body>
<s:form action="FileUpload" method="post" enctype="multipart/form-data">
    <s:textfield name="schema"/>
    <s:textfield name="entityName" />
    <s:textfield name="propertyName" />
    <s:textfield name="id" label="id" />
    <s:file name="upload" label="File"/>
    <s:submit/>
</s:form>
</body>
</html>