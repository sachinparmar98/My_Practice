// ................QUESTION-1................
// import java.util.*;
// class Employe implements Comparable
// { static int c;
// int id; String name;
// Employe(int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public String toString()
// {
// return "id="+id+"\tname="+name;
// }
// public int compareTo(Object o)
// {
// Employe e=(Employe)o;
// System.out.println("compareTo..........."+(++c));
// return id-e.id;
// }
// }
// class TreeSetClass
// {
// public static void main(String ...a)
// {
// TreeSet t=new TreeSet();
// t.add(new Employe(10,"ramji"));
// t.add(new Employe(9,"ram"));
// t.add(new Employe(8,"sita"));
// t.add(new Employe(7,"gita"));
// t.add(new Employe(6,"gita"));
// t.add(new Employe(5,"gita"));
// t.add(new Employe(4,"gita"));
// t.add(new Employe(4,"gita"));
// System.out.println(t);

// }
// }

// /*
// compareTo...........1
// compareTo...........2
// compareTo...........3
// compareTo...........4
// compareTo...........5
// compareTo...........6
// compareTo...........7
// compareTo...........8
// compareTo...........9
// compareTo...........10
// compareTo...........11
// compareTo...........12
// compareTo...........13
// compareTo...........14
// compareTo...........15
// compareTo...........16
// compareTo...........17
// compareTo...........18
// compareTo...........19
// compareTo...........20
// [id=4 name=gita, id=5 name=gita, id=6 name=gita, id=7 name=gita, id=8
// name=sita, id=9 name=ram, id=10 name=ramji]

// */

// ................QUESTION-2................

// import java.util.*;
// class Employe implements Comparable
// { static int c;
// int id; String name;
// Employe(int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public String toString()
// {
// return "id="+id+"\tname="+name;
// }
// public int compareTo(Object o)
// {
// Employe e=(Employe)o;
// System.out.println("compareTo..........."+(++c));
// return -id+e.id;
// }
// }
// class TreeSetClass
// {
// public static void main(String ...a)
// {
// TreeSet t=new TreeSet();
// t.add(new Employe(10,"ramji"));
// t.add(new Employe(9,"ram"));
// t.add(new Employe(8,"sita"));
// t.add(new Employe(7,"gita"));
// t.add(new Employe(6,"gita"));
// t.add(new Employe(5,"gita"));
// t.add(new Employe(4,"gita"));
// t.add(new Employe(4,"gita"));
// System.out.println(t);

// }
// }

// /*
// compareTo...........1
// compareTo...........2
// compareTo...........3
// compareTo...........4
// compareTo...........5
// compareTo...........6
// compareTo...........7
// compareTo...........8
// compareTo...........9
// compareTo...........10
// compareTo...........11
// compareTo...........12
// compareTo...........13
// compareTo...........14
// compareTo...........15
// compareTo...........16
// compareTo...........17
// compareTo...........18
// compareTo...........19
// compareTo...........20
// [id=10 name=ramji, id=9 name=ram, id=8 name=sita, id=7 name=gita, id=6
// name=gita, id=5name=gita, id=4 name=gita]

// */

// ................QUESTION-3................

// import java.util.*;
// class Employe implements Comparable
// { static int c;
// int id; String name;
// Employe(int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public String toString()
// {
// return "id="+id+"\tname="+name;
// }
// public int compareTo(Object o)
// {
// Employe e=(Employe)o;
// System.out.println("compareTo..........."+(++c));
// return -id-e.id;

// }
// }
// class TreeSetClass
// {
// public static void main(String ...a)
// {
// TreeSet t=new TreeSet();
// t.add(new Employe(10,"ramji"));
// t.add(new Employe(9,"ram"));
// t.add(new Employe(8,"sita"));
// t.add(new Employe(7,"gita"));
// t.add(new Employe(6,"gita"));
// t.add(new Employe(5,"gita"));
// t.add(new Employe(4,"gita"));
// //t.add(new Employe(4,"gita"));
// System.out.println(t);

// }
// }

/*

*/

// ................QUESTION-4................

// import java.util.*;
// class Employe implements Comparable
// { static int c;
// int id; String name;
// Employe(int id,String name)
// {
// this.id=id;
// this.name=name;
// }
// public String toString()
// {
// return "id="+id+"\tname="+name;
// }
// public int compareTo(Object o)
// {
// Employe e=(Employe)o;
// System.out.println("compareTo..........."+(++c));
// return id-e.id;

// }
// }
// class TreeSetClass
// {
// public static void main(String ...a)
// {
// TreeSet t=new TreeSet();
// t.add(new Employe(10,"ramji"));
// t.add(new Employe(9,"ram"));
// t.add(new Employe(8,"sita"));
// t.add(new Employe(7,"gita"));
// t.add(new Employe(7,"gita"));
// t.add(new Employe(6,"gita"));
// t.add(new Employe(5,"gita"));
// t.add(new Employe(4,"gita"));
// //t.add(new Employe(4,"gita"));
// System.out.println(t);

// }
// }

// /*

// */

// ................QUESTION-5................

// import java.util.*;
// class TreeSetClass
// {
// public static void main(String ...a)
// {
// TreeSet t=new TreeSet();
// t.add(new StringBuilder("ram"));
// t.add(new StringBuilder("sita"));
// System.out.println(t);
// }
// }
// ................QUESTION-6................

// import java.util.*;
// class TreeSetClass
// {
// public static void main(String ...a)
// {
// TreeSet t=new TreeSet();
// t.add(50.0);
// t.add(49.9);
// t.add(50.1);
// t.add(50.2);
// t.add(50.3);
// t.add(50.4);
// t.add(50.5);
// //System.out.println(t.lower(50.0));//49.9
// //System.out.println(t.floor(50.0));//50.0
// //System.out.println(t.ceiling(50.0));//50.0
// System.out.println(t.higher(50.0));//50.1
// // System.out.println(t.pollFirst());//49.5 and remove from TreeSet
// //System.out.println(t.pollLast());//50.5 and remove from TreeSet
// //System.out.println(t.last());//50.5
// //System.out.println(t.first());//49.9
// //System.out.println(t.headSet(50.3));//[49.9, 50.0, 50.1, 50.2]
// //System.out.println(t.tailSet(50.3));//[50.3, 50.4, 50.5]
// //System.out.println(t.tailSet(50.9));//[]
// //System.out.println(t.subSet(50.9,60.9));//[]
// System.out.println(t.subSet(50.1,50.4));//[]

// }
// }
// ................QUESTION-7................
