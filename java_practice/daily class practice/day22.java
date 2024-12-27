                              //tiktok game two box
/*
import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener
{
Button b1,b2;
FDemo()
{
Font f=new Font("Brush Script mt",Font.ITALIC,30);
setFont(f);
setLayout(null);

b1=new Button();
add(b1);
b1.setSize(100,100);
b1.setLocation(100,100);

b2=new Button();
add(b2);
b2.setSize(100,100);
b2.setLocation(200,100);

b1.addActionListener(this);
b2.addActionListener(this);
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
class day22
{
public static void main (String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(700,700);
f.setLocation(200,200);
}
}
*/
                          //TextField 1 ka data TextField 2 ma then clear TextField
/*
import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener
{
Button b1;
TextField tx1,tx2;
FDemo()
{
Font f=new Font("Brush Script mt",Font.ITALIC,30);
setFont(f);
setLayout(new FlowLayout());

tx1=new TextField(10);
add(tx1);

b1=new Button("click");
add(b1);

tx2 =new TextField(10);
add(tx2);

b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
String s1=tx1.getText();
tx2.setText(s1);
tx1.setText("");
}
}
}
class day22
{
public static void main (String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(700,700);
f.setLocation(200,200);
}
}
*/

                             //Q3 additon of two number using  button and TextField 
/*
import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener
{
Button b1;
TextField tx1,tx2,tx3;
FDemo()
{
Font f=new Font("Brush Script mt",Font.ITALIC,30);
setFont(f);
setLayout(new FlowLayout());

tx1=new TextField(10);
add(tx1);

b1=new Button("click");
add(b1);

tx2 =new TextField(10);
add(tx2);

tx3 =new TextField(10);
add(tx3);

b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
String s1=tx1.getText();
String s2=tx2.getText();
int x=Integer.parseInt(s1);
int y=Integer.parseInt(s2);

tx3.setText(""+(x+y));

}
}
}
class day22
{
public static void main (String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(700,700);
f.setLocation(200,200);
}
}
*/

                                   //Q4 Choice class
/*
import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame 
{
Button b1;
Choice ch1;
FDemo()
{
Font f=new Font("Brush Script MT",Font.ITALIC,30);
setFont(f);
setLayout(new FlowLayout());
//add(ch1);   isa bad ma likhana  ha nhi too error ayga
ch1=new Choice();
ch1.add("java");
ch1.add("core");
ch1.add("html");
ch1.add("c++");
add(ch1);
}
}
class day22
{
public static void main (String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(700,700);
f.setLocation(200,200);
}
}
*/
                               //Q4 List class
/*
import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame 
{
Button b1;
List l1;
FDemo()
{
Font f=new Font("Brush Script mt",Font.ITALIC,30);
setFont(f);
setLayout(new FlowLayout());
//add(ch1);   isa bad ma likhana  ha nhi too error ayga
l1=new List();
l1.add("java");
l1.add("core");
l1.add("html");
l1.add("c++");
l1.add("c");
l1.add("paint");
add(l1);
}
}
class day22
{
public static void main (String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(700,700);
f.setLocation(200,200);
}
}
*/
                          //Q5 Checkbox
/*
import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame 
{
Checkbox cb1,cb2;
FDemo()
{
Font f=new Font("Brush Script MT",Font.ITALIC,30);
setFont(f);
setLayout(new FlowLayout());
  
cb1=new Checkbox("java");
add(cb1);

cb2=new Checkbox("python");
add(cb2);

}
}
class day22
{
public static void main (String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(700,700);
f.setLocation(200,200);
}
}

*/