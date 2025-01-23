<html> 
<head>
<link rel="stylesheet" href="html68.css">
</head>
<body>
<%@include file="menucommon.jsp"%> 
<div id="mydata">
<center>
<form action="insert.jsp" method="post">
<table cellpadding="20">
<tr>
<td>Enter Roll No.</td>
<td><input type="text" class="A" placeholder="Enter Roll Number" name="n1"></td>
</tr><tr>
<td>Enter Name </td>
<td><input type="text" class="A" placeholder="Enter Name" name="n2"></td>
</tr><tr>
<td>Enter Physics Marks</td>
<td><input type="text" class="A" placeholder="Enter Physics Marks" name="n3"></td>
</tr>
<tr> 
<td>Enter Chemistrty Marks</td>
<td><input type="text" class="A" placeholder="Enter Chemistrty Marks" name="n4"></td>
</tr>
<tr>
<td>Enter  Maths Marks</td>
<td><input type="text" placeholder="Enter Maths Marks" class="A" name="n5"></td>
</tr>
<tr>
<th colspan="2"><input type="submit" class="B" value="INSERT"></th>
</tr>

</table>
</center>
</form>
</div>
</body>
</html>