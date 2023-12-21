import java.awt.event.*;
import java.awt.*;
class FDemo extends Frame implements ActionListener
{

TextField tx1,tx2,tx3;
Button b1,b2,b3,b4,b5;
FDemo()
{
Font f=new Font("Brush Script MT",Font.BOLD,30);
setFont(f);

setLayout(null);

Label u1=new Label("Enter no.1");
add(u1);
u1.setSize(150,40);
u1.setLocation(10,100);

tx1=new TextField(5);
add(tx1);
tx1.setSize(250,40);
tx1.setLocation(220,100);


Label u2=new Label("Enter no.2");
add(u2);
u2.setSize(150,40);
u2.setLocation(10,150);

tx2=new TextField(5);
add(tx2);
tx2.setSize(250,40);
tx2.setLocation(220,150);

Label u3=new Label(" RESULT ");
add(u3);
u3.setSize(150,40);
u3.setLocation(10,340);

tx3=new TextField(5);
add(tx3);
tx3.setSize(250,40);
tx3.setLocation(220,340);

b1=new Button("*");
add(b1);
b1.setSize(110,110);
b1.setLocation(20,210);


b2=new Button("+");
add(b2);
b2.setSize(110,110);
b2.setLocation(150,210);


b3=new Button("-");
add(b3);
b3.setSize(110,110);
b3.setLocation(280,210);


b4=new Button("/");
add(b4);
b4.setSize(110,110);
b4.setLocation(410,210);


b5=new Button("CLEAR");
add(b5);
b5.setSize(150,50);
b5.setLocation(225,400);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

setResizable(false);
}
public void actionPerformed(ActionEvent e)
{
String s1=tx1.getText();
String s2=tx2.getText();
int x=Integer.parseInt(s1);
int y=Integer.parseInt(s2);

if(e.getSource()==b1)
{
tx3.setText(""+x*y);
}
if(e.getSource()==b2)
{
tx3.setText(""+(x+y));

}
if(e.getSource()==b3)
{tx3.setText(""+(x-y));

}
if(e.getSource()==b4)
{
tx3.setText(""+(x/y));

}

if(e.getSource()==b5)
{
tx1.setText("");
tx2.setText("");
tx3.setText("");

}

}
}
class day22am
{
public static void main (String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(550,550);
f.setLocation(200,200);
}
}