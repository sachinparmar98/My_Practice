// class A {
//     class B {
//         void show() {
//             System.out.println("inner class B show method");
//         }
//     }
// }

// class Demo36 {
//     public static void main(String[] args) {
//         new A().new B().show();
//     }
// }

// class A {
//     class B {
//         class C {
//             void show() {
//                 System.out.println("class c show method");
//             }
//         }
//     }
// }

// class Demo37 {
//     public static void main(String[] args) {
//         new A().new B().new C().show();
//     }
// }

//*********we can't create inside inner class static block static method static varible  */ 

// class A {
//     static {
//         System.out.println("classs A static block");
//     }

//     class B {
//         static {
//             System.out.println("classs B static block");

//         }
//     }
// }

// class Demo38 {
//     public static void main(String[] args) {
//         A a = new A();
//         A.B b = a.new B();
//     }
// }

//*****************we can create instance block inside instance inner class  and outer class */

// class A {
//     {
//         System.out.println("classs A instance block");
//     }

//     class B {
//         {
//             System.out.println("classs B instance block");

//         }
//     }
// }

// class Demo39 {
//     public static void main(String[] args) {
//         A a = new A();
//         A.B b = a.new B();
//     }
// }
// *****************we can create final static variable inside instance inner class **********//

//********* CONSTRUCTOR INSIDE INNER CLASS AND OUTER CLASS **********//

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

// class Demo40 {
// public static void main(String[] args) {
// A a = new A();
// A.B b = a.new B();
// }
// }

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

// class Demo41 {
// public static void main(String[] args) {
// B b = new B();
// b.show();
// b.show2();
// }
// }

// **************DEMO42*************//

// BELOW EXAMPLE IS NOT WORKING
class A {
    class B {
        void show() {
            System.out.println("inner class B show method");
        }
    }
}

class C extends B {
    void show2() {
        System.out.println(" class C show2 method");
    }

}

class Demo42 {
    public static void main(String[] args) {
        A a = new A();
        A.C c = a.new C();
        c.show2();
        c.show();
    }
}