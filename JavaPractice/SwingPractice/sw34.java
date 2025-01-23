import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import javax.script.*;

class FDemo extends JFrame implements ActionListener {
    JButton b1;
    JTextField tf1;
    JComboBox cb1;

    FDemo() 
    {
        // setLayout(new FlowLayout());
        setLayout(null);
        Font f = new Font("", Font.BOLD, 20);
      
        String s[]={"java","c++","ds","python","php"};
        cb1=new JComboBox(s);
        add(cb1);  
        cb1.setFont(f);
        cb1.setBounds(50,150,200,50);

        tf1 = new JTextField(20);
        add(tf1);
        tf1.setBounds(300, 150, 300, 50);
        tf1.setFont(f);

        b1 = new JButton("BUTTON 1");
        add(b1);
        b1.setBounds(350, 300, 200, 50);
        b1.addActionListener(this);
        b1.setFont(f);

    }

    public void actionPerformed(ActionEvent e)
     {
        String s=(String)cb1.getSelectedItem();
        
        tf1.setText(s);

        

    }
}

class sw34
{
    public static void main(String[] ar) {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setSize(800, 800);
        f.setLocation(200, 200);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

    }
}