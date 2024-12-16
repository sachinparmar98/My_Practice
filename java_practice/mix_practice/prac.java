//Question 1
// class A {
//      void show() {
//         System.out.println("class AA");
//     }
// }

// class B extends A {
//       int show() {
//      System.out.println("class B");
//       return 5; 
//     }
// }

// class prac {
//     public static void main(String ar[]) {
//         //A a = new A();
//         B a=new B();
//         a.show();
//     }
// }

// error: show() in B cannot override show() in A
// int show() {
//     ^
// return type int is not compatible with void

// ***********************************************************
//   class A {
//     Integer show() {
//        System.out.println("class AA");
//        return 5;
//    }
// }

// class B extends A {
//      Object show() {
//     System.out.println("class B");
//      return 5; 
//    }
// }

// class prac {
//    public static void main(String ar[]) {
//        //A a = new A();
//        B a=new B();
//        a.show();
//    }
// }

// rac.java:38: error: show() in B cannot override show() in A
//      Object show() {
//             ^
//   return type Object is not compatible with Integer

//************************************************************* 

// class A {
//    final  void  show() {
//        System.out.println("class AA");

//    }
// }

// class B extends A {
//      final void  show() {
//     System.out.println("class B");

//    }
// }

// class prac {
//    public static void main(String ar[]) {
//        //A a = new A();
//        B a=new B();
//        a.show();
//    }
// }

// prac.java:69: error: show() in B cannot override show() in A
//      final void  show() {
//                  ^
//   overridden method is final
// 1 error
//******************************************************* 
// class A {
//     final  void  show() {
//         System.out.println("class AA");

//     }
//  }

//  class B extends A {
//        void  show() {
//      System.out.println("class B");

//     }
//  }

//  class prac {
//     public static void main(String ar[]) {
//         //A a = new A();
//         B a=new B();
//         a.show();
//     }
//  }

//  prac.java:103: error: show() in B cannot override show() in A
//        void  show() {
//              ^
//   overridden method is final
//***********************************************************
// class A {
//     final void show() {
//         System.out.println("class AA");

//     }
// }

// class B extends A { }

// class prac {
//     public static void main(String ar[]) {
//         // A a = new A();
//         B a = new B();
//         a.show();
//     }
// }
// output
// class AA

//*********************************************************** 

// class A {
//     private final void show() {
//         System.out.println("class AA");

//     }
// }

// class B extends A {
//     void show() {
//         System.out.println("class B");

//     }
// }

// class prac {
//     public static void main(String ar[]) {
//         // A a = new A();
//         B a = new B();
//         a.show();
//     }
// }

// output  
// class B

//*********************************************************** 

// class A {
//     private final void show() {
//         System.out.println("class AA");

//     }
// }

// class B extends A {
//     final void show() {
//         System.out.println("class BB");

//     }
// }

// class prac {
//     public static void main(String ar[]) {
//         // A a = new A();
//         B a = new B();
//         a.show();
//     }
// }

// output
// class BB

//*********************************************************** 

// class A {
//  static final void show() {
//         System.out.println("class AA");

//     }
// }

// class B extends A {
//     void show() {
//         System.out.println("class B");

//     }
// }

// class prac {
//     public static void main(String ar[]) {
//         // A a = new A();
//         B a = new B();
//         a.show();
//     }
// }

// rac.java:196: error: show() in B cannot override show() in A
//     void show() {
//          ^
//   overridden method is static,final

// //*********************************************************** 

// class A {
//     static  void show() {
//            System.out.println("class AAA");

//        }
//    }

//    class B extends A {
//     //    void show() {
//     //        System.out.println("class B");

//     //    }
//    }

//    class prac {
//        public static void main(String ar[]) {
//            // A a = new A();
//            B a = new B();
//            a.show();
//        }
//    }
//    output class AAA

// //*********************************************************** 
// interface Inter1 {
//     int x = 30;

//     default void show() {
//         System.out.println("interface method");
//     }
// }

// class B implements Inter1 {
//     int x = 20;

//     // public void show() {
//     //     System.out.println("class A method");
//     // }
// }

// public class prac extends B {
//     int x = 10;

//     public void show() {
//         System.out.println("class prac show method");
//     }

//     public static void main(String ar[]) {
//         prac p = new prac();
//         B b=new B();
//         ((Inter1)b).show();
//     }
// }
// //output interface method

//************************************************************
// interface Inter1 {

//     static void show() 
//     {
//         System.out.println("inter1");
//     }

// }
// interface Inter2 extends Inter1  {

// }
// public class Demo1212 {

// public static void main(String ar[]) {
// Inter2.show();

// }
// }

// Demo1212.java:17: error: cannot find symbol
// Inter2.show();
//      ^
// symbol:   method show()
// location: interface Inter2
// 1 error

//************************************************************** 
// interface Inter1 {

//     static void show() {
//         System.out.println("inter1");
//     }

// }

// public class prac implements Inter1 {

//     public static void main(String ar[]) {
//            prac p=new prac();
//         prac.show();

//     }
// }
// prac.java:312: error: cannot find symbol
//         prac.show();
//             ^
//   symbol:   method show()
//   location: class prac

//************************************************************** 
// class A {

//     static void show() {
//         System.out.println("class AAAAAAAAA");
//     }

// }

// public class prac extends A {

//     public static void main(String ar[]) {
//         prac p = new prac();
//         p.show();

//     }
// }
// output class AAAAA

//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

interface A {
    static void show() {
        System.out.println("interface A");
    }

}

interface B extends A {

}

class prac implements B {
    public static void main(String ar[]) {
        Demo d = new Demo();
        // d.show();//can not find show
        B.show();// can not find show
    }
}

