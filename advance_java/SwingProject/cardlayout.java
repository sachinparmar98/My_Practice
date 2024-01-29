import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class FDemo extends JFrame implements ActionListener
{
    JButton b1,b3,b4;
    CardLayout card;
    Container  cn=getContentPane();
    cardlayoutlogin cll;
    FDemo()
    {
       
        card=new CardLayout();
        setLayout(card);
           b1=new JButton("click 1");
           add("A",b1);
           cll=new cardlayoutlogin(this);
           add(cll);
           b3=new JButton("click 3");
           add("C",b3);
           b4=new JButton("click 4");
           add("D",b4);

           b1.addActionListener(this);
           b3.addActionListener(this);
           b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        card.next(cn);
    }
}
class cardlayout {
    public static void main (String ar[])
    {
           FDemo f1 =new FDemo();
           f1.setVisible(true);
           f1.setBounds(100,100,500,500);
           f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);        
    }
    
}
