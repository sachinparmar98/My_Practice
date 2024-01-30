import javax.swing.*;
import java.awt.*;

class MenuDemo extends JPanel {
    JTabbedPane tb1;
    InsertDemo ins;
    SearchDemo src;
    ShowAllDemo soa;
    UpdateDemo upd;
    DeleteDemo dlt;

    MenuDemo() {
        ins = new InsertDemo();
        src = new SearchDemo();
        soa = new ShowAllDemo();
        upd = new UpdateDemo();
        dlt = new DeleteDemo();
        setLayout(new BorderLayout());
        tb1 = new JTabbedPane();
        tb1.addTab("Insert", ins);
        tb1.addTab("Search", src);
        tb1.addTab("ShowAll", soa);
        tb1.addTab("Update", upd);
        tb1.addTab("Delete", dlt);
        add(tb1);

    }

}

class InsertDemo extends JPanel {
    JLabel u1, u2, u3, u4, u5;
    JTextField tx1, tx2, tx3, tx4, tx5;
    JButton b1;

    InsertDemo() {
        setLayout(null);

        u1 = new JLabel("Enter Name");
        u1.setBounds(50, 50, 120, 40);
        add(u1);
        tx1 = new JTextField();
        tx1.setBounds(200, 50, 180, 30);
        add(tx1);

        u2 = new JLabel("Enter RNo.");
        u2.setBounds(50, 100, 120, 40);
        add(u2);
        tx2 = new JTextField();
        tx2.setBounds(200, 100, 180, 30);
        add(tx2);

        u3 = new JLabel("Enter phy marks");
        u3.setBounds(50, 150, 120, 40);
        add(u3);
        tx3 = new JTextField();
        tx3.setBounds(200, 150, 180, 30);
        add(tx3);

        u4 = new JLabel("Enter chem marks");
        u4.setBounds(50, 200, 120, 40);
        add(u4);
        tx4 = new JTextField();
        tx4.setBounds(200, 200, 180, 30);
        add(tx4);

        u5 = new JLabel("Enter Math marks");
        u5.setBounds(50, 250, 120, 40);
        add(u5);
        tx5 = new JTextField();
        tx5.setBounds(200, 250, 180, 30);
        add(tx5);

        b1 = new JButton("Insert");
        b1.setBounds(200, 350, 100, 30);
        add(b1);

    }
}

class SearchDemo extends JPanel {
    JLabel u1, u2;
    JTextField tx1, tx2;
    JButton b1;
    JTextArea txa1;

    SearchDemo() {
        setLayout(null);

        u1 = new JLabel("Enter Name");
        u1.setBounds(50, 50, 120, 40);
        add(u1);
        tx1 = new JTextField();
        tx1.setBounds(200, 50, 180, 30);
        add(tx1);

        u2 = new JLabel("Enter RNo.");
        u2.setBounds(50, 100, 120, 40);
        add(u2);
        tx2 = new JTextField();
        tx2.setBounds(200, 100, 180, 30);
        add(tx2);

        b1 = new JButton("Search");
        b1.setBounds(200, 180, 100, 30);
        add(b1);

        txa1 = new JTextArea();
        txa1.setBounds(80, 250, 300, 150);
        add(txa1);

    }
}

class ShowAllDemo extends JPanel {

    ShowAllDemo() {
        setLayout(null);
    }
}

class UpdateDemo extends JPanel {
    JLabel u1, u2;
    JTextField tx1, tx2;
    JButton b1;

    UpdateDemo() {
        setLayout(null);

        u1 = new JLabel("Enter Name");
        u1.setBounds(50, 50, 120, 40);
        add(u1);
        tx1 = new JTextField();
        tx1.setBounds(200, 50, 180, 30);
        add(tx1);

        u2 = new JLabel("Enter RNo.");
        u2.setBounds(50, 100, 120, 40);
        add(u2);
        tx2 = new JTextField();
        tx2.setBounds(200, 100, 180, 30);
        add(tx2);

        b1 = new JButton("UPdate");
        b1.setBounds(200, 180, 100, 30);
        add(b1);

    }
}

class DeleteDemo extends JPanel {
    JLabel u1, u2;
    JTextField tx1, tx2;
    JButton b1;

    DeleteDemo() {
        setLayout(null);

        u1 = new JLabel("Enter Name");
        u1.setBounds(50, 50, 120, 40);
        add(u1);
        tx1 = new JTextField();
        tx1.setBounds(200, 50, 180, 30);
        add(tx1);

        u2 = new JLabel("Enter RNo.");
        u2.setBounds(50, 100, 120, 40);
        add(u2);
        tx2 = new JTextField();
        tx2.setBounds(200, 100, 180, 30);
        add(tx2);

        b1 = new JButton("Delete");
        b1.setBounds(200, 180, 100, 30);
        add(b1);

    }
}
