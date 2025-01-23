import java.util.ArrayList;
class ArrayList9
{
	
	public static void main(String ar[])
	{
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		for(Integer i:al)
			System.out.println(i);
	}
}
/*
java:14: error: incompatible types: Object cannot be converted to Integer
                for(Integer i:al)
                              ^
						  
 because add method ka parameter Onject type ha 
 ArrayList ma jo data stre ho rha ha vo Object ka 
 form ma store ho rha ha 
 
 
 see example ArrayList10 for solution 
						  
*/