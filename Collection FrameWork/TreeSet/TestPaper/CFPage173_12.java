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
		return -id+e.id;
	}
}
class CFPage173_12
{
	public static void main(String ...a)
	{
		TreeSet t=new TreeSet();
		t.add(new Employe(10,"ramji"));
		t.add(new Employe(9,"ram"));
		t.add(new Employe(8,"sita"));
		t.add(new Employe(7,"gita"));
		t.add(new Employe(6,"gita"));
		t.add(new Employe(5,"gita"));
		t.add(new Employe(4,"gita"));
		t.add(new Employe(4,"gita"));
		System.out.println(t);


	}
}

/*
compareTo...........1
compareTo...........2
compareTo...........3
compareTo...........4
compareTo...........5
compareTo...........6
compareTo...........7
compareTo...........8
compareTo...........9
compareTo...........10
compareTo...........11
compareTo...........12
compareTo...........13
compareTo...........14
compareTo...........15
compareTo...........16
compareTo...........17
compareTo...........18
compareTo...........19
compareTo...........20
[id=10  name=ramji, id=9        name=ram, id=8  name=sita, id=7 name=gita, id=6 name=gita, id=5name=gita, id=4  name=gita]

*/


