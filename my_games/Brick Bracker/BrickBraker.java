import javax.swing.*;
public class BrickBraker
{
public static void main (String ar[])
{
JFrame f=new JFrame();
f.setVisible(true);
f.setResizable(false);
f.setTitle("Brick Bracker");
f.setBounds(200,200,700,600);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

GamePlay gameplay=new GamePlay();
f.add(gameplay);
}
}