import javax.swing.*;
import java.awt.*;
class LoginDemo extends JPanel
{ 
JButton b1,b2;
JLabel u1,u2;
JTextField tx1;
JPasswordField pas;
ImageIcon imi;
Image im;

  LoginDemo()
  {
	 // setTitle("LOGIN PAGE");
	  Font f=new Font("Eras Bold ITC",Font.BOLD,30);
    setLayout(null);
	u1=new JLabel("Enter User id");
	u1.setFont(f);
	u1.setBounds(500,330,300,100);
	add(u1);
	
	tx1=new JTextField();
	tx1.setFont(f);
	tx1.setBounds(900,360,250,40);
	add(tx1);
	
	u2=new JLabel("Enter password");
	u2.setFont(f);
	u2.setBounds(500,470,300,100);
	add(u2);
	
	pas=new JPasswordField();
	pas.setBounds(900,500,250,40);
	pas.setEchoChar('*');
	pas.setFont(f);
	add(pas);
	
	b1=new JButton("LOGIN");
	b1.setBounds(650,650,150,50);
	b1.setFont(f);
	add(b1);
  
  b2=new JButton("BACK");
	b2.setBounds(900,650,150,50);
	b2.setFont(f);
	add(b2);
  }
  public void paintComponent(Graphics g)
  {
	  imi=new ImageIcon("login.png");
	  im=imi.getImage();
	  g.drawImage(im,0,0,this);
  }
}