import java.util.function.Predicate;
import java.util.Scanner;
class Employe
{
	int id;
	String name;
	double sal;
	String add;
	Employe(int id,String name,double sal,String add)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.add=add;
	}
	public String toString()
	{
		return "id ="+id+"\tname ="+name+"\tsalery ="+sal+"\tAdress="+add;
	}
	
}
class PredicateInterfacePrintDataFromDataBaseUsingParticularAddress
{     

public static void main(String ar[])
{
	Employe e1=new Employe(101,"ram",100000,"bhopal");
	Employe e2=new Employe(102,"arun",150000,"indore");
	Employe e3=new Employe(103,"sita",200000,"bhopal");
	Employe e4=new Employe(104,"gita",300000,"indore");
	
	System.out.println("enter address for particular Employles  ");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	System.out.println("enter  Salery for particular Employles  ");
	int i=sc.nextInt();
	
Predicate<Employe>p1=s1->s1.add.equals(s);
Predicate<Employe>p2=s1->s1.sal>i;

Employe e[]={e1,e2,e3,e4};
 show(e,p1.and(p2));  
//show(e,p1.and(p2).negate())
}
  static void show(Employe e[],Predicate<Employe>p1)
  {
	
      for(Employe e1:e)
	  {
		  if(p1.test(e1))
			  System.out.println(e1);
	  }		  
  }
}

/*
op =>
true 
false


note = Predicate interface  isEqual method internaly overide test method
*/

