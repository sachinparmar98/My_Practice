import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class pro extends JFrame implements ActionListener
{
    CardLayout card;
    Container cn=getContentPane();
    HomeDemo hm;
    LoginDemo lg;
    RegisDemo regis;
    pro()
    {
     card=new CardLayout();
     setLayout(card);
    hm=new HomeDemo();
    lg=new LoginDemo();
    regis=new RegisDemo();
    
    add("hm",hm);
    add("lg",lg);
    add("regis",regis);

    hm.b1.addActionListener(this);
    hm.b2.addActionListener(this);
    }
    public void actionPerformed (ActionEvent e)
    {
        if(e.getSource()==hm.b1)
        {
         card.show(cn,"lg");
        }
        if(e.getSource()==hm.b2)
{
card.show(cn,"regis");
}
    }

}
 class Fdemo1 {
    public static void main(String[] args) {
        pro f1=new pro();
        f1.setVisible(true);
        f1.setBounds(100,100,500,500);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
    }
    
}
 