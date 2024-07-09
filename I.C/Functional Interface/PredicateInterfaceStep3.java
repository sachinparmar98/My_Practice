@FunctionalInterface
interface Inter1<T ,U>
{
	boolean test (T t,U u);
}
class PredicateInterfaceStep3
{
	public static void main(String ar[])
	{
		Inter1<Integer,Integer>i=(a,b)->(a+b)%2==0;
	System.out.println(i.test(10,20));
	System.out.println(i.test(11,20));
	}
}
// moduls operator ki priority jyada ha addition operator sa 