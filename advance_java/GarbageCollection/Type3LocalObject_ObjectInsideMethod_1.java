class A {
    int x, y;

    void show() {
        System.out.println("class A show");
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();

    }

}

class Type3LocalObject_ObjectInsideMethod_1 {

    public static void main(String ar[]) {
        A a1 = new A();

        a1.show();// this line we have four object
        System.out.println("main method");// this line we have only one object
    }
}