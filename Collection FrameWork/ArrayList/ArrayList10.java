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
/*
class ArrayList16
{
	static public void main(String ar[])
	{
		int x=null;
	}
}

*/
/*
in version 1.4
ArrayList10.java:204: error: incompatible types: <null> cannot be converted to int
                int x=null;
*/

//remove METHOD WORKING

// import java.util.*;
// class ArrayList17
// {
// public static void main(String ... ar)
// {
// ArrayList al=new ArrayList();
// al.add(10);
// al.add(20);
// al.add(30);
// al.add(40);
// al.add(50);
// System.out.println(al);
// System.out.println(al.remove(2));		
// System.out.println(al);
// }
// } 

// OUT PUT BELOW

// [10, 20, 30, 40, 50]
// 30
// [10, 20, 40, 50]

//.................CASE 2 FOR remove method................

// import java.util.*;
// class ArrayList17
// {
// public static void main(String ... ar)
// {
// ArrayList al=new ArrayList();
// al.add(10);
// al.add(20);
// al.add(30);
// al.add(40);
// al.add(50);
// System.out.println(al);
// System.out.println(al.remove(5));		
// System.out.println(al);
// }
// } 

// OUTPUT
// [10, 20, 30, 40, 50]
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5, Size: 5
// at java.util.ArrayList.rangeCheck(ArrayList.java:659)
// at java.util.ArrayList.remove(ArrayList.java:498)
// at ArrayList17.main(ArrayList10.java:257)

//............... COLLECTION INTERFACE ADD METHOD.................

// import java.util.*;
// class ArrayList17
// {
// public static void main(String ... ar)
// {
// ArrayList al=new ArrayList();
// System.out.println(al.add(10));
// System.out.println(al.add(20));
// System.out.println(al.add(10));
// System.out.println(al.add(40));
// System.out.println(al.add(50));
// System.out.println(al);
// }
// } 

// ..........OUTPUT...........
// true
// true
// true
// true
// true
// [10, 20, 10, 40, 50]

//IF WE USE REMOVE WITHE ADD METHOD

// import java.util.*;
// class ArrayList17
// {
// public static void main(String ... ar)
// {
// ArrayList al=new ArrayList();
// System.out.println(al.add(10));
// System.out.println(al.add(20));
// System.out.println(al.add(10));
// System.out.println(al.add(0));
// System.out.println(al.add(null));
// System.out.println(al.size());
// }
// } 

// OUTPUT
// true
// true
// true
// true
// true
// 5

//............SOME CONCEPT ................

// import java.util.*;
// class ArrayList17
// {
// public static void main(String ... ar)
// {
// ArrayList al=new ArrayList();
// System.out.println(al.add(10));
// System.out.println(al.add(20));
// System.out.println(al.add(10));
// System.out.println(al.add(0));
// al.add(10,344);
// System.out.println(al.add(null));
// System.out.println(al.size());
// }
// } 

// ......OUTPUT
// true
// true
// true
// true
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 4
// at java.util.ArrayList.rangeCheckForAdd(ArrayList.java:667)
// at java.util.ArrayList.add(ArrayList.java:479)
// at ArrayList17.main(ArrayList10.java:338)

//................REMOVE METHOD

// import java.util.*;
// class ArrayList18
// {
// public static void main(String ... ar)
// {
// ArrayList al=new ArrayList();
// System.out.println(al.add(10));
// System.out.println(al.add(2550));
// System.out.println(al.add("10323"));
// System.out.println(al.add(0));
// al.remove("10323");
// al.remove("2550");
// al.remove(new Integer("2550"));

// System.out.println(al);
// }
// } 

// true
// true
// true
// true
// [10, 0]

//.................REMOVE AND REMOVEALL METHOD COLLECTION INTERFACE.......

// import java.util.*;
// class ArrayList18
// {
// public static void main(String ... ar)
// {
// ArrayList al=new ArrayList();
// al.add(10);	
// al.add(20);	
// al.add(30);	
// al.add(40);	
// al.add(50);	

// ArrayList al2=new ArrayList();
// al2.add(10);
// al2.add(100);
// al2.add(200);
// al2.add(20);
// al2.add(300);
// al.add(al2);
// System.out.println(al.remove(al2));
// System.out.println(al);

