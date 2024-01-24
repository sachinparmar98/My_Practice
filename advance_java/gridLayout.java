import javax.swing.*;
import java.awt.*;
class FDemo extends JFrame
{
    JButton b1,b2,b3,b4,b5,b6;
        FDemo()
    {
         GridLayout fl=new GridLayout(2,3);
         setLayout(fl);
         b1=new JButton("click !1");
         add(b1);
         b2=new JButton("click !2");
         add(b2);
         b3=new JButton("click !3");
         add(b3);
         b4=new JButton("click !4");
         add(b4);
         b5=new JButton("click !5");
         add(b5);
         b6=new JButton("click !6");
         add(b6);
    }
}
class gridLayout
{
    public static void main(String[] args) {
        FDemo f1=new FDemo();
        f1.setVisible(true);
        f1.setBounds(100,100,500,500);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
    }
}