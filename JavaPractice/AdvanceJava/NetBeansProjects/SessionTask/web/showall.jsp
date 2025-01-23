
<%@page import="java.sql.*" %>
 <html>
 <head>
     <link rel='stylesheet' href='html68.css'>
 </head>
 <body>
 
 <%@include file="menucommon.jsp" %>
 <div id='mydata'>
    <%
 try
 {
     Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagment?useSSL=false","root","root");
 
Statement st=con.createStatement();
 String q="select * from insmarks";
 ResultSet rs=st.executeQuery(q);
 %>
 <center>
 <table cellpadding=12>
 <tr>
 <td>Rno.</td>
 <td>Name</td>
 <td>Phys</td>
 <td>Chem</td>
 <td>Math</td
 </tr>
 <%
  while(rs.next())
  {
      %><tr>
          <td><%=rs.getString(1)%></td>
	 <td><%=rs.getString(2)%></td> 
         <td><%=rs.getString(3)%></td> 
         <td><%=rs.getString(4)%></td>
       <td><%=rs.getString(5)%></td>   
      </tr>
 <% 
 }%>
  
 </table>
  </center>
  </div>
<%
 con.close();
 
 }
 catch(Exception e)
 {
     out.println(e);
 }
 %>

 </body>
 </html>
 
<%
 out.close();
%>