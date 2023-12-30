// class A {
//     public void show() {
//         System.out.println("class A show method");
//     }
// }

// class B extends A {

//     void show() {
//         System.out.println("class B show method");
//     }
// }

// class Poly1 {
//     public static void main(String[] args) {
//         B b = new B();
//         b.show();
//     }

// }

//**SOLUTION FOR ABOVE EXAMPLE **/

class A {
    public void show() {
        System.out.println("class A show method");
    }
}

class B extends A {

    public void show() {
        System.out.println("class B show method2323");
    }
}

class Poly1S {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }

}
