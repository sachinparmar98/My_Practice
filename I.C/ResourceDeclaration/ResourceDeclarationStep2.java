import java.io.*;
class Demo3
{
	public static void main(String ar[])throws ClassNotFoundException,IOException
	{
		String s1="sachin parmar";
		FileWriter fw=null;
		try
		{
    fw=new FileWriter("abc.txt",true);
int i=0;
while(i<s1.length()) 
{
	fw.write(s1.charAt(i));
	i++;
	
}	
System.out.println("data inserted");
System.out.println(10/0);
		}
		finally
		{
			fw.close();
		}

	}
	
}
//data inserted
//Exception in thread "main" java.lang.ArithmeticException: / by zero
     //   at Demo3.main(Demo3.java:19)
