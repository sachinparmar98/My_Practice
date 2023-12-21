               //Q1 readLine method ka use return type String
/*
import java.io.*;
class day13
{
static public void main(String ar[])throws IOException
{
InputStreamReader ist=new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(ist);
System.out.println("enter any name ");
 

String s1=br.readLine();
System.out.println("name=>"+s1);
}
}

*/
             //Q2 program for addition of two number 
 /*
import java.io.*;
class day13
{
static public void main(String ar[])throws IOException
{
InputStreamReader ist=new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(ist);

System.out.println("enter two number ");
int x=br.readLine();
int y=br.readLine();


System.out.println("sum=>"+(x+y));
}
}
*/
                  //Q3 solution for above example 
/*
import java.io.*;
class day13
{
static public void main(String ar[])throws IOException
{
InputStreamReader ist=new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(ist);

System.out.println("enter two number ");
String s1=br.readLine();//int x=Integer.parseInt(br.readLine());
String s2=br.readLine();//int y=Integer.parseInt(br.readLine());


int x=Integer.parseInt(s1);
int y=Integer.parseInt(s2);
System.out.println("sum=>"+(x+y));
}
}

*/                   
                      //Q4 name add gender concept add  per direct output kyo a rha ha
/*
import java.io.*;
class day13
{
static public void main(String ar[])throws IOException
{
InputStreamReader ist=new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(ist);

System.out.println("enter name ");
String s1=br.readLine();

System.out.println("enter gender ");
char g=(char)br.read();

System.out.println("enter address ");
String s2=br.readLine();

System.out.println("name=>"+s1);
System.out.println("gender=>"+g);
System.out.println("add=>"+s2);

}
}   // iska concept day15 ma ha

*/
                      //Q5 we want to split String by space
/*
class day13
{
static public void main(String ar[])
{
String s1="10 20";
int x=Integer.parseInt(s1);
System.out.println(s1);
System.out.println(x);
}
}
*/
                      //Q6 StringTokenizer class nextToken method return String
/*
import java.util.*;
class day13
{
static public void main(String ar[])
{
String s="10 20";
StringTokenizer st=new StringTokenizer(s);

String s1=st.nextToken();
String s2=st.nextToken();

int x=Integer.parseInt(s1);
int y=Integer.parseInt(s2);

System.out.println("sum=>"+(x+y));
}
}
*/