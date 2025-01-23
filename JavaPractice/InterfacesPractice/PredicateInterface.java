// ...................Predicate and() method...........

// import java.util.function.Predicate;
// class PredicateInterface
// {
// public static void main(String ar[])
// {
// int x[]={10,12,3,4,5,4,30,53,71,86,89,98,100};
// Predicate <Integer>p1=a->a>=10;
// Predicate<Integer>p2=a->a<=40;
// show(x,p1.and(p2));

// }
// static void show(int x[],Predicate<Integer> p)
// {
// for(int i:x)
// if(p.test(i))
// System.out.println(i);
// }
// }

// //and method ka case ma dono condition true hona chahiya tabhi chala ga

// .............equal() method..................

// import java.util.function.Predicate;
// class PredicateInterface
// {
// public static void main(String ar[])
// {
// Predicate<String>p1=Predicate.isEqual("ram");

// System.out.println(p1.test("ram"));
// System.out.println(p1.test("ram ji"));

// }}

// /*
// op =>
// true
// false

// note = Predicate interface isEqual method internaly overide test method
// */

// ...............equal() method next step.................

// @FunctionalInterface
// interface Inter1
// {
// boolean test(String s);
// static Inter1 isEqual(String s)
// {
// return s1->s1.equals(s);
// }

// }
// class PredicateInterface
// {

// public static void main(String ar[])
// {
// Inter1 p1=Inter1.isEqual("sita");

// System.out.println(p1.test("sita"));
// System.out.println(p1.test("sita ji"));

// }}

// /*
// op =>
// true
// false

// note = Predicate interface isEqual method internaly overide test method
// */

// ....................negate() method...................

// import java.util.function.Predicate;
// class PredicateInterface
// {
// public static void main(String ar[])
// {
// int x[]={10,12,3,4,5,4,30,53,71,86,89,98,100};
// Predicate <Integer>p1=a->a>=10;
// Predicate<Integer>p2=a->a<=40;
// show(x,p1.and(p2).negate());

// }
// static void show(int x[],Predicate<Integer> p)
// {
// for(int i:x)
// if(p.test(i))
// System.out.println(i);
// }
// }

// /*

// 3
// 4
// 5
// 4
// 53
// 71
// 86
// 89
// 98
// 100
// */

// ............print data from using particular Address..............

// import java.util.function.Predicate;
// import java.util.Scanner;
// class Employe
// {
// int id;
// String name;
// double sal;
// String add;
// Employe(int id,String name,double sal,String add)
// {
// this.id=id;
// this.name=name;
// this.sal=sal;
// this.add=add;
// }
// public String toString()
// {
// return "id ="+id+"\tname ="+name+"\tsalery ="+sal+"\tAdress="+add;
// }

// }
// class PredicateInterface
// {

// public static void main(String ar[])
// {
// Employe e1=new Employe(101,"ram",100000,"bhopal");
// Employe e2=new Employe(102,"arun",150000,"indore");
// Employe e3=new Employe(103,"sita",200000,"bhopal");
// Employe e4=new Employe(104,"gita",300000,"indore");

// System.out.println("enter address for particular Employles ");
// Scanner sc=new Scanner(System.in);
// String s=sc.next();
// System.out.println("enter Salery for particular Employles ");
// int i=sc.nextInt();

// Predicate<Employe>p1=s1->s1.add.equals(s);
// Predicate<Employe>p2=s1->s1.sal>i;

// Employe e[]={e1,e2,e3,e4};
// show(e,p1.and(p2));
// //show(e,p1.and(p2).negate())
// }
// static void show(Employe e[],Predicate<Employe>p1)
// {

// for(Employe e1:e)
// {
// if(p1.test(e1))
// System.out.println(e1);
// }
// }
// }

// /*
// op =>
// true
// false

// note = Predicate interface isEqual method internaly overide test method
// */

// .................print word start with particular letter................

// import java.util.function.Predicate;
// import java.util.Scanner;
// class PredicateInterface
// {

// public static void main(String ar[])
// {
// System.out.println("enter leter for particular words Start with");
// Scanner sc=new Scanner(System.in);
// String s=sc.next();
// Predicate<String>p1=s1->s1.startsWith(s);
// show(p1);

// }
// static void show(Predicate<String >p1)
// {
// String s[]={"abhi","sachin","anarkali","ram","arun","sita","gopal"};
// for(String s1:s)
// {
// if(p1.test(s1))
// System.out.println(s1);
// }
// }
// }

