import java.util.function.Predicate;
import java.util.Scanner;
class PredicateInterfacePrintWordStartWithParticularLetter
{     

public static void main(String ar[])
{
	System.out.println("enter leter for particular words Start with");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
Predicate<String>p1=s1->s1.startsWith(s);
 show(p1);  

}
  static void show(Predicate<String >p1)
  {
	String s[]={"abhi","sachin","anarkali","ram","arun","sita","gopal"};
      for(String s1:s)
	  {
		  if(p1.test(s1))
			  System.out.println(s1);
	  }		  
  }
}

/*
op =>
true 
false


note = Predicate interface  isEqual method internaly overide test method
*/

