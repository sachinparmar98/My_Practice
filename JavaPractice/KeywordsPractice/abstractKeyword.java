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

// class abstractKeyword {
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

// ******************************* */
// *WE CAN CREATE A CONCRETE METHOD INSIDE AN ABSTRACT CLASS*//
abstract class A {
    abstract void show();

    void show2() {
        System.out.println("class A show2 method");
    }
}

class B extends A {

    void show() {
        System.out.println("class B show method");
    }
}

class Ab2 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.show2();
    }
}

// ***YES WE CAN CREATE AN CONSTRUCTOR INSIDE AN ABSTRACT CLASS***//
abstract class A {
    A() {
        System.out.println("class A constructor");
    }
}

class B extends A {

}

class Ab3 {
    public static void main(String[] args) {
        B b = new B();
    }
}*/