import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame implements ActionListener {
    JButton b1;
    JTextField tf1;
    JCheckBox cb1, cb2;

    FDemo() 
    {
        // setLayout(new FlowLayout());
        setLayout(null);
        Font f = new Font("", Font.BOLD, 20);

        cb1 = new JCheckBox("java");
        add(cb1);
        cb1.setFont(f);
        cb1.setBounds(100, 100, 150, 50);

        cb2 = new JCheckBox("php");
        add(cb2);
        cb2.setFont(f);
        cb2.setBounds(100, 200, 150, 50);

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
        if(cb1.isSelected())
        {
            s=cb1.getLabel();
        }
        
        if(cb2.isSelected())
        {
            s=s+"  "+cb2.getLabel();
        }
        tf1.setText(s);

        

    }
}

class sw32 {
    public static void main(String[] ar) {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setSize(800, 800);
        f.setLocation(200, 200);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

    }
}