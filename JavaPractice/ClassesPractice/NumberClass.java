// class NumberClass
// {
// public static void main (String ...ar)
// {
// Number x[]={10,20,30,40,50,10.8};
// for(Number i:x)
// {
// System.out.print(i+" ");
// }

// }
// }

// ....................................
// class NumberClass
// {
// public static void main (String ...ar)
// {
// //Object x[]={10,20,30,40,50,false};
// //Object x[]={10,20,30,40,50,"ram"};
// Object x[]={10,20,30,40,50,'a'};
// for(Object i:x)
// {
// System.out.print(i+" ");
// }

// }
// }

// /*
// All worked

// */

// .............................
// class NumberClass {
// public static void main(String... ar) {
// Number x[] = { 10, 20, 30, 40, 50, false };
// Number x1[] = { 10, 20, 30, 40, 50, 'A' };
// Number x2[] = { 10, 20, 30, 40, 50, "ram" };
// for (Number i : x) {
// System.out.print(i + " ");
// }

// }
// }

// /*
// * NumberClass2.java:5: error: incompatible types: boolean cannot be
// * converted to Number
// * Number x[]={10,20,30,40,50,false};
// * ^
// * NumberClass2.java:6: error: incompatible types: char cannot be
// * converted to Number
// * Number x1[]={10,20,30,40,50,'A'};
// * ^
// * NumberClass2.java:7: error: incompatible types: String cannot be
// * converted to Number
// * Number x2[]={10,20,30,40,50,"ram"};
// * ^
// * 3 errors
// *
// *
// * see example NumberClass3 for above error soution
// */
