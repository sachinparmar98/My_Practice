import javax.swing.*;
import java.awt.*;
class HomeDemo extends JPanel 
{  
   JButton b1,b2;
   ImageIcon imi;
   Image im;
        HomeDemo()
		{
			setLayout(null);
			
			
			Font f1=new Font("Century Schoolbook",Font.BOLD,25);
		  b1=new JButton("Login");
		  b1.setBounds(500,450,200,50); 
		  b1.setBackground(Color.green);
		  b1.setFont(f1);
		  add(b1);
		  
		  b2=new JButton("Register");
         b2.setBounds(900,450,200,50);
		  b2.setBackground(Color.green);
		  b2.setFont(f1);
		  add(b2);		  
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			imi=new ImageIcon("hm.jpg");
			im=imi.getImage();
			g.drawImage(im,0,0,this);
			
		
			
		}
}