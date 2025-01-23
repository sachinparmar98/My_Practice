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

String s[]={"sita","java","python","c++","html","jscript","simula"};
JList cb1=new JList(s);
add(cb1);
cb1.setVisibleRowCount(3);//foen
 visible
add(new JScrollPane(cb1));
cb1.setFont(f);
}
}
class sw16
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