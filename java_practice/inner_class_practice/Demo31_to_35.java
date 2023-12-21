// class A {
//     void show() {
//         System.out.println("class A show");
//     }
// }

// class B extends A {

//     void show2() {
//         System.out.println("class B show2");
//     }
// }

// class Demo31 {
//     public static void main(String[] args) {
//         B b = new B();
//         b.show();
//         b.show2();
//     }
// }

//  inner class extends 

// class A {
//     class B {
//         void show() {
//             System.out.println("class B show method");
//         }
//     }

//     class C extends B {
//         void show2() {
//             System.out.println("class c show2 method");
//         }
//     }
// }

// class Demo32 {
//     public static void main(String[] args) {
//         A a = new A();
//         A.C c = a.new C();
//         c.show();
//         c.show2();
//     }
// }

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

// ***** constructor inside outer  class 

// class A {
//     A() {
//         System.out.println("class A constructor ");
//     }
// }

// class B extends A {
//     B() {
//         System.out.println("class B constructor");
//     }
// }

// class C extends B {
//     C() {
//         System.out.println("class c constructor");
//     }
// }

// class Demo34 {
//     public static void main(String[] args) {
//         C c = new C();
//     }
// }

// CONSTRUCTOR INSIDE INNER CLASS 

class A {
    class B {
        B() {
            System.out.println("inner class B constructor");
        }
    }

    class C extends B {
        C() {
            System.out.println("inner class C constructor");
        }
    }

}

class Demo35 {
    public static void main(String[] args) {
        A a = new A();
        A.C c = a.new C();

    }
}
