// class A {
//     int x = 12000;

//     void show2() {
//         System.out.println("class A show2 method");
//     }

//     class B {
//         void show3() {
//             System.out.println(" class B show3 method");
//         }

//   

// void show1(){
//         B b = new B();
//         b.show3();
//         System.out.println("x=" + x);
//         show2();
//     }
// }

// class Demo7 {
//     public static void main(String ar[]) {
//         A a = new A();
//         a.show1();
//     }
// }

class A {
    int x = 12000;

    void show2() {
        System.out.println("class A show2 method");
    }

    class B {
        void show3() {
            System.out.println(" class B show3 method");
        }

    }

    static void show1() {
        B b = new B();
        b.show3();
        System.out.println("x=" + x);
        show2();
    }
}

class Demo7 {
    public static void main(String ar[]) {
        A a = new A();
        a.show1();
    }
}