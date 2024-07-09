//jo resource try with resource declaration ma open ki ha usa hum close nhi ker sakta ha

import java.io.*;
class ResourceDeclarationStep8
{
	public static void main(String ar[])throws IOException
	{
		String s1=" practice hard and smart ";
		
		try(FileWriter  fw=new FileWriter("abc.txt",true);)
		{
			fw=new FileWriter("aaa.txt",true);
 
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

ResourceDeclarationStep8.java:12: error: auto-closeable resource fw may not be assigned
                        fw=new FileWriter("aaa.txt",true);
                        ^
1 error


*/