// System.out.println(al2);
// }
// } 

//........OUTPUT
// true
// [10, 20, 30, 40, 50]
// [10, 100, 200, 20, 300]

//................RETAINALL METHOD..................

// import java.util.*;
// class ArrayList18
// {
// public static void main(String ... ar)
// {
// ArrayList al=new ArrayList();
// al.add(10);	
// al.add(20);	
// al.add(30);	
// al.add(40);	
// al.add(50);	

// ArrayList al2=new ArrayList();
// al2.add(100);
// al2.add(200);
// al2.add(300);
// al.add(al2);
// System.out.println(al.retainAll(al2));
// System.out.println(al);

// System.out.println(al2);
// }
// } 

//........putput
// true
// []
// [100, 200, 300]

//...........retainAll method...................

// import java.util.*;
// class ArrayList19
// {
// public static void main(String ... ar)
// {
// ArrayList al=new ArrayList();
// al.add(10);	
// al.add(20);	
// al.add(30);	
// al.add(40);	
// al.add(50);	

// ArrayList al2=new ArrayList();
// al2.add(10);
// al2.add(20);
// al2.add(30);
// System.out.println(al.retainAll(al2));
// System.out.println(al);
// System.out.println("ram");

// System.out.println(al2);
// }
// }

// ..........output 
// true
// [10, 20, 30]
// [10, 20, 30]

//.........................retainAll method..................

// import java.util.*;
// class ArrayList20
// {
// public static void main(String ... ar)
// {
// ArrayList al=new ArrayList();
// al.add(10);	
// al.add(20);	
// al.add(30);	
// al.add(40);	
// al.add(50);	

// ArrayList al2=new ArrayList();
// al2.add(10);
// al2.add(20);
// al2.add(30);
// al2.add(40);
// al2.add(50);

// System.out.println(al.retainAll(al2));
// System.out.println(al);

// System.out.println(al2);
// }
// }

// ..........output
// false
// [10, 20, 30, 40, 50]
// [10, 20, 30, 40, 50]

//..................contains method.......................

// import java.util.*;
// class ArrayList21
// {
// public static void main(String ... ar)
// {
// ArrayList al=new ArrayList();
// al.add(10);	
// al.add(20);	
// al.add(30);	
// al.add(40);	
// al.add(50);	

// System.out.println(al.contains(2));
// System.out.println(al.contains(20));

// System.out.println(al);
// }
// }
// ...............output
// false
// true
// [10, 20, 30, 40, 50]

//..................contains method.......................

// import java.util.*;
// class ArrayList22
// {
// public static void main(String ... ar)
// {
// ArrayList al=new ArrayList();
// al.add(10);	
// al.add(20);	
// al.add(30);	
// al.add(40);	
// al.add(50);	

// System.out.println(al.containsAll(2));		
// System.out.println(al);
// }
// }

// .............output
// ArrayList10.java:563: error: no suitable method found for containsAll(int)
// System.out.println(al.containsAll(2));
// ^
// method Collection.containsAll(Collection) is not applicable
// (argument mismatch; int cannot be converted to Collection)
// method List.containsAll(Collection) is not applicable
// (argument mismatch; int cannot be converted to Collection)
// method AbstractCollection.containsAll(Collection) is not applicable
// (argument mismatch; int cannot be converted to Collection)
// Note: ArrayList10.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error

// because containsAll() method ka parameter ma Collection ka Object hona chahiya

//..................containsAll method.......................

// import java.util.*;
// class ArrayList23
// {
// public static void main(String ... ar)
// {
// ArrayList al=new ArrayList();
// al.add(10);	
// al.add(20);	
// al.add(30);	
// al.add(40);	
// al.add(50);	
// ArrayList al2=new ArrayList();
// al2.add(10);	
// al2.add(20);	
// al2.add(30);	
// al2.add(40);	
// al2.add(50);	

// System.out.println(al.containsAll(al2));		

// }
// }

// .............output
// true

