class A {
    int x, y;

    void get(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void show() {
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}

class CloneMethodStep1 {
    public static void main(String ar[]) {
        A a1 = new A();
        A a2 = new A();
        a1.get(10, 20);
        a2.show();
    }
}