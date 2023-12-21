                         //choice content fetch in TextField without button
/*
import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ItemListener
{
	Choice ch1;
	TextField tx1;
FDemo()
{
Font f=new Font("",Font.ITALIC,20);
setFont(f);

setLayout(new FlowLayout());

ch1=new Choice();
ch1.add("java");
ch1.add("c++");
ch1.add("html");
ch1.add("ds");
ch1.add("javascirpt");
ch1.add("simula");
add(ch1);
ch1.addItemListener(this);

tx1=new TextField(20);
add(tx1);
}

public void itemStateChanged(ItemEvent e)
{
	String s=ch1.getSelectedItem();
	tx1.setText(s);
}
}
class day25
{
public static  void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(700,700);
f.setLocation(200,100);
//f.addWindowListener();
//newWindowAdapter({public void windowClosing(WindowEvent e){System.exit(0);}});
}
}
*/
                        //SELCTED ITEM FROM LIST FETCH TEXTfIELD WIHOUT BUTTON
/*									   
import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ItemListener
{
	List ch1;
	TextField tx1;
FDemo()
{
Font f=new Font("",Font.ITALIC,20);
setFont(f);

setLayout(new FlowLayout());

ch1=new List(3,false);
ch1.add("java");
ch1.add("c++");
ch1.add("html");
ch1.add("ds");
ch1.add("javascirpt");
ch1.add("simula");
add(ch1);
ch1.addItemListener(this);

tx1=new TextField(20);
add(tx1);
}

public void itemStateChanged(ItemEvent e)
{
	String s[]=ch1.getSelectedItems();
	String s1="";
	for(String x:s)
	{
		s1=x+s1;
	}
	tx1.setText(s1);
}
}
class day25
{
public static  void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(700,700);
f.setLocation(200,100);
//f.addWindowListener();
//newWindowAdapter({public void windowClosing(WindowEvent e){System.exit(0);}});
}
}
*/
        

		               //CheckboxGroup
	/*
	
	import java.awt.*;
	import java.awt.event.*;
class FDemo extends Frame implements ItemListener
{
	CheckboxGroup cbg1;
	Checkbox cb1,cb2,cb3;
    TextField tx1;
	FDemo()
	{
		Font f=new Font("Bell MT",Font.BOLD,20);
             setFont(f);
           setLayout(new FlowLayout());

cbg1=new CheckboxGroup();


cb1=new Checkbox("general",true,cbg1);
add(cb1);		   


cb2=new Checkbox("obc",true,cbg1);
add(cb2);		   
	
	
cb3=new Checkbox("sc",true,cbg1);
add(cb3);		   

tx1=new TextField(20);
add(tx1); 
cb1.addItemListener(this);
cb2.addItemListener(this);
cb3.addItemListener(this);
}
public void itemStateChanged(ItemEvent e)
{
String s=cbg1.getSelectedCheckbox().getLabel();
	tx1.setText(s);
	
}	
	
}
class day25
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(700,700);
		f.setLocation(100,200);
	}	
}									   
	*/								   
	
	                  //Shandar array
				/*	
					class day25
					{
						public static void main (String ar[])
						{
						
							//byte x[]={50,51,52,53,54};				
							//short x[]={50,51,52,53,54};					
							//int x[]={50,51,52,53,54};					
							//long x[]={50,51,52,53,54};
						    //float x[]={50,51,52,53,54};						
							//double x[]={50,51,52,53,54};		
						    //char x[]={10,13,72,75,54};
					
							//boolean x[]=new boolean[5];						
					      	String x[]={"ram","sita","radha","shyam","gita"};
							
							//String  x[]=new String[5];
						
							
						System.out.println(x);
						}				
				}
				
				*/
				//
				
				
				
				
				
				