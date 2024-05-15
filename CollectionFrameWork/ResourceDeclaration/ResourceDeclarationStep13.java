

import java.io.*;
class ResourceDeclarationStep13
{
	public static void main(String ar[])throws FileNotFoundException ,IOException
	{
		
		  FileReader fr=new FileReader("abc.txt");
		try(fr=new FileReader("abc.txt"))
		{}
System.out.println("data copid.....");
	
	}
}

/*

run in version  1.9
*/
