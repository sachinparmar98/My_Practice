import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import javax.script.*;

class FDemo extends JFrame implements ActionListener {
    JButton b1;
    JTextField tf1;
    JRadioButton rb1, rb2;
    ButtonGroup bg1;

    FDemo() 
    {
        // setLayout(new FlowLayout());
        setLayout(null);
        Font f = new Font("", Font.BOLD, 20);

        bg1=new ButtonGroup();
        rb1 = new JRadioButton("male");
        add(rb1);
        rb1.setFont(f);
        rb1.setBounds(100, 100, 150, 50);
        bg1.add(rb1);

        rb2 = new JRadioButton("female");
        add(rb2);
        rb2.setFont(f);
        rb2.setBounds(100, 200, 150, 50);
         bg1.add(rb2);

        tf1 = new JTextField(20);
        add(tf1);
        tf1.setBounds(300, 150, 300, 50);
        tf1.setFont(f);

        b1 = new JButton("BUTTON 1");
        add(b1);
        b1.setBounds(200, 300, 200, 50);
        b1.addActionListener(this);
        b1.setFont(f);

    }

    public void actionPerformed(ActionEvent e)
     {
        String s="";
        if(rb1.isSelected())
        {
            s=rb1.getLabel();
        }
        
        if(rb2.isSelected())
        {
            s=s+"  "+rb2.getLabel();
        }
        tf1.setText(s);

        

    }
}

class sw33 {
    public static void main(String[] ar) {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setSize(800, 800);
        f.setLocation(200, 200);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

    }
}