import java.io.*;
class ResourceDeclarationStep6
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
	finally
	{
		System.out.println("finally block");
	}
	}
}

/*

data inserted
finally block
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ResourceDeclarationStep6.main(ResourceDeclarationStep6.java:19)


*/
