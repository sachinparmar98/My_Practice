import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

class JFDemo extends JFrame implements ActionListener  
{
	CardLayout card;
	Container cn=getContentPane();
	HomeDemo hm;
	LoginDemo lg;
	RegisDemo rg;
	MenuDemo me;
    JFDemo()
	{ 
	card=new CardLayout();
        setLayout(card);	
hm=new HomeDemo();
lg=new LoginDemo();
rg=new RegisDemo();
me= new MenuDemo();
    add("home",hm);
    add("login",lg);
	add("regis",rg);
	add("menu",me);
	hm.b1.addActionListener(this);
    hm.b2.addActionListener(this);
	lg.b2.addActionListener(this);
	rg.b2.addActionListener(this);
	lg.b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==hm.b1)
	  {
		  card.show(cn,"login");
	  }
	   if(e.getSource()==hm.b2)
	  {
		  card.show(cn,"regis");
	  }
	   if (e.getSource() == lg.b1) {
            String s1 = lg.tx1.getText();
            String s2 = lg.pas.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql:///schoolManagment", "root", "root");
                Statement st = con.createStatement();
                String q = "select * from register where UID='" + s1 + "' AND UPASS='" + s2 + "'";
                ResultSet rs = st.executeQuery(q);
                if (rs.next()) {
                    card.show(cn, "menu");
                } else {
                    JOptionPane.showMessageDialog(null, "envalid id and password");
                }
                con.close();
                lg.tx1.setText("");
                lg.pas.setText("");
            } 
			catch (Exception e1) {
                System.out.println(e1);
            }
	   }
    
	 if(e.getSource()==lg.b2 || e.getSource()==rg.b2)
	  {
		  card.show(cn,"home");
	  }
	}
}

class mainClass {
    public static void main(String[] args) {
        JFDemo f1 = new JFDemo();
        f1.setVisible(true);
        f1.setBounds(100, 0, 1680, 1050);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
    }
}
