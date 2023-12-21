
                                //Choice ma selcted ko Text Field per show kerna
/*
import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
Choice ch1;
TextField tx1;
Button b;
FDemo()
{
Font f=new Font("",Font.BOLD,20);
setFont(f);

setLayout(new FlowLayout());
ch1=new Choice();
add(ch1);
ch1.add("java");
ch1.add("python");
ch1.add("c++");
ch1.add("html");
ch1.add("core");

b=new Button("click!!");
add(b);
b.addActionListener(this);
tx1=new TextField(20);
add(tx1);
}
public void actionPerformed(ActionEvent e)
{
String s1=ch1.getSelectedItem();
tx1.setText(s1);
}
}
class day24
{
public  static void main (String ar[])
{
FDemo f= new FDemo();
f.setVisible(true);
f.setSize(700,600);
f.setLocation(400,100);
}
}
*/
                                //List sa selcted ko text field ma show kerwana
/*
import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
List ch1;
TextField tx1;
Button b;
FDemo()
{
Font f=new Font("",Font.BOLD,20);
setFont(f);

setLayout(new FlowLayout());
ch1=new List(3,true);
add(ch1);
ch1.add("java");
ch1.add("python");
ch1.add("c++");
ch1.add("html");
ch1.add("core");

b=new Button("click!!");
add(b);
b.addActionListener(this);
tx1=new TextField(20);
add(tx1);
}
public void actionPerformed(ActionEvent e)
{


String s1=ch1.getSelectedItem();
tx1.setText(s1);
}
}
class day24
{
public  static void main (String ar[])
{
FDemo f= new FDemo();
f.setVisible(true);
f.setSize(700,600);
f.setLocation(400,100);
}
}

*/

 /*                           //List ma sa ak sa adhik ko select kerna

import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
List ch1;
TextField tx1;
Button b;
FDemo()
{
Font f=new Font("",Font.BOLD,20);
setFont(f);

setLayout(new FlowLayout());
ch1=new List(3,true);
add(ch1);
ch1.add("java");
ch1.add("python");
ch1.add("c++");
ch1.add("html");
ch1.add("core");

b=new Button("click!!");
add(b);
b.addActionListener(this);
tx1=new TextField(20);
add(tx1);
}
public void actionPerformed(ActionEvent e)
{

String s[]=ch1.getSelectedItems();
String s2="";
for(String i:s)
{
 s2=s2+i;
}
tx1.setText(s2);
}
}
class day24
{
public  static void main (String ar[])
{
FDemo f= new FDemo();
f.setVisible(true);
f.setSize(700,600);
f.setLocation(400,100);
}
}

*/
                             //check Box sa slected ko display kerwana
/*

import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
Checkbox cb1,cb2;
TextField tx1;
Button b;
FDemo()
{
Font f=new Font("",Font.BOLD,20);
setFont(f);

setLayout(new FlowLayout());
cb1=new Checkbox("female");
add(cb1);

cb2= new Checkbox("male");
add(cb2);
b=new Button("click!!");
add(b);
b.addActionListener(this);
tx1=new TextField(20);
add(tx1);
}
public void actionPerformed(ActionEvent e)
{
String s="";
if(cb1.getState())
{
s="female";
}
if(cb2.getState())
{
s=s+"   "+"male";
}
tx1.setText(s);
}
}
class day24
{
public  static void main (String ar[])
{
FDemo f= new FDemo();
f.setVisible(true);
f.setSize(700,600);
f.setLocation(400,100);
}
}

*/
                            //CheckboxGroup sa TextField ma display kerwana
/*
import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
CheckboxGroup cbg;
Checkbox cb1,cb2;
TextField tx1;
Button b;
FDemo()
{
Font f=new Font("",Font.BOLD,20);
setFont(f);
cbg=new CheckboxGroup();


setLayout(new FlowLayout());
cb1=new Checkbox("female",true,cbg);
add(cb1);

cb2= new Checkbox("male",false,cbg);
add(cb2);
b=new Button("click!!");
add(b);
b.addActionListener(this);
tx1=new TextField(20);
add(tx1);
}
public void actionPerformed(ActionEvent e)
{
String s="";
if(cb1.getState())
{
s="female";
}
if(cb2.getState())
{
s="male";
}
tx1.setText(s);
}
}
class day24
{
public  static void main (String ar[])
{
FDemo f= new FDemo();
f.setVisible(true);
f.setSize(700,600);
f.setLocation(400,100);
}
}

*/

                            //CheckboxGroup sa TextField ma display kerwana anothr logic
/*

import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
CheckboxGroup cbg;
Checkbox cb1,cb2;
TextField tx1;
Button b;
FDemo()
{
Font f=new Font("",Font.BOLD,20);
setFont(f);
cbg=new CheckboxGroup();


setLayout(new FlowLayout());
cb1=new Checkbox("female",true,cbg);
add(cb1);

cb2= new Checkbox("male",false,cbg);
add(cb2);
b=new Button("click!!");
add(b);
b.addActionListener(this);
tx1=new TextField(20);
add(tx1);
}
public void actionPerformed(ActionEvent e)
{
String s=cbg.getSelectedCheckbox().getLabel();
/*
if(cb1.getState())
{
s="female";
}
if(cb2.getState())
{
s="male";
} 
tx1.setText(s);
}
}
class day24
{
public  static void main (String ar[])
{
FDemo f= new FDemo();
f.setVisible(true);
f.setSize(700,600);
f.setLocation(400,100);
}
}
*/