/*
 * EXAMPLE 1 to 19 are overriding example
 */

// ***************EXAMPLE-1***************
// class A {
// void show() {
// System.out.println("class AA");
// }
// }

// class B extends A {
// int show() {
// System.out.println("class B");
// return 5;
// }
// }

// class Polymophism {
// public static void main(String ar[]) {
// //A a = new A();
// B a=new B();
// a.show();
// }
// }

// error: show() in B cannot override show() in A
// int show() {
// ^
// return type int is not compatible with void

// ***********************EXAMPLE-2************************************
// class A {
// Integer show() {
// System.out.println("class AA");
// return 5;
// }
// }

// class B extends A {
// Object show() {
// System.out.println("class B");
// return 5;
// }
// }

// class Polymophism {
// public static void main(String ar[]) {
// //A a = new A();
// B a=new B();
// a.show();
// }
// }

// rac.java:38: error: show() in B cannot override show() in A
// Object show() {
// ^
// return type Object is not compatible with Integer

// *********************EXAMPLE-3****************************************

// class A {
// final void show() {
// System.out.println("class AA");

// }
// }

// class B extends A {
// final void show() {
// System.out.println("class B");

// }
// }

// class Polymophism {
// public static void main(String ar[]) {
// //A a = new A();
// B a=new B();
// a.show();
// }
// }

// prac.java:69: error: show() in B cannot override show() in A
// final void show() {
// ^
// overridden method is final
// 1 error
// ***********************EXAMPLE-4********************************
// class A {
// final void show() {
// System.out.println("class AA");

// }
// }

// class B extends A {
// void show() {
// System.out.println("class B");

// }
// }

// class Polymophism {
// public static void main(String ar[]) {
// //A a = new A();
// B a=new B();
// a.show();
// }
// }

// prac.java:103: error: show() in B cannot override show() in A
// void show() {
// ^
// overridden method is final
// **********************EXAMPLE-5*************************************
// class A {
// final void show() {
// System.out.println("class AA");

// }
// }

// class B extends A { }

// class Polymophism {
// public static void main(String ar[]) {
// // A a = new A();
// B a = new B();
// a.show();
// }
// }
// output
// class AA

// ****************EXAMPLE-6*******************************************

// class A {
// private final void show() {
// System.out.println("class AA");

// }
// }

// class B extends A {
// void show() {
// System.out.println("class B");

// }
// }

// class Polymophism {
// public static void main(String ar[]) {
// // A a = new A();
// B a = new B();
// a.show();
// }
// }

// output
// class B

// *************************EXAMPLE-7**********************************

// class A {
// private final void show() {
// System.out.println("class AA");

// }
// }

// class B extends A {
// final void show() {
// System.out.println("class BB");

// }
// }

// class Polymophism {
// public static void main(String ar[]) {
// // A a = new A();
// B a = new B();
// a.show();
// }
// }

// output
// class BB

// ****************EXAMPLE-8*******************************************

// class A {
// static final void show() {
// System.out.println("class AA");

// }
// }

// class B extends A {
// void show() {
// System.out.println("class B");

// }
// }

// class Polymophism {
// public static void main(String ar[]) {
// // A a = new A();
// B a = new B();
// a.show();
// }
// }

// rac.java:196: error: show() in B cannot override show() in A
// void show() {
// ^
// overridden method is static,final

// //***************EXAMPLE-9********************************************

// class A {
// static void show() {
// System.out.println("class AAA");

// }
// }

// class B extends A {
// // void show() {
// // System.out.println("class B");

// // }
// }

// class Polymophism{
// public static void main(String ar[]) {
// // A a = new A();
// B a = new B();
// a.show();
// }
// }
// output class AAA

// //*************EXAMPLE-10**********************************************
// interface Inter1 {
// int x = 30;

// default void show() {
// System.out.println("interface method");
// }
// }

// class B implements Inter1 {
// int x = 20;

// // public void show() {
// // System.out.println("class A method");
// // }
// }

// public class Polymophism extends B {
// int x = 10;

// public void show() {
// System.out.println("class prac show method");
// }

