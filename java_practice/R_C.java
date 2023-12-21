interface Inter1 {
    static void show() {
        System.out.println("i am sachin");
    }

    class A implements Inter1 {
        static public void show() {
            System.out.println("i am sita");
        }
    }

    class R_C {
        public static void main(String[] args) {

            A a1 = new A();
            a1.show();

        }
    }

}