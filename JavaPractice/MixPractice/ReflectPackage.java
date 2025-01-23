// ........EXAMPLE-1...........
// DISPLAY CLASS ALL METHODS
// import java.lang.reflect.*;
// class ReflectPackage

// {
// public static void main(String ar[])
// {
// Object o=new Object();
// Class c=o.getClass();
// Method m[]=c.getDeclaredMethods();
// for(Method m1:m)
// {

// System.out.println(m1);
// }

// }
// }

// ...........EXAMPLE-2............

// import java.lang.reflect.*;
// class DisplayClassAllMethodType2

// {
// public static void main(String ar[])throws ClassNotFoundException
// {
// Class c=Class.forName("java.lang.String");
// Method m[]=c.getDeclaredMethods();
// for(Method m1:m)
// {

// System.out.println(m1);
// }

// }
// }