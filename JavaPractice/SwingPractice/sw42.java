import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class FDemo extends JFrame implements ItemListener {
    JTextField tf;
    JRadioButton rb1, rb2;
    ButtonGroup bg;

    FDemo() {
        setLayout(new FlowLayout());
        // setLayout(null);
        setResizable(false);
        Font f = new Font("", Font.BOLD, 20);
        bg = new ButtonGroup();

        rb1 = new JRadioButton("male");
        add(rb1);
        rb1.setFont(f);
        rb1.addItemListener(this);
        bg.add(rb1);

        rb2 = new JRadioButton("female");
        add(rb2);
        rb2.setFont(f);
        rb2.addItemListener(this);
        bg.add(rb2);

        tf = new JTextField(20);
        add(tf);
        // tf.setBounds(400,200,300,80);
        tf.setFont(f);

    }

    public void itemStateChanged(ItemEvent e) {
        String s = "";
        if (rb1.isSelected()) {
            s = rb1.getLabel();
        }
        if (rb2.isSelected()) {
            s = s + rb2.getLabel();
        }
        tf.setText(s);

    }
}

class sw42 {
    public static void main(String ar[]) {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setBounds(100, 100, 800, 800);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}