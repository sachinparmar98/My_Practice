class Employe {
   int id;String name;	
	Employe(int id,String name)
	{
		
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return getClass();
	}
 
}

class toS7 {
    public static void main(String ar[]) {
        Employe e1 = new Employe(101,"aaa");
        Employe e2 = new Employe(102,"bbb");
		
        System.out.println(e1);
        System.out.println(e2);
        
		}
}
/* because toString method ka return type String ha or us ma hum return getClass method ker wa raha 
ha jo possible nahi ha kyoki getClass mehthod ka return type Class ha there for error is occur

out put==
toS7.java:11: error: incompatible types: Class<CAP#1> cannot be converted to String
                return getClass();
                               ^
  where CAP#1 is a fresh type-variable:
    CAP#1 extends Employe from capture of ? extends Employe
1 error


*/