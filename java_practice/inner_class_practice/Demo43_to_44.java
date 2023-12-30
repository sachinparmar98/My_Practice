//********DEMO43******* */
// class A {
//     A() {
//         System.out.println("class A");
//     }

// }

// class B extends A {
//     B() {
//         System.out.println("class B conatructor");

//     }
// }

// class C extends B {
//     C() {
//         System.out.println("class C conatructor");

//     }
// }

// class Demo43 {
//     public static void main(String[] args) {
//         C c = new C();

//     }

// }

//***********DEMO44***********//

class A {
    class B {
        B() {
            System.out.println("Class B constructor");
        }

    }

    class C extends B {
        C() {
            System.out.println("Class C constructor");
        }

    }
}

class Demo44 {
    public static void main(String[] args) {
        A a = new A();
        A.C c = a.new C();
    }
}