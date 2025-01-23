/*
 * Object class all 12 method working with example step by step
 */
// *******************toString() method******************* */
// ...........Step-1............
// class ObjectClass
// {
// public static void main (String ar[])
// {
// String s1=new String("ram");
// System.out.println(s1);

// }
// }

/*
 * out put
 * ram
 * 
 * String class na toString method ko override ker rakha ha
 * 
 * all wraper class na toString method ko override kiya ha
 * 
 * //...........Step-2............
 * 
 * class ObjectClass
 * // {
 * // public static void main(String ar[])
 * // {
 * // String s1="ram";
 * // String s2="ram";
 * 
 * // System.out.println(s1==s2);
 * // System.out.println(s1.equals(s2));
 * 
 * // }
 * // }
 * 
 * // /*
 * // true
 * // true
 * //
 */

// ...........Step-3............

// class ObjectClass
// {
// public static void main(String ar[])
// {
// String s1=new String("ram");
// String s2=new String("ram");

// System.out.println(s1==s2);
// System.out.println(s1.equals(s2));

// }
// }

// /*
// false
// true
// */

// ...........Step-4............

// class ObjectClass {

// }

// class toS {
// public static void main(String ar[]) {
// Employe e1 = new Employe();
// System.out.println(e1);
// System.out.println(e1.getClass());
// System.out.println(e1.getClass().getName());
// }

// }
// // toS means toString() mdethod of Object class

// ...........Step-5............

// class Employe {
// }
// class ObjectClass {
// public static void main(String ar[]) {
// Employe e1 = new Employe();
// System.out.println(e1);
// System.out.println(e1.toString());
// }

// }

// ...........Step-6............

// Object class toString methode is public
// class Employe {
// String toString() {
// return "ram";
// }
// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe e1 = new Employe();
// System.out.println(e1);
// System.out.println(e1.toString());
// }

// }
// /*
// * error: toString() in Employe cannot override toString() in Object
// * String toString() {
// * ^
// * attempting to assign weaker access privileges; was public
// */
// ...........Step-7............

// class Employe {
// public String toString() {
// return "ram";
// }
// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe e1 = new Employe();
// System.out.println(e1);
// System.out.println(e1.toString());
// }

// }
// /*
// * ram
// * ram
// */
// ...........Step-8............

// class Employe {
// int id;
// String add;

// Employe(int id, String add) {
// this.id = id;
// this.add = add;
// }
// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe ram = new Employe(101, "indore");
// Employe sita = new Employe(102, "bhopal");
// System.out.println(ram);
// System.out.println(sita);
// }
// }

// ...........Step-9............

// class Employe {
// int id;
// String add;

// Employe(int id, String add) {
// this.id = id;
// this.add = add;
// }

// public String toString() {
// return "id=" + id + "\t add=" + add;
// }
// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe ram = new Employe(101, "indore");
// Employe sita = new Employe(102, "bhopal");
// System.out.println(ram);
// System.out.println(sita);
// }
// }

// ...........Step-10............

// class Employe {
// int id;String name;
// Employe(int id,String name)
// {

// this.id=id;
// this.name=name;
// }
// public String toString()
// {
// return getClass();
// }

// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe e1 = new Employe(101,"aaa");
// Employe e2 = new Employe(102,"bbb");

// System.out.println(e1);
// System.out.println(e2);

// }
// }
// /* because toString method ka return type String ha or us ma hum return
// getClass method ker wa raha
// ha jo possible nahi ha kyoki getClass mehthod ka return type Class ha there
// for error is occur

// out put==
// toS7.java:11: error: incompatible types: Class<CAP#1> cannot be converted to
// String
// return getClass();
// ^
// where CAP#1 is a fresh type-variable:
// CAP#1 extends Employe from capture of ? extends Employe
// 1 error

// */
// ...........Step-11............

// class Employe {
// int id;String name;
// Employe(int id,String name)
// {

// this.id=id;
// this.name=name;
// }
// public String toString()
// {
// return getClass() .getName();
// }

// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe e1 = new Employe(101,"aaa");
// Employe e2 = new Employe(102,"bbb");

// System.out.println(e1);
// System.out.println(e2);

// }
// }
// /*
// jo get class method na class Employe return kiya usa get name method na sirf
// Employe ko rakha jo
// String ka form ma ha to koi problem nahi hogi
// out put==
// Employe
// Employe

// hii am sachin parmar
// */

// ...........Step-12............

// class Employe {
// int id;String name;
// Employe(int id,String name)
// {

// this.id=id;
// this.name=name;
// }
// public String toString()
// {
// return getClass().getName()+"@";
// }

// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe e1 = new Employe(101,"aaa");
// Employe e2 = new Employe(102,"bbb");

// System.out.println(e1);
// System.out.println(e2);

// }
// }
// /*
// out put==
// Employe@
// Employe@

// */

// ...........Step-13............

// class Employe {
// int id;String name;
// Employe(int id,String name)
// {

// this.id=id;
// this.name=name;
// }
// public String toString()
// {
// return int;
// }

// }

// class ObjectClass
// {
// public static void main(String ar[]) {
// Employe e1 = new Employe(101,"aaa");
// Employe e2 = new Employe(102,"bbb");

// System.out.println(e1);
// System.out.println(e2);

// }
// }
// /*
// out put==
// class Employe {
// int id;String name;
// Employe(int id,String name)
// {

// this.id=id;
// this.name=name;
// }
// public String toString()
// {
// return getClass().getName()+"@";
// }

// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe e1 = new Employe(101,"aaa");
// Employe e2 = new Employe(102,"bbb");

// System.out.println(e1);
// System.out.println(e2);

// }
// }
// /*
// out put==

// toS_10.java:11: error: '.class' expected
// return int;
// ^
// */

// ...........Step-14............

// class Employe {
// int id;String name;
// Employe(int id,String name)
// {

// this.id=id;
// this.name=name;
// }
// public String toString()
// {
// return "";
// }

// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe e1 = new Employe(101,"aaa");
// Employe e2 = new Employe(102,"bbb");

// System.out.println(e1);
// System.out.println(e2);

// }
// }
// /*
// out put==

// blank screen
// */

// ...........Step-15............

// class Employe
// {
// int id;
// String name;
// Employe(int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public String toString()
// {

// return getClass().getName()+"@"+Integer.toHexString(hashCode());
// }

// }
// class ObjectClass
// {
// public static void main (String ar[])
// {
// Employe e1=new Employe(101,"aaa");
// System.out.println(e1);

// }
// }

// /* output ==
// Employe@7852e922

// note== \\Object class ki toString method internally below type likhi has

// public String toString()
// {

// return getClass().getName()+"@"+Integer.toHexString(hashCode());
// }

// */
// ...........Step-16............

// class Employe
// {
// int id;
// String name;

// Employe (int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public String toString()
// {

// return "id="+id+"\t name="+name;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])

// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(101,"bbb");
// Employe e3=new Employe(101,"aaa");

// System.out.println(e1==e2);
// System.out.println(e1==e3);
// System.out.println(e1.equals(e2));
// System.out.println(e1.equals(e3));
// }
// }

// /*
// false
// false
// false
// false
// */

// ...........Step-17............

// class Employe
// {
// int id;
// String name;

// Employe (int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public String toString()
// {

// return "id="+id+"\t name="+name;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])

// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(101,"bbb");
// Employe e3=new Employe(101,"aaa");
// Employe e4=e1;

// System.out.println(e1==e2);
// System.out.println(e1==e3);
// System.out.println(e1==e4);
// System.out.println(e1.equals(e2));
// System.out.println(e1.equals(e3));
// System.out.println(e1.equals(e4));
// }
// }

// /*
// false
// false
// true
// false
// false
// true
// */

// ...........Step-18............
// ...........toString() and hashCode()...........
// class Employe {
// int id;String name;
// Employe(int id,String name)
// {

// this.id=id;
// this.name=name;
// }
// public String toString()
// {
// return name;
// }
// public int hashCode()
// {
// return id;
// }
// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe e1 = new Employe(101,"aaa");
// Employe e2 = new Employe(102,"bbb");

// System.out.println(e1);
// System.out.println(e2);
// System.out.println(e1.hashCode());
// System.out.println(e2.hashCode());
// }
// }
// /* dono method employe class ma hi mil jana per employe class ki call hogi

// out put==
// aaa
// bbb
// 101
// 102

// */
// ...........Step-19............

// ......toString() and hashCode().........

// class Employe {
// int id;String name;
// Employe(int id,String name)
// {

// this.id=id;
// this.name=name;
// }
// public String toString()
// {
// return getClass().getName()+"@"+hashCode();
// }
// public int hashCode()
// {
// return id;
// }

// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe e1 = new Employe(101,"aaa");
// Employe e2 = new Employe(102,"bbb");

// System.out.println(e1);
// System.out.println(e2);

// }
// }
// /*
// out put==
// Employe@101
// Employe@102

// */

// ...........Step-20............

// *******************hashCode() method******************* */
// ........STEP-1........
// public class A {
// public String toString() {
// return "ram";
// }
// }

