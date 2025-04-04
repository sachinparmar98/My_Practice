import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class FDemo extends JFrame  implements ActionListener
{
JTextField t1,t2,t3,t4;
JButton b1;
FDemo()
{
	 FlowLayout l=new FlowLayout();
	 setLayout(l);
	t1=new JTextField(10);
	add(t1);
	t2=new JTextField(10);
	add(t2);
	t3=new JTextField(10);
	add(t3);
	t4=new JTextField(10);
	add(t4);
	
	b1=new JButton("register");
	add(b1);
	b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)

{
	
	    String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		String s4=t4.getText();
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///Try1","root","root");
		Statement st=con.createStatement();
		String q="insert into myTable values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
	st.executeUpdate(q);
		
		
	}
	catch(Exception e1)
	{
		
	}
	
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
}

}
class Try1
{
	public static void main(String ar[])
	{
		
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setBounds(200,200,700,700);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}