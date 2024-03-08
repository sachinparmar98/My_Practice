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

class CloneMethodStep2 {
    public static void main(String ar[]) {
        A a1 = new A();
        a1.get(10, 20);
        A a2=a1;
         a1.show();
        a2.show();
    }
}