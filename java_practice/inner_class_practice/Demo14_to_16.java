// class A {
//     int x = 10;

//     class B {
//         int x = 20;

//         void show() {
//             int x = 30;
//             System.out.println("x=" + x);
//             System.out.println("x=" + this.x);
//             System.out.println("x=" + A.this.x);

//         }
//     }
// }

// class Demo14 {
//     public static void main(String[] args) {
//         A a = new A();
//         A.B b = a.new B();
//         b.show();
//     }
// }

// if we dclare private int x then

// class A {
//     private int x = 10;

// }

// class Demo15 {
//     public static void main(String[] args) {
//         A a = new A();
//         System.out.println(a.x);
//     }
// }

//  Data enacpsulation 
class A {
    private int x = 101;

    void show() {

        System.out.println("x=" + x);
    }
}

class Demo16 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}
