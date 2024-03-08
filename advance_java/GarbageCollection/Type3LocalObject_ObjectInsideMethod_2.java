class A {
    int x, y;

    A show() {
        System.out.println("class A show");
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        return a4;

    }

}

class Type3LocalObject_ObjectInsideMethod_2 {

    public static void main(String ar[]) {
        A a1 = new A();
        A a5 = a1.show();// this line we have 4 object
        a5.show();
        System.out.println("main method");// this line we have two object
    }
}