import java.awt.*;
import javax.swing.*;
class FDemo extends JFrame
{
    JTextArea ta;
    JTextField tf;
    FDemo()
    {
        setResizable(false);
        FlowLayout fl=new FlowLayout();
        setLayout(fl);       
         ta=new JTextArea();
        ta.setBounds(100,100,200,200);
              add(ta);

              JTextField tf=new JTextField(20);
              tf.setBounds(500,500 ,100 , 100);
              add(tf);
    }
}
class sw18
{
    public static void main (String args[])
{
FDemo f =new FDemo();
f.setVisible(true);
 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
 f.setBounds(100,200,1000,800);
}
}