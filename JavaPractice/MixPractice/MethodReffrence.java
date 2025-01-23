import java.util.function.Consumer;
import java.util.function.Function;
// ......................Step-1.................
// class MethodReffrence
// {
// public static void main(String ar[])
// {
// Function<Integer,Double>F=Math::sqrt;
// Consumer<Double>C=System.out::println;
// C.accept(F.apply(25));
// }
// }

// /*
// 5.0
// */

// ..................STEP-2..............

// import java.util.function.Consumer;
// import java.util.function.BiFunction;
// class MethodReffrence
// {
// public static void main(String ar[])
// {
// BiFunction<Integer,Integer,Double>F=Math::pow;
// Consumer<Double>C=System.out::println;
// C.accept(F.apply(2,5));
// }
// }

// /*
// 32.0
// */

// ...............STEP-3............
// @FunctionalInterface
// interface Inter1
// {
// void show(int n);
// }
// class MethodReffrenceStep3
// {

// public static void main(String ar[])
// {
// Inter1 i=System.out::println;
// i.show(10);
// }
// }

// /*
// 10
// */

// ................STEP-4...............

// @FunctionalInterface
// interface Inter1
// {
// void show(int x,int y);
// }
// class A
// {
// static void sum(int x,int y)
// {
// System.out.println(x+y);
// }
// }
// class MethodReffrenceStep4
// {

// public static void main(String ar[])
// {
// Inter1 i=A::sum;
// i.show(10,20);
// }
// }

// /*
// 30
// */

// .................STEP-5...............

// @FunctionalInterface
// interface Inter1
// {
// int show(int x,int y);
// }
// class A
// {
// static int max(int x,int y)
// {
// return x>y?x:y;
// }
// }
// class MethodReffrenceStep5
// {

// public static void main(String ar[])
// {
// Inter1 i=A::max;
// System.out.println("largest number is="+i.show(10,20));
// }
// }

// /*
// largest number is=20
// */

// .............STEP-5.......................

// @FunctionalInterface
// interface Inter1
// {
// //int show(int x,int y);
// double show(double x,double y);

// }
// //class A
// //{
// // static int max(int x,int y)
// // {
// // return x>y?x:y;
// // }
// //}
// class MethodReffrenceStep6
// {

// public static void main(String ar[])
// {
// Inter1 i=Math::max;
// System.out.println("max number is="+i.show(10,20));
// }
// }

// /*
// largest number is=20
// */
// .....................STEP-7................

// @FunctionalInterface
// interface Inter1
// {
// void show(int x);
// }
// class MethodReffrenceStep7
// {
// public static void main(String ar[])
// {
// Inter1 i=System.out::println;
// i.show(100000);
// }
// }

// .................STEP-8................

// import java.util.function.Consumer;
// class MethodReffrenceStep8
// {
// public static void main(String ar[])
// {
// Consumer c=System.out::println;
// c.accept(10);
// }
// }

// /*
// D:\sachin\GitDemo\My_Practice\CollectionFrameWork\MethodReffrence>javac
// MethodReffrenceStep8.java
// Note: MethodReffrenceStep8.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\sachin\GitDemo\My_Practice\CollectionFrameWork\MethodReffrence>java
// MethodReffrenceStep8
// 10
// */

// ...................STEP-9.....................

// import java.util.function.Consumer;
// import java.util.function.Function;
// class MethodReffrenceStep9
// {
// public static void main(String ar[])
// {
// Function<Double,Double>F=Math::sqrt;
// Consumer <Double>c=System.out::println;
// c.accept(F.apply(25.0));
// }
// }

// /*
// 5.0
// */

// ....................STEP-10............
import java.util.function.Consumer;
// import java.util.function.Function;
// class MethodReffrenceStep10
// {
// public static void main(String ar[])
// {
// Function<Double,Double>F=Math::sqrt;
// Consumer <String>c=System.out::println;
// c.accept("squre root is = "+ F.apply(25.0));
// }
// }

// /*
// squre root is = 5.0
// */

// .................STEP-11.................
import java.util.function.Consumer;
// import java.util.function.BiFunction;
// class MethodReffrenceStep11
// {
// public static void main(String ar[])
// {
// BiFunction<Integer,Integer,Double>F=Math::pow;
// Consumer <Double>c=System.out::println;
// c.accept( F.apply(2,5));
// }
// }

// /*
// 32.0
// */

// ......................STEP-12.................
// Method reffrence work only for Functional interface

// interface Inter1
// {
// void show(int x);
// void show1(int x,int y);
// default void su
// }
