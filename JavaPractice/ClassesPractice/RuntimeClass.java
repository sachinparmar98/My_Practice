/*
 * first we discus diffrent way to alligible an object for gc
 * then we discius diffrent way to request garbage colector using gc() method
 * use of Runtime singleton class
 */

// //......NULL ASSIGN TO REFFRENCE VARIABLE........
// class A {
// int x, y;

// void show() {
// System.out.println("x=" + x);
// System.out.println("y=" + y);
// }

// void get(int x, int y) {
// this.x = x;
// this.y = y;
// }
// }

// class RuntimeClass {

// public static void main(String ar[]) {
// A a1 = new A();
// A a2 = new A();
// a1.get(10, 20);
// a1.show();
// a2.show();
// a2 = a1;// this line we have only one object
// a1.show();
// a2.show();
// }
// }

// ..........NULL ASSIGN TO REFFRENCE VARIABLE.........
// class A {
// void show() {
// System.out.println("class A show method ");
// }
// }

// class RuntimeClass {

// public static void main(String ar[]) {
// A a1 = new A();
// a1.show();
// a1 = null;
// a1.show();
// }
// }

// ........REASIGN TO REFFRENCE VARIABLE.........
// class A {
// void show() {
// System.out.println("class A show method ");
// }
// }

// class RuntimeClass {

// public static void main(String ar[]) {
// A a1 = new A();
// A a2 = new A();
// a1.show();
// a2.show();
// a2 = a1;// this line we have only one object
// a1.show();
// a2.show();
// }
// }

// ..............REASSIGN TO REFFRENCE VARIABLE...............
// class A {
// int x, y;

// void show() {
// System.out.println("x=" + x);
// System.out.println("y=" + y);
// }

// void get(int x, int y) {
// this.x = x;
// this.y = y;
// }
// }

// class RuntimeClass {

// public static void main(String ar[]) {
// A a1 = new A();
// A a2 = new A();
// a1.get(10, 20);
// a1.show();
// a2.show();
// a2 = a1;// this line we have only one object
// a1.show();
// a2.show();
// }
// }

// ...........LOCAL OBJECT(object inside method)...........
// class A {
// int x, y;

// void show() {
// System.out.println("class A show");
// A a2 = new A();
// A a3 = new A();
// A a4 = new A();

// }

// }

// class RuntimeClass {

// public static void main(String ar[]) {
// A a1 = new A();

// a1.show();// this line we have four object
// System.out.println("main method");// this line we have only one object
// }
// }

// .........LOCAL OBJECT(object inside method)............

// class A {
// int x, y;

// A show() {
// System.out.println("class A show");
// A a2 = new A();
// A a3 = new A();
// A a4 = new A();
// return a4;

// }

// }

// class RuntimeClass {

// public static void main(String ar[]) {
// A a1 = new A();
// A a5 = a1.show();// this line we have 4 object
// a5.show();
// System.out.println("main method");// this line we have two object
// }
// }

// .........LOCAL OBJECT(object inside method)............

// class A {
// A() {
// System.out.println("class A construtor");
// }
// }

// class RuntimeClass {

// public static void main(String ar[]) {
// A a1 = new A(); // line 10 and line 11 both line we have only one Object
// System.out.println("main method");
// }
// }

// ........ANNONYMOUS OBJECT.............

// class A {
// A() {
// System.out.println("class A {

// public static void main(String ar[]) {
// A a1 = new A(); // line 10 and line 11 both line we have only one Object
// System.out.println("main method");
// }
// }

// ......coding of Runtime class insise System class .........

// class System {
// public static void gc() {
// Runtime.getRuntime().gc();
// }
// }
// // this is the internl codding of Runtime inside System class

// ............WAY TO REQUEST GARBAGECOLLECTOR..............
// ......STEP-1.......
// class A {
// int x, y, z;

// public void finalize() {
// System.out.println("finlaize called");
// }
// }

// class RuntimeClass {
// public static void main(String ar[]) {
// A a1 = new A();
// a1 = null;
// Runtime r = new Runtime();
// r.gc();
// System.out.println("main called");
// }
// }
// // because we can create direct Object of Runtime class because its an
// singleton
// // class

// ......STEP-2.......

// class A {
// int x, y, z;

// public void finalize() {
// System.out.println("finlaize called");
// }
// }

// class RuntimeClass {
// public static void main(String ar[]) {
// A a1 = new A();
// a1 = null;
// Runtime r = Runtime.getRuntime();
// r.gc();
// System.out.println("main called");
// }
// }
// // because we can create direct Object of Runtime class because its an
// singleton
// // class

// ......STEP-3.......

// class A {
// int x, y, z;

// public void finalize() {
// System.out.println("finlaize called");
// }
// }

// class RuntimeClass {
// public static void main(String ar[]) {
// A a1 = new A();
// a1 = null;
// Runtime.getRuntime().gc();
// System.out.println("main called");
// }
// }
// //there are three posiblitis of out put
// // 1
// // main called
// // finlaize called

// // 2
// // finlaize called
// // main called

// // 3
// // main called