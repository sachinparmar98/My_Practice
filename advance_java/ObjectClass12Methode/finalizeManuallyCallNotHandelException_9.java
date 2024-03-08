
class A {
    int x, y, z;

    public void finalize() {
        System.out.println("finalize method call");
        System.out.println(10 / 0);

    }
}

class finalizeManuallyCallNotHandelException_9 {
    public static void main(String ar[]) {
        A a1 = new A();
        a1.finalize();

        System.out.println("main method call");
    }
}
/*
 * finalize method call
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at A.finalize(finalizeManuallyCallNotHandelException_9.java:7)
 * at finalizeManuallyCallNotHandelException_9.main(
 * finalizeManuallyCallNotHandelException_9.java:15)
 */