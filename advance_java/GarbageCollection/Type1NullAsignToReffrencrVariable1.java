class A {
    void show() {
        System.out.println("class A show method ");
    }
}

class Type1NullAsignToReffrencrVariable1 {

    public static void main(String ar[]) {
        A a1 = new A();
        a1.show();
        a1 = null;
        a1.show();
    }
}