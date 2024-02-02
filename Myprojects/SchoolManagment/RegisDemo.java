import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;

class RegisDemo extends JPanel implements ActionListener {
    JTextField tx1, tx2, tx3,tx4;
	JLabel u1,u2,u3,u4;
    JButton b1, b2;
	ImageIcon imi;
	Image im;

    RegisDemo() {
		setLayout(null);
		Font f=new Font("Bernard MT Condensed",Font.BOLD,40);
		Font f1=new Font("Century Schoolbook",Font.BOLD,25);  
		  u1=new JLabel("ENTER NAME");
		  u1.setFont(f);
		  u1.setBounds(300,100,350,50);
		  add(u1);
		  
		   tx1=new JTextField();
		   tx1.setFont(f1);
		   tx1.setBounds(900,100,350,50);
              add(tx1);	

 

 u2=new JLabel("CREATE ID");
		  u2.setFont(f);
		  u2.setBounds(300,250,350,50);
		  add(u2);
		  
		   tx2=new JTextField();
		   tx2.setFont(f1);
		   tx2.setBounds(900,250,350,50);
              add(tx2);	

 u3=new JLabel("ENTER CONTECT NO.");
		  u3.setFont(f);
		  u3.setBounds(300,400,350,50);
		  add(u3);
		  
		   tx3=new JTextField();
		   tx3.setFont(f1);
		   tx3.setBounds(900,400,350,50);
              add(tx3);		

u4=new JLabel("ENTER PASSWORD");
		  u4.setFont(f);
		  u4.setBounds(300,550,350,50);
		  add(u4);
		  
		   tx4=new JTextField();
		   tx4.setFont(f1);
		   tx4.setBounds(900,550,350,50);
              add(tx4);				  

        b1 = new JButton("REGISTER");
		b1.setFont(f1);
		b1.setBounds(500,700,200,50);
        add(b1);
		
        b2 = new JButton("  BACK  ");
        b2.setFont(f1);
		b2.setBounds(800,700,200,50);
		add(b2);

        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tx1.getText();
        String s2 = tx2.getText();
        String s3 = tx3.getText();
        String s4 = tx4.getText();
   try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql:///SchoolManagment", "root", "root");
            Statement st = con.createStatement();
            String q = "insert into register values ('" + s1 + "','" + s2 + "','" + s3 + "','"+s4+"')";
            st.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "data inserted");
            con.close();
            tx1.setText("");
            tx2.setText("");
            tx3.setText("");
            tx4.setText("");
        } catch (Exception e1) {
            System.out.println(e1);
        }
    }
	 public void paintComponent(Graphics g)
  {
	  imi=new ImageIcon("rg.png");
	  im=imi.getImage();
	  g.drawImage(im,0,0,this);
  }

}
