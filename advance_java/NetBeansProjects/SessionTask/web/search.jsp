<%@page import="java.sql.*"%>
<html>
    <head>
        <link rel="stylesheet" href="html68.css">
    </head>
    <body>
        <%@include file="menucommon.jsp"%>
        <div id="mydata">
            <center>
                <form action="search.jsp" >
                    <table cellpadding="12">
                        <tr>
                            <td>Enter Roll No.</td>
                            <td><input type="text" class="A" name="u1" placeholder="enter roll no."></td>
                          </tr>
                          <tr>
                              <th colspan="2"><input type="submit" name="b1" value="SEARCH" class="B"><th>
                            </tr>
                    </table>
                    </form>
          
        <%
            
            String B1=request.getParameter("b1");
            if(B1!=null)
            {
            try
            {
                String s1=request.getParameter("u1");
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagment?useSSL=false","root","root");
                Statement st=con.createStatement();
                String q="select * from insmarks where UROLL='"+s1+"'";
                ResultSet rs=st.executeQuery(q);
                
                if(rs.next())
                {
               %>
               <form action="search.jsp">
               <table cellpadding="12">
                   <tr>
                       <td>Roll No.</td>
                       <td><input type="text" class="A" name="n1" value="<%=rs.getString(1)%>"></td>
                   </tr>
                    <tr>
                       <td>Name</td>
                       <td><input type="text" class="A" name="n2" value="<%=rs.getString(2)%>"></td>
                   </tr>
                    <tr>
                       <td>Physics</td>
                       <td><input type="text" class="A" name="n3" value="<%=rs.getString(3)%>"></td>
                   </tr>
                    <tr>
                       <td>Chemistry</td>
                       <td><input type="text" class="A" name="n4" value="<%=rs.getString(1)%>"></td>
                   </tr>
                    <tr>
                       <td>Maths</td>
                       <td><input type="text" class="A" name="n5" value="<%=rs.getString(1)%>"></td>
                   </tr>
                   <tr>
                       <th colspan="2"><input type="submit" class="B" name="b2" value="UPDATE"></th>
                   </tr>
                   
                   </table>
                   </form>
               <%
                }
                else
                {
                out.print("invalid roll no.");
                }  
            }
            catch(Exception e)
            {
                out.print(e);
            }
            }
            
            %>
                 </center>
        </div>
    </body>
    </html>
    <%
   String Update=request.getParameter("b2");
   if(Update!=null)
   {
       try
       {
        String s11=request.getParameter("n1");
          String s12=request.getParameter("n2");
            String s13=request.getParameter("n3");
              String s14=request.getParameter("n4");
                String s15=request.getParameter("n5");
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagment?useSSL=false","root","root");
                Statement st=con.createStatement();
                String q="update insmarks set UNAME='"+s12+"', PHYMARK='"+s13+"' ,CHEMARK='"+s14+"', MATHMARK='"+s15+"' where UROLL='"+s11+"' ";
                st.executeUpdate(q);
                con.close();
                response.sendRedirect("showall.jsp");
       }
       catch(Exception e)
       {}
   }
    %>