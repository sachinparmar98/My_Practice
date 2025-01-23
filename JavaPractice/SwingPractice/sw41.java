import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
class FDemo extends JFrame implements ItemListener
{
    JTextField tf;
    JCheckBox cb,cb1;
    
    FDemo()
    {
        setLayout(new FlowLayout());
            //  setLayout(null);
        setResizable(false);
        Font f=new Font("",Font.BOLD,20);
        
       cb=new JCheckBox("male");
       add(cb);
       cb.setFont(f);
       cb.addItemListener(this);
        
       cb1=new JCheckBox("female");
       add(cb1);
       cb1.setFont(f);
       cb1.addItemListener(this);
        
        tf=new JTextField(20);
         add(tf);
        //  tf.setBounds(400,200,300,80);
         tf.setFont(f);

       
    }
    public void itemStateChanged(ItemEvent e)
    {
        String s="";
        if(cb.isSelected())
        {
                s=cb.getLabel();
        }
        if(cb1.isSelected())
        {
            s=s+"  "+cb1.getLabel();
        }
        tf.setText(s);

    }
}
class sw41
{
    public static void main(String ar[])
    {
        FDemo f=new FDemo();
        f.setVisible(true);
        f.setBounds(100,100,800,800);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}