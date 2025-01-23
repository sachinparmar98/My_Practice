
<html> 
<head>
<link rel="stylesheet" href="html68.css">
</head>
<body>
<%@include file="homecommon.jsp"%> 
<div id="mydata">
<center>
<form action="ControlerDemo" >
    <%
    String s2=request.getParameter("s1");
    if(s2!=null)
    {
    %>
    <%=s2%>
    <%}%>
<table cellpadding="20">
<tr>
<td>Enter Name</td>
<td><input type="text" class="A" placeholder="Enter name" name="u1"></td>
</tr>
<tr> 
<td>Enter Password</td>
<td><input type="password" class="A" placeholder="Enter Password" name="u2"></td>
</tr>

<tr>
<th colspan="2"><input type="submit" class="B" value="login"></th>
</tr>

</table>

</form>
    </center>
</div>
</body>
</html>