// to create Object of a class 

//below use of forName() method

// class A{
	// static{System.out.println("static block");}
		// {
			// System.out.println("instance block");
		// }
// }
// class WaysToCreateObject
// {
	// public static void main (String ar[])throws ClassNotFoundException
	// {
		// Class.forName("A");
	// }
// }


//CREATIN OBJECT USIN new instance() METHOD

// class A{
	// static{System.out.println("static block");}
		// {
			// System.out.println("instance block");
		// }
// }
// class WaysToCreateObject1
// {
	// public static void main (String ar[])throws ClassNotFoundException,InstantiationException,IllegalAccessException
	// {
		// Class c=Class.forName("A");
		// c.newInstance();
// }}
// OUTPUT 
// STATIC BOLOCK
// INSTANCE BLOCK


// class A{
	// static{System.out.println("static block");}
		// {
			// System.out.println("instance block");
		// }
		// void show()
		// {
			// System.out.println("show method");
		// }
// }
// class WaysToCreateObject2
// {
	// public static void main (String ar[])throws ClassNotFoundException,InstantiationException,IllegalAccessException
	// {
		// Class c=Class.forName("A");
    		// c.newInstance().show();

// }}

// D:\sachin\GitDemo\My_Practice\Collection FrameWork>javac WaysToCreateObject.java
// WaysToCreateObject.java:55: error: not a statement
                // (A)c.newInstance().show();
                // ^
// 1 error

// because the return type of newInstance() method is Object jvm show method ko 
// Object class ma serch ker rha ha 


//...............SOLUTION FOR ABOVE PROGRAM ERROR.................



// class A{
	// A()
	// static{System.out.println("static block");}
		// {
			// System.out.println("instance block");
		// }
		// void show()
		// {
			// System.out.println("show method");
		// }
// }
// class WaysToCreateObject3
// {
	// public static void main (String ar[])throws ClassNotFoundException,InstantiationException,IllegalAccessException
	// {
		// Class c=Class.forName("A");
  // Object o=c.newInstance();
    // A a1=(A)o;
	// a1.show();
// }}


// OUTPUT
// static block
// instance block
// show method


//....................PASSING ARGUMENT AT RUNTIME................
import java.util.*;
class A{
	
	static{System.out.println(" A static block");}
		{
			System.out.println(" A instance block");
		}
		void show()
		{
			System.out.println("A show method");
		}
}
class B{
	
	static{System.out.println(" B static block");}
		{
			System.out.println(" B instance block");
		}
		void show()
		{
			System.out.println("B show method");
		}
}
class WaysToCreateObject4
{
	public static void main (String ar[])throws ClassNotFoundException,InstantiationException,IllegalAccessException
	{
		Class c=Class.forName(ar[0]);
  Object o=c.newInstance();

}}

output

D:\sachin\GitDemo\My_Practice\Collection FrameWork>java WaysToCreateObject4 B
 B static block
 B instance block

D:\sachin\GitDemo\My_Practice\Collection FrameWork>java WaysToCreateObject4 A
 A static block
 A instance block