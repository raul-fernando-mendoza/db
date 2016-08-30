<%@ page contentType="application/json; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
 {
 "actionErrors"=<s:property value="getJSON(actionErrors,false)" escapeHtml="false"/>
 <s:if test="!fieldErrors.isEmpty()">
 ,"fieldErrors"=<s:property value="getJSON(fieldErrors,false)" escapeHtml="false"/>
 </s:if>
 }