                                          //Q1 half Game
/*
import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{

FDemo()
{
Button b1[]=new Button[9];
int k=0, x=100, y=100;
Font f1=new Font("",Font.BOLD,30);
setFont(f1);
setLayout(null);

for(int i=1;i<=3;i++)
{
for(int j=1;j<=3;j++)
{
b1[k]=new Button();
add(b1[k]);
b1[k].setSize(100,100);
b1[k].setLocation(x,y);
b1[k].addActionListener(this);
b1[k].setBackground(Color.PINK);
b1[k].setForeground(Color.BLUE);
k++;
x+=100;
}
x=100;
y+=100;

}
}
int c=1;
public void actionPerformed(ActionEvent e)
{
Button b=(Button)e.getSource();//type cast
if(c%2==1)
{
b.setLabel("O");
}
else
{
b.setLabel("X");
}
c++;
b.removeActionListener(this);
}
}
class day23
{
static public void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(500,500);
f.setLocation(200,100);
}
}
*/         
/*                     //CHECK BOX GROUP
import java.awt.*;
class FDemo extends Frame
{
FDemo()
{
Font f=new Font("",Font.BOLD,20);
setFont(f);
setLayout(new FlowLayout());

Checkbox cb1,cb2,cb3,cb4,cb5;
CheckboxGroup cbg1,cbg2;
cbg1= new CheckboxGroup ();
cbg2=new CheckboxGroup();

 cb1=new Checkbox("MALE",true,cbg1);
add(cb1);

 cb2=new Checkbox("FEMALE",false,cbg1);
add(cb2);

 cb3=new Checkbox("MALE",false,cbg2);
add(cb3);

 cb4=new Checkbox("FEMALE",false,cbg2);
add(cb4);

 cb5=new Checkbox("MALE",true,cbg2);
add(cb5);


}
}
class day23
{
public static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setLocation(200,100);
f.setSize(700,500);
}
}

*/
import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener 
{
Button  b,b1,b2,b3;
FDemo()
{

Font f=new Font("",Font.BOLD,30);
setFont(f);

setLayout(new FlowLayout());

b1=new Button("Fill rec");
add(b1);
b1.addActionListener(this);

b2=new Button("Fill Oval");
add(b2);
b2.addActionListener(this);

b3=new Button("Fill Arc");
add(b3);
b3.addActionListener(this);
}
public void paint(Graphics g)
{
	
Color c=new Color(255,18,239);
g.setColor(c);

if(b1==b)
{
g.fillRect(300,200,300,100);
}
else if(b2==b)
{
	g.fillOval(300,180,200,300);
}
else if(b3==b)
{
	g.fillArc(300,180,200,300,90,250);
}
}
public void actionPerformed(ActionEvent e)
{
	
 b =(Button)e.getSource();
{
repaint();
}
}
}
class day23
{
public  static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(800,500);
f.setLocation(200,100);
} 
}