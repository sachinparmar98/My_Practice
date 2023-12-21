// class A {
//     int x = 10;
//     static int y = 20;

//     class B {
//         void show() {
//             System.out.println("x=" + x);
//             System.out.println("y=" + y);
//         }
//     }
// }

// class Demo11 {
//     public static void main(String ar[]) {
//         A a = new A();
//         A.B b = a.new B();
//         b.show();
//     }
// }

//   static void show

// class A {
//     int x = 10;
//     static int y = 20;

//     class B {
//         static void show() {
//             System.out.println("x=" + x);
//             System.out.println("y=" + y);
//         }
//     }
// }

// class Demo12 {
//     public static void main(String ar[]) {
//         A a = new A();
//         A.B b = a.new B();
//         b.show();
//     }
// }

//   instance and local variable

class A {
    int x = 10;

    void show() {
        int x = 50;
        System.out.println("x=" + x);
        System.out.println("x=" + this.x);
    }
}

class Demo13 {
    public static void main(String ar[]) {
        A a = new A();
        a.show();
    }
}