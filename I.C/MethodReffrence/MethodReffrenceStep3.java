@FunctionalInterface
interface Inter1
{
	void show(int n);
}
class MethodReffrenceStep3
{
	
	public static void main(String ar[])
	{
Inter1 i=System.out::println;
i.show(10);
	}
}

/*
10
*/