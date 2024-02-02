import java.sql.*;

class insertData1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql:///SchoolManagment", "root", "root");
            Statement st = con.createStatement();
            String q = "insert into login values('bbb','222')";
            st.executeUpdate(q);
            System.out.println("data insertion is done");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}