import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener 
{
    JButton b1;

FDemo()
{
    setLayout(new FlowLayout());
b1=new JButton("click!!");
add(b1);
b1.setBounds(200,200,100,50);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
    System.out.println("softwaves");
}
}

class sw19
{
    public static void main(String []ar)
{
    FDemo f=new FDemo();
    f.setVisible(true);
    f.setSize(500,500);
    f.setLocation(200,200);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

}
}