@FunctionalInterface
interface Inter1
{
	//int  show(int x,int y);
	double  show(double x,double y);
	
}
//class A
//{
//	static int max(int x,int y)
//	{
//		return x>y?x:y;
//		}
//}
class MethodReffrenceStep6
{
	
	public static void main(String ar[])
	{
Inter1 i=Math::max;
System.out.println("max number is="+i.show(10,20));
	}
}

/*
largest number is=20
*/