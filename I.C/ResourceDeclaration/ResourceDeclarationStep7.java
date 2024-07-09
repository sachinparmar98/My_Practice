import java.io.*;
class ResourceDeclarationStep7
{
	public static void main(String ar[])throws ClassNotFoundException,IOException
	{
		String s1=" practice hard ";
		
		try(FileWriter  fw=new FileWriter("abc.txt",true);)
		{
 
int i=0;
while(i<s1.length()) 
{
	fw.write(s1.charAt(i));
	i++;
	
}	
System.out.println("data inserted");
System.out.println(10/0);

	}
	catch(Exception e)
	{
		System.out.println("Exception handled");
	}
	finally
	{
		System.out.println("finally block");
	}
	}
}

/*


data inserted
Exception handled
finally block

*/
