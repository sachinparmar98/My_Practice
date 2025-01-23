// ...............STEP-1..........

// interface Inter1<T>
// {
// void show(T t);
// }
// class ConsumerInterface
// {
// public static void main(String ar[])
// {
// Inter1<String >I1=a->System.out.println("my name is =>"+a);
// I1.show("ram");
// I1.show("sita");
// }
// }

// .........STEP-2................

// import java.util.function.Consumer;
// class ConsumerInterface
// {
// public static void main(String ar[])
// {
// Consumer<String >C1=a->System.out.println("my name is =>"+a);
// C1.accept("ram");
// C1.accept("sita ji");
// }
// }