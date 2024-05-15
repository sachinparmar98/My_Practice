//insert data one file to another file using resource declaration

import java.io.*;
class ResourceDeclarationStep11
{
	public static void main(String ar[])throws FileNotFoundException ,IOException
	{
		FileWriter fw=new FileWriter("apl.txt",true) ;
		  FileReader fr=new FileReader("abc.txt");
		try(fw ; fr )
		{
			
int i=fr.read();
while(i!=-1) 
{
	fw.write((char)i);
	
	i=fr.read();
	
}	
System.out.println("data copid.....");

	}
	
	}
}

/*
 too solve the problem of readiblity form version 1.9 it provide faclity that we can
 declare the resources the out side ot try 
   
   and pass the object in try parameter 
   
   
   this example compile and run in java 1.9 and after java 1.9 version

*/
