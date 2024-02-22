import javax.swing.JPanel;
import  javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;

class GamePlay extends JPanel implements ActionListener,KeyListener
{
	boolean play=false;
	int totalBrick=21;
	Timer timer;
	int delay=8;
	int ballposx=120;
	int ballposy=350;
	int ballXdir=-1;
	int ballYdir=-2;
	int playerX=300;
	
 public GamePlay()
 {
	 addKeyListener(this);
	 setFocusable(true);
	 setFocusTraversalKeysEnabled(true);
	 
	 timer=new Timer(delay,this);
	 timer.start();
 }
	
public void paint(Graphics g)
{
	//board
g.setColor(Color.black);
g.fillRect(1,1,692,592);


g.setColor(Color.cyan);
g.fillRect(0,0,692,3);// top border
g.fillRect(0,3,3,592);// Left Border	
g.fillRect(678,3,3,592);// right Border	

//paddle
g.setColor(Color.green);
g.fillRect(playerX,540,100,50);

//ball
g.setColor(Color.red);
g.fillOval(ballposx,ballposy,20,20);
}

public void actionPerformed(ActionEvent e)
{
	}

public void keyTyped(KeyEvent e)
{}

public void moveleft()
{
	playerX-=20;
}

public void moveright()
{
		playerX+=20;
}

public void keyPressed(KeyEvent e)
{
	if(e.getKeyCode()==KeyEvent.VK_LEFT)
	{
		moveleft();
	}
	
	if(e.getKeyCode()==KeyEvent.VK_RIGHT)
	{
		moveright();
	}
	repaint();
}

public void keyReleased(KeyEvent e)
{}

}