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

JComboBox cb1=new JComboBox();
add(cb1);
cb1.setFont(f);
for(int i=1;i<=13;i++)
cb1.addItem(i);
}
}
class sw15
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