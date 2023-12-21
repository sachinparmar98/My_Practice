import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame {
    JPDemo jp;

    FDemo() {
        jp = new JPDemo();
        add(jp);

    }
}

class JPDemo extends JPanel implements ActionListener, KeyListener {
    ImageIcon img1, img2;
    Image dot, head;
    int x[] = new int[100];
    int y[] = new int[100];
    int dots = 5;
    boolean Start_game = false;

    JPDemo() {
        x[0] = 120;
        y[0] = 100;
        x[1] = 100;
        y[1] = 100;
        x[2] = 80;
        y[2] = 100;
        x[3] = 60;
        y[3] = 100;
        x[4] = 40;
        y[4] = 100;
        setBackground(Color.black);
        img1 = new ImageIcon("dot.png");
        dot = img1.getImage();
        img2 = new ImageIcon("head.png");
        head = img2.getImage();
        Timer t = new Timer(200, this);
        t.start();
        addKeyListener(this);
        setFocusable(true);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < dots; i++) {
            if (i == 0) {
                g.drawImage(head, x[i], y[i], this);

            } else {
                g.drawImage(dot, x[i], y[i], this);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (Start_game) {

            for (int i = dots; i > 0; i--) {
                x[i] = x[i - 1];
                y[i] = y[i - 1];
            }
            x[0] = x[0] + 20;
        }
        repaint();
    }

    public void keyReleased(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        Start_game = true;

    }

    public void keyTyped(KeyEvent e) {

    }

}

class snakeGame {
    public static void main(String[] args) {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setBounds(200, 50, 1000, 1000);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}
