/*

                                   //Q1 login page
import java.awt.Frame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
class FDemo extends Frame
{
FDemo()
{
setTitle("Login page");

Font f=new Font ("Aptos Display",Font.BOLD,35);
setFont(f);
setLayout(null);

Label u1=new Label("Enter Name");
add(u1);
u1.setSize(300,40);
u1.setLocation(100,100);

TextField tx1=new TextField(10);
add(tx1);
tx1.setSize(200,40);
tx1.setLocation(400,100);

Label u2=new Label("Enter Password");
add(u2);
u2.setSize(300,40);
u2.setLocation(100,200);

TextField tx2=new TextField(10);
add(tx2);
tx2.setSize(200,40);
tx2.setLocation(400,200);
tx2.setEchoChar('*');

Button b1=new Button("click!");
add(b1);

b1.setLocation(330,300);
b1.setSize(100,40);
b1.setBackground(Color.YELLOW);
b1.setForeground(Color.BLUE);

setResizable(false);
}
}

class day21
{
public  static void main (String ar[])
{
FDemo f=new FDemo ();
f.setVisible(true);
f.setSize(800,800);
f.setLocation(100,100);
}
}
*/
                            //Q2 Adding Listener in button


/*

//import java.awt.Frame;
//import java.awt.Button;
//import java.awt.Font;
//import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
FDemo()
{
Font f1=new Font("",Font.BOLD,20);
setFont(f1);
FlowLayout fl = new FlowLayout();
setLayout(fl);

Button b1=new Button("click!!");
add(b1);
//b1.setSize(100,20);
//b1.setLocation(200,200);}
b1.addActionListener(this);

}
public void actionPerformed (ActionEvent e)
{
System.out.println("ram");
}
}
class day21
{
public static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(400,400);
f.setLocation(400,400);
}
}
    */

/*                               //background color change throw button
import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
Button b1,b2,b3;
FDemo()
{
Font f1 =new Font("",Font.BOLD,20);
setFont(f1);
 
FlowLayout fl= new FlowLayout();
setLayout(fl);

 b1=new Button("RED");
add(b1);
b1.addActionListener(this);
 b2=new Button("GREEN");
add(b2);
b2.addActionListener(this);


 b3=new Button("BLUE");
add(b3);
b3.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
setBackground(Color.RED);
}
if(e.getSource()==b2)
{
setBackground(Color.GREEN);
}
if(e.getSource()==b3)
{
setBackground(Color.BLUE);
}
}
}                     
class day21
{
public static  void main (String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(500,500);
f.setLocation(250,250);
}
}
*/