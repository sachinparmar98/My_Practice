// this exaple for addition of two number using lamda expresion 

@FunctionalInterface
interface Inter1
{
	boolean test(int x);

}
class LambdaExpresionStep10
{
	public static void main(String ar[])
	{
		Inter1 i=x->true;
		
		System.out.println(i.test(10));
	
	
	}
}

/* 
note single statement ka liya return type likhna compilsory  nhi hota ha lamda expresion ma

out put  always ture output ayga
*/