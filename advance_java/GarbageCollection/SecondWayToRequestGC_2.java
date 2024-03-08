class A {
    int x, y, z;

    public void finalize() {
        System.out.println("finlaize called");
    }
}

class SecondWayToRequestGC_2 {
    public static void main(String ar[]) {
        A a1 = new A();
        a1 = null;
        Runtime r = new Runtime();
        r.gc();
        System.out.println("main called");
    }
}
// because we can create direct Object of Runtime class because its an singleton
// class
