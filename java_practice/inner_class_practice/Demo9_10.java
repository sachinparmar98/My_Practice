// class A {
//     class B // instance inner class
//     {
//         void show() {
//             System.out.println("class B show method");
//         }

//     }
// }

// class Demo9 {
//     public static void main(String[] args) {
//         A a = new A();
//         A.B b = a.new B();
//         b.show();
//     }
// }

//  CLASS A inside class B inside class C
class A {
    class B // instance inner class
    {
        class C {

            void show() {
                System.out.println("class C show method ...");
            }
        }

    }
}

class Demo10 {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.show();
    }
}
