// class A {
//     A() {
//         System.out.println("class A constructor");
//     }

//     void show() {
//         System.out.println("class A show method");
//     }
// }

// class Demo21 {
//     public static void main(String[] args) {
//         A a = new A();
//         a.show();
//     }
// }

// **** CLASS A WITH INSTANCE BLOCK AND CONSTRUCTOR

// class A {
// A() {
// System.out.println("class A constructor");
// }

// void show() {
// System.out.println("class A show method");
// }

// {
// System.out.println("class A instance block...");
// }
// }

// class Demo22 {
// public static void main(String[] args) {
// A a = new A();
// a.show();
// }
// }

// **** STATIC BLOCK 

// class A {
//     A() {
//         System.out.println("class A constructor");
//     }

//     void show() {
//         System.out.println("class A show method");
//     }

//     {
//         System.out.println("class A instance block...");
//     }
//     static {
//         System.out.println("class A static  block...");
//     }
// }

// class Demo23 {
//     public static void main(String[] args) {
//         A a = new A();
//         a.show();
//     }
// }

// ***** CALLING CONSTRUCTOR WITHOUT REFFRENCE VARIABLE

// class A {
//     A() {
//         System.out.println("class A constructor");
//     }

//     void show() {
//         System.out.println("class A show method");
//     }
// }

// class Demo24 {
//     public static void main(String[] args) {
//         new A();

//     }
// }

// ***** CALLING  CONSTRUCTOR WITHOUT REFFRENCE VARIABLE 

class A {
    A() {
        System.out.println("class A constructor");
    }

    void show() {
        System.out.println("class A show method");
    }
}

class Demo25 {
    public static void main(String[] args) {
        new A().show(); // concept because new A() is object of class A

    }
}
