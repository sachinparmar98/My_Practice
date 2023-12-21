// class Demo3 {
//     int x = 10;

//     public static void main(String ar[]) {
//         System.out.println("x=" + x);
//     }
// }

// class Demo3_3 {
//     int x = 10;

//     public static void main(String ar[]
//  Demo3_3 d=new Demo3_3();
//         System.out.println("x=" + d.

// }
// }

// class Demo3_4 {
//     static int x = 50;

//     public static void main(String ar[]) {
//         System.out.println("x=" + x);

//     }
// }

// class Demo3_5 {
//     int x = 1000;

//     void show() {
//         System.out.println("class Demo3_5 void show");
//     }

//     public static void main(String ar[]) {
//         Demo3_5 d = new Demo3_5();
//         d.show();
//         System.out.println("x=" + d.x);

//     }
// }

// class Demo3_6 {
//     int x = 1000;

//     void show() {
//         System.out.println("class Demo3_6  show method");
//     }

//     class A {
//         void show1() {
//             System.out.println("Demo3_6 inner class A show method");
//         }
//     }

//     public static void main(String ar[]) {
//         Demo3_6 d = new Demo3_6();
//         Demo3_6.A a = d.new A();
//         a.show1();
//         d.show();
//         System.out.println("x=" + d.x);

//     }
// }

class Demo3_7 {
    int x = 8000;

    void show() {
        System.out.println("class Demo3_7  show method");
    }

    class A {
        void show1() {
            System.out.println("Demo3_7 inner class A show method");
        }
    }

    public static void main(String ar[]) {
        Demo3_7 d = new Demo3_7();
        d.new A().show1();
        d.show();
        System.out.println("x=" + d.x);

    }
}
