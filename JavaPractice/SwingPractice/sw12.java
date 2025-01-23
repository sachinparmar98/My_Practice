                             //JCheckBox
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
JCheckBox cb1,cb2;
cb1=new JCheckBox("female");
cb2=new JCheckBox("male");
add(cb1);
cb1.setFont(f);
cb2.setFont(f);

add(cb2);

}
}
class sw12
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