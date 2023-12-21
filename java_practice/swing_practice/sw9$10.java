                              //LOGIN PAGE
import javax.swing.*;
import java.awt.*;
class FDemo extends JFrame
{
FDemo()
{
Font f=new Font("Forte",Font.BOLD,25);
setFont(f);

Color cen=new Color(82,214,196);
Color cep=new Color(168,105,125);

setTitle("LOGIN PAGE");
setResizable(false);
setLayout(null);

JLabel en=new JLabel("Enter Name");
add(en);
en.setSize(200,100);
en.setLocation(100,80);
en.setFont(f);



JLabel ep=new JLabel("Enter Password");
add(ep);
ep.setSize(200,100);
ep.setLocation(100,190);
ep.setFont(f);

JTextField jten=new JTextField(10);
add(jten);
jten.setSize(200,50);
jten.setLocation(310,100);
jten.setFont(f);
jten.setBackground(cen);

JPasswordField jpep=new JPasswordField(10);
add(jpep);
jpep.setFont(f);
jpep.setSize(200,50);
jpep.setLocation(310,210);
jpep.setBackground(cep);



JButton b=new JButton("Login");
add(b);
b.setLocation(300,280);
b.setSize(100,50);


}
}
class sw9$10
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