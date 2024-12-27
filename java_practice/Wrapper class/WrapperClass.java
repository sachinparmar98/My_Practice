//................Byte Wrapper class...................
import java.util.*;
/*
class WrapperClass
{
public static void main(String ar[])
{
	ArrayList al=new ArrayList();
	al.add(new Byte(10));
	al.add(new Byte(20));
	al.add(new Byte(30));
	for(Object i:al)
		System.out.println(i);
	
}
}
*/

/*
WrapperClass.java:8: error: no suitable constructor found for Byte(int)
        al.add(new Byte(10));
               ^
    constructor Byte.Byte(byte) is not applicable
      (argument mismatch; possible lossy conversion from int to byte)
    constructor Byte.Byte(String) is not applicable
      (argument mismatch; int cannot be converted to String)
WrapperClass.java:9: error: no suitable constructor found for Byte(int)
        al.add(new Byte(20));
               ^
    constructor Byte.Byte(byte) is not applicable
      (argument mismatch; possible lossy conversion from int to byte)
    constructor Byte.Byte(String) is not applicable
      (argument mismatch; int cannot be converted to String)
WrapperClass.java:10: error: no suitable constructor found for Byte(int)
        al.add(new Byte(30));
               ^
    constructor Byte.Byte(byte) is not applicable
      (argument mismatch; possible lossy conversion from int to byte)
    constructor Byte.Byte(String) is not applicable
      (argument mismatch; int cannot be converted to String)
3 errors


because Byte wrapper class have only 2 constructor 
1- Byte(byte)
2- Byte(String);
*/

//SOLUTION FOR ABOVE EXAMPLE
/*
class WrapperClass
{
public static void main(String ar[])
{
	ArrayList al=new ArrayList();
	al.add(new Byte((byte)10));
	al.add(new Byte((byte)20));
	al.add(new Byte((byte)30));
	for(Object i:al)
		System.out.println(i);
	
}
}
*/
/*
10
20
30
*/


//................Short Wrapper class...................
/*
class WrapperClass2
{
	public static void main(String ar[])
	{
		ArrayList al=new ArrayList();
		al.add(new Short(10));
		al.add(new Short(20));
		al.add(new Short(30));
		for (Object i:al)
			System.out.println(i);
	}
}
*/
/*
WrapperClass.java:78: error: no suitable constructor found for Short(int)
                al.add(new Short(10));
                       ^
    constructor Short.Short(short) is not applicable
      (argument mismatch; possible lossy conversion from int to short)
    constructor Short.Short(String) is not applicable
      (argument mismatch; int cannot be converted to String)
WrapperClass.java:79: error: no suitable constructor found for Short(int)
                al.add(new Short(20));
                       ^
    constructor Short.Short(short) is not applicable
      (argument mismatch; possible lossy conversion from int to short)
    constructor Short.Short(String) is not applicable
      (argument mismatch; int cannot be converted to String)
WrapperClass.java:80: error: no suitable constructor found for Short(int)
                al.add(new Short(30));
                       ^
    constructor Short.Short(short) is not applicable
      (argument mismatch; possible lossy conversion from int to short)
    constructor Short.Short(String) is not applicable
      (argument mismatch; int cannot be converted to String)
3 errors
 because Short have only two constructor
 1-Short(short)
 2-Short(String)
*/

//SOLUTION FOR ABOVE ERROR
/*
class WrapperClass2
{
	public static void main(String ar[])
	{
		ArrayList al=new ArrayList();
		al.add(new Short((short)10));
		al.add(new Short((short)30));
		al.add(new Short((short)30));
		for (Object i:al)
			System.out.println(i);
	}
}

*/

/*
10
30
30
*/
//.......................Integer Wrapper Class.................
/*
class WrapperClass3
{
	public static void main(String ar[])
	{
		ArrayList al=new ArrayList();
		al.add(new Integer(10));
		al.add(new Integer(10.1));
		al.add(new Integer(20));
		al.add(new Integer(30));
		al.add(new Integer("ram"));
		for(Object i:al)
			System.out.println(i);
	}
}
*/
/*
WrapperClass.java:145: error: no suitable constructor found for Integer(double)
                al.add(new Integer(10.1));
                       ^
    constructor Integer.Integer(int) is not applicable
      (argument mismatch; possible lossy conversion from double to int)
    constructor Integer.Integer(String) is not applicable
      (argument mismatch; double cannot be converted to String)
Note: WrapperClass.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error

because Integer wrapper class have only 2 constructor
1-Integer(int)
2-Integer(String)
*/

//......................Long Wrapper Class..........................
/*
class WrapperClass4
{
	public static void main (String ar[])
	{
		ArrayList al=new ArrayList();
		al.add(new Long(10));
		al.add(new Long("20"));
		//al.add(new Long("9223372036854775808"));//numberformatException
		for(Object i:al)
			System.out.println(i);
	}
}
*/
/*
10
20
Long Wrapper class have two constructor
1-Long(long)
2-Long(String)
*/


//........................Float WrapperClass........................
/*
class WrapperClass
{
	public static void main (String ar[])
	{
		ArrayList al=new ArrayList();
		al.add(new Float(10));
		al.add(new Float(10.0));
		al.add(new Float("10.0"));
		al.add(new Float("40"));
		for(Object i:al)
			System.out.println(i);
		
	}
}
*/
/*
10.0
10.0
10.0
40.0
 
 Float wrapper class have three constructor
 1-Float(float)
 2-Float(double)
 3-Float(String)
*/

//..................Double wrapper class.....................

/*class WrapperClass
{
	public static void main(String ar[])
	{
		ArrayList al=new ArrayList();
		al.add(new Double(10));
		al.add(new Double(10.10));
		al.add(new Double(40.000000));
		al.add(new Double(10.1234567812345678));
             
	   al.add(new Double("50.10"));
	   al.add(new Double("50.1"));
	   for(Object i:al)
		   System.out.println(i);
	}
}
*/
/*
10.0
10.1
40.0
10.123456781234568
50.1
50.1


Double wrapper Class have two constructor
1-Double(double)
2-Double(String)

*/

//...........................Character wrapper class ..................
class WrapperClass
{
	public static void main(String ar[])
	{
		ArrayList al =new ArrayList();
		al.add(new Character('A'));
		al.add(new Character("A"));
		al.add(new Character(65));
		al.add(new Character('6'));
		for(Object i:al)
			System.out.println(i);
		
	}
}