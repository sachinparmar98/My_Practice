class A {
    int x;

    A(int x) {
        x = x;
    }

    public String toString() {
        return "" + x;
    }
}

class sita {
    public static void main(String ar[]) {
        A a1 = new A('A');
        A a2 = new A('B');
        System.out.println(a1);
        System.out.println(a2);
    }
}