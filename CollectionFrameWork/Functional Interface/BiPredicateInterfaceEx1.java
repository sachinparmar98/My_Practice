import java.util.function.BiPredicate;

class BiPredicateInterfaceEx1
{
	public static void main(String ar[])
	{
		BiPredicate<Integer,Integer>i=(a,b)->(a+b)%2==0;
	System.out.println(i.test(11,20));
	System.out.println(i.test(11,20));
	}
}
// moduls operator ki priority jyada ha addition operator sa 