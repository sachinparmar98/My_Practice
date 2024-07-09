//for Long range
import java.util.*;
class ArrayList7
{
public static void main (String ar[])
{
ArrayList al=new ArrayList();
al.add(new Long(10));
al.add(new Long(20));
al.add(new Long(30));
al.add(new Long(40));
al.add(new Long(50));
al.add(new Long("9223372036854775808"));
System.out.println(al);


}}

/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "9223372036854775808"
        at java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.lang.Long.parseLong(Unknown Source)
        at java.lang.Long.<init>(Unknown Source)
        at ArrayList7.main(ArrayList7.java:13)
*/