//..................EXAMPLE-1...............
class InnerClassPractice {
    class A {

    }

    public static void main(String[] args) {
        System.out.println("class Demo1 inner class ");
    }
}

// ..................EXAMPLE-2...............

// class InnerClass {
// class A

// {
// void show() {
// System.out.println();
// }
// }

// public static void main(String ar[]) {
// System.out.println("class A sachin parmar");
// A a = new A();
// a.show();
// }

// }

// ..................EXAMPLE-3...............

// ...............STEP-1................
// class Demo3 {
// int x = 10;

// public static void main(String ar[]) {
// System.out.println("x=" + x);
// }
// }
// ...................STEP-2.............
// class Demo3_3 {
// int x = 10;

// public static void main(String ar[]
// Demo3_3 d=new Demo3_3();
// System.out.println("x=" + d.

// }
// }
// .........STEP-3.........
// class Demo3_4 {
// static int x = 50;

// public static void main(String ar[]) {
// System.out.println("x=" + x);

// }
// }

// ..............STEP-4................
// class Demo3_5 {
// int x = 1000;

// void show() {
// System.out.println("class Demo3_5 void show");
// }

// public static void main(String ar[]) {
// Demo3_5 d = new Demo3_5();
// d.show();
// System.out.println("x=" + d.x);

// }
// }

// ................STEP-5................
// class Demo3_6 {
// int x = 1000;

// void show() {
// System.out.println("class Demo3_6 show method");
// }

// class A {
// void show1() {
// System.out.println("Demo3_6 inner class A show method");
// }
// }

// public static void main(String ar[]) {
// Demo3_6 d = new Demo3_6();
// Demo3_6.A a = d.new A();
// a.show1();
// d.show();
// System.out.println("x=" + d.x);

// }
// }

// ..............STEP-6..............
// class Demo3_7 {
// int x = 8000;

// void show() {
// System.out.println("class Demo3_7 show method");
// }

// class A {
// void show1() {
// System.out.println("Demo3_7 inner class A show method");
// }
// }

// public static void main(String ar[]) {
// Demo3_7 d = new Demo3_7();
// d.new A().show1();
// d.show();
// System.out.println("x=" + d.x);

// }
// }

// ..................EXAMPLE-4...............

// class InnerClass {
// class A {
// void show() {
// System.out.println("class A show method");
// }
// }

// public static void main(String ar[]) {
// InnerClass = new InnerClass();
// A a = d.new A();
// a.show();
// a.show();
// }
// }
// ..................EXAMPLE-5...............

// class A {
// class B {
// void show() {
// System.out.println("A.B show method");
// }
// }
// }

// class InnerClass {
// public static void main(String ar[]) {
// A a = new A();
// A.B b = a.new B();
// b.show();
// }
// }
// ..................EXAMPLE-6...............

// //..............STEP-1...........

// // class A {
// // int x = 75;

// // void show() {
// // System.out.println("x=" + x);
// // }
// // }

// // class InnerClass {
// // public static void main(String ar[]) {
// // A a = new A();
// // a.show();
// // }
// // }

// //..............STEP-2...........
// // class A {
// // int x = 79;

// // static void show() {
// // A a = new A();
// // System.out.println("x=" + a.x);
// // }
// // }

// // class InnerClass {
// // public static void main(String ar[]) {
// // A.show();
// // }
// // }

// //...........STEP-3.............

// class A {
// int x = 99;

// void show2() {
// System.out.println("show2 method.");
// }

// static void show1() {
// A a = new A();

// a.show2();
// System.out.println("x=" + a.x);
// }
// }

// class InnerClass {
// public static void main(String ar[]) {

// A.show1();
// }
// }

// ..................EXAMPLE-7...............

// ..........STEP-1............

// class A {
// int x = 12000;

// void show2() {
// System.out.println("class A show2 method");
// }

// class B {
// void show3() {
// System.out.println(" class B show3 method");
// }

//

// void show1(){
// B b = new B();
// b.show3();
// System.out.println("x=" + x);
// show2();
// }
// }

// class InnerClass {
// public static void main(String ar[]) {
// A a = new A();
// a.show1();
// }
// }
// .............STEP-2................
// class A {
// int x = 12000;

// void show2() {
// System.out.println("class A show2 method");
// }

// class B {
// void show3() {
// System.out.println(" class B show3 method");
// }

// }

// static void show1() {
// B b = new B();
// b.show3();
// System.out.println("x=" + x);
// show2();
// }
// }

// class InnerClass {
// public static void main(String ar[]) {
// A a = new A();
// a.show1();
// }
// }
// ..................EXAMPLE-8...............

// ................STEP-1..................

