import javax.swing.*;
import java.awt.*;
class FDemo extends JFrame
{
FDemo()
{
	setLayout(new FlowLayout());
	
	Font f=new Font("Broadway",Font.BOLD,20);
	setFont(f);
	JLabel ep=new JLabel("enter password");
	add(ep);
	ep.setFont(f);
JTextField tx=new JTextField(10);
add(tx);
tx.setFont(f);
}
}
class sw8
{
public static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(700,700);
f.setLocation(200,100);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
}
