@FunctionalInterface
interface Inter1
{
void sum(int x,int y);

}
class LambdaExpresionStep3
{
	public static void main(String ar[])
	{
		Inter1 i=new Inter1()
		{
			public void sum(int x,int y)
			{
				System.out.println(x+y);
			}
		};
	
		i.sum(10,20);
	}
}

/* 

output  30


*/