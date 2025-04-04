// class staticKeyword {
// final static short i = 2;
// public static int j = 0;

// public static void main(String ar[]) {
// for (int k = 0; k <= 3; k++) {
// switch (k) {
// case i:
// System.out.println("0");
// case i - 1:
// System.out.println("1");
// case i - 2:
// System.out.println("2");
// case i - 3:
// System.out.println("3");
// }
// }
// }

// }

// Question no2
// class A
// {
// {System.out.println("class A instace Block");}
// A() {System.out.println("class A constructior");}
// }
// class B extends A
// {
// static {System.out.println("class B static block");}
// {System.out.println("class B instace Block");}
// B() {System.out.println("class B constructior");}
// static {System.out.println("class B block static ");}
// }
// class staticKeyword extends B
// {
// public static void main(String ar[])
// {
// System.out.println("q2 main method");
// new staticKeyword();
// System.out.println("class staticKeyword main method");
// }
// }

// ...............................Q3.....................

// class A {
// static int x = 100;
// static {
// System.out.println("class A static block");
// }
// }

// class B extends A {
// static int x = 200;
// static {
// System.out.println("class B static block");
// }
// }

// class staticKeyword {
// static {
// System.out.println("class q3 static block");
// }

// public static void main(String ar[]) {
// System.out.println("main method");
// System.out.println("x=" + B.x);
// }

// }

// **************************** */
/*
 * 
 * class A {
 * A() {
 * System.out.println("class A constructor");
 * }
 * 
 * static {
 * System.out.println("class A static block");
 * }
 * }
 * 
 * class staticKeyword {
 * 
 * static {
 * System.out.println("class staticKeyword static block");
 * }
 * 
 * public static void main(String ar[]) {
 * System.out.println("class StaticPractic main method");
 * A a = new A();
 * }
 * }
 */

/*
 * output
 * class saticpractice static block
 * class staticpractice main method
 * class A static block
 * class A constructor
 */
// ...........................................Q5

// class A {
// A() {
// System.out.println("class A constructor");
// }

// static {
// System.out.println(" A static block");
// }
// // static StaticPractice s2 = new StaticPractice();
// }

// class staticKeyword {
// static staticKeyword s = new staticKeyword();
// static A a = new A();

// staticKeyword() {
// System.out.println("class StaticPractice constructor");
// }

// static {
// System.out.println("class staticPractice static block");
// }

// public static void main(String ar[]) {
// System.out.println("class StaticPractic main method");
// staticKeyword s1 = new staticKeyword();
// }
// }
// ............................Q6...................
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// class staticKeyword{

// static int H;
// static int B;
// static boolean flag = false;
// static {
// Scanner s = new Scanner(System.in);
// H = s.nextInt();
// B = s.nextInt();
// if (H <= 0 || B <= 0) {
// System.out.println("java.lang.Exception: Breadth and height must be
// positive");
// } else {

// flag = true;
// }

// }

// public static void main(String[] args) {
// if (flag) {
// int area = B * H;
// System.out.print(area);
// }

// }// end of main

// }// end of class

// *****************EXAMPLE 7**************** */

/*
 * class A {
 * static int x = 10;
 * 
 * {
 * System.out.println("A instace block");
 * 
 * }
 * static {
 * System.out.println("A static  block");
 * 
 * }
 * 
 * A() {
 * System.out.println("A constuructor");
 * 
 * }
 * 
 * static A a = new A();
 * }
 * 
 * class B extends A {
 * {
 * System.out.println("B instace block");
 * 
 * }
 * static {
 * System.out.println("B static block");
 * 
 * }
 * 
 * B() {
 * System.out.println("B constructor");
 * 
 * }
 * }
 * 
 * class staticKeyword extends B {
 * {
 * System.out.println("staticKeyword instance block");
 * }
 * static {
 * System.out.println("staticKeyword static block");
 * 
 * }
 * 
 * staticKeyword() {
 * System.out.println("staticKeyword constructor");
 * }
 * 
 * public static void main(String ar[]) {
 * new B();
 * }
 * }
 */
