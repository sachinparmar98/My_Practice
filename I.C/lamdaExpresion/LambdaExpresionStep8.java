// this exaple for addition of two number using lamda expresion 

@FunctionalInterface
interface Inter1
{
	boolean test(int x);

}
class LambdaExpresionStep8	
{
	public static void main(String ar[])
	{
		Inter1 i=( x)->x>18;
		
		System.out.println(i.test(20));
	
	
	}
}

/* 
note single statement ka liya return type likhna compilsory  nhi hota ha lamda expresion ma

OUT PUT true
*/