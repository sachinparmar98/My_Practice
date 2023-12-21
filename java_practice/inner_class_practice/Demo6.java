// class A {
//     int x = 75;

//     void show() {
//         System.out.println("x=" + x);
//     }
// }

// class Demo6 {
//     public static void main(String ar[]) {
//         A a = new A();
//         a.show();
//     }
// }

// class A {
//     int x = 79;

//     static void show() {
//         A a = new A();
//         System.out.println("x=" + a.x);
//     }
// }

// class Demo6 {
//     public static void main(String ar[]) {
//         A.show();
//     }
// }

class A {
    int x = 99;

    void show2() {
        System.out.println("show2 method.");
    }

    static void show1() {
        A a = new A();

        a.show2();
        System.out.println("x=" + a.x);
    }
}

class Demo6 {
    public static void main(String ar[]) {

        A.show1();
    }
}
