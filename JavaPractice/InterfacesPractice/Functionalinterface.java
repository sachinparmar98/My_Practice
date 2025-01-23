// ..............STEP-1...............

// @FunctionalInterface
// interface Inter1 {
// void show(int x, int y);
// }
//// program will compile properly

// ..............STEP-2...............
@FunctionalInterface
// interface Inter1
// {
// void show(int x,int y);
// void show2(int x);
// }

// /* FunctionalinterfaceStep2.java:1: error: Unexpected @FunctionalInterface
// annotation
// @FunctionalInterface
// ^
// Inter1 is not a functional interface
// multiple non-overriding abstract methods found in interface Inter1
// 1 error */

// ..............STEP-3...............

@FunctionalInterface
// interface Inter1
// {
// void show(int x,int y);
// default void sum(int x){}

// }

// /*
// //program will compile proper

// */

// ..............STEP-4...............

@FunctionalInterface
// interface Inter1
// {
// void show(int x,int y);
// void sum(int x){}

// }

// /*
// FunctionalinterfaceStep4.java:5: error: interface abstract methods cannot
// have body
// void sum(int x){}
// ^
// FunctionalinterfaceStep4.java:1: error: Unexpected @FunctionalInterface
// annotation
// @FunctionalInterface
// ^
// Inter1 is not a functional interface
// multiple non-overriding abstract methods found in interface Inter1
// 2 errors
// */
// // interface ki method ma public abstract automatic add ho jata ha

// ..............STEP-5...............

@FunctionalInterface
// interface Inter1
// {
// void show(int x,int y);
// static void sum(int x){}

// }

// /*

// program will compile properly

// */
// // static body metod introduced in java version 1.9 in interface

// ..............STEP-6...............

@FunctionalInterface
// interface Inter1
// {
// void sum(int x,int y);

// }
// interface Inter2
// {

// void sum(int x,int y);
// void sum2(int x,int y);
// }

// /*

// program will compile properly because annotation sirf uska nicha wala
// interface ka liya aplicable hoga
// program ka all interface ka liya nahi

// */

// ..............STEP-7...............

@FunctionalInterface
// interface Inter1
// {
// void sum(int x,int y);

// }
// @FunctionalInterface
// interface Inter2
// {

// void sum(int x,int y);
// void sum2(int x,int y);
// }

// /*

// FunctionalinterfaceStep7.java:7: error: Unexpected @FunctionalInterface
// annotation
// @FunctionalInterface
// ^
// Inter2 is not a functional interface
// multiple non-overriding abstract methods found in interface Inter2
// 1 error

// */

// ..............STEP-8...............

@FunctionalInterface
// interface Inter1
// {
// void sum(int x,int y);

// }
// @FunctionalInterface
// interface Inter2 extends Inter1
// {

// void sum2(int x,int y);
// }

// /*
// FunctionalinterfaceStep7.java:7: error: Unexpected @FunctionalInterface
// annotation
// @FunctionalInterface
// ^
// Inter2 is not a functional interface
// multiple non-overriding abstract methods found in interface Inter2
// 1 error

// because extends kerna per Inter2 ma 2 abstract methods ho gai ha
// */

// ..............STEP-9...............

@FunctionalInterface
// interface Inter1
// {
// void sum(int x,int y);

// }
// @FunctionalInterface
// interface Inter2
// {

// void sum(int x,int y);
// }

// /*

// program will compile properly

// */

// ..............STEP-10...............

@FunctionalInterface
// interface Inter1
// {
// void sum(int x,int y);

// }
// class FunctionalinterfaceStep10
// {
// public static void main(String ar[])
// {
// Inter1 i=new Inter1();
// }
// }

// /*

// FunctionalinterfaceStep10.java:11: error: Inter1 is abstract; cannot be
// instantiated
// Inter1 i=new Inter1();
// ^
// 1 error

// */

// ..............STEP-11...............

import java.util.function.Function;
// class FunctionInterfaceAndThenAndComposeMethodWorkingStep6
// {
// static public void main(String ar[])
// {
// Function<Integer,Integer>f1=s->
// {
// System.out.println("f1");
// return s+s;

// };
// Function<Integer,Integer>f2=s->
// {
// System.out.println("f2");
// return s*s;
// };
// Function<Integer,Integer>f3=s->
// {
// System.out.println("f3");
// return s*5;
// };
// Function<Integer,Integer>f4=s->
// {
// System.out.println("f4");
// return s+5;
// };

