/*
class A
{
int x,y;
A(int a,int b)
{
x=a;y=b;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
}
class day31
{
public static void main(String ar[])
{
A a1=new A(10,20);
// A a1(10,20);//not aceptalble
a1.show();
}
}
*/
/*
class day31
{
	public static void main(String ar[])
	{
		
		String s="my name is ram is ram";
		System.out.println(s);
		System.out.println(s.substring(4));
		System.out.println(s.substring(1,6));
		System.out.println(s.substring(3,6));
		// System.out.println(s.substring(3,30));
		System.out.println(s.substring(30	,3));

}}
*/

/*
class day31
{
	public static void main (String ar[])
	{
		String  s="my name is ram is ram";
		System.out.println(s.startsWith("my"));
		System.out.println(s.startsWith("m"));
		System.out.println(s.startsWith("M"));
		System.out.println(s.endsWith("m"));
		System.out.println(s.endsWith("M"));
	}
}
*/
/*
class day31
{
	public static void main(String ar[])
	{
		String s="   my name is ram      ";
	System.out.println(s);
	System.out.println(s.trim());
	}
}
*/
/*

class day31
{
	public static void main(String ar[])
	{
		String s1="10 ";
		String s2="20";
		int x=Integer.parseInt(s1.trim());
		int y=Integer.parseInt(s2);
	System.out.println("sum="+(x+y));
	}
}
*/
/*
class day31
{
	public static void main(String ar[])
	{
		String s="my name is ram";
		System.out.println(s.replace('a','z'));
	}
}
*/

/*
class day31
{
	public static void main(String ar[])
	{
		String s="my na me is ra m ";
	System.out.println(s);
String s1[]=s.split(" ");
// System.out.println(s1[0]);
// System.out.println(s1[3]);
// System.out.println(s1.length);
	for(String s2:s1)
	{
		System.out.println(s2);
	}
	}
}
*/

/*  
class day31
{
	public static void main(String ar[])
	{
		int x[]={100,5,20,50,0,-1,7,10,75};
		int m1=x[0];
		int m2=x[0];
	
		for (int i=1;i<x.length;i++)
		{
			if(m1<x[i])
			{
				
				m2=m1;
				m1=x[i];
			}
			else if(m2<x[i]||m1==m2)
			{
				m2=x[i];
			}
			
		}
	System.out.println(m2);
	}
}
 */