// public static void main(String ar[]) {
// Polymorphism p = new Polymophism();
// B b=new B();
// ((Inter1)b).show();
// }
// }
// //output interface method

// ********************EXAMPLE-11****************************************
// interface Inter1 {

// static void show()
// {
// System.out.println("inter1");
// }

// }
// interface Inter2 extends Inter1 {

// }
// public class Polymophism {

// public static void main(String ar[]) {
// Inter2.show();

// }
// }

// Demo1212.java:17: error: cannot find symbol
// Inter2.show();
// ^
// symbol: method show()
// location: interface Inter2
// 1 error

// *****************EXAMPLE-12*********************************************
// interface Inter1 {

// static void show() {
// System.out.println("inter1");
// }

// }

// public class Polymophism implements Inter1 {

// public static void main(String ar[]) {
// Polymophism p=new Polymophism();
// prac.show();

// }
// }
// prac.java:312: error: cannot find symbol
// prac.show();
// ^
// symbol: method show()
// location: class prac

// *************EXAMPLE-13*************************************************
// class A {

// static void show() {
// System.out.println("class AAAAAAAAA");
// }

// }

// public class Polymophism extends A {

// public static void main(String ar[]) {
// Polymophism p =new Polymophism();
// p.show();

// }
// }
// output class AAAAA

// ****************EXAMPLE-14**************** */

// interface A {
// static void show() {
// System.out.println("interface A");
// }

// }

// interface B extends A {

// }

// class Polymophism implements B {
// public static void main(String ar[]) {
// Demo d = new Demo();
// // d.show();//can not find show
// B.show();// can not find show
// }
// }

// ****************EXAMPLE-15****************
// class Animal {
// void move() {
// System.out.println("animal can move");
// }

// }

// class Dog extends Animal {
// void move() {

// System.out.println("dog can bark");
// }
// }

// class Polymorphism {
// public static void main(String ar[]) {
// Animal a1 = new Animal();
// Animal b1 = new Dog();
// a1.move();
// b1.move();
// }
// }

// ****************EXAMPLE-16****************

// class A {
// public void show() {
// System.out.println("class A");

// }

// class B extends A {
// public void show() {
// System.out.println("class B");

// }
// }
// }

// class Polymophism {
// public static void main(String ar[]) {
// B b1 = new B();
// b1.show();
// }
// }
// ****************EXAMPLE-17****************

// class A {
// public void show() {
// System.out.println("class A show method");
// }
// }

// class B extends A {

// void show() {
// System.out.println("class B show method");
// }
// }

// class Polymophism {
// public static void main(String[] args) {
// B b = new B();
// b.show();
// }

// }

// **SOLUTION FOR ABOVE EXAMPLE **/

// class A {
// public void show() {
// System.out.println("class A show method");
// }
// }

// class B extends A {

// public void show() {
// System.out.println("class B show method2323");
// }
// }

// class Polymophism{
// public static void main(String[] args) {
// B b = new B();
// b.show();
// }

// }

// ****************EXAMPLE-18****************

// class A {
// protected void show() {
// System.out.println("class A protected method");
// }
// }

// class B extends A {

// void show() {
// System.out.println("class A protected method");
// }
// }

// class Polymophism {
// public static void main(String[] args) {
// B b = new B();
// b.show();
// }
// }

// *****SOLUTION FOR ABOVE EXAMPLE//

// class A {
// protected void show() {
// System.out.println("class A protected method");
// }
// }

// class B extends A {

// public void show() {
// System.out.println("class A protected method");
// }
// }

// class Polymophism {
// public static void main(String[] args) {
// B b = new B();
// b.show();
// }
// }

// ****************EXAMPLE-19****************

// private -> default -> protected -> public
// class A {
// private void show() {
// System.out.println("class A show private method");
// }
// }

// class B extends A {

// }

// class Polymophism {
// public static void main(String[] args) {
// B b = new B();
// b.show();
// }
// }

// ****************EXAMPLE-20****************
// ****************EXAMPLE-14****************
// ****************EXAMPLE-14****************