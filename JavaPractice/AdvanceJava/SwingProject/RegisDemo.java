import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class RegisDemo extends JPanel implements ActionListener {
    JTextField tx1, tx2, tx3;
    JButton b1, b2;

    RegisDemo() {
        tx1 = new JTextField(10);// user id
        add(tx1);
        tx2 = new JTextField(10);// uset password
        add(tx2);
        tx3 = new JTextField(10);// contect no.
        add(tx3);

        b1 = new JButton("register");
        add(b1);
        b2 = new JButton("Back");
        add(b2);

        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tx1.getText();
        String s2 = tx2.getText();
        String s3 = tx3.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql:///SchoolManagment", "root", "root");
            Statement st = con.createStatement();
            String q = "insert into regis values ('" + s1 + "','" + s2 + "','" + s3 + "')";
            st.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "data inserted");
            con.close();
            tx1.setText("");
            tx2.setText("");
            tx3.setText("");

        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

}
