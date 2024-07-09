import java.io.*;
class ResourceDeclarationStep4
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
}

/*

insise try parameter is try with resourcce Declaration

*/
