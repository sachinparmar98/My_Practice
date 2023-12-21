 
                             //Q1 Scanner class and next method return String util package

/*
import java.util.*;
class day16
{
static public void main(String ar[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter name");

String s= sc.next();
System.out.println("neame=>"+s);

}}
*/
                            //Q2 addition of two number using Scanner class
/*
import java.util.*;
class day16
{
static public void main(String ar[])
{
Scanner sc =new Scanner(System.in);

System.out.println("enter first no.");
String s1=sc.next();

System.out.println("enter second no.");
String s2=sc.next();

int x=Integer.parseInt(s1);
int y=Integer.parseInt(s2);

System.out.println("sum=>"+(x+y));
}
}
*/
/* case
enter first no.
10
enter second no.
20
sum=>30

D:\JAVASACH>java day16
enter first no.
10 50
enter second no.
sum=>60
*/

                           //Q3 addition of two number using nextInt() method return int
/*
import java.util.*;
class day16
{
static public void main(String ar[])
{
Scanner sc=new Scanner(System.in);

System.out.println("enter first no.");
int x=sc.nextInt();

System.out.println("enter second no.");
int y=sc.nextInt();

System.out.println("addition=>"+(x+y));
}
} 
*/
/* cases

enter first no.
10
enter second no.
20
addition=>30

D:\JAVASACH>java day16
enter first no.
10 20
enter second no.
addition=>30

D:\JAVASACH>java day16
enter first no.
10
enter second no.
ab
Exception in thread "main" java.util.InputMismatchException
        at java.util.Scanner.throwFor(Scanner.java:864)
        at java.util.Scanner.next(Scanner.java:1485)
        at java.util.Scanner.nextInt(Scanner.java:2117)
        at java.util.Scanner.nextInt(Scanner.java:2076)
        at day16.main(day16.java:66)
*/
                    //Q4  array concept
/*
class day16
{
static public void main(String ar[])
{
int x[]={10,20,30,40,50};

System.out.println(x[0]);
System.out.println(x[2]);
System.out.println(x[4]);
}
}
*/
                       //Q5 array using  for loop
/*
class day16
{
static public void main(String ar[])
{
int x[]={10,20,30,40,50};
for(int i=0;i<5;i++)
{
System.out.println(x[i]);
 
}
}
}
*/
                       //Q6 ARRAY SIZE DECLARATION SYNTAX int data type
 
/*
class day16
{
static public void main(String ar[])
{
//int x[]=new int[size];
int x[]=new int[5];

System.out.println(x[0]);
System.out.println(x[2]);
System.out.println(x[4]);
}
}
*/

                                         //Q7 ARRAY SIZE DECLARATION SYNTAX float

/*
class day16
{
static public void main(String ar[])
{
//int x[]=new int[size];
int x[]=new int[5];
for(int i:x)
{
System.out.println(x[i]);
}
}}

*/

                                         //Q8 ARRAY SIZE DECLARATION SYNTAX char

/*
class day16
{
static public void main(String ar[])
{
//int x[]=new char[size];
char x[]=new char[5];
for(int i:x)
{
System.out.println(x[i]);
}
}}

*/
                                         //Q9 ARRAY SIZE DECLARATION SYNTAX String

/*
class day16
{
static public void main(String ar[])
{
//int x[]=new int[size];
String x[]=new String[5];
for(int i:x)//by for each loop nhi chal rha ha
{
System.out.println(x[i]);
}
}}   //day16.java:189: error: incompatible types: String cannot be converted to int
      //System.out.println(x[i]);
*/



                                         //Q10 ARRAY SIZE DECLARATION SYNTAX float

/*
class day16
{
static public void main(String ar[])
{
//int x[]=new int[size];
String x[]=new String[5];
for(int i=0;i<5;i++)
{
System.out.println(x[i]);
}
}}
*/
                          //Q11  using boolean data type
/*
  class day16
{
static public void main(String ar[])
{
//int x[]=new int[size];
boolean x[]=new boolean[5];
for(int i=0;i<5;i++)
{
System.out.println(x[i]);
}
}}
                         
*/
                 //Q12 imp concept 
/*
class day16
{
static public void main(String ar[])
{
//int x[]=new int[size];
int x[]={10,20,30,40,50};
for(int i=0;i<6;i++)
{
System.out.println(x[i]);
}
}}
*/
/*
10
20
30
40
50
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        at day16.main(day16.java:236)
*/
                       //Q13 CONCEPT
 /*
class day16
{
static public void main(String ar[])
{
//int x[]=new int[size];
int x[]=new int[5];
for(int i=0;i<6;i++)
{
System.out.println(x[i]);
}
}}
*/
/*
0
0
0
0
0
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        at day16.main(day16.java:260)
*/
                     //Q14 for each loop
/*
class day16
{
static public void main(String ar[])
{
int x[]={10,20,30,40,50};
for(int i:x)
{
System.out.println(i);
}
}}
*/
                          // Q15 assignment display even no in array using for each loop
/*
class day16
{
static public void main(String ar[])
{
int x[]={100,20,012 ,11,23,0,-42};//012 is octal
for(int i:x)
{
if(i%2==0&& i!=0)
{
System.out.print("\t"+i);
}
}
}
}
*/

                      //Q16 bubble sort dessending order
class day16
{
static public void main(String ar[])
{
int x[]={12 ,'a',53,-11,10,0 ,12,32,50,54,-65,-19,23232};
int i,j,sort;
for(i=11;i>=0;i--)
{
for(j=0;j<=i;j++)
{
if(x[j]<x[j+1])
{
sort=x[j];
x[j]=x[j+1];
x[j+1]=sort;
}
}
}
for(i=0;i<13;i++)
{
System.out.print("\t"+x[i]);
}
}
}