// public class ObjectClass {
// public static void main(String ar[]) {
// A a1 = new A();
// System.out.println(a1);
// System.out.println(a1.toString());
// }
// }
// /*
// * error: reached end of file while parsing
// * If2PublicClassInFile
// * ^
// *
// *
// *
// * solution == dono ko public declare nhi ker sakta ha
// */

// ........STEP-2........

// class Employe {

// }

// class HAS_CODE {
// public static void main(String ar[]) {
// Employe ram = new Employe();
// Employe sita = new Employe();
// System.out.println(ram);
// System.out.println(sita);
// }
// }
// // HEAXA DECIMAL NUMBER KO HE hashCode kahta ha

// ........STEP-3........
// class Employe {

// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe ram = new Employe();
// Employe sita = new Employe();
// System.out.println(ram);
// System.out.println(sita.hashCode());
// }
// }
// // HEAXA DECIMAL NUMBER KO HE hashCode kahta ha
// // return type of hashCode() is decimal

// ........STEP-4........

// class Employe {

// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe e1 = new Employe();
// System.out.println(e1);
// System.out.println(e1.hashCode());
// System.out.println(Integer.toHexString(e1.hashCode()));
// System.out.printf("%x\n", e1.hashCode());
// }
// }
// // HEAXA DECIMAL NUMBER KO HE hashCode kahta ha
// // return type of hashCode() is decimal

// ........STEP-5........// class Employe // class Employe // class Employe //
// class Employe // class Employe // class Employe // class Employe // class
// Employe // public int hashCode() // return 100// // // class ObjectClass //
// public static void main(String ar[]) // Employe e1 = new Employe()// Employe
// e2 = new Employe()// System.out.println(e1)// System.out.println(e2)// // }
/*
 * 1.HEAXA DECIMAL NUMBER KO HE hashCode kahta ha
 * 2.return type of hashCode() is int
 * 
 * 
 * 3.this time employe class hashCode method is called because object e1 and e2
 * is
 * employe class and employe class have its hashCode methode .
 * 
 * output==>
 * Employe@64
 * Employe@64
 */

// ........STEP-6........
// class Employe {
// int id;String name;
// Employe(int id)
// {

// this.id=id;
// this.name=name;
// }
// public int hashCode()
// {
// return id;
// }
// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe e1 = new Employe(101);
// Employe e2 = new Employe(102);

// System.out.println(e1);
// System.out.println(e2);
// System.out.println(e1.hashCode());
// System.out.println(e2.hashCode());
// }
// }
// /* e1 ko print ker raha ha too toString method call ho rahi ha or uska pass
// employe class ki
// hashCode method id ko return ker rahi ha or object class ki tostring mehod us
// id ko hexadecimal no.
// ka form ma print ker rahi ha

// out put==
// Employe@65
// Employe@66
// 101
// 102

// */

// ........STEP-7........

// class Employe {
// int id;String name;
// Employe(int id,String name)
// {

// this.id=id;
// this.name=name;
// }

// public int hashCode()
// {
// return id;
// }

// }

// class ObjectClass {
// public static void main(String ar[]) {
// Employe e1 = new Employe(101,"aaa");
// Employe e2 = new Employe(102,"bbb");

// System.out.println(e1);
// System.out.println(e2);

// }
// }
// /*
// out put==
// Employe@65
// Employe@66

// */

// ........STEP-8........
// ........STEP-9........

// *************equals() method**************** */
// .......STEP-0.........

// class Employe
// {
// int id;
// String name;
// Employe(int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {
// Employe e= (Employe)o;
// if(id==e.id)
// return true;
// else
// return false;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])
// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(102,"bbb");
// Employe e3=new Employe(101,"ccc");
// Employe e4=e1;
// System.out.println(e1==e2);
// System.out.println(e1==e3);
// System.out.println(e1==e4);
// System.out.println(e1.equals(e2));
// System.out.println(e1.equals(e3));
// System.out.println(e1.equals(e4));
// }
// }

// /*
// false
// false
// true
// false
// true
// true

// note== line 12 per type casting ho jay gi kyo ki o ka pass employe class ka
// object hi ha
// */
// .........STEP-1...............
// class Employe
// {
// int id;
// String name;
// Employe(int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {
// if(id==o.id)
// return true;
// else
// return false;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])
// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(102,"bbb");
// Employe e3=new Employe(101,"ccc");
// Employe e4=e1;
// System.out.println(e1==e2);
// System.out.println(e1==e3);
// System.out.println(e1==e4);
// System.out.println(e1.equals(e2));
// System.out.println(e1.equals(e3));
// System.out.println(e1.equals(e4));
// }
// }

