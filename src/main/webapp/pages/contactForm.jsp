<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<!-- This JSP is to display form page on browser
	author: KUMAR
	created : DEC 22nd 2019
  -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color:gold;text-align:center">Contact Form</h1>
	<h4 style="color:green;text-align:center">${succMsg}</h4>
	<h4 style="color:red;text-align:center">${errMsg}</h4>
	
	<form:form action="saveContact" method="post" modelAttribute="contact">
		<table>
			<tr>
				<td><form:hidden path="contactId"/></td>
			</tr>
			<tr>
				<td>Contact Name::</td>
				<td><form:input path="contactName"/>
			</tr>
			<tr>
				<td>Contact Email::</td>
				<td><form:input path="contactEmail"/>
			</tr>
			<tr>
				<td>Contact Number::</td>
				<td><form:input path="phNo"/>
			</tr>
			<tr><td><input type ="reset" value="Clear Contact Details"/></td><td><input type="submit" value="Save Contact"></td></tr>
		</table>
	</form:form>
	<h3 style="color:yellow"><a href="viewContacts">Show All Contacts</a></h3>
</body>
</html>