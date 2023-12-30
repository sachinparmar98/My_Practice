//private -> default -> protected -> public
class A {
    private void show() {
        System.out.println("class A show private method");
    }
}

class B extends A {

}

class Poly3 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
