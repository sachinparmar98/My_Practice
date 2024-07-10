
//BOXING
/*
class UnBoxing
{
public static void main (String ...a)
{

Integer i1=new Integer(20);
int x=i1.intValue();
System.out.println(x);
System.out.println(i1);

}
}
*/
/*
20
20
*/

//BELOW PROGRAM FOR VERSION 1.4
/*class UnBoxing
{
	static public void main(String ar[])
	{
		
		Integer i=new Integer(50);
		int x=i;
		System.out.println(i);
		System.out.println(x);
	}
}
*/
/*
 error: incompatible types: Integer cannot be converted to int
                int x=i;
*/

//REASON FOR NULLPOINTEREXCEPTION
/*
class UnBoxing
{
	
	public static void main (String ar[])
	{
		Integer x=null;
		int i=x.intValue();
		
	}
}
*/
/*
Exception in thread "main" java.lang.NullPointerException
        at UnBoxing.main(UnBoxing.java:47)

*/