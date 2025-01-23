class A {
    int x;
    String name;
    A a = new A();

    A() {
        System.out.println("class A constructor");
    }
}

class StackOverFlow {
    public static void main(String ar[]) {
        System.out.println("main method");
        A a1 = new A();
    }

}

/*
 * A a ak instance reffrence variable ha when we create A a1 object uska
 * coresponding A a object create hoga fir A a
 * coresponding fir sa new object create hoga ya process chalti rahagi or stack
 * overflow ho jay ga
 */