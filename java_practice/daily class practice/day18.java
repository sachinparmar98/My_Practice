/*import java.awt.Frame;
class FDemo extends Frame
{
FDemo()
{

}
}
class day18
{
static public void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
//f.setSize(w,h);
f.setSize(200,200);
//setLocation(x,y);
f.setLocation(500,500);
}
}
*/
/*
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Color;
class FDemo extends Frame
{
FDemo()
{
}
public void paint(Graphics g)
{
//drawString(string,x axis,y axis)
g.drawString("sachin",200,200);
}
}
class day18
{
static public void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(400,400);
f.setLocation(500,500);
f.setBackground(Color.BLUE);
f.setForeground(Color.WHITE);

}
}
*/
import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
class FDemo extends Frame
{
FDemo()
{

Font f1=new Font("Algerian",Font.BOLD,40);
setFont(f1);

}
public void paint(Graphics g)
{
Color c=new Color(255,9,250);
g.setColor(c);
g.drawString("# SELF INTRODUCTION #",750,170);
Color c1=new Color(255,240,16);
g.setColor(c1);
g.drawString("->  Hi my name is Sachin parmar.",300,300);
g.drawString("->  I am from Shujalpur mandi madhya pradesh.",300,380);
g.drawString("->  I am student of SRM university.",300,460);
g.drawString("->  I am curently pursuing a degree in MCA.",300,540);
g.drawString("->  I am hard Working and Dedicated for way to imporve.",300,620);
g.drawString("->  I am a team player and working with other.",300,700);
g.drawString("->  I enjoy swiming playing games and visit new places.",300,780);
g.drawString("->  I am always very excited to learn new things",300,860);
//iner box
g.drawLine(100,100,1700,100);
g.drawLine(1700,100,1700,900);
g.drawLine(1700,900,100,900);
g.drawLine(100,900,100,100);

//outer box
g.drawLine(70,70,1730,70);
g.drawLine(1730,70,1730,930);
g.drawLine(1730,930,70,930);
g.drawLine(70,930,70,70);

}
}
class day18
{
static public void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(1800,1000);
f.setLocation(40,0);
f.setBackground(Color.BLUE);
f.setForeground(Color.WHITE);
}
}
