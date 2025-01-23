import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
class cardlayoutlogin extends JPanel implements ActionListener
{
    JButton b1,b2;
    JTextField tx1,tx2;
    cardlayoutlogin(FDemo f)
{
     setLayout(new FlowLayout());
     
     tx1 =new JTextField(10);
     add(tx1);
     tx2 =new JTextField(10);
     add(tx2);

     b1=new JButton("login 1");
     b2=new JButton("login 2");
     add(b1);
     add(b2);
     b1.addActionListener(this);
     b2.addActionListener(f);
    }

public void actionPerformed(ActionEvent e)
{
System.out.println("ram");
}
}