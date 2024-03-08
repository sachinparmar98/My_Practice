
class A {
    int x, y, z;

    public void finalize() {
        System.out.println("finalize method call");

    }
}

class finalizeManuallyCall_7 {
    public static void main(String ar[]) {
        A a1 = new A();
        a1 = null;
        a1.finalize();
        System.out.println("main method call");
    }
}

// OP=Exception in thread "main" java.lang.NullPointerException
// at finalizeManuallyCall_7.main(finalizeManuallyCall_7.java:15)