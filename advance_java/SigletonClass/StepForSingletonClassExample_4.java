//this is the example for singleton class wrie interwiew final result for singleton class
class A {
    static A a;

    private A() {
    }

    static A get() {
        if (a == null) {
            a = new A();
        }
        return a;
    }

    void show() {
        System.out.println("show method class A");
    }
}

class StepForSingletonClassExample_4 {
    public static void main(String ar[]) {
        A a1 = A.get();
        A a2 = A.get();
        A a3 = A.get();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
    }
}

/*
 * 2018699554
 * 2018699554
 * 2018699554 because only object is create in this class there for all ouput is
 * same
 * 
 */