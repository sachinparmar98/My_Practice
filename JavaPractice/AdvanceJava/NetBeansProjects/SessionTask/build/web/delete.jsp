<%@page import="java.sql.*"%>
<html>
    <head>
        <link rel="stylesheet" href="html68.css">
    </head>
    <body>
        <%@include file="menucommon.jsp"%>
        <div id="mydata">
            <center>
                <form action="delete.jsp">
                    <table cellpadding="12">
                        <tr>
                            <td>Enter Roll No.</td>
                            <td><input type="text" class="A" name="u1" placeholder="enter roll no"></td>
                          </tr>
                          <tr>
                              <th colspan="2"><input type="submit" name="b1" value="DELETE" class="B"><th>
                            </tr>
                    </table>
                    </form>
                </center>
            </body>
        </html>
          
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
                String q="delete  from insmarks where UROLL='"+s1+"'";
               st.executeUpdate(q);
                con.close();
                response.sendRedirect("search.jsp");
            }
            catch(Exception e)
            {
                out.print(e);
}
            }
            %>