class Employe {
 public int hashCode()
 {
	 return 100;
 }
}

class HASH_CODE4 {
    public static void main(String ar[]) {
        Employe e1 = new Employe();
        Employe e2 = new Employe();
        System.out.println(e1);
        System.out.println(e2);
     }
}
/*  1.HEAXA DECIMAL NUMBER KO HE hashCode kahta ha
  2.return type of hashCode() is int


3.this time employe class hashCode method is called because object  e1 and e2 is 
employe class and employe class have its hashCode methode .

output==>
Employe@64
Employe@64
*/

