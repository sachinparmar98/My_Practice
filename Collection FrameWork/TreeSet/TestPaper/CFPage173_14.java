import java.util.*;
class Employe implements Comparable
{  static int c;
	int id; String name;
	Employe(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "id="+id+"\tname="+name;
	}
	public int compareTo(Object o)
	{
		Employe e=(Employe)o;
		System.out.println("compareTo..........."+(++c));
	return id-e.id;
		
	}
}
class CFPage173_14
{
	public static void main(String ...a)
	{
		TreeSet t=new TreeSet();
		t.add(new Employe(10,"ramji"));
		t.add(new Employe(9,"ram"));
		t.add(new Employe(8,"sita"));
		t.add(new Employe(7,"gita"));
		t.add(new Employe(7,"gita"));
		t.add(new Employe(6,"gita"));
		t.add(new Employe(5,"gita"));
		t.add(new Employe(4,"gita"));
		//t.add(new Employe(4,"gita"));
		System.out.println(t);


	}
}

/*

*/


