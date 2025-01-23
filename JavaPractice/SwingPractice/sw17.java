import javax.swing.*;
import java.awt.*;


class FDemo extends JFrame
{
	JLabel JL1, JL2,JL3, JL4,JL5, JL6,JL7, JL8,JL9,JL10;
	JCheckBox cb1,cb2,cb3,cb4;
	JComboBox cmb1,cmb2,cmb3;
	JTextField tx1,tx2,tx3,tx4,tx5;
	JRadioButton rb1,rb2;
	JButton jb; 
	JTextArea ta;
FDemo()
{
	
Font jlf=new Font("Algerian",Font.ITALIC,40);

	setTitle("softwave addmision form");
Color c=new Color(111,243,245);
Font f=new Font("Impact",Font.ITALIC,40);
setFont(f);
Color c3=new Color(208,255,42);
setBackground(c3);

Font ftx=new Font("",Font.BOLD,30);
setLayout(null);

JL1=new JLabel("SOFTWAVES ENQUIRY FORM ");
add(JL1);
JL1.setSize(700,80);
JL1.setFont(jlf);
JL1.setLocation(650,0);


JL10=new JLabel("Write your querry ");
add(JL10);
JL10.setSize(700,80);
JL10.setFont(f);
JL10.setLocation(1200,140);

JL2=new JLabel("Name");
add(JL2);
JL2.setSize(300,80);
JL2.setFont(f);
JL2.setLocation(100,100);

tx1=new JTextField(10);
add(tx1);
tx1.setSize(450,60);
tx1.setLocation(420,100);
tx1.setFont(ftx);
tx1.setBackground(c);


 JL3=new JLabel(" Last Name");
add(JL3);
JL3.setSize(300,80);
JL3.setFont(f);
JL3.setLocation(100,200);


tx2=new JTextField(10);
add(tx2);
tx2.setSize(450,60);
tx2.setLocation(420,200);
tx2.setFont(ftx);
tx2.setBackground(c);
 
 JL4=new JLabel("E Mail");
add(JL4);
JL4.setSize(300,80);
JL4.setFont(f);
JL4.setLocation(100,300);


tx3=new JTextField(10);
add(tx3);
tx3.setSize(450,60);
tx3.setLocation(420,300);
tx3.setBackground(c);
tx3.setFont(ftx);

 JL5=new JLabel("Contact NO.");
add(JL5);
JL5.setSize(300,80);
JL5.setFont(f);
JL5.setLocation(100,400);


tx4=new JTextField(10);
add(tx4);
tx4.setSize(450,60);
tx4.setLocation(420,400);
tx4.setFont(ftx);
tx4.setBackground(c);

 JL6=new JLabel("Address");
add(JL6);
JL6.setSize(300,80);
JL6.setFont(f);
JL6.setLocation(100,500);


tx5=new JTextField(10);
add(tx5);
tx5.setSize(450,60);
tx5.setLocation(420,500);
tx5.setFont(ftx);
tx5.setBackground(c);
 
 JL7=new JLabel("Date");
add(JL7);
JL7.setSize(300,80);
JL7.setFont(f);
JL7.setLocation(100,600);



cmb1=new JComboBox();
add(cmb1);
cmb1.setBackground(c);
cmb1.setFont(ftx);
cmb1.setSize(100,60);
cmb1.setLocation(420,600);
cmb1.addItem("Day");
for(int i=1;i<=31;i++)
cmb1.addItem(i);


cmb2=new JComboBox();
add(cmb2);
cmb2.setBackground(c);
cmb2.setFont(ftx);
cmb2.setSize(150,60);
cmb2.setLocation(520,600);
cmb2.addItem("Month");
for(int i=1;i<=12;i++)
cmb2.addItem(i);


cmb3=new JComboBox();
add(cmb3);
cmb3.setBackground(c);
cmb3.setFont(ftx);
cmb3.setSize(200,60);
cmb3.setLocation(670,600);
cmb3.addItem("Year");
for(int i=1950;i<=2023;i++)
cmb3.addItem(i);

 JL8=new JLabel("Gender");
add(JL8);
JL8.setSize(300,80);
JL8.setFont(f);
JL8.setLocation(100,700);
ButtonGroup bg =new  ButtonGroup();

rb1=new JRadioButton("Male");
add(rb1);
rb1.setSize(200,100);
rb1.setLocation(420,700);
bg.add(rb1);
rb1.setBackground(Color.yellow);
rb1.setFont(ftx);

rb2=new JRadioButton("Female");
add(rb2);
bg.add(rb2);
rb2.setBackground(Color.yellow);
rb2.setSize(200,100);
rb2.setLocation(650,700);
rb2.setFont(ftx);


 JL9=new JLabel("Language");
add(JL9);
JL9.setSize(300,80);
JL9.setFont(f);
JL9.setLocation(100,800);

cb1=new JCheckBox("C");
add(cb1);
cb1.setBackground(Color.yellow);
cb1.setSize(200,50);
cb1.setLocation(420,800);
cb1.setFont(ftx);

cb2=new JCheckBox("C++");
add(cb2);
cb2.setBackground(Color.yellow);
cb2.setSize(200,50);
cb2.setLocation(650,800);
cb2.setFont(ftx);

cb3=new JCheckBox("Java");
add(cb3);
cb3.setBackground(Color.yellow);
cb3.setSize(200,50);
cb3.setLocation(420,850);
cb3.setFont(ftx);

cb4=new JCheckBox("Python");
add(cb4);
cb4.setBackground(Color.yellow);
cb4.setSize(200,50);
cb4.setLocation(650,850);
cb4.setFont(ftx);

Color c1=new Color(255,205,206);
ta=new JTextArea(20,50);
add(ta);
ta.setSize(700,600);
ta.setLocation(1000,200);
ta.setFont(ftx);
ta.setBackground(c1);

jb=new JButton("SUBMIT");
add(jb);
jb.setSize(200,50);
jb.setLocation(800,900);
jb.setFont(ftx);
Color c2=new Color(32,250,8);
ta=new JTextArea(20,50);
jb.setBackground(c2);
}
}
class sw17
{
public static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(1920,1000);
f.setLocation(0,0);
f.getContentPane().setBackground(Color.yellow);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
}