@FunctionalInterface
interface Inter1<R ,T>
{
	R apply(T t);
}
class FunctionInterfaceApplyMethodStep1
{
	static public void main(String ar[])
	{
		Inter1<Integer,String>I1=s->s.length();
		System.out.println(I1.apply("ram"));
		System.out.println(I1.apply("ram ji"));
	}
}
