  /*                              //Assignment

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
class FDemo extends Frame
{
FDemo()
{
Font f1=new Font("",Font.BOLD,20);
setFont(f1);
}
public void paint (Graphics g)
{
//self name 
g.drawString("SACHIN PARMAR",1850,1000);
//background rec1
Color bgrc1 = new Color(255,192,24);
g.setColor(bgrc1);
g.fillRect(0,0,1900,350);

//background rec2
Color bgrc2 = new Color(255,255,255);
g.setColor(bgrc2);
g.fillRect(0,350,1900,350);


//background rec3
Color bgrc3 = new Color(149,230,20);
g.setColor(bgrc3);
g.fillRect(0,700,1900,350);

//central ashok chakra
Color ac2 = new Color(0,30,252);
g.setColor(ac2);
int sa2=0;
int ma2=3;
for(int i=1;i<=24;i++)
{
g.fillArc(900,365,330,330,sa2,ma2);
sa2+=15;
}


//fr1
Color rc1 = new Color(255,144,36);
g.setColor(rc1);
g.fillRect(200,100,400,100);

//fr2
Color rc2 = new Color(255,255,255);
g.setColor(rc2);
g.fillRect(200,200,400,100);

//fr3
Color rc3 = new Color(89,201,55);
g.setColor(rc3);
g.fillRect(200,300,400,100);

//flag pipe
Color pc = new Color(0,0,0);
g.setColor(pc);
g.fillRect(180,100,20,800);

//flag first base
g.fillRect(140,800,100,30);
g.fillRect(100,830,180,30);
g.fillRect(60,860,260,40);

//ashok chakra
Color ac = new Color(0,30,252);
g.setColor(ac);
int sa=0;
int ma=3;
for(int i=1;i<=24;i++)
{
g.fillArc(350,200,100,100,sa,ma);
sa+=15;
}

//emoji face
Color fc = new Color(255,219,163);
g.setColor(fc);
g.fillOval(1500,600,100,100);

//left eyes
Color lec = new Color(0,0,0);
g.setColor(lec);
g.fillOval(1520,630,10,10);

//right eyes 
Color rec = new Color(0,0,0);
g.setColor(rec);
g.fillOval(1570,630,10,10);

//mouth
Color mc = new Color(255,18,16);
g.setColor(mc);
g.fillArc(1535,650,30,30,180,180);

//tumyy
Color tc = new Color(9,57,250);
g.setColor(tc);
g.fillOval(1500,700,100,150);

// legs
Color lc = new Color(255, 219, 163);
g.setColor(lc);
g.fillRect(1510,830,10,100);//left leg
g.fillRect(1580,830,10,100);//right leg

//hands
g.fillRect(1400,750,100,10);//left hand
g.fillRect(1600,750,100,10);//right hand

//hand flag
Color hrc1 = new Color(255,144,36);
g.setColor(hrc1);
g.fillRect(1350,650,50,10);

Color hrc2 = new Color(255,255,255);
g.setColor(hrc2);
g.fillRect(1350,660,50,10);

Color hrc3 = new Color(89,201,55);
g.setColor(hrc3);
g.fillRect(1350,670,50,10);

// hand flag pipe
Color hpc = new Color(0,0,0);
g.setColor(hpc);
g.fillRect(1400,650,5,110);


// hand flag ashok chakra
Color hac = new Color(0,30,252);
g.setColor(hac);
int sa1=0;
int ma1=3;
for(int i=1;i<=24;i++)
{
g.fillArc(1370,660,10,10,sa1,ma1);
sa1+=15;
}

//ballon 1
Color b1c = new Color(255 ,144 ,36);
g.setColor(b1c);
g.fillOval(1500,300,100,105);


Color b2c = new Color(255,255,255);
g.setColor(b2c);
g.fillOval(1600,250,100,110);


Color b3c = new Color(89,201,55);
g.setColor(b3c);
g.fillOval(1700,300,100,115);

// ballon threads

Color t1c = new Color(255 ,144 ,36);
g.setColor(t1c);
g.drawLine(1550,405,1700,750);//thread 1


Color t2c = new Color(0,0,0);
g.setColor(t2c);
g.drawLine(1650,360,1700,750);//thread 2


Color t3c = new Color(89,201,55);
g.setColor(t3c);
g.drawLine(1750,415,1700,750);//thread 3

// WRITE IN BALLON

Color tb1c = new Color(239,52,255);
g.setColor(tb1c);
g.drawString ("MERA",1515,350); //BALLON 1 MERA
g.drawString ("BHARAT",1610,305); //BALLON 2 BHARAT
g.drawString ("MAHAAN",1710,355); //BALLON 3 MAHAAN

}}
class day19
{
public  static void main(String ar[]) 
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(1900,1050);
//f.setLocation(40,0);
f.setBackground(Color.BLACK);
}
}
*/
                                      //diffrent diffrent methods of Graphics class
/*
import java.awt.*;
class FDemo extends Frame
{
FDemo()
{

}
public void paint(Graphics g)
{
//g.drawLine(100,100,400,300);
//g.drawRect(400,400,300,200);
//g.drawroundRect(400,400,300,200,13,54);//not working
//g.drawOval(100,100,300,500);
//g.fillRect(100,100,400,300);
//g.fillOval(100,100,100,100);
//g.drawArc(200,200,100,100,90,360);
//g.fillArc(200,300,100,600,30,270);//concept
}
}
class day19
{
static public void main(String ar[])

{
FDemo f =new FDemo();
f.setVisible(true);
f.setSize(1000,1000);
f.setLocation(100,50);

}
}
*/

 /*                              //lang package Math class diffrent methods
class day19
{
static public void main(String ar[])
{
//System.out.println(Math.max(10,40));
Sytem.out.println(Math.min(-3,6));
}
}
*/