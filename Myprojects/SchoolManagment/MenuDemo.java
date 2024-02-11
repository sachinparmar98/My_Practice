import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

class MenuDemo extends JPanel {
    JTabbedPane tb1;
    InsertDemo ins;
    SearchDemo src;
    ShowAllDemo soa;
    UpdateDemo upd;
    DeleteDemo dlt;

    MenuDemo() {
        ins = new InsertDemo();
        src = new SearchDemo();
        soa = new ShowAllDemo();
        upd = new UpdateDemo();
        dlt = new DeleteDemo();
        setLayout(new BorderLayout());
        tb1 = new JTabbedPane();
        tb1.addTab("Insert", ins);
        tb1.addTab("Search", src);
        tb1.addTab("ShowAll", soa);
        tb1.addTab("Update", upd);
        tb1.addTab("Delete", dlt);
        add(tb1);

    }

}

class InsertDemo extends JPanel implements ActionListener {
    JLabel u1, u2, u3,u4,u5;
    JTextField tx1, tx2, tx3,tx4,tx5;
    JButton b1;
     ImageIcon imi;
	 Image im;
    InsertDemo() {
       setLayout(null);
		Font f=new Font("Bernard MT Condensed",Font.BOLD,40);
		Font f1=new Font("Century Schoolbook",Font.BOLD,25);  
		
u1=new JLabel("ENTER ROLL NO.");
		  u1.setFont(f);
		  u1.setBounds(200,100,450,50);
		  add(u1);
		  
		   tx1=new JTextField();
		   tx1.setFont(f1);
		   tx1.setBounds(900,100,350,50);
              add(tx1);	
 

 u2=new JLabel("ENTER NAME");
		  u2.setFont(f);
		  u2.setBounds(200,250,450,50);
		  add(u2);
		  
		   tx2=new JTextField();
		   tx2.setFont(f1);
		   tx2.setBounds(900,250,350,50);
              add(tx2);	

 u3=new JLabel("ENTER PHYSICS MARKS");
		  u3.setFont(f);
		  u3.setBounds(200,400,450,50);
		  add(u3);
		  
		   tx3=new JTextField();
		   tx3.setFont(f1);
		   tx3.setBounds(900,400,350,50);
              add(tx3);		

u4=new JLabel("ENTER CHEMISTRY MARKS");
		  u4.setFont(f);
		  u4.setBounds(200,550,450,50);
		  add(u4);
		  
		   tx4=new JTextField();
		   tx4.setFont(f1);
		   tx4.setBounds(900,550,350,50);
              add(tx4);				  

u5=new JLabel("ENTER MATHS MARKS");
		  u5.setFont(f);
		  u5.setBounds(200,700,450,50);
		  add(u5);
		  
		   tx5=new JTextField();
		   tx5.setFont(f1);
		   tx5.setBounds(900,700,350,50);
              add(tx5);				  


        b1 = new JButton("Insert");
        b1.setBounds(800, 850, 150, 50);
		b1.setFont(f1);
        add(b1);
        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tx1.getText();
        String s2 = tx2.getText();
        String s3 = tx3.getText();
        String s4 = tx4.getText();
		 String s5 = tx5.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///schoolManagment", "root", "root");
            Statement st = con.createStatement();
            String q = "insert into insmarks values ('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','"+s5+"')";
            st.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "data inserted");
            con.close();
            tx1.setText("");
            tx2.setText("");
            tx3.setText("");
            tx4.setText("");
            tx5.setText("");
        } catch (Exception e1) {
            System.out.println(e1);
        }

    }
	public void paintComponent(Graphics g)
	{
		imi =new ImageIcon("ins.jpg");
		im=imi.getImage();
		g.drawImage(im,0,0,this);
	}
}

class SearchDemo extends JPanel implements ActionListener {
    JLabel u1, u2, u3, u4, u5;
    JTextField tx1, tx2, tx3, tx4, tx5;
    JButton b1,b2;
	ImageIcon imi;
	Image im;

