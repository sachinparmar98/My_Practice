@FunctionalInterface
interface Inter1
{
	void show(int x,int y);
}
class A
{
	static void sum(int x,int y)
	{
		System.out.println(x+y);
	}
}
class MethodReffrenceStep4
{
	
	public static void main(String ar[])
	{
Inter1 i=A::sum;
i.show(10,20);
	}
}

/*
30
*/