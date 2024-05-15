

import java.io.*;
class ResourceDeclarationStep12
{
	public static void main(String ar[])throws FileNotFoundException ,IOException
	{
		
		  FileReader fr=new FileReader("abc.txt");
		try(fr)
		{}
System.out.println("data copid.....");
	
	}
}

/*
work in version 1.9 and greater


*/
