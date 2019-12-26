<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <!-- this JSP is to display all contacts on to browser
	author: KUMAR
	created : DEC 22nd 2019
  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function deleteConfirm(){
		return confirm("are sure you want to delete?");
	}
</script>

</head>
<body>
	<h3 style="color:voilet"><a href="/PhoneBook/addContact">Add one more Contact</a></h3>
	<h4 style="color:green">${delSuccMsg}</h4>
	<h4 style="color:red">${delErrMsg}</h4>
	<table border="1">
		<thead>
			<tr>
				<th>S NO</th><th>Contact Name</th><th>Contact Email</th><th>Contact Number</th><th>Action</th> 
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${contactList}" var="contact"  varStatus="status">
			<tr>
					<td>${status.index+1}</td>
					<td>${contact.contactName}</td>
					<td>${contact.contactEmail}</td>
					<td>${contact.phNo}</td>
					<td>
					<a href="/PhoneBook/editContact?contactId=${contact.contactId}">Edit</a>
					&nbsp;&nbsp;
					<a href="/PhoneBook/deleteContact?contactId=${contact.contactId}" onclick="return deleteConfirm()">Delete</a>
					</td>
			</tr>
				</c:forEach>
		</tbody>
	</table>
</body>
</html>