class Demo4 {
    class A {
        void show() {
            System.out.println("class A show method");
        }
    }

    public static void main(String ar[]) {
        Demo4 d = new Demo4();
        A a = d.new A();
        a.show();
        a.show();
    }
}