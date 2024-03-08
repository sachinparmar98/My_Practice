
class A {
    private A() {
        System.out.println("class A private Constructor");
    }

}

class StepForSingletonClass_1 {
    public static void main(String ar[]) {
        A a = new A();
    }
}

/* 

 */