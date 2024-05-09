import java.io.*;
class Demo4
{
	public static void main(String ar[])throws ClassNotFoundException,IOException
	{
		String s1=" mr. sachin parmar";
		
		try(FileWriter  fw=new FileWriter("abc.txt",true);)
		{
 
int i=0;
while(i<s1.length()) 
{
	fw.write(s1.charAt(i));
	i++;
	
}	
System.out.println("data inserted");


	}
	
}
//Demo4.java:23: error: cannot find symbol
  //                      fw.close();
                     //   ^
 // symbol:   variable fw
  //location: class Demo4
//1 error
