import javax.swing.*;

class JPanel1 extends JPanel {
    JButton b1;
    JTextField tx1, tx2;

    JPanel1() {

        tx1 = new JTextField(10);
        add(tx1);

        tx2 = new JTextField(10);
        add(tx2);

        b1 = new JButton("SACHIN");
        add(b1);

    }
}
