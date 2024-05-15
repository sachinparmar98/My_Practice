// this exaple for addition of two number using lamda expresion 

@FunctionalInterface
interface Inter1
{
	boolean test(int x);

}
class LambdaExpresionStep6			
{
	public static void main(String ar[])
	{
		Inter1 i=( x)->
		{
			return x>18;
		};
		System.out.println(i.test(10));
	
	
	}
}

/* 
output  false

*/