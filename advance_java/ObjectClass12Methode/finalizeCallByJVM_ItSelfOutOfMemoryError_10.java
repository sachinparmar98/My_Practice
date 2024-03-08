
class A {
    int x, y, z;
    static int count = 0;

    public void finalize() {
        count++;
        System.out.println(count);

    }
}

class finalizeCallByJVM_ItSelfOutOfMemoryError_10 {
    public static void main(String ar[]) {
        A a[] = new A[100000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = new A();
            a[i] = null;
        }
    }
}

/* 

 */