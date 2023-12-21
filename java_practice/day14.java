                         //Q1(nexttoken(); method )
/*
import java.io.*;
import java.util.*;
class day14
{
static public void main(String ar[])
{
//InputStreamReader i= new InputStreamReader(System.in);
//BufferedReader br = new BufferedReader(i);

//String s=br.readLine();
String s="10 20";
StringTokenizer st=new StringTokenizer(s);

String s1=st.nextToken();
String s2=st.nextToken();
String s3=st.nextToken();

//int x=Integer.parseInt(s1);
//int y=Integer.parseInt(s2);
//int z=Integer.parseInt(s3);

System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
}
}
*/

                           // Q2 taking token throw user 
/*
import java.io.*;
import java.util.*;
class day14
{
static public void main(String ar[]) throws IOException
{
InputStreamReader i= new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(i);

System.out.println("enter any  two number ");
String s=br.readLine();

StringTokenizer st=new StringTokenizer(s);
String s1=st.nextToken();
String s2=st.nextToken();

int x=Integer.parseInt(s1);
int y=Integer.parseInt(s2);

System.out.println(x+y);
}
}
*/
                     // Q3 split string using  any charcacter we use comma(,)          
/*
import java.io.*;
import java.util.*;
class day14
{
static public void main(String ar[]) throws IOException
{
InputStreamReader i= new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(i);

System.out.println("enter any  two number ");
String s=br.readLine();

StringTokenizer st=new StringTokenizer(s,",");//we made change in parameter
String s1=st.nextToken();
String s2=st.nextToken();

int x=Integer.parseInt(s1);
int y=Integer.parseInt(s2);

System.out.println(x+y);
}
}
*/
                     //Q4 split String using comma and space
/*
import java.io.*;
import java.util.*;
class day14
{
static public void main(String ar[]) throws IOException
{
InputStreamReader i= new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(i);

System.out.println("enter any  two number ");
String s=br.readLine();

StringTokenizer st=new StringTokenizer(s,", ");//we add space in parameter
String s1=st.nextToken();
String s2=st.nextToken();

int x=Integer.parseInt(s1);
int y=Integer.parseInt(s2);

System.out.println(x+y);
}
}
*/
                //Q5 using countTokens(); method is inside class Strinkenizer
/*
	import java.util.*;
import java.io.*;
	class day14
	{
		static public void main(String ar[])throws IOException
		{
			InputStreamReader i=new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(i);
			
			System.out.println("enter any number");
			String s=br.readLine();
			
			StringTokenizer st=new StringTokenizer(s,",  @#$%^*");
		System.out.println(st.countTokens());//
		String s1=st.nextToken();
		String s2=st.nextToken();
		System.out.println(st.countTokens());
		String s3=st.nextToken();
		System.out.println(st.countTokens);
		}
	}	
	*/
	         //Q6 using hasmoreTokens(); method this method return type is boolean 
/*
	import java.util.*;
import java.io.*;
	class day14
	{
		static public void main(String ar[])throws IOException
		{
			InputStreamReader i=new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(i);
			
			System.out.println("enter any number");
			String s=br.readLine();
			
			StringTokenizer st=new StringTokenizer(s,",  @#$%^*");
		System.out.println(st.hasMoreTokens());//
		String s1=st.nextToken();
		String s2=st.nextToken();
		System.out.println(st.hasMoreTokens());
		String s3=st.nextToken();
		System.out.println(st.hasMoreTokens());
		}
	}	
		 
	*/		 

                            //Q7 assignment additon of token using countToken();method
/*
import java.io.*;
import java.util.*;
class day14
{
static public void main(String ar[])throws IOException
{
 InputStreamReader ist=new InputStreamReader(System.in);
BufferedReader br =new BufferedReader(ist);
System.out.println("enter any number");

String s=br.readLine();//exception
StringTokenizer st=new StringTokenizer(s,", ");//comma and space
 
int sum=0;
while(st.countTokens()!=0)
{
sum=sum+Integer.parseInt(st.nextToken());
}

System.out.println("sum="+sum);

}
}
*/
                      //Q8 addi tion of token using hasMoreTokens(); method   
/*
import java.io.*;
import java.util.*;
class day14
{
static public void main(String ar[])throws IOException
{
 InputStreamReader ist=new InputStreamReader(System.in);
BufferedReader br =new BufferedReader(ist);
System.out.println("enter any number");

String s=br.readLine();//exception
StringTokenizer st=new StringTokenizer(s,", ");//comma and space
 
int sum=0;
while(st.hasMoreTokens())
{

sum=sum+Integer.parseInt(st.nextToken());

}

System.out.println("addition="+sum);

}
}

*/