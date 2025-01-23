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
// ................EXAMPLE-8...........
// ................EXAMPLE-9...........
// ................EXAMPLE-10...........