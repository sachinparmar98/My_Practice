        //Choice ko hi swing ma JOmboBox kahta ha
/*
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
setLayout(new FlowLayout());

JComboBox cb1=new JComboBox();
add(cb1);
cb1.setFont(f);

cb1.addItem("java");
cb1.addItem("python");
cb1.addItem("html");
cb1.addItem("c++");
cb1.addItem("ds");
}
}
class sw14
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
*/
                     //one more way for above example 
					         //Choice ko hi swing ma JOmboBox kahta ha
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
setLayout(new FlowLayout());
String s[]={"java","python","c++","html","jscript","ram"};
JComboBox cb1=new JComboBox(s);
add(cb1);
cb1.setFont(f);
}
}
class sw14
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