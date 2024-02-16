class Employe {
   int id;String name;	
	Employe(int id,String name)
	{
		
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return int;
	}
 
}

class toS_10
{
    public static void main(String ar[]) {
        Employe e1 = new Employe(101,"aaa");
        Employe e2 = new Employe(102,"bbb");
		
        System.out.println(e1);
        System.out.println(e2);
        
		}
}
/* 
out put==
class Employe {
   int id;String name;	
	Employe(int id,String name)
	{
		
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return getClass().getName()+"@";
	}
 
}

class toS9 {
    public static void main(String ar[]) {
        Employe e1 = new Employe(101,"aaa");
        Employe e2 = new Employe(102,"bbb");
		
        System.out.println(e1);
        System.out.println(e2);
        
		}
}
/* 
out put==

toS_10.java:11: error: '.class' expected
                return int;
                          ^
*/


