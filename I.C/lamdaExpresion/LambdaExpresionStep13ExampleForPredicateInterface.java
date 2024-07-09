import java.util.function.Predicate;
class LambdaExpresionStep13ExampleForPredicateInterface
{
	public static void main(String ar[])
	{
		Inter1 <Integer>i=x->x>18;
		System.out.println(i.test(10));
		System.out.println(i.test(20));
	
	}
}
/* 
false
true

*/