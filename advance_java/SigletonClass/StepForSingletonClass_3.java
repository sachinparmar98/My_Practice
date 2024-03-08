
class A {
    private A() {
    }

    static A get() {
        return new A();
    }

    void show() {
        System.out.println("show method class A");
    }
}

class StepForSingletonClass_3 {
    public static void main(String ar[]) {
        A a1 = A.get();
        A a2 = A.get();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
}

/*
 * 2018699554
 * 1311053135 because both the object are diffrent
 */