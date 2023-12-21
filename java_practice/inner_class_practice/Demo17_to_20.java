// class A {
//     private int x = 111;

//     class B {
//         void show() {

//             System.out.println("x=" + x);
//         }
//     }
// }

// class Demo17 {
//     public static void main(String[] args) {

//         A a = new A();
//         A.B b = a.new B();
//         b.show();
//     }
// }

// what happen if we declare outer class private 

// private class A {
//     int x = 111;

//     class B {
//         void show() {

//             System.out.println("x=" + x);
//         }
//     }
// }

// class Demo18 {
//     public static void main(String[] args) {

//         A a = new A();
//         A.B b = a.new B();
//         b.show();
//     }
// }

// *** (for Demo18)error: modifier private not allowed here *** \\
// ***if e declare inner class private  

// class A {
//     private class B {
//         void show() {

//             System.out.println("A.B  private inner class show method");
//         }
//     }
// }

// class Demo19 {
//     public static void main(String[] args) {

//         A a = new A();
//         A.B b = a.new B();
//         b.show();
//     }
// }

// *** (for Demo19) error:A.B has private access in A *** \\
// ***  how to acess inner class private data (see below ex.)\\

class A {

    private class B {
        void show() {

            System.out.println("A.B  private inner class show method");
        }
    }

    void show1() {
        B b = new B();
        b.show();
    }
}

class Demo20 {
    public static void main(String[] args) {

        A a = new A();
        a.show1();
    }
}