// System.out.println(f1.andThen(f2).andThen(f3).apply(10));

// }

// }

// ..............STEP-12...............

import java.util.function.Function;
// class FunctionInterfaceAndThenAndComposeMethodWorkingStep7
// {
// static public void main(String ar[])
// {
// Function<Integer,Integer>f1=s->
// {
// System.out.println("f1");
// return s+s;

// };
// Function<Integer,Integer>f2=s->
// {
// System.out.println("f2");
// return s*s;
// };
// Function<Integer,Integer>f3=s->
// {
// System.out.println("f3");
// return s*5;
// };
// Function<Integer,Integer>f4=s->
// {
// System.out.println("f4");
// return s+5;
// };

// System.out.println(f1.compose(f2).compose(f3).apply(10));

// }

// }

// ..............STEP-13...............

import java.util.function.Function;
// class FunctionInterfaceAndThenAndComposeMethodWorkingStep8
// {
// static public void main(String ar[])
// {
// Function<Integer,Integer>f1=s->
// {
// System.out.println("f1");
// return s+s;

// };
// Function<Integer,Integer>f2=s->
// {
// System.out.println("f2");
// return s*s;
// };
// Function<Integer,Integer>f3=s->
// {
// System.out.println("f3");
// return s*5;
// };
// Function<Integer,Integer>f4=s->
// {
// System.out.println("f4");
// return s+5;
// };

// System.out.println(f1.andThen(f2).compose(f3).apply(10));

// }

// }

// ..............STEP-14...............

import java.util.function.Function;
// class FunctionInterfaceAndThenAndComposeMethodWorkingStep9
// {
// static public void main(String ar[])
// {
// Function<Integer,Integer>f1=s->
// {
// System.out.println("f1");
// return s+s;

// };
// Function<Integer,Integer>f2=s->
// {
// System.out.println("f2");
// return s*s;
// };
// Function<Integer,Integer>f3=s->
// {
// System.out.println("f3");
// return s*5;
// };
// Function<Integer,Integer>f4=s->
// {
// System.out.println("f4");
// return s+5;
// };

// System.out.println(f1.compose(f2).andThen(f3).apply(10));

// }

// }

// ..............STEP-15...............

import java.util.function.Function;
// class FunctionInterfaceAndThenAndComposeMethodWorkingStep10
// {
// static public void main(String ar[])
// {
// Function<Integer,Integer>f1=s->
// {
// System.out.println("f1");
// return s+s;

// };
// Function<Integer,Integer>f2=s->
// {
// System.out.println("f2");
// return s*s;
// };
// Function<Integer,Integer>f3=s->
// {
// System.out.println("f3");
// return s*5;
// };
// Function<Integer,Integer>f4=s->
// {
// System.out.println("f4");
// return s+5;
// };

// System.out.println(f1.andThen(f2).compose(f3).compose(f4).apply(10));

// }

// }

// ..............STEP-16...............

import java.util.function.Function;
// class FunctionInterfaceAndThenAndComposeMethodWorkingStep11
// {
// static public void main(String ar[])
// {
// Function<Integer,Integer>f1=s->
// {
// System.out.println("f1");
// return s+s;

// };
// Function<Integer,Integer>f2=s->
// {
// System.out.println("f2");
// return s*s;
// };
// Function<Integer,Integer>f3=s->
// {
// System.out.println("f3");
// return s*5;
// };
// Function<Integer,Integer>f4=s->
// {
// System.out.println("f4");
// return s+5;
// };

// System.out.println(f1.andThen(f2).compose(f3).andThen(f4).apply(10));

// }

// }

// ..............STEP-17...............

import java.util.function.Function;
// class FunctionInterfaceAndThenAndComposeMethodWorkingStep12
// {
// static public void main(String ar[])
// {
// Function<Integer,Integer>f1=s->
// {
// System.out.println("f1");
// return s+s;

// };
// Function<Integer,Integer>f2=s->
// {
// System.out.println("f2");
// return s*s;
// };
// Function<Integer,Integer>f3=s->
// {
// System.out.println("f3");
// return s*5;
// };
// Function<Integer,Integer>f4=s->
// {
// System.out.println("f4");
// return s+5;
// };

