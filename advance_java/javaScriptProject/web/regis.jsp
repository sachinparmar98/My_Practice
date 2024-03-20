<%@page import="java.sql.*;" %>
<%
String s1=request.getParameter("u1");
String s2=request.getParameter("u2");
String s3=request.getParameter("u3");
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagment?useSSL=false","root","root");
Statement st=con.createStatement();
String q="insert into regis values ('"+s1+"','"+s2+"','"+s3+"')";
st.executeUpdate(q);
con.close();
response.sendRedirect("loginhtml.jsp");
}
catch(Exception e)
{
    
}

%>
