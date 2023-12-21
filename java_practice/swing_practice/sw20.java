import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener 
{
    JButton b1;
    JTextField tx;   
FDemo()
{
    // setLayout(new FlowLayout());
setLayout(null);
    Font f=new Font ("",Font.BOLD,20); 

b1=new JButton("click!!");
add(b1);
b1.setBounds(200,100,100,50);
b1.addActionListener(this);
b1.setFont(f);

 tx=new JTextField(10);
 add(tx);
 tx.setBounds(150,200,200,50) ;
 tx.setFont(f);
}
public void actionPerformed(ActionEvent e)
{
    tx.setText("hello sachin");
}
}

class sw20
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