    SearchDemo() {
        setLayout(null);

Font f=new Font("Bernard MT Condensed",Font.BOLD,40);
		Font f1=new Font("Century Schoolbook",Font.BOLD,25);  
		//Color c=new Color();
	      
 u1=new JLabel("ENTER ROLL NO.");
		  u1.setFont(f);
		  u1.setBounds(300,100,350,50);
		  add(u1);
		  u1.setForeground(Color.green);
		  
		   tx1=new JTextField();
		   tx1.setFont(f1);
		   tx1.setBounds(900,100,350,50);
              add(tx1);	
			  
		  b1 = new JButton("SEARCH");
        b1.setBounds(700, 270, 200, 50);
        b1.setFont(f1);
		add(b1);
        b1.addActionListener(this);
		
		u2=new JLabel("STUDENT NAME");
		  u2.setFont(f);
		  u2.setBounds(300,400,350,50);
		  u2.setForeground(Color.green);
		  add(u2);
		  
		   tx2=new JTextField();
		   tx2.setFont(f1);
		   tx2.setBounds(900,400,350,50);
              add(tx2);	

 

 u3=new JLabel("PHYSIC MARKS");
		  u3.setFont(f);
		  u3.setBounds(300,500,350,50);
		  u3.setForeground(Color.green);
		  add(u3);
		  
		   tx3=new JTextField();
		   tx3.setFont(f1);
		   tx3.setBounds(900,500,350,50);
              add(tx3);	

 u4=new JLabel("CHEMISTRY MARKS");
		  u4.setFont(f);
		  u4.setBounds(300,600,350,50);
		  u4.setForeground(Color.green);
		  add(u4);
		  
		   tx4=new JTextField();
		   tx4.setFont(f1);
		   tx4.setBounds(900,600,350,50);
              add(tx4);		

u5=new JLabel("MATHS MARKS");
		  u5.setFont(f);
		  u5.setBounds(300,700,350,50);
		  u5.setForeground(Color.green);
		  add(u5);
		  
		   tx5=new JTextField();
		   tx5.setFont(f1);
		   tx5.setBounds(900,700,350,50);
              add(tx5);				  

      b2=new JButton("UPDATE");
	  b2.setBounds(700,850,200,50);
	  b2.setFont(f1);
	  add(b2);
	  b2.addActionListener(this);
        

      
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tx1.getText();
		if(e.getSource()==b1){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///schoolManagment", "root", "root");
            Statement st = con.createStatement();
            String q = "select * from insmarks where UROLL='" + s1 + "'";
            ResultSet rs = st.executeQuery(q);
            if (rs.next()) {
                tx2.setText(rs.getString(2));
                tx3.setText(rs.getString(3));
                tx4.setText(rs.getString(4));
				tx5.setText(rs.getString(5));
               
            } else {
                JOptionPane.showMessageDialog(null, "invalid roll number");
				
            }
            con.close();

        } catch (Exception e1) {
            System.out.println(e1);
        }
		}
		if(e.getSource()==b2)
		{
			String s2=tx2.getText();
			String s3=tx3.getText();
			String s4=tx4.getText();
			String s5=tx5.getText();
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///schoolManagment","root","root");
             Statement st=con.createStatement();
			 String q="update insmarks set UNAME='"+s2+"',PHYMARK='"+s3+"',CHEMARK='"+s4+"',MATHMARK='"+s5+"' where UROLL='"+s1+"'";
		     int x=st.executeUpdate(q);
			 JOptionPane.showMessageDialog(null,"data updated");
			  tx1.setText("");
			   tx2.setText("");
			   tx3.setText(""); 
               tx4.setText("");
               tx5.setText("");
			 con.close();
			}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		}
	}

    
	public void paintComponent(Graphics g)
	{
		imi =new ImageIcon("search.jpg");
		im=imi.getImage();
		g.drawImage(im,0,0,this);
	}
}

class ShowAllDemo extends JPanel {

    ShowAllDemo() {
        setLayout(null);
    }
}

class UpdateDemo extends JPanel {
    JLabel u1, u2;
    JTextField tx1, tx2;
    JButton b1;

    UpdateDemo() {
        setLayout(null);

        u1 = new JLabel("Enter Name");
        u1.setBounds(50, 50, 120, 40);
        add(u1);
        tx1 = new JTextField();
        tx1.setBounds(200, 50, 180, 30);
        add(tx1);

        u2 = new JLabel("Enter RNo.");
        u2.setBounds(50, 100, 120, 40);
        add(u2);
        tx2 = new JTextField();
        tx2.setBounds(200, 100, 180, 30);
        add(tx2);

        b1 = new JButton("UPdate");
        b1.setBounds(200, 180, 100, 30);
        add(b1);

    }
}

class DeleteDemo extends JPanel {
    JLabel u1, u2;
    JTextField tx1, tx2;
    JButton b1;

    DeleteDemo() {
        setLayout(null);

        u1 = new JLabel("Enter Name");
        u1.setBounds(50, 50, 120, 40);
        add(u1);
        tx1 = new JTextField();
        tx1.setBounds(200, 50, 180, 30);
        add(tx1);

        u2 = new JLabel("Enter RNo.");
        u2.setBounds(50, 100, 120, 40);
        add(u2);
        tx2 = new JTextField();
        tx2.setBounds(200, 100, 180, 30);
        add(tx2);

        b1 = new JButton("Delete");
        b1.setBounds(200, 180, 100, 30);
        add(b1);

    }
}
