import java.io.*;
class SystemInRead
{
	public static void main(String ar[])throws IOException
	{
		char choice;
		System.out.println("Select Yout Choice");
		System.out.println("A -> Ahmedabad");
		System.out.println("B -> Bombay");
		System.out.println("C -> Chenai");
		System.out.println("D-> Delhi");
		System.out.print("Choice --->");
         System.out.flush();		
		
switch(choice=(char)System.in.read())
{
case 'A':
case 'a':
System.out.println(" Ahmedabad => Parsel 25");
break;
case 'B':
case 'b':
System.out.println(" Bombay => Parsel 64");
break;
case 'C':
case 'c':
System.out.println(" Chenai => Parsel 53");
break;
case 'D':
case 'd':
System.out.println(" Delhi => Parsel 27");
break;
default:
System.out.println("Invlaid choice");

}
//catch(Exception e)
//{
//System.out.println(e);
//}
}}