import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import javax.script.*;

class FDemo extends JFrame implements ActionListener {
    JButton b1;
    JTextField tf1;
    JList Lt1;
    String s[]={"java","c++","ds","python","php","sachin"};

    FDemo() 
    {
        setLayout(new FlowLayout());
        // setLayout(null);
        Font f = new Font("", Font.BOLD, 20);
      
        Lt1=new JList(s);
        add(Lt1);  
        Lt1.setFont(f);
        Lt1.setLocation(50,150);
        // Lt1.setSize(250,100);
        Lt1.setVisibleRowCount(3);
         add(new JScrollPane(Lt1));

        tf1 = new JTextField(20);
        add(tf1);
        // tf1.setBounds(350, 150, 300, 50);
        tf1.setFont(f);

        b1 = new JButton("BUTTON 1");
        add(b1);
        // b1.setBounds(350, 300, 200, 50);
        b1.addActionListener(this);
        b1.setFont(f);

    }

    public void actionPerformed(ActionEvent e)
     {
int x =Lt1.getSelectedIndex();        
        tf1.setText(s[x]);

        

    }
}

class sw36
{
    public static void main(String[] ar) {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setSize(800, 800);
        f.setLocation(200, 200);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

    }
}