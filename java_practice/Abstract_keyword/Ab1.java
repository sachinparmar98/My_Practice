//**Ab1***//
// abstract class A {
//     abstract void show1();

//     abstract void show2();
// }

// class B extends A {
//     void show1();

//     {
//         System.out.println("class B show method535465");
//     }
// }

// class Ab1 {
//     public static void main(String[] args) {
//         B b = new B();
//         b.show1();
//     }
// }

//*Ab2**  YES WE CAN CREATE STATIC METHOD INSIDE AN ABSTRACT CLASS//

abstract class A {
    static void show1() {
        System.out.println("class A static method");
    }

}

class Ab2 {
    public static void main(String[] args) {
        A.show1();
    }
}
