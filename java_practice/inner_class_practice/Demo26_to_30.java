//****  CALLING INNER CLASS METHOD WITHOUT USING REFFRENCE VARIABLE

// class A {
//     class B {
//         void show() {
//             System.out.println("class B show method");
//         }
//     }
// }

// class Demo26 {
//     public static void main(String[] args) {
//         new A().new B().show();
//     }
// }

// A.B.C METHOD ACESS WITHOUT REFFRENCE VARIABLE

// class A {
//     class B {
//         class C {
//             void show() {
//                 System.out.println("class C show method");
//             }
//         }
//     }
// }

// class Demo27 {
//     public static void main(String[] args) {
//         new A().new B().new C().show();
//     }
// }

//***  WHAT HAPPEN IF CREATE STATIC BLOCK INSIDE  INSTANCE INNER CLASS

// class A {
//     class B {
//         static {
//             System.out.println("class C show method");
//         }
//     }
// }

// class Demo28 {
//     public static void main(String[] args) {
//         new A().new B();
//     }
// }

// ***** (FOR ABOVE EX.) error: Illegal static declaration in inner class A.B
// **** WE CAN CREATE INSTANCE BLOCK INSIDE INNER CLASS

// class A {
//     {
//         System.out.println("class A instance block");
//     }

//     class B {
//         {
//             System.out.println("class B instance block");
//         }
//     }
// }

// class Demo29 {
//     public static void main(String[] args) {
//         new A().new B();
//     }
// }

//****   CONSTRUCTOR INSIDE INNER AND OUTER CLASS

class A {
    A() {
        System.out.println("class A constructor");
    }

    {
        System.out.println("class A instance block");
    }

    class B {
        B() {
            System.out.println("class B constructor");
        }

        {
            System.out.println("class B instance block");
        }
    }
}

class Demo30 {
    public static void main(String[] args) {
        new A().new B();
    }
}
