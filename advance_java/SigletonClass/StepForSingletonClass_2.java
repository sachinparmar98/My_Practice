
class A {
    private A() {
        System.out.println("class A private Constructor");
    }

}

class StepForSingletonClass_2 {
    public static void main(String ar[]) {
        A a = new A(10);
    }
}

/*
 * StepForSingletonClass_2.java:11: error: constructor A in class A cannot be
 * applied to given types;
 * A a = new A(10);
 * ^
 * required: no arguments
 * found: int
 * reason: actual and formal argument lists differ in length
 */