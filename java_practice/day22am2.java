import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{

int count=1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
TextField tx1;
FDemo()
{

setResizable(false);
Font f=new Font("",Font.BOLD,100);
setFont(f);
setForeground(Color.RED);

setLayout(null);
b1=new Button();
add(b1);
b1.setSize(300,300);
b1.setLocation(0,0);
b1.setBackground(Color.BLUE);

b2=new Button();
add(b2);
b2.setSize(300,300);
b2.setLocation(300,0);
b2.setBackground(Color.BLUE);

b3=new Button();
add(b3);
b3.setSize(300,300);
b3.setLocation(600,0);
b3.setBackground(Color.BLUE);

b4=new Button();
add(b4);
b4.setSize(300,300);
b4.setLocation(0,300);
b4.setBackground(Color.BLUE);

b5=new Button();
add(b5);
b5.setSize(300,300);
b5.setLocation(300,300);
b5.setBackground(Color.BLUE);

b6=new Button();
add(b6);
b6.setSize(300,300);
b6.setLocation(600,300);
b6.setBackground(Color.BLUE);

b7=new Button();
add(b7);
b7.setSize(300,300);
b7.setLocation(0,600);
b7.setBackground(Color.BLUE);

b8=new Button();
add(b8);
b8.setSize(300,300);
b8.setLocation(300,600);
b8.setBackground(Color.BLUE);



b9=new Button();
add(b9);
b9.setSize(300,300);
b9.setLocation(600,600);
b9.setBackground(Color.BLUE);



b10=new Button("restart");
add(b10);
b10.setSize(450,100);
b10.setLocation(0,900);
//b1.setForeground(Color.RED);

tx1=new TextField(10);
add(tx1);
tx1.setSize(450,100);
tx1.setLocation(450,900);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
tx1.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b1)
{
count++;
if(count%2==1)
{
b1.setLabel("O");
}
else
{
b1.setLabel("X");
}
}


if(e.getSource()==b2)
{
count++;
if(count%2==1)
{
b2.setLabel("O");
}
else
{
b2.setLabel("X");
}
}

if(e.getSource()==b3)
{
count++;
if(count%2==1)
{
b3.setLabel("O");
}
else
{
b3.setLabel("X");
}
}


if(e.getSource()==b4)
{
count++;
if(count%2==1)
{
b4.setLabel("O");
}
else
{
b4.setLabel("X");
}
}
if(e.getSource()==b5)
{
count++;
if(count%2==1)
{
b5.setLabel("O");
}
else
{
b5.setLabel("X");
}
}


if(e.getSource()==b6)
{
count++;
if(count%2==1)
{
b6.setLabel("O");
}
else
{
b6.setLabel("X");
}
}
if(e.getSource()==b7)
{
count++;
if(count%2==1)
{
b7.setLabel("O");
}
else
{
b7.setLabel("X");
}
}


if(e.getSource()==b8)
{
count++;
if(count%2==1)
{
b8.setLabel("O");
}
else
{
b8.setLabel("X");
}
}


if(e.getSource()==b9)
{
count++;
if(count%2==1)
{
b9.setLabel("O");
}
else
{
b9.setLabel("X");
}
}
if(e.getSource()==b10)
{
b1.setLabel("");
b2.setLabel("");
b3.setLabel("");
b4.setLabel("");
b5.setLabel("");
b6.setLabel("");
b7.setLabel("");
b8.setLabel("");
b9.setLabel("");
count=1;
tx1.setText("");
}

String s1=b1.getLabel();
String s2=b2.getLabel();
String s3=b3.getLabel();
String s4=b4.getLabel();
String s5=b5.getLabel();
String s6=b6.getLabel();
String s7=b7.getLabel();
String s8=b8.getLabel();
String s9=b9.getLabel();
if(s1==s2&&s2==s3&&s3==s1)
{
tx1.setText("won  "+s1);
}

else if(s4==s5&&s5==s6&&s6==s4)
{
tx1.setText("won  "+s4);
}

 else if(s7==s8&&s8==s9&&s9==s7)
{
tx1.setText("won  "+s7);
}

else if(s1==s4&&s4==s7&&s7==s1)
{
tx1.setText("won  "+s1);
}

else if(s2==s5&&s5==s8&&s8==s2)
{
tx1.setText("won  "+s8);
}

 else if(s3==s6&&s6==s9&&s9==s3)
{
tx1.setText("won  "+s3);
}

else if(s1==s5&&s5==s9&&s9==s1)
{
tx1.setText("won  "+s1);
}

else if(s3==s5&&s5==s7&&s7==s3)
{
tx1.setText("won  "+s3);
}
else if(count==10)
{
tx1.setText("draw");
}




}}
class day22am2
{
public static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(900,1000);
f.setLocation(300,0);
} 
}