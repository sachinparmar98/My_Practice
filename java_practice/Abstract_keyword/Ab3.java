//***YES WE CAN CREATE AN CONSTRUCTOR INSIDE AN ABSTRACT CLASS***//
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
}
