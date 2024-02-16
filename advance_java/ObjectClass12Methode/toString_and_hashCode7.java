class Employe {
   int id;String name;	
	Employe(int id,String name)
	{
		
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return getClass().getName()+"@"+hashCode();
	}
	public int hashCode()
	{
		return id;
	}
 
}

class toString_and_hashCode7 {
    public static void main(String ar[]) {
        Employe e1 = new Employe(101,"aaa");
        Employe e2 = new Employe(102,"bbb");
		
        System.out.println(e1);
        System.out.println(e2);
        
		}
}
/*
out put==
Employe@101
Employe@102
 
*/


