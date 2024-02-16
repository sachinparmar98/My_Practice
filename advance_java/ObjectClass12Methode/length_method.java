class Employe {
  public String get()
  {
	  return "ram";
  }
 
}

class length_method {
    public static void main(String ar[]) {
        Employe e1 = new Employe();
       
        System.out.println(e1.get().length());
        
		}
}
/*
because get method Employe class ki mil gai or length() method String class ki call hui kyo ki 
Employe class ma length method nhi ha.
out put==
3
 
*/


