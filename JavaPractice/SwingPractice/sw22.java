import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener 
{
    JButton b1;
    JTextField tf1,tf2,tf3;
FDemo()
{
    // setLayout(new FlowLayout());
setLayout(null);
    Font f=new Font ("",Font.BOLD,20); 
    
    
    b1=new JButton("BUTTON 1");
    add(b1);
    b1.setBounds(200,380,200,50);
    b1.addActionListener(this);
    b1.setFont(f);

    tf1=new JTextField(10);
    add(tf1);
    tf1.setFont(f);
    tf1.setBounds(50,100,200,100);

    tf2=new JTextField(10);
    add(tf2);
    tf2.setFont(f);
    tf2.setBounds(300,100,200,100);

    tf3=new JTextField(10);
    add(tf3);
    tf3.setFont(f);
    tf3.setBounds(200,250,200,100);
   
}
public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b1)
{
    int x =Integer.parseInt(tf1.getText());
    int y =Integer.parseInt(tf2.getText());
    tf3.setText(""+(x+y));
    
}

}
}

class sw22
{
    public static void main(String []ar)
{
    FDemo f=new FDemo();
    f.setVisible(true);
    f.setSize(600,500);
    f.setLocation(200,200);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

}
}