//......................genric type ArrayList................
// import java.util.*;
// class ArrayList24
// {
// public static void main(String ... ar)
// {
//ArrayList<Number> al=new ArrayList<>();
// ArrayList<Integer> al=new ArrayList<>();
// al.add(10);	
// al.add(20);	
// al.add(30);	
// al.add(40);	
// al.add(50);	
// ArrayList al2=new ArrayList();
// al2.add(10);	
// al2.add(20);	
// al2.add(30);	
// al2.add(40);	
// al2.add("ab");

// al.addAll(al2);
// System.out.println(al);		
// System.out.println(al2);		

// }
// }
//.................Number...............
// class ArrayList25
// {

// public static void main(String ar[])
// {
// Number x=10;
// Number x1="sachin";
// System.out.println(x);
// System.out.println(x1);
// }
// }

//.........out put
// D:\sachin\GitDemo\My_Practice\Collection FrameWork>java ArrayList25
// 10

// D:\sachin\GitDemo\My_Practice\Collection FrameWork>javac ArrayList10.java
// ArrayList10.java:649: error: incompatible types: String cannot be converted to Number
// Number x1="sachin";
// ^
// 1 error

//.......................get method concept..............
// import java.util.*;
// class ArrayList26
// {
// public static void main(String ... ar)
// {
// ArrayList<Number> al=new ArrayList<>();
//ArrayList<Integer> al=new ArrayList<>();
// al.add(10);	
// al.add(20);	
// al.add(30);	
// al.add(40);	
// al.add(50);	
// ArrayList al2=new ArrayList();
// al2.add(10);	
// al2.add(20);	
// al2.add(30);	
// al2.add(40);	
// al2.add("ab");
// Integer y=(Integer)al.get(3);
// System.out.println(y);		

// }
// }
// .....output
// 40

//.........run below in v 1.4
// import java.util.*;
// class ArrayList27
// {
// public static void main(String ar[])

// {
// ArrayList al=new ArrayList();
// al.add(10);
// al.add(20);
// al.add(30);
// al.add(40);
// al.add(50);
// int x=(int )al.get(1);
// System.out.println(x);
// }
//}
// ......output
// ArrayList10.java:705: error: incompatible types: Object cannot be converted to int
// int x=(int )al.get(1);
// ^

//.......................get method concept..............
// import java.util.*;
// class ArrayList27
// {
// public static void main(String ... ar)
// {

// ArrayList<Integer> al=new ArrayList<>();
// al.add(10);	
// al.add(20);	
// al.add(30);	
// al.add(40);	
// al.add(50);	
// ArrayList <Number>al2=new ArrayList<>();
// al2.add(10);	
// al2.add(20);	
// al2.add(30);	
// al2.add(40);	
// al2.add("ab");
//al.addAll(al2);
// System.out.println(al);		
// System.out.println(al2);		

// }
// }
// ..............outputArrayList10.java:732: error: no suitable method found for add(String)
// al2.add("ab");
// ^
// method Collection.add(Number) is not applicable
// (argument mismatch; String cannot be converted to Number)
// method List.add(Number) is not applicable
// (argument mismatch; String cannot be converted to Number)
// method AbstractCollection.add(Number) is not applicable
// (argument mismatch; String cannot be converted to Number)
// method AbstractList.add(Number) is not applicable
// (argument mismatch; String cannot be converted to Number)
// method ArrayList.add(Number) is not applicable
// (argument mismatch; String cannot be converted to Number)
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error

//.................classcastexception in get
// import java.util.*;
// class ArrayList27
// {
// public static void main(String ... ar)
// {

// ArrayList al=new ArrayList();
// al.add(10);	
// al.add(20);	
// al.add("30");	
// al.add(40);	
// al.add(50);	
// System.out.println("sachin1");
//int x=(int )al.get(2);
// Integer x=(Integer )al.get(2);
// }}

//..........................ArrayList get method...................

import java.util.*;

class ArrayList28 {
	public static void main(String... ar) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		ArrayList al2 = new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add("ab");
		al2.add('c');
		int x = al.get(2);
		al.addAll(al2);
		// int y=al.get(8);
		System.out.println(x);
		// System.out.println(y);
		System.out.println(al);
		System.out.println(al2);

	}
}
