class A {
    A() {
        System.out.println("class A construtor");
    }
}

class Type3LocalObject_ObjectInsideMethod_3 {

    public static void main(String ar[]) {
        A a1 = new A(); // line 10 and line 11 both line we have only one Object
        System.out.println("main method");
    }
}