// /*
// EQUALS_METHOD_0.java:12: error: cannot find symbol
// if(id==o.id)
// ^
// symbol: variable id
// location: variable o of type Object

// */

// .........STEP-2...............

// class Employe
// {
// int id;
// String name;
// Employe(int id,String name)

// {

// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {
// Employe e=(Employe)o;
// if(id==e.id && name.equals(e.name))
// return true;
// else
// return false;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])
// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(102,"bbb");
// Employe e3=new Employe(101,"aaa");
// Employe e4=e1;
// System.out.println(e1.equals(e2));
// }
// }

// //out put= true

// .........STEP-3...............

// class Employe
// {
// int id;
// String name;
// Employe(int id,String name)

// {

// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {
// Employe e=(Employe)o;
// if(id==e.id && name.equals(e.name))
// return true;
// else
// return false;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])
// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(102,"bbb");
// Employe e3=new Employe(101,"ccc");
// Employe e4=e1;
// System.out.println(e1==e2);
// System.out.println(e1==e3);
// System.out.println(e1==e4);
// System.out.println(e1.equals("aaa"));
// System.out.println(e1.equals(e3));
// System.out.println(e1.equals(e4));
// }
// }

// /*false
// false
// true
// Exception in thread "main" java.lang.ClassCastException: java.lang.String
// cannot be cast to Employe
// at Employe.equals(EQUALS_METHOD1.java:14)
// at EQUALS_METHOD1.main(EQUALS_METHOD1.java:32)

// note= because employe class ka refrence varible e String class ka object hold
// nhi kera
// sakta ha

// */

// .........STEP-4...............

// class Employe
// {
// int id;
// String name;
// Employe(int id,String name)

// {

// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {
// Employe e=(Employe)o;
// if(id==e.id && name.equals(e.name))
// return true;
// else
// return false;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])
// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(102,"bbb");
// Employe e3=new Employe(101,"ccc");
// Employe e4=e1;
// System.out.println(e1==e2);
// System.out.println(e1==e3);
// System.out.println(e1==e4);
// System.out.println(e1.equals(101));
// // System.out.println(e1.equals(e3));
// // System.out.println(e1.equals(e4));
// }
// }

// /*
// false
// false
// true
// Exception in thread "main" java.lang.ClassCastException: java.lang.Integer
// cannot be cast to Employe
// at Employe.equals(EQUALS_METHOD2.java:14)
// at EQUALS_METHOD2.main(EQUALS_METHOD2.java:32)

// */
// .........STEP-5...............

// class Employe
// {
// int id;
// String name;
// Employe(int id,String name)

// {

// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {
// Employe e=(Employe)o;
// if(id==e.id && name.equals(e.name))
// return true;
// else
// return false;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])
// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(102,"bbb");
// Employe e3=new Employe(101,"ccc");
// Employe e4=e1;
// System.out.println(e1==e2);
// System.out.println(e1==e3);
// System.out.println(e1==e4);
// System.out.println(e1.equals(null));
// // System.out.println(e1.equals(e3));
// // System.out.println(e1.equals(e4));
// }
// }

// /*
// false
// false
// true
// Exception in thread "main" java.lang.NullPointerException
// at Employe.equals(EQUALS_METHOD3.java:15)
// at EQUALS_METHOD3.main(EQUALS_METHOD3.java:32)

// note== e.id is point per exception aygi kyoki e ma null ayga or null sa hum
// id ko acess keraga too
// exception aygi.

// */

// .........STEP-6...............
// class Employe
// {
// int id;
// String name;

// Employe (int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {

// return true;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])

// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(101,"bbb");
// Employe e3=new Employe(101,"aaa");
// Employe e4=e1;

// System.out.println(e1==e2);
// System.out.println(e1==e3);
// System.out.println(e1==e4);
// System.out.println(e1.equals(e2));
// System.out.println(e1.equals(e3));
// System.out.println(e1.equals(e4));
// }
// }

// /*
// false
// false
// true
// true
// true
// true
// */

// .........STEP-7...............
// class Employe
// {
// int id;
// String name;

// Employe (int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {
// if(id==o.id)
// return true;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])

// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(101,"bbb");
// Employe e3=new Employe(101,"aaa");
// Employe e4=e1;

// System.out.println(e1==e2);
// System.out.println(e1==e3);
// System.out.println(e1==e4);
// System.out.println(e1.equals(e2));
// System.out.println(e1.equals(e3));
// System.out.println(e1.equals(e4));
// }
// }

// /*
// error: cannot find symbol
// if(id==o.id)
// ^
// symbol: variable id
// location: variable o of type Object
// */

// .........STEP-8...............
// class Employe
// {
// int id;
// String name;

