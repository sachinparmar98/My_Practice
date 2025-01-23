import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class FDemo extends JFrame implements KeyListener {
    JTextField tf, tf1;

    FDemo() {
        setLayout(new FlowLayout());
        // setLayout(null);
        setResizable(false);
        Font f = new Font("", Font.BOLD, 20);

        tf = new JTextField("ENTER NAME", 10);
        add(tf);
        // tf.setBounds(400,200,300,80);
        tf.setFont(f);
        tf.setForeground(Color.gray);
        tf.addKeyListener(this);

        tf1 = new JTextField("ENTER C.N", 10);
        add(tf1);
        // tf.setBounds(400,200,300,80);
        tf1.setFont(f);
        tf1.setForeground(Color.gray);

    }

    public void keyPressed(KeyEvent e){
        String s = tf.getText();
        if(s.equals("ENTER NAME"))
        {
            tf.setText("");
        }

    }
    

    public void keyReleased(KeyEvent e){
        String s=tf.getText().trim();
        if(s.equals(" "))
        {
            tf.setText("ENTER NAME");
            tf.setForeground(Color.gray);
        }

    }

    public void keyTyped(KeyEvent e){
        String s = "";

    }

}

class sw43 {
    public static void main(String ar[]) {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setBounds(100, 100, 800, 800);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}