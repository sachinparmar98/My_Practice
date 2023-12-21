                             // Q1
/*  
class A
{
void show(int x[])
{
for(int i:x)
{
System.out.println(i);
}
}
}
class day30
{
public static void main (String ar[])
{
int x[]={10,20,30,40,50};

A a1=new A();
a1.show(x);
}
}
 */
                                         // Q2
 /*
 class A
 {
	 int[] show(int a[],int b[])
	 {
		int c[]=new int [5];
		for(int i=0;i<5;i++)
		{
			c[i]=a[i]+b[i];
		}
		return c;
	 }
 }
 class day30
 {
	 public static void main(String ar[])
	 
	 {
		 
		 int x[]={10,20,30,40,50};
		 int y[]={1,2,3,4,5,};
		A a1=new A();
		 int z[]=a1.show(x,y);
		 for(int i:z)
		 {
			 System.out.println(i);
		 }
	 }
	 }
	  
	  
	  */
	                                  // Q3
/*  
	  class day30
	  {
		  public static void main(String ar[])
		  {
			  int a=100;
			  int x[]={10,20,a,40,50};
		  for(int i:x)
		  {
			  System.out.println(i);
		  }
		  }
		  
	  }
	  */
	                                         // Q4
	  /*
	  class day30
	  {
		  public static void main (String ar[])
		  {
			  String s1=new String("ram 1");
			  String s2=new String();
			  s2="ram 2";
			  String s3="ram 3";
char x[]={'r','a','m','s','i','t','a'};
String s4=new String(x);		 
String s5=new String(x,0,5);	 
String s6=new String(x,4,1);		 
 // String s7=new String(x,9,5);		 
// String s8=new String(x,4,9);		 

System.out.println(s1);	
System.out.println(s2);	
System.out.println(s3);	
System.out.println(x);	
System.out.println(s4);	
System.out.println(s5);	
System.out.println(s6);	
 // System.out.println(s7);	
// System.out.println(s8);	
	}
	  }
	  */
	  
	                         // Q5
							 /*  
class day30
{
	public static void main(String ar[])
	{
		String s1="                                                Soft";
		String s2="Waves";
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.concat(s2));
	}
}					 
							 */
							 // Q6
							 /*
class day30
{
	static public void main(String ar[])
	{
		String s1="sachin";
		String s2="SACHIN";
		String s3="SaCHiN";
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		
		
	}
}
*/

                                    // Q7
									/*
class day30
{
	public static void main(String ar[])
	{
		String s1="abc";
		String s2="abc";
		String s3="Abc";
		String s4="Abcd";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		
	}
}
*/
                                 //Q8
/*								 
class day30
{
	public static void main(String ar[])
	{
		String s2="my name 	is ram is ram";
		
		// String s3="Abc"	;
		// String s4="Abcd";
		
		System.out.println(s2.indexOf("is"));
		System.out.println(s2.indexOf("isram"));
		System.out.println(s2.lastIndexOf("is"));
		// System.out.println(s1.compareTo(s3));
		
	}
}
*/


class A
{
	String lowercase(String s)
	{
		String s3="";
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>=65&&ch[i]<=90)
		{
			char ch1=(char)(ch[i]+32);
			 s3=s3+ch1;
		}
		else
			{
			s3=s3+ch[i];
          		}
	}
		return s3;
		
	}
}
class day30
{
	public static void main(String ar[])
	{
		String s1="AbCdee eee FFFF ZZ*ZZ";
			A a1=new A();
			String s2=a1.lowercase(s1);
			 System.out.println(s2); 
	}
}


/*
class A
{
	String upperCase(String s)
	{
		String s3="";
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>=97&&ch[i]<=122)
		{
			char ch1=(char)(ch[i]-32);
			 s3=s3+ch1;
		}
		else
			{
			s3=s3+ch[i];
          		}
	}
		return s3;
		
	}
}
class day30
{
	public static void main(String ar[])
	{
		String s1="AbCdee e eeF FFF ZZZZ";
			A a1=new A();
			String s2=a1.upperCase(s1);
			System.out.println(s2);
	}
}
*/