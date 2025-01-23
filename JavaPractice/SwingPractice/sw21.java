import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener 
{
    JButton b1,b2;
FDemo()
{
    // setLayout(new FlowLayout());
setLayout(null);
    Font f=new Font ("",Font.BOLD,20); 
    
    
    b1=new JButton("BUTTON 1");
    add(b1);
    b1.setBounds(50,100,200,50);
    b1.addActionListener(this);
    b1.setFont(f);

    b2=new JButton("BUTTON 2");
    add(b2);
    b2.setBounds(275,100,200,50);
    b2.addActionListener(this);
    b2.setFont(f);
 
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
    b1.setLabel("O");
}
if(e.getSource()==b2)
{
    b2.setLabel("X");
}
}
}

class sw21
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