class Employe {
   int id;String name;	
	Employe(int id,String name)
	{
		
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return getClass() .getName();
	}
 
}

class toS8 {
    public static void main(String ar[]) {
        Employe e1 = new Employe(101,"aaa");
        Employe e2 = new Employe(102,"bbb");
		
        System.out.println(e1);
        System.out.println(e2);
        
		}
}
/* 
jo get class method na class Employe return kiya usa get name method na sirf Employe ko rakha jo 
String ka form ma ha to koi problem nahi hogi
out put==
Employe
Employe


*/
