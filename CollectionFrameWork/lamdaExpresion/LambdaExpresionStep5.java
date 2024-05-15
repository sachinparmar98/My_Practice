// this exaple for addition of two number using lamda expresion 

@FunctionalInterface
interface Inter1
{
void sum(int x,int y);

}
class LambdaExpresionStep5			
{
	public static void main(String ar[])
	{
		Inter1 i=( x ,y)->
			
				System.out.println(x+y);
			
	
	
		i.sum(20,20);
	}
}

/* 

 interface ma ak hi method ha too override ka time method name nhi define kera ga tabh bhi chala ga
 or varible type bhi define nhi kerga or body hata denga tabh hi chala ga
 
 
 above example ma isa type infrares kehta ha 
 
 
 lamda expresion ka case ma interface ma ak hi abstract method hona chahiya tabhi work kera gi above condition
 

output  40

*/