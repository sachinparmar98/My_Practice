// ................EXAMPLE-1...........

// we cannot create interface object
// interface Inter1 {

// }

// class IntefacePractice {
// public static void main(String ar[]) {
// Inter1 i = new Inter1();

// }
// }

// ................EXAMPLE-2...........
// interface Inter1 {
// // public abstract void show();
// // abstract public void show();
// // abstract void show();
// public void show();
// // void show();

// }

// class A implements Inter1 {
// public void show() {
// System.out.println("ra1s");
// }

// }

// class IntefacePractice {
// public static void main(String ar[]) {
// A a1 = new A();
// a1.show();
// }
// }

// ................EXAMPLE-3...........

// interface Inter3 {
//     void show(); //internaly abstract public void show();
// }

// class A implements Inter3 {

// }

// class IntefacePractice {
//     public static void main(String[] args) {

//     }
// }
//error-(for I3) A is not abstract and does not override abstract method show() in Inter3

//.............ABOVE ERROR  SOLUTION..............

// interface Inter3 {
//     void show();
// }

// class A implements Inter3 {
//     void show() {
//         System.out.println("class A show method ");
//     }
// }

// class IntefacePractice {
//     public static void main(String[] args) {
//         A a = new A();
//         a.show();
//     }
// }

//ERROR(for I3Solution) - attempting to assign weaker access privileges; was public

//...........ABOVE ERROR SOLUTION.................

// interface Inter3 {
//     void show();
// }

// class A implements Inter3 {
//     public void show() {
//         System.out.println("class A show method1212 ");
//     }
// }

// class IntefacePractice {
//     public static void main(String[] args) {
//         A a = new A();
//         a.show();
//     }
// }

// ................EXAMPLE-4...........

//INTERFACE ABSTRACT METHOD CAN NOT HAVE BODY
// interface Inter2 {
//     void show ()
//     {

//     }
// }

// class I2 {
//     public static void main(String[] args) {

//     }
// }

// ................EXAMPLE-5...........

//WE CAN NOT CREATE AN INSTANCE OF INTERFACE
// interface Inter1 {

// }

// class I1 {
//     public static void main(String[] args) {
//         Inter1 i = new Inter1();

//     }
// }

// ................EXAMPLE-6...........

//interface Inter1 {
//     static void show() {
//         System.out.println("i am sachin");
//     }

//     class A implements Inter1 {
//         static public void show() {
//             System.out.println("i am sita");
//         }
//     }

//     public class IntefacePractice {
//         public static void main(String[] args) {

//             A a1 = new A();
//             a1.show();

//         }
//     }

// }
// ................EXAMPLE-7...........
// interface i {
// }

// class A {
// }

// class B {
// }

// public class InterfacePractice {
//     public static void main(String[] args) {

//         A a = new B();// error
//         A a1 = null;// compile
//         A a2 = new A();
//         i i1 = (i) a1;
//         i i2 = (i) a2;// class cast exception

//         i i3 = null;

//         Object o = i1;
//         Object o1 = i3;

//         System.out.println(i1);// null
//         System.out.println(i3);// null
//         System.out.println(o);// null
//         System.out.println(o1);// null
//     }
// }

// ................EXAMPLE-8...........
interface i {

}

class A implements i {

}

public class InterfacePractice {
  public static void main(String[] args) {
    i i1[] = { null, null };
    i i11[] = { new A(), new A() };
    i i13 = new A();
    Object o1 = i1;// worked
    Object o11 = i11;// worked
    Object o111 = i13;

    Object o2[] = i1;// worked

    Object o3[] = (Object[]) i1;
    // Object o4[]=(i)i1;
    // Object o5[]=(i[])i1;
    System.out.println(o1);// [Li;@15db9742
    System.out.println(o11);// [Li;@15db9742
    System.out.println(o2);// [Li;@15db9742
    System.out.println(o111);
    System.out.println(o3);
    // System.out.println(o4);
    // System.out.println(o5);
  }
}

// ................EXAMPLE-9...........
// ................EXAMPLE-10...........