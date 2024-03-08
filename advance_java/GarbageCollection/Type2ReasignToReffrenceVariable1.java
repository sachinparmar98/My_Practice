class A {
    void show() {
        System.out.println("class A show method ");
    }
}

class Type2ReasignToReffrencrVariable1 {

    public static void main(String ar[]) {
        A a1 = new A();
        A a2 = new A();
        a1.show();
        a2.show();
        a2 = a1;// this line we have only one object
        a1.show();
        a2.show();
    }
}