
// ......................STEP-1..................

// interface Inter1<R>

// {
// R get();

// }
// class SupplierInterfaceStep1
// {
// public static void main(String ar[])
// {
// Inter1<String >I1=()->"Sachin Singh parmar";
// System.out.println("my name is =>"+I1.get());

// }
// }

// ......................STEP-2..................

// import java.util.function.Supplier;
// class SupplierInterfaceStep2
// {
// public static void main(String ar[])
// {
// Supplier<String >S1=()->"ram singh ji";
// System.out.println("my name is =>"+S1.get());

// }
// }

// ......................STEP-3..................
// import java.util.function.Supplier;
// class SupplierInterfaceStep3
// {
// public static void main(String ar[])
// {
// Supplier<String >i=()->"ram";
// System.out.println("My name is "+i.get());
// }
// }

// .....................STEP-4..............

// import java.util.function.Supplier;
// @FunctionalInterface
// interface Inter1<T>
// {
// void show(T t);
// }
// class SupplierInterfaceStep4
// {
// public static void main(String ar[])
// {
// String s[]={"aaa","bbb","ccc","ddd","eee","fff"};
// Inter1<String[]>i=a->
// {
// for(String s1:a)
// System.out.println(s1);
// };
// i.show(s);
// }
// }
//

// ................convert above example in Consumer interface...........

// import java.util.function.Consumer;
// class SupplierInterfaceStep4
// {
// public static void main(String ar[])
// {

// String s1[]={"aaa","vvv","ddd","ssss"};
// Consumer<String[]>i=a->
// {
// for(String s:a)
// System.out.println(s);
// };
// i.accept(s1);
// }
