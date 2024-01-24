import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
    JButton b1;
    Container cn;
    FDemo()
    {
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        cn=getContentPane();
b1=new JButton("click!!");
add(b1);
b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
       cn.setBackground(Color.red);
    }
}
class Container1 
{
    public static void main(String[] args) {
        
            FDemo f1 =new FDemo();
            f1.setVisible(true);
            f1.setBounds(100,100,500,500);
            f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
            }
}