// System.out.println(f1.compose(f2).andThen(f3).compose(f4).apply(10));

// }

// }

// ..............STEP-18...............

import java.util.function.Function;
// class FunctionInterfaceAndThenAndComposeMethodWorkingStep13
// {
// static public void main(String ar[])
// {
// Function<Integer,Integer>f1=s->
// {
// System.out.println("f1");
// return s+s;

// };
// Function<Integer,Integer>f2=s->
// {
// System.out.println("f2");
// return s*s;
// };
// Function<Integer,Integer>f3=s->
// {
// System.out.println("f3");
// return s*5;
// };
// Function<Integer,Integer>f4=s->
// {
// System.out.println("f4");
// return s+5;
// };

// System.out.println(f1.andThen(f2).compose(f3).compose(f4).andThen(f1).apply(10));

// }

// }

// ..............STEP-19...............

import java.util.function.Function;
// class FunctionInterfaceAndThenMethodWorkingStep4
// {
// static public void main(String ar[])
// {
// Function<Integer,Integer>f1=s->s+s;
// Function<Integer,Integer>f2=s->s*s;

// System.out.println(f1.apply(10));
// System.out.println(f2.apply(10));
// }

// }

// ..............STEP-20...............

@FunctionalInterface
// interface Inter1<R ,T>
// {
// R apply(T t);
// }
// class FunctionInterfaceApplyMethodStep1
// {
// static public void main(String ar[])
// {
// Inter1<Integer,String>I1=s->s.length();
// System.out.println(I1.apply("ram"));
// System.out.println(I1.apply("ram ji"));
// }
// }

// ..............STEP-22...............

import java.util.function.Function;
// class FunctionInterfaceApplyMethodStep2
// {
// static public void main(String ar[])
// {
// Function<String,Integer>f1=s->s.length();
// System.out.println(f1.apply("ram"));
// System.out.println(f1.apply("ram ji"));
// }
// }

// ..............STEP-23...............

import java.util.function.Function;
// class FunctionInterfaceApplyMethodStep3
// {
// static public void main(String ar[])
// {
// Function<Integer,Integer>f1=s->s*s;
// System.out.println(f1.apply(10));
// System.out.println(f1.apply(20));
// }
// }

// ..............STEP-24...............
// ToCountSpacesInStringOrFileOrMessages

import java.util.function.Function;
// class FunctionInterfaceApplyMethodToCountSpacesInStringAndFileAndMessageStep4
// {
// static public void main(String ar[])
// {
// Function<String,Integer>f1=s->s.length()-s.replaceAll(" ","").length();
// show(f1) ;
// }
// static void show(Function<String ,Integer>f1)
// {
// String s1[]={"hello ram ji","a dd adf ","dita ji ki jai ho","hello mr sachin
// parmar"};
// for(String s:s1)
// {
// System.out.println(f1.apply(s));
// }
// }

// }

// // note why it is not working (s.replaceAll(".",""))

// ..............STEP-25...............

import java.util.function.Function;
// class FunctionInterfaceApplyMethodToRemoveSpacesInStringAndFileStep3
// { //ToRemoveSpacesInStringAndFile
// static public void main(String ar[])
// {
// Function<String,String>f1=s->s.replaceAll(" ","");
// System.out.println(f1.apply("my name is ram"));
// System.out.println(f1.apply("Hell mrsachin"));
// }
// }

// // note why it is not working (s.replaceAll(".",""))

// ..............STEP-26...............

import java.util.function.Function;
// class FunctionInterfaceComposeAndMethodWorkingStep5
// { //ComposeMethodWorking
// static public void main(String ar[])
// {
// Function<Integer,Integer>f1=s->
// {
// System.out.println("f1");
// return s+s;

// };
// Function<Integer,Integer>f2=s->
// {
// System.out.println("f2");
// return s*s;
// };
// Function<Integer,Integer>f3=s->
// {
// System.out.println("f3");
// return s*5;
// };
// Function<Integer,Integer>f4=s->
// {
// System.out.println("f4");
// return s+5;
// };

// System.out.println(f1.compose(f2).apply(10));

// }

// }

// ..............STEP-27...............
// ..............STEP-28...............
// ..............STEP-29...............
// ..............STEP-30...............
// ..............STEP-31...............
