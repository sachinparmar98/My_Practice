        //JRadioButton and JButtonGroup
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

ButtonGroup bg;
bg=new ButtonGroup();
JRadioButton rb1,rb2;
rb1=new JRadioButton("male"); 
add(rb1);
rb1.setFont(f);
rb2=new JRadioButton("female"); 
add(rb2);
rb2.setFont(f);
bg.add(rb1);//
bg.add(rb2);//group ma asa dalta ha


}
}
class sw13
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