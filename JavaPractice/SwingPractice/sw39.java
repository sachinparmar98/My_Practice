import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
class FDemo extends JFrame implements ListSelectionListener
{
    JTextField tf;
    JList lt;
    String s[]={"java","php","css","html","python","simula","c#"};
    
    FDemo()
    {
        setLayout(new FlowLayout());
            //  setLayout(null);
        setResizable(false);
        Font f=new Font("",Font.BOLD,20);
         tf=new JTextField(20);
         add(tf);
        //  tf.setBounds(400,200,300,80);
         tf.setFont(f);

         lt =new JList(s);
         add(lt);
        //  lt.setBounds(40,200,300,150);
         lt.setVisibleRowCount(3);
         add(new JScrollPane(lt));
         lt.setFont(f);
         lt.addListSelectionListener(this);
    }
    public void valueChanged(ListSelectionEvent e)
    {
        String s="";
        Object o[]=lt.getSelectedValues();
        for(Object s1:o)
        {
            s=s+s1;
        }
        tf.setText(s);

    }
}
class sw39
{
    public static void main(String ar[])
    {
        FDemo f=new FDemo();
        f.setVisible(true);
        f.setBounds(100,100,800,800);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}