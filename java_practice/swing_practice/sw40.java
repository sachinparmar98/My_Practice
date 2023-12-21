import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class FDemo extends JFrame implements ItemListener {
    JTextField tf;
    JComboBox cb;
    String s[] = { "java", "php", "css", "html", "python", "simula", "c#" };

    FDemo() {
        setLayout(new FlowLayout());
        // setLayout(null);
        setResizable(false);
        Font f = new Font("", Font.BOLD, 20);

        cb = new JComboBox(s);
        add(cb);
        cb.setFont(f);
        cb.addItemListener(this);

        tf = new JTextField(20);
        add(tf);
        // tf.setBounds(400,200,300,80);
        tf.setFont(f);

    }

    public void itemStateChanged(ItemEvent e) {
        String s = (String) cb.getSelectedItem();
        tf.setText(s);

    }
}

class sw40 {
    public static void main(String ar[]) {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setBounds(100, 100, 800, 800);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}