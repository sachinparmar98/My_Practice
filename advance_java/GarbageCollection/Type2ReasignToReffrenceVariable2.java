class A {
    int x, y;

    void show() {
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }

    void get(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Type2ReasignToReffrenceVariable2 {

    public static void main(String ar[]) {
        A a1 = new A();
        A a2 = new A();
        a1.get(10, 20);
        a1.show();
        a2.show();
        a2 = a1;// this line we have only one object
        a1.show();
        a2.show();
    }
}