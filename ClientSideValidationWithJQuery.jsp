<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<style>
	.error{
		color:#FF0000;
	}
</style>

<script type="text/javascript">
$(document).ready(function () {
    $("#ssnEnrollForm").validate({ 
    	
        rules: {
        	firstName: 'required',
        	lastName: 'required',
        	dob: 'required',
        	gender: 'required',
        	phone: 'required',
        	state: 'required',
        	photo: 'required'
        },
    	messages: {
    	   firstName: 'First Name field is required',
    	   lastName: 'First Name is required',
    	   dob: 'Date of birth is required',
    	   gender: 'gender is required',
    	   phone: 'phone number is required',
    	   photo: 'photo is required'
    	   
    	}
    });

});
</script>


</head>
<body>
	<h1>SSN Erollment Form</h1>


	<font color="green">${succMsg}</font>
	<font color="green">${failMsg}</font>
	<form:form id="ssnEnrollForm" action="enrollSsn"
		modelAttribute="ssaModel" enctype="multipart/form-data" method="POST">
		<!-- ye jo model attb hena ye controller se aya h re bhai ..dekh wha new object bna ke as a key set kiy h -->

		<table border="1">
			<tr>
				<td>FirstName :</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>LastName :</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>DOB :</td>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><form:radiobuttons path="gender" items="${gender}" /></td>
			</tr>
			<tr>
				<td>Phone :</td>
				<td><form:input path="phone" /></td>
			</tr>

			<tr>
				<td>State :</td>
				<td><form:select path="state" items="${states}"></form:select>
				</td>
			</tr>

			<tr>
				<td>Photo :</td>
				<td><form:input path="photo" type="file" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Enroll"></td>
			</tr>

		</table>



	</form:form>
	<a href="viewSsnDetails">View SSN Details</a>

</body>
</html>