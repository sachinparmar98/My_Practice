@FunctionalInterface
interface Inter1
{
void sum(int x,int y);

}
class FunctionalinterfaceStep10
{
	public static void main(String ar[])
	{
		Inter1 i=new Inter1();
	}
}

/* 

FunctionalinterfaceStep10.java:11: error: Inter1 is abstract; cannot be instantiated
                Inter1 i=new Inter1();
                         ^
1 error

*/