// class A {
// class B // instance inner class
// {
// void show() {
// System.out.println("class B show method");
// }

// }
// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// A.B b = a.new B();
// b.show();
// }
// }

// ....................STEP-2...................
// CLASS A inside class B inside class C
// class A {
// class B // instance inner class
// {
// class C {

// void show() {
// System.out.println("class C show method ...");
// }
// }

// }
// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// A.B b = a.new B();
// A.B.C c = b.new C();
// c.show();
// }
// }

// ..................EXAMPLE-9...............

// .................STEP-1.................
// class A {
// int x = 10;
// static int y = 20;

// class B {
// void show() {
// System.out.println("x=" + x);
// System.out.println("y=" + y);
// }
// }
// }

// class InnerClass {
// public static void main(String ar[]) {
// A a = new A();
// A.B b = a.new B();
// b.show();
// }
// }

// ...............STEP-2...................
// static void show

// class A {
// int x = 10;
// static int y = 20;

// class B {
// static void show() {
// System.out.println("x=" + x);
// System.out.println("y=" + y);
// }
// }
// }

// class InnerClass {
// public static void main(String ar[]) {
// A a = new A();
// A.B b = a.new B();
// b.show();
// }
// }

// ................STEP-3.................
// instance and local variable

// class A {
// int x = 10;

// void show() {
// int x = 50;
// System.out.println("x=" + x);
// System.out.println("x=" + this.x);
// }
// }

// class InnerClass {
// public static void main(String ar[]) {
// A a = new A();
// a.show();
// }
// }

// ..................EXAMPLE-10...............

// ...............STEP-1.................
// class A {
// int x = 10;

// class B {
// int x = 20;

// void show() {
// int x = 30;
// System.out.println("x=" + x);
// System.out.println("x=" + this.x);
// System.out.println("x=" + A.this.x);

// }
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// A.B b = a.new B();
// b.show();
// }
// }

// ..............STEP-2..............
// if we dclare private int x then

// class A {
// private int x = 10;

// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// System.out.println(a.x);
// }
// }

// .............STEP-3................
// Data enacpsulation
// class A {
// private int x = 101;

// void show() {

// System.out.println("x=" + x);
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// a.show();
// }
// }

// ..................EXAMPLE-11...............

// ..............STEP-1.................
// class A {
// private int x = 111;

// class B {
// void show() {

// System.out.println("x=" + x);
// }
// }
// }

// class InnerClass {
// public static void main(String[] args) {

// A a = new A();
// A.B b = a.new B();
// b.show();
// }
// }

// ............STEP-2...............
// what happen if we declare outer class private

// private class A {
// int x = 111;

// class B {
// void show() {

// System.out.println("x=" + x);
// }
// }
// }

// class InnerClass{
// public static void main(String[] args) {

// A a = new A();
// A.B b = a.new B();
// b.show();
// }
// }

// *** (for Demo18)error: modifier private not allowed here *** \\

// ...............STEP-3................

// ***if we declare inner class private

// class A {
// private class B {
// void show() {

// System.out.println("A.B private inner class show method");
// }
// }
// }

// class InnerClass {
// public static void main(String[] args) {

// A a = new A();
// A.B b = a.new B();
// b.show();
// }
// }

// *** (for Demo19) error:A.B has private access in A *** \\

// ...........................STEP-4..................
// *** how to acess inner class private data (see below ex.)\\

// class A {

// private class B {
// void show() {

// System.out.println("A.B private inner class show method");
// }
// }

// void show1() {
// B b = new B();
// b.show();
// }
// }

// class InnerClass {
// public static void main(String[] args) {

// A a = new A();
// a.show1();
// }
// }

// ..................EXAMPLE-12...............

// ................STEP-1................
// class A {
// A() {
// System.out.println("class A constructor");
// }

// void show() {
// System.out.println("class A show method");
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// a.show();
// }
// }

// ................STEP-2................

// **** CLASS A WITH INSTANCE BLOCK AND CONSTRUCTOR

// class A {
// A() {
// System.out.println("class A constructor");
// }

// void show() {
// System.out.println("class A show method");
// }

// {
// System.out.println("class A instance block...");
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// a.show();
// }
// }

// ................STEP-3................

// **** STATIC BLOCK

// class A {
// A() {
// System.out.println("class A constructor");
// }

// void show() {
// System.out.println("class A show method");
// }

// {
// System.out.println("class A instance block...");
// }
// static {
// System.out.println("class A static block...");
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// a.show();
// }
// }

// ................STEP-4................

// ***** CALLING CONSTRUCTOR WITHOUT REFFRENCE VARIABLE

// class A {
// A() {
// System.out.println("class A constructor");
// }

