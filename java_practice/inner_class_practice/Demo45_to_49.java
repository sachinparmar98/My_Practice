
//*******DEMO45********//
// abstract class A {
//     void show() {
//         System.out.println("class A show method");
//     }
// }

// class Demo45 {
//     public static void main(String[] args) {
//         A a = new A();
//         a.show();
//     }
// }

//*******DEMO46********//

// abstract class A {
//     void show() {
//         System.out.println("class A show method");
//     }
// }

// class B extends A {

// }

// class Demo46 {
//     public static void main(String[] args) {
//         B b = new B();
//         b.show();
//     }
// }

//*******DEMO47********//

// abstract class A {
//     class B {
//         void show() {
//             System.out.println("class B show method123");
//         }
//     }
// }

// class C extends A {

// }

// class Demo47 {
//     public static void main(String[] args) {
//         C c = new C();
//         C.B b = c.new B();
//         b.show();
//     }
// }

//*******DEMO48******** only we can do this in case of inheritance//
// abstract class A {
//     class B {
//         void show() {
//             System.out.println("class B show method5342");
//         }
//     }
// }

// class B extends A {

// }

// class Demo48 {
//     public static void main(String[] args) {
//         B b = new B();
//         B.B b1 = b.new B();
//         b1.show();
//     }
// }

//*******DEMO48******** extenal and internal class name can not be same//

class A {
    class A {
        void show() {
            System.out.println("inner class show method");
        }
    }
}

class Demo49 {

    public static void main(String[] args) {
        A a = new A();
        A.A a1 = a.new A();
        a1.show();
    }
}