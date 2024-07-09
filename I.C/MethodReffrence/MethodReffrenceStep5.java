@FunctionalInterface
interface Inter1
{
	int  show(int x,int y);
}
class A
{
	static int max(int x,int y)
	{
		return x>y?x:y;
		}
}
class MethodReffrenceStep5
{
	
	public static void main(String ar[])
	{
Inter1 i=A::max;
System.out.println("largest number is="+i.show(10,20));
	}
}

/*
largest number is=20
*/