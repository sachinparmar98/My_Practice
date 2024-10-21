                          //Question 05
// import java.util.*;
// class Employe implements Comparable
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
// return "id="+id+"\tname="+name;
// }
// public int compareTo(Object o)
// {
// Employe e=(Employe)o;
// System.out.println(id+"......."+e.id);

// return 1;
// }
// }
// class Demo
// {
// public static  void main(String ...a )
// {
// TreeSet t=new TreeSet();
// t.add(new Employe(12,"ramji"));
// t.add(new Employe(11,"ramji"));
// t.add(new Employe(11,"ramji"));
// t.add(new Employe(11,"ramji"));
// t.add(new Employe(11,"ramji"));
// t.add(new Employe(11,"ramji"));
// System.out.println(t);
// }
// }
//OUTPUt
/*
12.......12
11.......12
11.......12
11.......11
11.......11
11.......11
11.......11
11.......11
11.......11
11.......11
11.......11
11.......11
[id=12  name=ramji, id=11       name=ramji, id=11       name=ramji, id=11       name=ramji, id=11       name=ramji, id=11       name=ramji]

*/
                                //Question 06
// import java.util.*;
// class Employe implements Comparable
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
// return "id="+id+"\tname="+name;
// }
// public int compareTo(Object o)
// {
// Employe e=(Employe)o;
// System.out.println("employe.......");
// return 1;
// }
// }
// class Student implements Comparable
// {
// int id;
// String name;
// Student(int id,String name)
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
// Student e=(Student)o;
// System.out.println(id+"......."+e.id);
// return 1;
// }
// }
// class Demo
// {
// public static  void main(String ...a )
// {
// TreeSet t=new TreeSet();
// t.add(new Employe(11,"ramji"));
// t.add(new Student(12,"sitaji"));
// t.add(new Student(13,"gitaji"));
// t.add(new Student(11,"ramji"));
// System.out.println(t);
// }
// }
          //OUTPUT     
/*
employe.......
Exception in thread "main" java.lang.ClassCastException: Employe cannot be cast to Student
        at Student.compareTo(ReTest.java:92)
        at java.util.TreeMap.put(TreeMap.java:568)
        at java.util.TreeSet.add(TreeSet.java:255)
        at Demo.main(ReTest.java:103)
*/
                              //QUESTION 07
// import java.util.*;
// class Employe implements Comparable
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
// return "id="+id+"\tname="+name;
// }
// public int compareTo(Object o)
// {

// System.out.println("employe.......");
// return -1;
// }
// }
// class Student implements Comparable
// {
// int id;
// String name;
// Student(int id,String name)
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

// System.out.println("Student.......");
// return -1;
// }
// }
// class Demo
// {
// public static  void main(String ...a )
// {
// TreeSet t=new TreeSet();
// t.add(new Employe(11,"ramji"));
// t.add(new Employe(11,"ramji"));
// t.add(new Student(12,"sitaji"));
// t.add(new Student(12,"sitaji"));
// t.add(new Student(13,"gitaji"));
// System.out.println(t);
// }
// }
         //OUTPUT
/*
employe.......
employe.......
Student.......
Student.......
Student.......
Student.......
Student.......
Student.......
Student.......
[id=13  name=gitaji, id=12      name=sitaji, id=12      name=sitaji, id=11      name=ramji, id=11       name=ramji]
*/
                    //QUSETION 08		 
// import java.util.*;
// class Employe implements Comparable
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
// return "id="+id+"\tname="+name;
// }
// public int compareTo(Object o)
// {

// System.out.println("employe.......");
// return -1;
// }
// }
// class Student implements Comparable
// {
// int id;
// String name;
// Student(int id,String name)
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

// System.out.println("Student.......");
// return 0;
// }
// }
// class Demo
// {
// public static  void main(String ...a )
// {
// TreeSet t=new TreeSet();
// t.add(new Employe(11,"RAMJI"));
// t.add(new Student(12,"RAMJI"));
// t.add(new Student(13,"RAMJI"));
// t.add(new Student(14,"RAMJI"));
// t.add(new Employe(13,"RAMJI"));
// System.out.println(t);
// }
// }

         //output
/*
employe.......
Student.......
Student.......
Student.......
employe.......
[id=13  name=RAMJI, id=11       name=RAMJI]
*/
                       //QUSETION 09
// import java.util.*;
// class Employe implements Comparable
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
// return "id="+id+"\tname="+name;
// }
// public int compareTo(Object o)
// {

// System.out.println("employe.......");
// return -1;
// }
// }
// class Student implements Comparable
// {
// int id;
// String name;
// Student(int id,String name)
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

// System.out.println("Student.......");
// return 1;
// }
// }
// class Demo
// {
// public static  void main(String ...a )
// {
// TreeSet t=new TreeSet();
// t.add(new Employe(11,"RAMJI"));
// t.add(new Student(12,"RAMJI"));
// t.add(new Student(12,"RAMJI"));
// t.add(new Student(13,"RAMJI"));
// t.add(new Employe(13,"RAMJI"));
// t.add(new Employe(15,"RAMJI"));
// System.out.println(t);
// }
// }
              //OUTPUT
/*
employe.......
Student.......
Student.......
Student.......
Student.......
Student.......
employe.......
employe.......
employe.......
employe.......
employe.......
[id=15  name=RAMJI, id=13       name=RAMJI, id=11       name=RAMJI, id=12       name=RAMJI, id=12       name=RAMJI, id=13       name=RAMJI]
*/
                         //QUESTION 10
// import java.util.*;
// class Employe implements Comparable
// {

// int id ;
// String name;
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
// System.out.println("compareTo..........");
// Employe e=(Employe)o;
// return id-e.id;
// }
// }
// class Demo
// {
// public static void main(String ar[])
// {
// TreeSet t=new TreeSet();
// t.add(new Employe(10,"ram"));
// t.add(new Employe(9,"ram"));
// t.add(new Employe(8,"GITA"));
// t.add(new Employe(7,"GITA"));
// t.add(new Employe(7,"GITA"));
// t.add(new Employe(6,"GITA"));
// t.add(new Employe(5,"GITA"));
// t.add(new Employe(4,"GITA"));
// System.out.println(t);
// }

// }
     //output
/*
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
compareTo..........
[id=4   name=GITA, id=5 name=GITA, id=6 name=GITA, id=7 name=GITA, id=8 name=GITA, id=9 name=ram, id=10 name=ram]*/