import java.io.*;
class Demo1
{
	public static void main(String ar[])throws ClassNotFoundException,IOException
	{
		String s1="sachin parmar";
		FileWriter fw;
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

//Demo2.java:23: error: variable fw might not have been initialized
                      //  fw.close();