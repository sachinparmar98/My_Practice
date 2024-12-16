// class Q2 {
//     final static short i = 2;
//     public static int j = 0;

//     public static void main(String ar[]) {
//         for (int k = 0; k <= 3; k++) {
//             switch (k) {
//                 case i:
//                     System.out.println("0");
//                 case i - 1:
//                     System.out.println("1");
//                 case i - 2:
//                     System.out.println("2");
//                 case i - 3:
//                     System.out.println("3");
//             }
//         }
//     }

// }

// Question no2
//   class A 
//   {
//     {System.out.println("class A instace Block");}
//    A() {System.out.println("class A constructior");}
//   }
//   class B extends A 
//   { 
//     static {System.out.println("class B static block");}
//     {System.out.println("class B instace Block");}
//    B() {System.out.println("class B constructior");}
// static {System.out.println("class B block static ");}
// }
//   class Q2 extends B
//   {
//     public static void main(String ar[])
//     {
//         System.out.println("q2 main method");
//         new Q2();
//         System.out.println("Q2 main method");
//         }
//   }

//Q3
class A {
    static int x = 100;
    static {
        System.out.println("class A static block");
    }
}

class B extends A {
    static int x = 200;
    static {
        System.out.println("class B static block");
    }
}

class Q3 {
    static {
        System.out.println("class q3 static block");
    }

    public static void main(String ar[]) {
        System.out.println("main method");
        System.out.println("x=" + B.x);
    }

}