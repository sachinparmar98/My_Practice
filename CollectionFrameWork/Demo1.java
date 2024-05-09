import java.io.*;
class Demo1
{
	public static void main(String ar[])throws Exception
	{
		String s1="ram";
   FileWriter fw=new FileWriter("abc.txt",true);
int i=0;
while(i<s1.length()) 
{
	fw.write(s1.charAt(i));
	i++;
	
}	
System.out.println("data inserted");

fw.close();
	}
	
}