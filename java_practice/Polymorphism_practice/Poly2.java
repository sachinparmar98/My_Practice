// class A {
//     protected void show() {
//         System.out.println("class A protected method");
//     }
// }

// class B extends A {

//     void show() {
//         System.out.println("class A protected method");
//     }
// }

// class Poly2 {
//     public static void main(String[] args) {
//         B b = new B();
//         b.show();
//     }
// }

// *****SOLUTION FOR ABOVE EXAMPLE//

class A {
    protected void show() {
        System.out.println("class A protected method");
    }
}

class B extends A {

    public void show() {
        System.out.println("class A protected method");
    }
}

class Poly2 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
