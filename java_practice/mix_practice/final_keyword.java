//******we can not inherit a final class *****//
// final class A {
//     void show() {
//         System.out.println("final class A");
//     }
// }

// class B extends A {

// }

// class Today {
//     public static void main(String[] args) {
//         B b = new B();
//         b.show();
//     }
// }

//******we can not  override an final method******//

// class A {
//     final void show() {
//         System.out.println("final class A");
//     }
// }

// class B extends A {

// }

// class f2 {
//     public static void main(String[] args) {
//         B b = new B();
//         b.show();
//     }
// }

// class A {
//     final void show() {
//         System.out.println("final class A");
//     }
// }

// class B extends A {

//     void show() {
//         System.out.println(" class B");
//     }
// }

// class f3 {
//     public static void main(String[] args) {
//         B b = new B();
//         b.show();
//     }
// }

//*****we can only initilized final variable only one time******//

class A {
    final int x = 10;

    void show() {
        x = 23;
        System.out.println("x=" + x);
    }
}

class f3 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}