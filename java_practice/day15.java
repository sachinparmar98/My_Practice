                                 //Q1 hasMoreTokens using addition of two number
/*
import java.io.*;
import java.util.*;
class day15
{
static public void main(String ar[])throws IOException
{
InputStreamReader ist =new InputStreamReader(System.in);
BufferedReader br =new BufferedReader(ist);
System.out.println("enter any number");
String s=br.readLine();

StringTokenizer st=new StringTokenizer(s," ,");
int sum=0;
while(st.hasMoreTokens())
{
sum=sum+Integer.parseInt(st.nextToken());
}
System.out.println(sum);
}
}   

*/

/*                                 //Q2 \n and \r
class day15
{
static public  void main (String ar[])
{
int x='\n';
int y='\r';
System.out.println(x);
System.out.println(y);
}
}
*/
                              //Q3 day 13 address wala concepts
/*
import java.io.*;
class day15
{
static public void main(String ar[])throws IOException
{
InputStreamReader ist= new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(ist);
System.out.println("enter any character");

char x1=(char)br.read();
char x2=(char)br.read();
char x3=(char)br.read();
char x4=(char)br.read();

System.out.println(x1);
System.out.println(x2);
System.out.println(x3);
System.out.println(x4);
}
}

*/
/* case for above question
D:\JAVASACH>java day15
enter any character
abcd
a
b
c
d

D:\JAVASACH>java day15
enter any character
abcdef
a
b
c
d

D:\JAVASACH>java day15
enter any character
abc
a
b
c


D:\JAVASACH>java day15
enter any character
ab
a
b




D:\JAVASACH>java day15
enter any character
a
b
a



b

*/
 
                                   // Q4 address wala concept
/*
 import java.io.*; 
class day15
{
static public void main(String ar[])throws IOException
{
InputStreamReader ist=new InputStreamReader(System.in);
BufferedReader br =new BufferedReader(ist);
System.out.println("enter any character");

int x1=br.read();
int x2=br.read();
int x3=br.read();
int x4=br.read();

System.out.println(x1);
System.out.println(x2);
System.out.println(x3);
System.out.println(x4);
}
}
*/
/* cases for above question
D:\JAVASACH>java day15
enter any character
abcd
97
98
99
100

D:\JAVASACH>java day15
enter any character
abcdef
97
98
99
100

D:\JAVASACH>abc
'abc' is not recognized as an internal or external command,
operable program or batch file.

D:\JAVASACH>java day15
enter any character
abc
97
98
99
13

D:\JAVASACH>java day15
enter any character
ab
97
98
13
10

D:\JAVASACH>java day15
enter any character
a
b
97
13
10
98

D:\JAVASACH>two times enter
'two' is not recognized as an internal or external command,
operable program or batch file.

D:\JAVASACH>
D:\JAVASACH>
D:\JAVASACH>
D:\JAVASACH>java day15
enter any character//two times enter


13
10
13
10

*/
                          // Q6 address wala final question
/*
import java.io.*;
class day15
{
static public void main(String ar[])throws IOException
{
InputStreamReader ist=new InputStreamReader(System.in);
BufferedReader br =new BufferedReader(ist);

System.out.println("enter your name");
String s=br.readLine();

System.out.println("enter your gender");
char g=(char)br.read();
int g1=br.read();
int g2=br.read();

System.out.println("enter your address");
String s1=br.readLine();

System.out.println("name=>"+s);
System.out.println("gender=>"+g);
System.out.println("add=>"+s1);
System.out.println(g1);
System.out.println(g2);
}
}
*/