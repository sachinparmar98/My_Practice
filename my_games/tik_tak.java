import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	JButton b[]=new JButton[9];
	JButton b9;
	JTextField tx1;
	int i=0;
	
FDemo()
{
setResizable(false);
   setLayout(null);
Font f1=new Font("Goudy Stout",Font.ITALIC,30);
   
tx1=new JTextField();
add(tx1);
tx1.setLocation(200,450);
Color c=new Color(255,62,42);
tx1.setBackground(c);
Color c1=new Color(255,255,255);
tx1.setForeground(c1);

tx1.setSize(250,100);
tx1.setFont(f1);

Font f2=new Font("Goudy Stout",Font.ITALIC,25);
 b9=new JButton("RESET");
add(b9);
b9.setLocation(0,450);
b9.setSize(200,100);
b9.setFont(f2);
// Color c=new Color(255,62,42);
b9.setBackground(c);
// Color c1=new Color(255,255,255);
b9.setForeground(c1);

b9.addActionListener(this);

   Font f=new Font("Goudy Stout",Font.ITALIC,50);
	int w=150,h=150,x=0,y=0,k=0;
	for(int z=1;z<=3;z++)
	{
		for(int j=1;j<=3;j++)
		{
			b[k]=new JButton();
			add(b[k]);
			b[k].setBounds(x,y,w,h);
			b[k].setFont(f);
			b[k].addActionListener(this);
		k++;
x+=150;		               
		}
		x=0;
		y+=150;
	}
                              }//fdemo
                  public void actionPerformed(ActionEvent e)
                          {
	String s[]=new String[9];
	JButton bs=(JButton)e.getSource();
		
if(i%2==0&&bs!=b9)
{
	bs.setLabel("O");
	bs.setBackground(Color.YELLOW);
	bs.removeActionListener(this);
i++;
}	
else if(i%2==1&&bs!=b9)
{
	bs.setLabel("X");
	bs.setBackground(Color.GREEN);
bs.removeActionListener(this);
i++;
}
if(i>=5)
{
	for(int j=0;j<9;j++)
	{	
s[j]=b[j].getLabel();
    }
	  if((s[0]==s[1]&&s[1]==s[2]&&s[2]==s[0])||(s[0]==s[3]&&s[3]==s[6]&&s[6]==s[0])
	||(s[0]==s[4]&&s[4]==s[8]&&s[8]==s[0]))
	{
		tx1.setText("  "+s[0]);
	}
	
	 else if((s[4]==s[5]&&s[5]==s[3]&&s[3]==s[4])||(s[4]==s[7]&&s[7]==s[1]&&s[1]==s[4])||
	(s[4]==s[6]&&s[6]==s[2]&&s[2]==s[4]))
	{
		tx1.setText("  "+s[4]);
	}
	
	else if((s[8]==s[7]&&s[7]==s[6]&&s[6]==s[8])||(s[8]==s[5]&&s[5]==s[2]&&s[2]==s[8]))
	{
		tx1.setText("  "+s[8]);
	}
	else if(i==9)
	{
		tx1.setText("draw");
	}
}
	if(bs==b9)
	{
		for(int p=0;p<9;p++)
		{
			b[p].setLabel("");	
			b[p].setBackground(null);
			b[p].addActionListener(this);
			tx1.setText("");	
		}
		i=0;
	}
                                     }//listener
}
class tik_tak
{
public static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setBounds(300,100, 470,595);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
}