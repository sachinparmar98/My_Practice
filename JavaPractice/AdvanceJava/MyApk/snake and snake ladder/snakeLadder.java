import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame
{
    JPDemo jp1;

    FDemo()
    {
         super.setTitle("snake & Ladder");
        jp1=new JPDemo();
        add(jp1);

    }
}
 class JPDemo extends JPanel implements ActionListener
 {
    ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11;
    Image swt,board,s1,start,player1,player2,player11,player12,dice,dice1,about,reset;
    JButton b1,b2,b3,b4;
    JTextField tx1,tx3,tx2;
    int px1=40;
    int py1=620;
    JPDemo()
{
 setBackground(Color.black);

img1 =new ImageIcon("swt.jpg");
swt=img1.getImage();

img2 =new ImageIcon("board.jpg");//700*700
board=img2.getImage();

img3 =new ImageIcon("s1.png");
s1=img3.getImage();

img4 =new ImageIcon("start.jpg");
start=img4.getImage();

img5 =new ImageIcon("about.gif");
//  about=img5.getImage();

img6 =new ImageIcon("reset.png");
//  reset=img6.getImage();

img7 =new ImageIcon("start.gif");
//  start=img7.getImage();

img8 =new ImageIcon("player1.png");
player1=img8.getImage();

img9 =new ImageIcon("player2.png");
player2=img9.getImage();

img10 =new ImageIcon("dice.gif");
dice=img10.getImage();

player11=img8.getImage();
player12=img9.getImage();

img11 =new ImageIcon("dice1.png");
dice1=img11.getImage();

setLayout(null);

b1=new JButton(img5);
b1.setBounds(50,120,100,30);
add(b1);
b1.setBackground(new Color(4,129,255));

b2=new JButton(img6);
b2.setBounds(50,180,100,30);
add(b2);
b2.setBackground(new Color(4,129,255));

Font f=new Font("Bauhaus 93",Font.ITALIC,20);

tx1=new JTextField("Start Game");
add(tx1);
tx1.setBounds(50,230,150,35);
tx1.setBackground(Color.black);
tx1.setForeground(Color.green);
tx1.setFont(f);

tx2=new JTextField("Player1 Name");
add(tx2);
tx2.setBounds(50,290,150,35);
tx2.setBackground(Color.black);
tx2.setForeground(Color.green);
tx2.setFont(f);

tx3=new JTextField("Player2 Name");
add(tx3);
tx3.setBounds(50,375,150,35);
tx3.setBackground(Color.black);
tx3.setForeground(Color.green);
tx3.setFont(f);

b3=new  JButton("ROLL");
b3.setBounds(50,500,100,30);
add(b3);
b3.setFont(f);
b3.setForeground(Color.red);
b3.addActionListener(this);

b4=new  JButton(img7);
b4.setBounds(20,560,150,60);
add(b4);
b4.setFont(f);
b4.setForeground(Color.red);

}
    public void paintComponent(Graphics g)
    {super.paintComponent(g);
    g.setColor(new Color(4,129,255));
        g.fillRect(0,0,200,735);
        
g.drawImage(swt,0,0,this);
g.drawImage(board,200,0,this);
g.drawImage(s1,920,0,this);
g.drawImage(start,20,550,this);

g.drawImage(player1,px1,py1,this);
g.drawImage(player2,120,620,this);

g.drawImage(player11,10,280,this);
g.drawImage(player12,10,360,this);

g.drawImage(dice,10,420,this);
g.drawImage(dice1,110,430,this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b3)
        {
            int random=(int)Math.round(Math.random()*5+1);
            px1=140; py1=645;
                        switch(random)
            {
                case 1:
                img11=new ImageIcon("dice1.png");
               px1+=70;
               break;
               
               case 2:
               img11=new ImageIcon("dice2.png");
               px1+=70*2;
               break;
               
               case 3:
               img11=new ImageIcon("dice3.png");
               px1+=70*3;
               break;
               
               case 4:
               img11=new ImageIcon("dice4.png");
               px1+=70*4;
               break;
               
               case 5:
               img11=new ImageIcon("dice5.png");
               px1+=70*5;
               break;
               
               case 6:
               img11=new ImageIcon("dice6.png");
               px1+=70*6;
                break;
            }
            dice1=img11.getImage();
            repaint();
        }
    }
} 
class snakeLadder

{
    public static void main (String ar[])
    {
FDemo f=new FDemo();
f.setVisible(true);
f.setBounds(200,100,990,735);

f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}