// Employe (int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {
// Employe e=(Employe)o;
// if(id==e.id)
// return true;
// else
// return false;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])

// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(102,"bbb");
// Employe e3=new Employe(101,"aaa");
// Employe e4=e1;

// System.out.println(e1==e2);
// System.out.println(e1==e3);
// System.out.println(e1==e4);
// System.out.println(e1.equals(e2));
// System.out.println(e1.equals(e3));
// System.out.println(e1.equals(e4));
// }
// }

// /*
// false
// false
// true
// false
// true
// true
// */

// .........STEP-9...............

// class Employe
// {
// int id;
// String name;

// Employe (int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {
// Employe e=(Employe)o;
// if(id==e.id && name.equals(e.name))
// return true;
// else
// return false;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])

// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(102,"bbb");
// Employe e3=new Employe(101,"ccc");
// Employe e4=e1;

// System.out.println(e1==e2);
// System.out.println(e1==e3);
// System.out.println(e1==e4);
// System.out.println(e1.equals(e2));
// System.out.println(e1.equals(e3));
// System.out.println(e1.equals(e4));
// }
// }

// /*
// false
// false
// true
// false
// false
// true

// */
// class Employe
// {
// int id;
// String name;

// Employe (int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {
// Employe e=(Employe)o;
// if(id==e.id && name.equals(e.name))
// return true;
// else
// return false;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])

// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(102,"bbb");
// Employe e3=new Employe(101,"ccc");
// Employe e4=e1;

// System.out.println(e1.equals("aaa"));

// }
// }

// /*
// Exception in thread "main" java.lang.ClassCastException: java.lang.String
// cannot be cast to Employe
// at Employe.equals(EQUALS_METHOD_8.java:13)
// at EQUALS_METHOD_8.main(EQUALS_METHOD_8.java:30)

// */

// .........STEP-10...............

// class Employe
// {
// int id;
// String name;

// Employe (int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {
// Employe e=(Employe)o;
// if(id==e.id && name.equals(e.name))
// return true;
// else
// return false;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])

// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(102,"bbb");
// Employe e3=new Employe(101,"ccc");
// Employe e4=e1;

// System.out.println(e1.equals(101));

// }
// }

// /*
// Exception in thread "main" java.lang.ClassCastException: java.lang.Integer
// cannot be cast to Employe
// at Employe.equals(EQUALS_METHOD_9.java:13)
// at EQUALS_METHOD_9.main(EQUALS_METHOD_9.java:30)

// */

// .........STEP-11...............
// class Employe
// {
// int id;
// String name;

// Employe (int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {
// Employe e=(Employe)o;
// if(id==e.id && name.equals(e.name))
// return true;
// else
// return false;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])

// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(102,"bbb");
// Employe e3=new Employe(101,"ccc");
// Employe e4=e1;

// System.out.println(e1.equals(null));

// }
// }

// /*
// Exception in thread "main" java.lang.NullPointerException
// at Employe.equals(EQUALS_METHOD_10.java:14)
// at EQUALS_METHOD_10.main(EQUALS_METHOD_10.java:30)

// */

// .........STEP-12...............

// class Employe
// {
// int id;
// String name;

// Employe (int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public boolean equals(Object o)
// {
// if(o instanceof Employe)
// {
// System.out.println("yes");
// Employe e=(Employe)o;
// if(id==e.id && name.equals(e.name))
// return true;
// else
// return false;
// }
// else
// {
// return false;
// }
// }}
// class ObjectClass
// {
// public static void main(String ar[])

// {
// Employe e1=new Employe(101,"aaa");
// Employe e2=new Employe(102,"bbb");
// Employe e3=new Employe(101,"ccc");
// Employe e4=e1;

// System.out.println(e1.equals(101));

// }
// }

// .........STEP-13...............

// class Employe {
// int id;
// String name;

// Employe(int id, String name) {
// this.id = id;
// this.name = name;
// }

// public boolean equals(Object o) {
// try {
// if (o instanceof Employe) {
// System.out.println("yes1");
// }
// } catch (Exception e) {
// System.out.println(e);
// }
// // {
// System.out.println("yes");
// Employe e = (Employe) o;
// if (id == e.id && name.equals(e.name))
// return true;
// else
// return false;

// // else
// // {
// // return false;
// // }
// }
// }

// class ObjectClass {
// public static void main(String ar[])

// {
// Employe e1 = new Employe(101, "aaa");
// Employe e2 = new Employe(102, "bbb");
// Employe e3 = new Employe(101, "ccc");
// Employe e4 = e1;

// System.out.println(e1.equals(101));

// }
// }

