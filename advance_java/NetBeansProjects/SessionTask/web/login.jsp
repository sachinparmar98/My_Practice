<%@page import="java.sql.*;" %>
<%
    String s1=request.getParameter("u1");
    String s2=request.getParameter("u2");
    try
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagment?useSSL=false","root","root");
    Statement st=con.createStatement();
    String q="select * from regis where UID='"+s1+"'AND  UPASS='"+s2+"'";
    ResultSet rs=st.executeQuery(q);
   
    if(rs.next())
    {
     response.sendRedirect("menu.jsp");
    }
    else
    {
        response.sendRedirect("loginhtml.jsp?s1=invalid id and password");
    
    }
     con.close();
    }
    catch(Exception e)
    {
     out.println(e);
    }
    
    
%>