// /*
// op =>
// true
// false

// note = Predicate interface isEqual method internaly overide test method
// */

// ...................Predicate use ...............

// @FunctionalInterface
// interface Inter1<T ,U>
// {
// boolean test (T t,U u);
// }
// class PredicateInterface
// {
// public static void main(String ar[])
// {
// Inter1<Integer,Integer>i=(a,b)->(a+b)%2==0;
// System.out.println(i.test(10,20));
// System.out.println(i.test(11,20));
// }
// }
// // moduls operator ki priority jyada ha addition operator sa

// ................ Program for composite number............

// import java.util.function.Predicate;
// class PredicateInterface
// {
// public static void main(String ar[])
// {

// Predicate <Integer>p1=a->
// {
// for(int i=2;i<a;i++)
// {
// if(a%i==0)return false;

// }
// return true;
// };
// show(p1.negate());

// }
// static void show(Predicate<Integer> p)
// {
// for(int i=1;i<=100;i++)
// {
// if(p.test(i))
// System.out.println(i);
// }}
// }

// /*
// there is no four digit prime palindorme number

// 1
// 2
// 3
// 5
// 7
// 11
// 101
// 131
// 151
// 181
// 191
// 313
// 353
// 373
// 383
// 727
// 757
// 787
// 797
// 919
// 929

// */

// ..............Predicate for Prime and Palindrome number.........

// import java.util.function.Predicate;
// class PredicateInterface
// {
// public static void main(String ar[])
// {

// Predicate <Integer>p1=a->
// {
// for(int i=2;i<a;i++)
// {
// if(a%i==0)return false;

// }
// return true;
// };
// Predicate<Integer>p2=a->
// {
// int n1=a;
// int s=0;
// while(a!=0)
// {
// s=s*10+a%10;
// a=a/10;
// }
// return n1==s;
// };
// show(p1.and(p2));

// }
// static void show(Predicate<Integer> p)
// {
// for(int i=1;i<=1000;i++)
// {
// if(p.test(i))
// System.out.println(i);
// }}
// }

// /*
// there is no four digit prime palindorme number

// 1
// 2
// 3
// 5
// 7
// 11
// 101
// 131
// 151
// 181
// 191
// 313
// 353
// 373
// 383
// 727
// 757
// 787
// 797
// 919
// 929

// */

// ....................Predicate recive as parameter in any function.......

// .................PredicateAndMethodWorking..............

// import java.util.function.Predicate;
// class PredicateInterface
// {
// public static void main(String ar[])
// {
// int x[]={10,12,3,4,5,4,30,53,71,86,89,98,100};
// Predicate <Integer>p=a->a%2==0;
// show(x,p);

// }
// static void show(int x[],Predicate<Integer> p)
// {
// for(int i:x)
// if(p.test(i))
// System.out.println(i);
// }
// }

// .............find Arrays even number.................

// import java.util.function.Predicate;
// class PredicateInterface
// {
// public static void main(String ar[])
// {
// int x[]={10,12,3,4,5,4,3,50,78,86,89,98,100};
// Predicate <Integer>p=a->a%2==0;
// for(int i:x)
// if(p.test(i))
// System.out.println(i);
// }
// }

// //Integer ko hata na per error kyo a raha ha

// ..............four digit prime and palindrome.........

// import java.util.function.Predicate;
// class PredicateInterface
// {
// public static void main(String ar[])
// {

// Predicate <Integer>p1=n->
// {
// for(int i=2;i<=n/2;i++)
// {
// if(n%i==0)return false;
// }
// return true;
// };
// Predicate<Integer>p2=n->

// {
// int s=0;
// int n1=n;
// while(n!=0)
// {
// s=s*10+n%10;
// n=n/10;
// }
// return n1==s;
// };
// show(p1.and(p2));
// }
// static void show(Predicate<Integer>p)

// {
// int i;
// for(i=1;i<=9999;i++)
// {
// if(p.test(i))
// System.out.println(i);
// }

// }
// }

// ..................lambda using Predicate.............

import java.util.function.Predicate;
// class PredicateInterface
// {
// public static void main(String ar[])
// {
// Inter1 <Integer>i=x->x>18;
// System.out.println(i.test(10));
// System.out.println(i.test(20));
// }
// }
// /*
// false
// true

// */
