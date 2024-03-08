class A {
    static A a;
    int x, y;

    private A() {
    }

    static public A getInstance() {
        if (a == null) {
            a = new A();
        }
        return a;
    }

    public void get(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void show() {
        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }
}

class finalExampleforSingletonClass {
    public static void main(String a[]) {
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        a1.get(10, 20);
        a2.show();
    }
}