// void show() {
// System.out.println("class A show method");
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// new A();

// }
// }

// ................STEP-5................

// ***** CALLING CONSTRUCTOR WITHOUT REFFRENCE VARIABLE

// class A {
// A() {
// System.out.println("class A constructor");
// }

// void show() {
// System.out.println("class A show method");
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// new A().show(); // concept because new A() is object of class A

// }
// }

// ..................EXAMPLE-13...............

// ......................STEP-1......................

// **** CALLING INNER CLASS METHOD WITHOUT USING REFFRENCE VARIABLE

// class A {
// class B {
// void show() {
// System.out.println("class B show method");
// }
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// new A().new B().show();
// }
// }

// ......................STEP-2......................
// A.B.C METHOD ACESS WITHOUT REFFRENCE VARIABLE

// class A {
// class B {
// class C {
// void show() {
// System.out.println("class C show method");
// }
// }
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// new A().new B().new C().show();
// }
// }

// ......................STEP-3......................
// *** WHAT HAPPEN IF CREATE STATIC BLOCK INSIDE INSTANCE INNER CLASS

// class A {
// class B {
// static {
// System.out.println("class C show method");
// }
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// new A().new B();
// }
// }

// ***** (FOR ABOVE EX.) error: Illegal static declaration in inner class A.B

// ......................STEP-4......................
// **** WE CAN CREATE INSTANCE BLOCK INSIDE INNER CLASS

// class A {
// {
// System.out.println("class A instance block");
// }

// class B {
// {
// System.out.println("class B instance block");
// }
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// new A().new B();
// }
// }

// ......................STEP-5......................

// **** CONSTRUCTOR INSIDE INNER AND OUTER CLASS

// class A {
// A() {
// System.out.println("class A constructor");
// }

// {
// System.out.println("class A instance block");
// }

// class B {
// B() {
// System.out.println("class B constructor");
// }

// {
// System.out.println("class B instance block");
// }
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// new A().new B();
// }
// }

// ..................EXAMPLE-14...............

// ......................STEP-1......................
// class A {
// void show() {
// System.out.println("class A show");
// }
// }

// class B extends A {

// void show2() {
// System.out.println("class B show2");
// }
// }

// class Demo31 {
// public static void main(String[] args) {
// B b = new B();
// b.show();
// b.show2();
// }
// }

// ......................STEP-2......................
// inner class extends

// class A {
// class B {
// void show() {
// System.out.println("class B show method");
// }
// }

// class C extends B {
// void show2() {
// System.out.println("class c show2 method");
// }
// }
// }

// class Demo32 {
// public static void main(String[] args) {
// A a = new A();
// A.C c = a.new C();
// c.show();
// c.show2();
// }
// }

// ......................STEP-3......................
// **** three class

// class A {
// void show() {
// System.out.println("class A show");
// }
// }

// class B extends A {

// void show2() {
// System.out.println("class B show2");
// }
// }

// class C extends B {

// void show3() {
// System.out.println("class C show3");
// }
// }

// class Demo33 {
// public static void main(String[] args) {
// C c = new C();
// c.show();
// c.show2();
// c.show3();
// }
// }

// ......................STEP-4......................
// ***** constructor inside outer class

// class A {
// A() {
// System.out.println("class A constructor ");
// }
// }

// class B extends A {
// B() {
// System.out.println("class B constructor");
// }
// }

// class C extends B {
// C() {
// System.out.println("class c constructor");
// }
// }

// class Demo34 {
// public static void main(String[] args) {
// C c = new C();
// }
// }

// ......................STEP-5......................

// CONSTRUCTOR INSIDE INNER CLASS

// class A {
// class B {
// B() {
// System.out.println("inner class B constructor");
// }
// }

// class C extends B {
// C() {
// System.out.println("inner class C constructor");
// }
// }

// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// A.C c = a.new C();

// }
// }

// ..................EXAMPLE-15...............

// ............STEP-1............
// class A {
// class B {
// void show() {
// System.out.println("inner class B show method");
// }
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// new A().new B().show();
// }
// }

// ............STEP-2............

// class A {
// class B {
// class C {
// void show() {
// System.out.println("class c show method");
// }
// }
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// new A().new B().new C().show();
// }
// }

// ............STEP-3............
// *********we can't create inside inner class static block static method static
// varible */

// class A {
// static {
// System.out.println("classs A static block");
// }

// class B {
// static {
// System.out.println("classs B static block");

// }
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// A.B b = a.new B();
// }
// }

// ............STEP-4............
// *****************we can create instance block inside instance inner class and
// outer class */

// class A {
// {
// System.out.println("classs A instance block");
// }

// class B {
// {
// System.out.println("classs B instance block");

