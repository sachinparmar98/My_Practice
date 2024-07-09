import java.util.*;
class ArrayList4
{
public static void main (String ar[])
{
ArrayList al=new ArrayList();
Integer i1=new Integer(10);
Integer i2=new Integer(20);
Integer i3=new Integer(60);
Integer i4=new Integer(40);
Integer i5=new Integer(50);
Integer i6=new Integer("ram");
al.add(i1);
al.add(i2);
al.add(i3);
al.add(i4);
al.add(i5);
al.add(i6);

System.out.println(al);
}
}
//run this program in vesion 1.4

/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "ram"
        at java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at java.lang.Integer.<init>(Unknown Source)
        at ArrayList4.main(ArrayList4.java:13)

*/