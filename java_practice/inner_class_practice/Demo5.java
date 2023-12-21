class A {
    class B {
        void show() {
            System.out.println("A.B show method");
        }
    }
}

class Demo5 {
    public static void main(String ar[]) {
        A a = new A();
        A.B b = a.new B();
        b.show();
    }
}