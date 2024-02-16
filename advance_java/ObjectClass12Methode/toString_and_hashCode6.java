class Employe {
   int id;String name;	
	Employe(int id,String name)
	{
		
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return name;
	}
 public int hashCode()
 {
	 return id;
 }
}

class toString_and_hashCode6 {
    public static void main(String ar[]) {
        Employe e1 = new Employe(101,"aaa");
        Employe e2 = new Employe(102,"bbb");
		
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
     }
}
/*  dono method employe class ma hi mil jana per employe class ki call hogi

out put==
aaa
bbb
101
102


*/