// .........STEP-14...............

// class Employe {
// int id;

// String name;

// Employe(int id, String name) {
// this.id = id;
// this.name = name;
// }

// public boolean equals(Object o) {
// if (this == o) {

// return true;

// }
// if (o instanceof Employe) {

// Employe e = (Employe) o;

// if (id == e.id && name.equals(e.name))

// {

// return true;

// } else

// {

// return false;
// }
// } else {

// return false;
// }
// }
// }

// class ObjectClass {
// public static void main(String ar[])

// {
// Employe e1 = new Employe(101, "aaa");
// Employe e2 = new Employe(102, "bbb");
// Employe e3 = new Employe(101, "ccc");
// Employe e4 = e1;

// System.out.println(e1 == e2);
// System.out.println(e1 == e3);
// System.out.println(e1 == e4);

// System.out.println(e1.equals(e2));
// System.out.println(e1.equals(e3));
// System.out.println(e1.equals(e4));

// System.out.println(e1.equals("aaa"));
// System.out.println(e1.equals(101));
// System.out.println(e1.equals(null));

// }
// }

// .........STEP-15...............

// class Employe {
// int id;

// String name;

// Employe(int id, String name) {
// this.id = id;
// this.name = name;
// }

// public boolean equals(Object o) {
// if (this == o) {
// System.out.println("this block");
// return true;

// }
// if (o instanceof Employe) {
// System.out.println("instanceof");
// Employe e = (Employe) o;
// System.out.println("type casting");
// if (id == e.id && name.equals(e.name))

// {
// System.out.println("id== code exexcute");
// return true;

// } else

// {
// System.out.println("id ==code else execute");
// return false;
// }
// } else {
// System.out.println("istancceof else execute");
// return false;
// }
// }
// }

// class ObjectClass {
// public static void main(String ar[])

// {
// Employe e1 = new Employe(101, "aaa");
// Employe e2 = new Employe(102, "bbb");
// Employe e3 = new Employe(101, "ccc");
// Employe e4 = e1;

// // System.out.println(e1 == e2);
// // System.out.println(e1 == e3);
// // System.out.println(e1 == e4);

// // System.out.println(e1.equals(e2));
// // System.out.println(e1.equals(e3));
// // System.out.println(e1.equals(e4));

// System.out.println(e1.equals("aaa"));
// // System.out.println(e1.equals(101));
// // System.out.println(e1.equals(null));

// }
// }

// .........STEP-16...............

// class ObjectClass {
// public static void main(String ar[])

// {

// String s1=new String("ram");
// StringBuffer s2=new StringBuffer("ram");
// System.out.println(s1==s2);

// }
// }

// /*
// op
// EQUALS_METHOD19Equal_EqualOperator.java:9: error: incomparable types: String
// and StringBuffer
// System.out.println(s1==s2);
// ^
// 1 error
// */

// .........STEP-17...............

// Source code is decompiled from a .class file using FernFlower decompiler.
// class ObjectClass {
// EQUALS_METHOD20Equal_EqualOperator() {
// }

// public static void main(String[] var0) {
// String var1 = new String("ram");
// StringBuffer var2 = new StringBuffer("ram");
// System.out.println(var1 == var2);
// }
// }

// .........STEP-18...............

// class ObjectClass {
// public static void main(String ar[])

// {

// Object s1=new String("ram");
// Object s2=null;
// System.out.println("yes ");
// System.out.println(s1==s2);

// }
// }

// /*
// op=>
// yes
// false
// */
// .........STEP-19...............

// class Employe {
// int id;

// String name;

// Employe(int id, String name) {
// this.id = id;
// this.name = name;
// }

// public boolean equals(Object o) {
// return (this==o);
// }
// }

// class ObjectClass {
// public static void main(String ar[])

// {
// Employe e1 = new Employe(101, "aaa");
// Employe e2 = new Employe(102, "bbb");
// Employe e3 = new Employe(101, "aaa");
// Employe e4 = e1;

// System.out.println(e1 == e2);
// System.out.println(e1 == e3);
// System.out.println(e1 == e4);

// System.out.println(e1.equals(e2));
// System.out.println(e1.equals(e3));
// System.out.println(e1.equals(e4));

// System.out.println(e1.equals("aaa"));
// System.out.println(e1.equals(101));
// System.out.println(e1.equals(null));

// }
// }

// .........STEP-20...............

// class ObjectClass {
// public static void main(String ar[])

// {

// }

// //equal methos inside Object class writen like bellow

// /*
// public boolean equals(Object obj)
// {
// return (this==obj);k
// }
// */
// .........STEP-21...............
// .........STEP-22...............
// *****************clone() method */
// .........STEP-1...............

