import java.io.*;
// ......................STEP-1...................

// class AutoCloseableInterfacePractice
// {
// public static void main(String ar[])throws FileNotFoundException ,IOException
// {

// try(String s1="ram"))
// {
// System.out.println(s1);
// }
// //System.out.println("data copid.....");

// }
// }

// /*
// version 1.9 ma error ay ga

// error incompatible type String can not be converted to autoCloseable

// FileReader and FileWriter are AutoCloseable
// */

// ...................STEP-2...................

// class A
// {}
// class AutoCloseableInterfacePractice
// {
// public static void main(String ar[])
// {
// try(A a1=new A())
// {
// System.out.println("Hello mr. Sachin");
// }
// }
// }
// /*
// AutoCloseable is an interface it has single abstract method close();

// Autocloseable is an Functional interface

// AutoCloseableStep2.java:7: error: incompatible types: try-with-resources not
// applicable to variable type
// try(A a1=new A())
// ^
// (A cannot be converted to AutoCloseable)
// 1 error

// */

// ..............STEP-3..................

// class A implements AutoCloseable
// {
// public void close()
// {
// System.out.println("close.....");
// }
// }
// class AutoCloseableInterfacePractice
// {
// public static void main(String ar[])
// {
// try(A a1=new A())
// {
// System.out.println("Hello mr. Sachin");
// }
// }
// }
// /*
// out put =>
// close is automatically called after try block code
// Hello mr. Sachin
// close.....
// */

// ..................STEP-4...................

// class A implements AutoCloseable
// {
// public void close()
// {
// System.out.println("close.....");
// }
// }
// class AutoCloseableInterfacePractice
// {
// public static void main(String ar[])
// {
// try(A a1=new A())
// {
// System.out.println("Hello mr. Sachin");
// System.out.println(10/0);
// }
// }
// }
// /*
// out put =>

// Hello mr. Sachin
// close.....
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at AutoCloseableStep4.main(AutoCloseableStep4.java:15)

// */
