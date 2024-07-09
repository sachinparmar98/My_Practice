
/*
import java.util.ArrayList;
class ArrayList10
{
	
	public static void main(String ar[])
	{
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		for(Object i:al)
			System.out.println(i);
	}
}
*/
/*
out put 
10
20
30
40
50
*/
// BELOW WE WANT DATA INTO Integer
/*
import java.util.ArrayList;
class ArrayList10
{
	
	public static void main(String ar[])
	{
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(60);
		for(Object i:al)
		{
			Integer j=(Integer)i;
			System.out.println(j);
	}}
}
*/
/*
10
20
30
40
60
*/

//CLASS CAST EXCEPTION IN ABOVE EXAMPLE

/*
import java.util.ArrayList;
class ArrayList10
{
	
	public static void main(String ar[])
	{
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add("ram");
		for(Object i:al)
		{
			Integer j=(Integer)i;//exception genrate here for "ram"
			System.out.println(j);
	}}
}
*/
/*
10
20
30
40
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        at ArrayList10.main(ArrayList10.java:74)
*/


//SOLUTION FOR ABOVE CLASSCASTEXCEPTION
/*
import java.util.ArrayList;
class ArrayList12
{
	
	public static void main(String ar[])
	{
		
		ArrayList <Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add("ram");
		for(Object i:al)
		{
			Integer j=(Integer)i;
			System.out.println(j);
	}}
}
*/
/*
ArrayList10.java:104: error: no suitable method found for add(String)
                al.add("ram");
                  ^
    method Collection.add(Integer) is not applicable
      (argument mismatch; String cannot be converted to Integer)
    method List.add(Integer) is not applicable
      (argument mismatch; String cannot be converted to Integer)
    method AbstractCollection.add(Integer) is not applicable
      (argument mismatch; String cannot be converted to Integer)
    method AbstractList.add(Integer) is not applicable
      (argument mismatch; String cannot be converted to Integer)
    method ArrayList.add(Integer) is not applicable
      (argument mismatch; String cannot be converted to Integer)
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
*/



// WE CAN STORE NULL IN Integer
/*
import java.util.ArrayList;
class ArrayList13
{
	
	public static void main(String ar[])
	{
		
		ArrayList <Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(null);//because Integer is wrapper class type then dafinatly store null
		for(Object i:al)
		{
			Integer j=(Integer)i;
			System.out.println(j);
	}}
}
*/
/*
10
20
30
50
null
*/


//CASE FOR NULL POINTEREXCEPTION 
/*

import java.util.ArrayList;
class ArrayList15
{
	public static void main(String ...a)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(null);
		for(int i:al)
		{
			System.out.println(i);
		}
	}
}
*/
/*
10
11
12
13
14
Exception in thread "main" java.lang.NullPointerException
        at ArrayList15.main(ArrayList10.java:178)

*/

// WHY ABOVE NULLPOINTEREXCEPTION IS OCURS

class ArrayList16
{
	static public void main(String ar[])
	{
		int x=null;
	}
}

/*
in version 1.4
ArrayList10.java:204: error: incompatible types: <null> cannot be converted to int
                int x=null;
*/