
class A {
    int x, y, z;

    public void finalize() {
        System.out.println("finalize method call");

    }
}

class finalizeManuallyCall_8 {
    public static void main(String ar[]) {
        A a1 = new A();

        a1.finalize();
        a1.finalize();
        a1.finalize();
        a1.finalize();
        a1.finalize();

        System.out.println("main method call");
    }
}
/* 
op==>
finalize method call
finalize method call
finalize method call
finalize method call
finalize method call
main method call 
*/