// class A {
// int x, y;

// void get(int x, int y) {
// this.x = x;
// this.y = y;
// }

// void show() {
// System.out.println("x=" + x);
// System.out.println("y=" + y);
// }
// }

// class ObjectClass{
// public static void main(String ar[]) {
// A a1 = new A();
// A a2 = new A();
// a1.get(10, 20);
// a2.show();
// }
// }

// .........STEP-2...............

// class A {
// int x, y;

// void get(int x, int y) {
// this.x = x;
// this.y = y;
// }

// void show() {
// System.out.println("x=" + x);
// System.out.println("y=" + y);
// }
// }

// class ObjectClass {
// public static void main(String ar[]) {
// A a1 = new A();
// a1.get(10, 20);
// A a2=a1;
// a1.show();
// a2.show();
// }
// }

// .........STEP-3...............

// class A {
// int x, y;

// void get(int x, int y) {
// this.x = x;
// this.y = y;
// }

// void show() {
// System.out.println("x=" + x);
// System.out.println("y=" + y);
// }
// }

// class ObjectClass{
// public static void main(String ar[]) {
// A a1 = new A();
// a1.get(10, 20);
// A a2=a1;
// a2.x=55;
// a1.show();
// a2.show();
// }
// }
// .........STEP-4...............

// class B
// {
// int i=10;
// }
// class A
// {
// int j=20;
// B b=new B();
// }
// class ObjectClass
// {
// public static void main(String ar[])
// {
// A a1=new A();
// System.out.println("i="+a1.b.i);
// System.out.println("j="+a1.j);
// }
// }

// .........STEP-5...............

// class B
// {
// int i;
// B(int i)
// {
// this.i=i;
// }
// }
// class A
// {
// int j;
// int k;
// B b;
// A(int j,int k,B b)
// {
// this.j=j;
// this.k=k;
// this.b=b;
// }
// void show()
// {
// System.out.println("i="+b.i);
// System.out.println("j="+j);
// System.out.println("k="+k);

// }
// }
// class ObjectClass
// {
// public static void main(String ar[])
// {
// B b1=new B(10);
// A a1=new A(40,20,b1);
// a1.show();
// }
// }

// .........STEP-6...............

// Clone Method Cloneing Of Object In Same Class

// class ObjectClass implements Cloneable
// {
// int x, y;

// void get(int x, int y) {
// this.x = x;
// this.y = y;
// }

// void show() {
// System.out.println("x=" + x);
// System.out.println("y=" + y);
// }

// public static void main(String ar[])throws CloneNotSupportedException {
// CloneMethodCloneingOfObjectInSameClass c1=new
// CloneMethodCloneingOfObjectInSameClass();
// c1.get(20,30);
// CloneMethodCloneingOfObjectInSameClass
// c2=(CloneMethodCloneingOfObjectInSameClass)c1.clone();
// c2.x=65;
// c1.show();
// c2.show();
// }
// }
// .........STEP-7...............

// Clone Method Clone Object Of One Class In Other Class
// class A implements Cloneable
// {
// int x, y;

// void get(int x, int y) {
// this.x = x;
// this.y = y;
// }

// void show() {
// System.out.println("x=" + x);
// System.out.println("y=" + y);
// }
// public Object clone() throws CloneNotSupportedException
// {
// return super.clone();
// }
// }

// class ObjectClass {
// public static void main(String ar[])throws CloneNotSupportedException {
// A a1 = new A();
// a1.get(10, 20);
// A a2=(A)a1.clone();
// a2.x=55;
// a1.show();
// a2.show();
// }
// }
// .........STEP-8...............
// deep cloning example
// Deep cloning means user defind cloneing
// class B
// {
// int i;
// B(int i)
// {
// this.i=i;
// }
// }
// class A implements Cloneable
// {

// int j,k;
// B b;
// A(int j,int k,B b)
// {

// this.j=j;
// this.k=k;
// this.b=b;
// }

// void show()
// {
// System.out.println(b.i);
// System.out.println(j);
// System.out.println(k);
// }

// public Object clone()throws CloneNotSupportedException
// {
// B b2=new B(b.i);
// A a5=new A(j,k,b2);
// return a5;
// }
// }
// class cloneMethodDeepCloningConcept
// {
// public static void main(String ar[])throws CloneNotSupportedException
// {
// B b1=new B(10);
// A a1=new A(20,30,b1);
// A a2=(A)a1.clone();
// a1.show();
// System.out.println(".................");
// a2.show();
// System.out.println(".................");

