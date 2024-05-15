import java.io.*;
class ResourceDeclarationStep5
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
	}
}

/*


data inserted
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ResourceDeclarationStep5.main(ResourceDeclarationStep5.java:19)

*/
