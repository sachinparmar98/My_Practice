// ...................EXAMPLE-1...................
// class ExceptionClass {
// public static void main(String... args) {
// System.out.println("swt1");
// try {
// System.out.println(10 / 0);
// } catch (ArithmeticException e) {
// e = new ArithmeticException();
// System.out.println(e.getMessage());

// }
// System.out.println("swt4");

// }

// }

// ...................EXAMPLE-2...................
// class InvalidAgeException extends RuntimeException
// {

// InvalidAgeException() {

// }

// InvalidAgeException(String s) {
// super(s);
// }
// }

// ...................EXAMPLE-3...................

// class ExceptionClass {
// public static void main(String ar[]) {
// int age = Integer.parseInt(ar[0]);
// if (age < 18) {
// InvalidAgeException iae = new InvalidAgeException("invlaid age is="+age);
// throw iae;
// } else {
// System.out.println("welcome");
// }
// }
// }

// ...................EXAMPLE-4...................

// ................STEP-1....................

// class ExceptionClass {
// public static void main(String[] ar) {
// System.out.println("softwaves 1");
// int x = Integer.parseInt(ar[0]);
// System.out.println("softwaves 2");
// int y = Integer.parseInt(ar[1]);
// System.out.println("softwaves 3");
// System.out.println(x / y);
// System.out.println("softwaves 4");
// }
// }

// ...............STEP-2................

// class ExceptionClass {
// public static void main(String[] ar) {
// int x = Integer.parseInt(ar[0]);
// int y = Integer.parseInt(ar[1]);
// try{
// System.out.println(x / y);

// }System.out.println("softwaves");
// }
// }

// ...............STEP-3.................

// class ExceptionClass {
// public static void main(String[] ar) {

// int x = Integer.parseInt(ar[0]);
// int y = Integer.parseInt(ar[1]);
// try {
// System.out.println(x / y);
// } catch (ArithmeticException e) {
// System.out.println("hii sachin");
// }
// System.out.println("1000 line code");
// }
// }

// ...................EXAMPLE-5...................

// ...................EXAMPLE-6...................
// ...................EXAMPLE-7...................
// ...................EXAMPLE-8...................
// ...................EXAMPLE-9...................