// a2.b.i=555;
// a2.j=666;
// a1.show();
// System.out.println(".................");
// a2.show();
// System.out.println(".................");

// }
// }

// ..........STEP-9............
// DEEP CLONING EXAMPLE
// Deep cloning means user defind cloneing
// class B
// {
// int i;
// B(int i)
// {
// this.i=i;
// }
// }
// class A implements Cloneable
// {

// int j,k;
// B b;
// A(int j,int k,B b)
// {

// this.j=j;
// this.k=k;
// this.b=b;
// }

// void show()
// {
// System.out.println(b.i);
// System.out.println(j);
// System.out.println(k);
// }

// public Object clone()throws CloneNotSupportedException
// {
// B b2=new B(b.i);
// A a5=new A(j,k,b2);
// return a5;
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])throws CloneNotSupportedException
// {
// B b1=new B(10);
// A a1=new A(20,30,b1);
// A a2=(A)a1.clone();
// a1.show();
// System.out.println(".................");
// a2.show();
// System.out.println(".................");

// a2.b.i=555;
// a2.j=666;
// a1.show();
// System.out.println(".................");
// a2.show();
// System.out.println(".................");

// A a3=(A)a1.clone();
// a3.b.i=777;
// a3.j=888;
// a1.show();
// System.out.println(".................");
// a2.show();
// System.out.println(".................");
// a3.show();
// System.out.println(".................");
// }
// }

// .........STEP-10...............
// SHALLOW CLONING
// class B
// {
// int i;
// B(int i)
// {
// this.i=i;
// }
// }
// class A implements Cloneable
// {

// int j,k;
// B b;
// A(int j,int k,B b)
// {

// this.j=j;
// this.k=k;
// this.b=b;
// }

// void show()
// {
// System.out.println(b.i);
// System.out.println(j);
// System.out.println(k);
// }

// public Object clone()throws CloneNotSupportedException
// {
// return super.clone();
// }
// }
// class ObjectClass
// {
// public static void main(String ar[])throws CloneNotSupportedException
// {
// B b1=new B(10);
// A a1=new A(20,30,b1);
// A a2=(A)a1.clone();
// a1.show();
// System.out.println(".................");
// a2.show();
// System.out.println(".................");

// a2.b.i=555;
// a2.j=666;
// a1.show();
// System.out.println(".................");
// a2.show();
// System.out.println(".................");

// }
// }

// ****************finalize() method */
// .........STEP-1...........
// finalize call by JVM IT SELF OUT MEMORY ERROR

// class A {
// int x, y, z;
// static int count = 0;

// public void finalize() {
// count++;
// System.out.println(count);

// }
// }

// class ObjectClass {
// public static void main(String ar[]) {
// A a[] = new A[100000000];
// for (int i = 0; i < a.length; i++) {
// a[i] = new A();
// a[i] = null;
// }
// }
// }

// /*

// */
// .........STEP-2...........
// FINALIZE MANULLY CALL

// class A {
// int x, y, z;

// public void finalize() {
// System.out.println("finalize method call");

// }
// }

// class ObjectClass {
// public static void main(String ar[]) {
// A a1 = new A();
// a1 = null;
// a1.finalize();
// System.out.println("main method call");
// }
// }

// // OP=Exception in thread "main" java.lang.NullPointerException
// // at finalizeManuallyCall_7.main(finalizeManuallyCall_7.java:15)

// .........STEP-3...........
// FINALIZE MANUALLY CALL

// class A {
// int x, y, z;

// public void finalize() {
// System.out.println("finalize method call");

// }
// }

// class ObjectClass {
// public static void main(String ar[]) {
// A a1 = new A();

// a1.finalize();
// a1.finalize();
// a1.finalize();
// a1.finalize();
// a1.finalize();

// System.out.println("main method call");
// }
// }
// /*
// op==>
// finalize method call
// finalize method call
// finalize method call
// finalize method call
// finalize method call
// main method call
// */
// .........STEP-4...........
// WHEN WE CALL FINALIZE MANULLY IT WILL NOT HANDLE EXCEPTION

// class A {
// int x, y, z;

// public void finalize() {
// System.out.println("finalize method call");
// System.out.println(10 / 0);

// }
// }

// class ObjectClass {
// public static void main(String ar[]) {
// A a1 = new A();
// a1.finalize();

// System.out.println("main method call");
// }
// }
// /*
// * finalize method call
// * Exception in thread "main" java.lang.ArithmeticException: / by zero
// * at A.finalize(finalizeManuallyCallNotHandelException_9.java:7)
// * at finalizeManuallyCallNotHandelException_9.main(
// * finalizeManuallyCallNotHandelException_9.java:15)
// */
