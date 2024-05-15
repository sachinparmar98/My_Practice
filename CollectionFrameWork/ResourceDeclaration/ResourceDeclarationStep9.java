//jo resource try with resource declaration ma open ki ha usa hum close nhi ker sakta ha

import java.io.*;
class ResourceDeclarationStep8
{
	public static void main(String ar[])throws IOException
	{
		String s1=" practice hard and smart ";
		 FileWriter fw;
		try( fw=new FileWriter("abc.txt",true);)
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
ResourceDeclarationStep9.java:10: error: <identifier> expected
                try( fw=new FileWriter("abc.txt",true);)
                       ^
1 error


because try ka ander file close ho jay gi too hum usa bhar too use ker hi nhi pay ga isliya


*/
