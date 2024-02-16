class Employe {
   int id;String name;	
	Employe(int id)
	{
		
		this.id=id;
		this.name=name;
	}
 public int hashCode()
 {
	 return id;
 }
}

class HASH_CODE5 {
    public static void main(String ar[]) {
        Employe e1 = new Employe(101);
        Employe e2 = new Employe(102);
		
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
     }
}
/* e1 ko print ker raha ha too toString method call ho rahi ha or uska pass employe class ki 
hashCode method id ko return ker rahi ha or object class  ki tostring mehod us id ko hexadecimal no. 
ka form ma print ker rahi ha 

out put==
Employe@65
Employe@66
101
102


*/