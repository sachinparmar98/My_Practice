// to create Object of a class

// below use of forName() method

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

// CREATIN OBJECT USIN new instance() METHOD

// class A{
// static{System.out.println("static block");}
// {
// System.out.println("instance block");
// }
// }
// class WaysToCreateObject1
// {
// public static void main (String ar[])throws
// ClassNotFoundException,InstantiationException,IllegalAccessException
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
// public static void main (String ar[])throws
// ClassNotFoundException,InstantiationException,IllegalAccessException
// {
// Class c=Class.forName("A");
// c.newInstance().show();

// }}

// D:\sachin\GitDemo\My_Practice\Collection FrameWork>javac
// WaysToCreateObject.java
// WaysToCreateObject.java:55: error: not a statement
// (A)c.newInstance().show();
// ^
// 1 error

// because the return type of newInstance() method is Object jvm show method ko
// Object class ma serch ker rha ha

// ...............SOLUTION FOR ABOVE PROGRAM ERROR.................

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
// public static void main (String ar[])throws
// ClassNotFoundException,InstantiationException,IllegalAccessException
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

// ....................PASSING ARGUMENT AT RUNTIME................
/*
 * import java.util.*;
 * class A{
 * 
 * static{System.out.println(" A static block");}
 * {
 * System.out.println(" A instance block");
 * }
 * void show()
 * {
 * System.out.println("A show method");
 * }
 * }
 * class B{
 * 
 * static{System.out.println(" B static block");}
 * {
 * System.out.println(" B instance block");
 * }
 * void show()
 * {
 * System.out.println("B show method");
 * }
 * }
 * class WaysToCreateObject4
 * {
 * public static void main (String ar[])throws
 * ClassNotFoundException,InstantiationException,IllegalAccessException
 * {
 * Class c=Class.forName(ar[0]);
 * Object o=c.newInstance();
 * 
 * }}
 */
/*
 * output
 * 
 * D:\sachin\GitDemo\My_Practice\Collection FrameWork>java WaysToCreateObject4 B
 * B static block
 * B instance block
 * 
 * D:\sachin\GitDemo\My_Practice\Collection FrameWork>java WaysToCreateObject4 A
 * A static block
 * A instance block
 */

// ******call difrrent class method at runtime.***********
// ....................PASSING ARGUMENT AT RUNTIME................
/*
 * import java.util.*;
 * 
 * class A {
 * 
 * static {
 * System.out.println(" A static block");
 * }
 * {
 * System.out.println(" A instance block");
 * }
 * 
 * void show() {
 * System.out.println("A show method");
 * }
 * }
 * 
 * class B {
 * 
 * static {
 * System.out.println(" B static block");
 * }
 * {
 * System.out.println(" B instance block");
 * }
 * 
 * void show() {
 * System.out.println("B show method");
 * }
 * }
 * 
 * class WaysToCreateObject4 {
 * public static void main(String ar[]) throws ClassNotFoundException,
 * InstantiationException, IllegalAccessException {
 * Class c = Class.forName(ar[0]);
 * Object o = c.newInstance();
 * if (o instanceof A) {
 * // A a=(A)o;
 * // a.show();
 * ((A) o).show();
 * } else if (o instanceof B) {
 * ((B) o).show();
 * // B b=(B)o;
 * // b.show();
 * }
 * }
 * }
 */

// ..................Method overiding using reflection.................
/*
 * class A {
 * static {
 * System.out.println("Class A static block");
 * }
 * 
 * A() {
 * System.out.println("Class A constructor");
 * }
 * 
 * void show() {
 * System.out.println("Class A show method");
 * }
 * }
 * 
 * class B extends A {
 * static {
 * System.out.println("Class B static block");
 * }
 * 
 * B() {
 * System.out.println("Class B constructor");
 * }
 * 
 * void show() {
 * System.out.println("Class B show method");
 * }
 * }
 * 
 * class C extends B {
 * static {
 * System.out.println("Class B static block");
 * }
 * 
 * C()
 * {
 * System.out.println("Class B Constructor");
 * }
 * 
 * void show() {
 * System.out.println("Class C show method");
 * }
 * }
 * 
 * class WaysToCreateObject {
 * public static void main(String... ar)throws
 * ClassNotFoundException,IllegalAccessException,InstantiationException {
 * Class c = Class.forName(ar[0]);
 * Object o = c.newInstance();
 * A a = (A) o;
 * a.show();
 * 
 * }
 * }
 */

// ***********METHOD HIDDING USING REFLECTION************ */
/*
 * class A {
 * 
 * static void show() {
 * System.out.println("Class A show method");
 * }
 * }
 * 
 * class B extends A {
 * 
 * static void show() {
 * System.out.println("Class B show method");
 * }
 * }
 * 
 * class C extends B {
 * 
 * static void show() {
 * System.out.println("Class C show method");
 * }
 * }
 * 
 * class WaysToCreateObject {
 * public static void main(String... ar)
 * throws ClassNotFoundException, IllegalAccessException, InstantiationException
 * {
 * Class c = Class.forName(ar[0]);
 * Object o = c.newInstance();
 * A a = (A) o;
 * a.show();
 * 
 * }
 * }
 */

// **************when will InstantiationException come*************** */
/*
 * abstract class A {
 * 
 * void show() {
 * System.out.println("Class A show method");
 * }
 * }
 * 
 * class WaysToCreateObject {
 * public static void main(String... ar)
 * throws ClassNotFoundException, IllegalAccessException, InstantiationException
 * {
 * Class c = Class.forName(ar[0]);
 * Object o = c.newInstance();
 * A a = (A) o;
 * a.show();
 * 
 * }
 * }
 */
// Exception in thread "main" java.lang.InstantiationException
// at
// sun.reflect.InstantiationExceptionConstructorAccessorImpl.newInstance(InstantiationExceptionConstructorAccessorImpl.java:48)
//because A is abstract we can not create its Object

//***********newInstance() mehtod and Parmeterize constructor*************** */
// note=> newInstance() method create only zero parameter Object 
class A {
	A(int x) {
		Sysytem.out.println("class A ");
	}

	void show() {
		Sysytem.out.println("class A ");
	}
}

class WaysToCreateObject {
	public static void main(String ar[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException

	{
		Class c = Class.forName(ar[0]);
		//Object o = c.newInstance();//InstantiationException
       // Object o=c.newInstance(100);//error : reason: actual and formal argument lists differ in length
		A a1 = (A) o;
		a1.show();

	}
}