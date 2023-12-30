//*WE CAN CREATE A CONCRETE METHOD INSIDE AN ABSTRACT CLASS*//
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
