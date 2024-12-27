/*
import  java.awt.Frame;
import  java.awt.Color;
import  java.awt.Font;
import  java.awt.Graphics;



class FDemo extends Frame
{
FDemo()
{
Font f1=new Font("Broadway",Font.BOLD,40);
setFont(f1);
}
public void paint(Graphics g)
{
int x=100;
int y=100;
for(int i=1;i<=10;i++)
{
for(int j=1;j<=10;j++)
{
try {Thread.sleep(50);} catch (Exception e){}
int r1=(int)Math.round(Math.random()*255);
int g1=(int)Math.round(Math.random()*255);
int b1=(int)Math.round(Math.random()*255);

Color c =new Color(r1,g1,b1);
g.setColor(c);

g.drawString(""+i*j,x,y);//multplication priority
x=x+100;
}
y+=70;
x=100;
}
}
}
class day20
{
public static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(1200,1000);
f.setLocation(200,200);
f.setBackground(Color.BLACK);
//f.setBackground(Color.WHITE);
}
}

*/
/*
import java.awt.*;
class FDemo extends Frame

{
FDemo()
{
FlowLayout fl =new FlowLayout();
setLayout(fl);
Font f1=new Font("",Font.BOLD,20);
setFont(f1);

Button b1=new Button("click!!");
add(b1);

TextField tf=new TextField();
add(tf);

TextField tf1=new TextField(10);
add(tf1);
}

}                            
class day20
{
public static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(1000,1000);
f.setLocation(100,100);

}
}
*/