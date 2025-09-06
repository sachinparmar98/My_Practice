import java.util.*;

class A {

    public synchronized void show() {
        System.out.println("my name is A");
    }

    public void show(int x) {
        System.out.println("parmeter method");
    }
}

class Date21June {
    public static void main(String ar[]) throws Exception {

        A a = new A();
        a.show();
        a.show(4);

    }
}