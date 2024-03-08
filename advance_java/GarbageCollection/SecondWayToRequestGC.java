class A {
    int x, y, z;

    public void finalize() {
        System.out.println("finlaize called");
    }
}

class SecondWayToRequestGC {
    public static void main(String ar[]) {
        A a1 = new A();
        a1 = null;
        Runtime.getRuntime().gc();
        System.out.println("main called");
    }
}
//there are three posiblitis of out put
// 1
// main called
// finlaize called

// 2
// finlaize called
// main called

// 3
// main called