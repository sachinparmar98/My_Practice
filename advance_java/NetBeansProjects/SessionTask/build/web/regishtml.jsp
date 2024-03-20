<html> 
<head>
<link rel="stylesheet" href="html68.css">
<script type="text/javascript" src="validation.js">
</script>
</head>
<body>
<%@include file="homecommon.jsp"%> 
<div id="mydata">
<center>
<form action="regis.jsp" method="post" name="form1">
<table cellpadding="20">
<tr>
<td>Enter Name</td>
<td><input type="text" class="A" id="t1" placeholder="Enter name" name="u1"><br><br><font id="s1"></font></td>
</tr>

<tr> 
<td>Enter Password</td>
<td><input type="password" class="A" id="t2" placeholder="Enter Password" name="u2"><br><br><font id="s2"></font></td>
</tr>
<tr>
<td>Enter  number</td>
<td><input type="text" placeholder="Enter contect number" id="t3" class="A" name="u3"><br><br><font id="s3"></font></td>
</tr>
<tr>
<th colspan="2"><input type="button" class="B" onclick="validation()" value="Registration"></th>
</tr>

</table>
</center>
</form>
</div>
</body>
</html>