// class A {
//     abstract class B {
//         void show() {
//             System.out.println("A.B show method");
//         }
//     }
// }

// class Demo50 {
//     public static void main(String[] args) {

//         A a = new A();
//         A.B b = a.new B();
//         b.show();
//     }

// }

//*******51******//

// class A {
//     abstract class B {
//         void show() {
//             System.out.println("A.B show method54");
//         }

//     }

//     class C extends B {

//     }
// }

// class Demo51 {
//     public static void main(String[] args) {

//         A a = new A();
//         A.C c = a.new C();
//         c.show();
//     }

// }

// //*******52******//

// class A {
//     class B {
//         abstract void show();
//     }

// }

// class Demo52 {
//     public static void main(String[] args) {

//         A a = new A();
//         A.B b = a.new B();
//         b.show();
//     }

// }

// //*******53******WE CAN DAFINATLY CREATE INNER CLASS AS A ABSTRACT CLASS//

// class A {
//     abstract class B {
//         abstract void show();
//     }

// }

// class Demo53 {
//     public static void main(String[] args) {

//     }

// }

//*******54******//

class A {
    abstract class B {
        abstract void show();
    }

    class C extends B {
        void show() {
            System.out.println("hello sachin");

        }

    }

}

class Demo54 {
    public static void main(String[] args) {

        A a = new A();
        A.C c = a.new C();
        c.show();
    }

}
