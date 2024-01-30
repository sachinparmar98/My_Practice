import javax.swing.*;

class RegisDemo extends JPanel {
    JTextField tx1, tx2, tx3;
    JButton b1, b2;

    RegisDemo() {
        tx1 = new JTextField(10);
        add(tx1);
        tx2 = new JTextField(10);
        add(tx2);
        tx3 = new JTextField(10);
        add(tx3);

        b1 = new JButton("register");
        add(b1);
        b2 = new JButton("Back");
        add(b2);

    }

}
