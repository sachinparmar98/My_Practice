                              //LOGIN PAGE
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	JTextField jten,jpep;
FDemo()
{
Font f=new Font("Forte",Font.BOLD,25);
setFont(f);

Color cen=new Color(82,214,196);
Color cep=new Color(168,105,125);

setTitle("LOGIN PAGE");
setResizable(false);
setLayout(null);

JLabel en=new JLabel("Enter Text");
add(en);
en.setSize(200,100);
en.setLocation(100,80);
en.setFont(f);



JLabel ep=new JLabel("Message");
add(ep);
ep.setSize(200,100);
ep.setLocation(100,190);
ep.setFont(f);


jten=new JTextField(10);
add(jten);
jten.setSize(200,50);
jten.setLocation(310,100);
jten.setFont(f);
jten.setBackground(cen);

 jpep=new JTextField(10);
add(jpep);

jpep.setSize(200,50);
jpep.setLocation(310,210);
jpep.setFont(f);
jpep.setBackground(cen);


JButton b=new JButton("Enter");
add(b);
b.setLocation(300,280);
b.setSize(100,50);
b.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
{
	String s=jten.getText();
	char c[]=s.toCharArray();
	String s1="ram";
	String s2="";
	int count=0;
	int loop=0;
	x:
	{
	for(int i=0;i<s.length();i++)
		
	{count++;
		s2=s2+c[i];
		if(s2.equals(s1))
		{
			
			jpep.setText("welcome  "+s2);
			break x;
		}
		else 
		
			jpep.setText("invalid data");
		
	 if(count==3)
  		{
			
   	i=loop++;
			count =0;
s2="";		   
		}
		
		
	}
	}
	
}
}
class sw11
{
static public void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(700,700);
f.setLocation(100,200);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
}