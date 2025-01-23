// ...............STEP-1..................
// class A {
// private A() {
// System.out.println("class A private Constructor");
// }

// }

// class SingletonClass {
// public static void main(String ar[]) {
// A a = new A();
// }
// }

// ...............STEP-2..................

// class A {
// private A() {
// System.out.println("class A private Constructor");
// }

// }

// class SingletonClass {
// public static void main(String ar[]) {
// A a = new A(10);
// }
// }

/*
 * StepForSingletonClass_2.java:11: error: constructor A in class A cannot be
 * applied to given types;
 * A a = new A(10);
 * ^
 * required: no arguments
 * found: int
 * reason: actual and formal argument lists differ in length
 */
// ...............STEP-3..................

// class A {
// private A() {
// }

// static A get() {
// return new A();
// }

// void show() {
// System.out.println("show method class A");
// }
// }

// class SingletonClass {
// public static void main(String ar[]) {
// A a1 = A.get();
// A a2 = A.get();
// System.out.println(a1.hashCode());
// System.out.println(a2.hashCode());
// }
// }

// ...............STEP-4..................

// //this is the example for singleton class wrie interwiew final result for
// singleton class
// class A {
// static A a;

// private A() {
// }

// static A get() {
// if (a == null) {
// a = new A();
// }
// return a;
// }

// void show() {
// System.out.println("show method class A");
// }
// }

// class SingletonClass {
// public static void main(String ar[]) {
// A a1 = A.get();
// A a2 = A.get();
// A a3 = A.get();
// System.out.println(a1.hashCode());
// System.out.println(a2.hashCode());
// System.out.println(a3.hashCode());
// }
// }

/*
 * 2018699554
 * 2018699554
 * 2018699554 because only object is create in this class there for all ouput is
 * same
 * 
 */
// ...............STEP-5..................
// final Program for singleton class

// class A {
// static private A a;
// int x, y;

// private A() {
// }

// static public A getInstance() {
// if (a == null) {
// a = new A();
// }
// return a;
// }

// public void get(int x, int y) {
// this.x = x;
// this.y = y;
// }

// public void show() {
// System.out.println("x=" + x);
// System.out.println("y=" + y);

// }
// }

// class SingletonClass {
// public static void main(String a[]) {
// A a1 = A.getInstance();
// A a2 = A.getInstance();
// a1.get(10, 20);
// a2.show();
// }
// }
// ...............STEP-1..................
// ...............STEP-1..................
// ...............STEP-1..................
// ...............STEP-1..................