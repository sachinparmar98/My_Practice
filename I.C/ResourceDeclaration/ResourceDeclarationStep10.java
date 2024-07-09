//insert data one file to another file using resource declaration

import java.io.*;
class ResourceDeclarationStep10
{
	public static void main(String ar[])throws FileNotFoundException ,IOException
	{
		
		 
		try( FileWriter fw=new FileWriter("aaa.txt",true) ; FileReader fr=new FileReader("abc.txt"))
		{
			
int i=fr.read();
while(i!=-1) 
{
	fw.write((char)i);
	
	i=fr.read();
	
}	
System.out.println("data copid");

	}
	
	}
}

/*
 
 ResourceDeclarationStep10.java:10: error: no suitable constructor found for FileReader(String,boolean)
                try( FileWriter fw=new FileWriter("aaa.txt",true) ; FileReader fr=new FileReader("abc.txt",true))
                                                                                  ^
    constructor FileReader.FileReader(String) is not applicable
      (actual and formal argument lists differ in length)
    constructor FileReader.FileReader(File) is not applicable
      (actual and formal argument lists differ in length)
    constructor FileReader.FileReader(FileDescriptor) is not applicable
      (actual and formal argument lists differ in length)
1 error


yadi FileReader fr=new fileReader("abc.txt",true)  ma true pass kerna ka liya above error ayga


output data copied

*/
