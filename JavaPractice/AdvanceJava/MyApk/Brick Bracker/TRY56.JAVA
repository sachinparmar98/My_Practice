
import javax.swing.*;
import java.awt.*;
import javax.script.*;
import java.awt.event.*;

class FDemo extends JFrame implements ActionListener {
	JButton b[] = new JButton[20];
	JTextField tf;
	int i = 0;
	int x = 0, y = 100;
	String data[] = { "B", "C", "1/X", "sqrt", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3",
			"-", "0", ".", "=", "+" };

	FDemo() {
		Font f = new Font("", Font.ITALIC, 35);
		Color c = new Color(20, 252, 231);
		Color c1 = new Color(255, 253, 127);
		setResizable(false);
		setTitle("CALCULATOR");

		setLayout(null);
		tf = new JTextField(10);
		tf.setSize(400, 100);
		tf.setLocation(0, 0);
		tf.setBackground(c1);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		add(tf);
		tf.setFont(f);
		for (int k = 1; k <= 5; k++) {
			for (int j = 1; j <= 4; j++) {
				b[i] = new JButton();
				b[i].setLabel(data[i]);
				add(b[i]);
				b[i].setBackground(c);
				b[i].setSize(100, 100);
				b[i].setLocation(x, y);
				b[i].setFont(f);
				b[i].addActionListener(this);
				x += 100;
				i++;
			}
			y += 100;
			x = 0;
		}
		/*
		 * 
		 * b[0].setLabel("B");
		 * b[1].setLabel("C");
		 * b[2].setLabel("1/X");
		 * b[3].setLabel("Sqrt");
		 * 
		 * b[4].setLabel("7");
		 * b[5].setLabel("8");
		 * b[6].setLabel("9");
		 * b[7].setLabel("/");
		 * 
		 * b[8].setLabel("4");
		 * b[9].setLabel("5");
		 * b[10].setLabel("6");
		 * b[11].setLabel("*");
		 * 
		 * b[12].setLabel("1");
		 * b[13].setLabel("2");
		 * b[14].setLabel("3");
		 * b[15].setLabel("-");
		 * 
		 * b[16].setLabel("0");
		 * b[17].setLabel(".");
		 * b[18].setLabel("=");
		 * b[19].setLabel("+");
		 * 
		 */
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b[0]) {
			String s = tf.getText();
			tf.setText(s.substring(0, s.length() - 1));
		} else if (e.getSource() == b[1]) {
			tf.setText("");
		} else if (e.getSource() == b[2]) {
			String s = tf.getText();
			double d = Double.parseDouble(s);
			d = 1 / d;
			tf.setText("" + d);
		} else if (e.getSource() == b[3]) {
			String s = tf.getText();
			double d = Double.parseDouble(s);

			tf.setText("" + Math.sqrt(d));

		} else if (e.getSource() == b[18]) {
			String s = tf.getText();
			ScriptEngineManager sem = new ScriptEngineManager();
			ScriptEngine se = sem.getEngineByName("js");
			try {
				tf.setText("" + se.eval(s));
			} catch (Exception esm) {
			}
		} else {

			JButton br = (JButton) e.getSource();
			String s = tf.getText() + br.getLabel();

			tf.setText(s);
		}
	}
}

class TRY56

 {
	public static void main(String ar[]) {
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(417, 647);
		f.setLocation(700, 300);
		// f.getContentPane().setBackground(Color.cyan);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}