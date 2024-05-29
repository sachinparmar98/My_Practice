@FunctionalInterface
interface Inter1
{
	void show(int x);
}
class MethodReffrenceStep7
{
	public static void main(String ar[])
	{
		Inter1 i=System.out::println;
		i.show(100000);
	}
}