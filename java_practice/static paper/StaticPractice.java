/*

class A {
    A() {
        System.out.println("class A constructor");
    }

    static {
        System.out.println("class A static block");
    }
}

class StaticPractice {

    static {
        System.out.println("class staticPractice static block");
    }

    public static void main(String ar[]) {
        System.out.println("class StaticPractic main method");
        A a = new A();
    }
}
*/

/* output
 * class saticpractice static block
 * class staticpractice main method
 * class A static block
 * class A constructor
 */

class A {
    A() {
        System.out.println("class A constructor");
    }

    static {
        System.out.println(" A static block");
    }
    // static StaticPractice s2 = new StaticPractice();
}

class StaticPractice {
    static StaticPractice s = new StaticPractice();
    static A a = new A();

    StaticPractice() {
        System.out.println("class StaticPractice constructor");
    }

    static {
        System.out.println("class staticPractice static block");
    }

    public static void main(String ar[]) {
        System.out.println("class StaticPractic main method");
        StaticPractice s1 = new StaticPractice();
    }
}