// }
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// A.B b = a.new B();
// }
// }

// ............STEP-5............
// *****************we can create final static variable inside instance inner
// class **********//

// ********* CONSTRUCTOR INSIDE INNER CLASS AND OUTER CLASS **********//

/**
 * Demo36_to_42
 */
// class A {
// A() {
// System.out.println("class A constructor");
// }

// class B {
// B() {
// System.out.println("class B constructor");

// }

// {
// System.out.println("class B instance block");

// }

// }
// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// A.B b = a.new B();
// }
// }

// ............STEP-6............
// **************DEMO41*************/
// class A {
// void show() {
// System.out.println("class A show method");
// }
// }

// class B extends A {
// void show2() {
// System.out.println("class B show2 method");
// }

// }

// class InnerClass {
// public static void main(String[] args) {
// B b = new B();
// b.show();
// b.show2();
// }
// }

// ............STEP-7............
// **************DEMO42*************//

// BELOW EXAMPLE IS NOT WORKING
// class A {
// class B {
// void show() {
// System.out.println("inner class B show method");
// }
// }
// }

// class C extends B {
// void show2() {
// System.out.println(" class C show2 method");
// }

// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// A.C c = a.new C();
// c.show2();
// c.show();
// }
// }
// ..................EXAMPLE-16...............

// ..........STEP-1................

// class A {
// A() {
// System.out.println("class A");
// }

// }

// class B extends A {
// B() {
// System.out.println("class B conatructor");

// }
// }

// class C extends B {
// C() {
// System.out.println("class C conatructor");

// }
// }

// class InnerClass{
// public static void main(String[] args) {
// C c = new C();

// }

// }

// ..........STEP-2................

// class A {
// class B {
// B() {
// System.out.println("Class B constructor");
// }

// }

// class C extends B {
// C() {
// System.out.println("Class C constructor");
// }

// }
// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// A.C c = a.new C();
// }
// }

// ..................EXAMPLE-17...............

// ............STEP-1...............
// abstract class A {
// void show() {
// System.out.println("class A show method");
// }
// }

// class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// a.show();
// }
// }

// ............STEP-2...............

// abstract class A {
// void show() {
// System.out.println("class A show method");
// }
// }

// class B extends A {

// }

// class InnerClass {
// public static void main(String[] args) {
// B b = new B();
// b.show();
// }
// }

// ............STEP-3...............

// abstract class A {
// class B {
// void show() {
// System.out.println("class B show method123");
// }
// }
// }

// class C extends A {

// }

// class InnerClass {
// public static void main(String[] args) {
// C c = new C();
// C.B b = c.new B();
// b.show();
// }
// }
// ............STEP-4...............

// only we can do this in case of inheritance//
// abstract class A {
// class B {
// void show() {
// System.out.println("class B show method5342");
// }
// }
// }

// class B extends A {

// }

// class InnerClass {
// public static void main(String[] args) {
// B b = new B();
// B.B b1 = b.new B();
// b1.show();
// }
// }

// ............STEP-5...............
// extenal and internal class name can not be same//

// class A {
// class A {
// void show() {
// System.out.println("inner class show method");
// }
// }
// }

// class InnerClass {

// public static void main(String[] args) {
// A a = new A();
// A.A a1 = a.new A();
// a1.show();
// }
// }

// ..................EXAMPLE-18...............

// ...............STEP-1.................

// class A {
// abstract class B {
// void show() {
// System.out.println("A.B show method");
// }
// }
// }

// class InnerClass {
// public static void main(String[] args) {

// A a = new A();
// A.B b = a.new B();
// b.show();
// }

// }
// ...............STEP-2.................

// class A {
// abstract class B {
// void show() {
// System.out.println("A.B show method54");
// }

// }

// class C extends B {

// }
// }

// class InnerClass {
// public static void main(String[] args) {

// A a = new A();
// A.C c = a.new C();
// c.show();
// }

// }
// ...............STEP-3.................

// class A {
// class B {
// abstract void show();
// }

// }

// class InnerClass {
// public static void main(String[] args) {

// A a = new A();
// A.B b = a.new B();
// b.show();
// }

// }

// ...............STEP-4.................
// WE CAN DAFINATLY CREATE INNER CLASS AS A ABSTRACT CLASS//

// class A {
// abstract class B {
// abstract void show();
// }

// }

// class InnerClass {
// public static void main(String[] args) {

// }

// }

// ...............STEP-5.................

// class A {
// abstract class B {
// abstract void show();
// }

// class C extends B {

// }

// }

// class InnerClass {
// public static void main(String[] args) {

// A a = new A();
// A.C c = a.new C();
// c.show();
// }

// }
