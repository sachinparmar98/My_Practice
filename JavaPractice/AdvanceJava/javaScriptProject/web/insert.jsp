<%@page import="java.sql.*"%>
<%
String s1=request.getParameter("n1");
String s2=request.getParameter("n2");
String s3=request.getParameter("n3");
String s4=request.getParameter("n4");
String s5=request.getParameter("n5");
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagment?useSSL=false","root","root");
Statement st=con.createStatement();
String q="insert into insmarks values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
st.executeUpdate(q);
con.close();
response.sendRedirect("showall.jsp");
}
catch(Exception e)
{
 out.println(e);
}
%>