/*
 * A static block
 * A instace block
 * A constuructor
 * B static block
 * Tata static block
 * A instace block
 * A constuructor
 * B instace block
 * B constructor
 * PS D:\>
 */

// ***********************EXAMPLE-8******************** */
/*
 * class A {
 * static int x = 10;
 * 
 * {
 * System.out.println("A instace block");
 * 
 * }
 * static {
 * System.out.println("A static  block");
 * 
 * }
 * 
 * A() {
 * System.out.println("A constuructor");
 * 
 * }
 * 
 * static B b = new B();
 * }
 * 
 * class B extends A {
 * {
 * System.out.println("B instace block");
 * 
 * }
 * static {
 * System.out.println("B static block");
 * 
 * }
 * 
 * B() {
 * System.out.println("B constructor");
 * 
 * }
 * }
 * 
 * class staticKeyword extends B {
 * {
 * System.out.println("staticKeyword instance block");
 * }
 * static {
 * System.out.println("staticKeyword static block");
 * 
 * }
 * 
 * staticKeyword() {
 * System.out.println("staticKeyword constructor");
 * }
 * 
 * public static void main(String ar[]) {
 * new B();
 * }
 * }
 */
/*
 * A static block
 * A instace block
 * A constuructor
 * B instace block
 * B constructor
 * B static block
 * staticKeyword static block
 * A instace block
 * A constuructor
 * B instace block
 * B constructor
 */
// ***********************EXAMPLE-9*********************88 */
/*
 * class A {
 * static int x = 10;
 * 
 * {
 * System.out.println("A instace block");
 * 
 * }
 * static {
 * System.out.println("A static  block");
 * 
 * }
 * 
 * A() {
 * System.out.println("A constuructor");
 * 
 * }
 * 
 * B b = new B();
 * }
 * 
 * class B extends A {
 * {
 * System.out.println("B instace block");
 * 
 * }
 * static {
 * System.out.println("B static block");
 * 
 * }
 * 
 * B() {
 * System.out.println("B constructor");
 * 
 * }
 * }
 * 
 * class staticKeyword extends B {
 * {
 * System.out.println("staticKeyword instance block");
 * }
 * static {
 * System.out.println("staticKeyword static block");
 * 
 * }
 * 
 * staticKeyword() {
 * System.out.println("staticKeyword constructor");
 * }
 * 
 * public static void main(String ar[]) {
 * new B();
 * }
 * }
 */
/*
 * stack overflow will come
 */

// *****************EXAMPLE-10 *****************8 */

/*
 * class A {
 * static int x = 10;
 * 
 * {
 * System.out.println("A instace block");
 * 
 * }
 * static {
 * System.out.println("A static  block");
 * 
 * }
 * 
 * A() {
 * System.out.println("A constuructor");
 * 
 * }
 * 
 * }
 * 
 * class B extends A {
 * {
 * System.out.println("B instace block");
 * 
 * }
 * static {
 * System.out.println("B static block");
 * 
 * }
 * 
 * B() {
 * System.out.println("B constructor");
 * 
 * }
 * 
 * static B b = new B();
 * }
 * 
 * class staticKeyword extends B {
 * {
 * System.out.println("staticKeyword instance block");
 * }
 * static {
 * System.out.println("staticKeyword static block");
 * 
 * }
 * 
 * staticKeyword() {
 * System.out.println("staticKeyword constructor");
 * }
 * 
 * public static void main(String ar[]) {
 * new B();
 * }
 * }
 */
/*
 * A static block
 * B static block
 * A instace block
 * A constuructor
 * B instace block
 * B constructor
 * staticKeyword static block
 * A instace block
 * A constuructor
 * B instace block
 * B constructor
 */
//***************EXAMPLE-11****************8 */

public class staticKeyword {
    static {
        System.out.println("staticKeyword static block");

    }

    public static void main(String ar[]) {
        System.out.println(java.lang.Byte.MAX_VALUE);
    }
}