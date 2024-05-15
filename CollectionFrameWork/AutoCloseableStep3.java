class A implements AutoCloseable
{
	public void close()
	{
		System.out.println("close.....");
	}
}
class AutoCloseableStep3
{
	public static void main(String ar[])
	{
		try(A a1=new A())
		{
			System.out.println("Hello mr. Sachin");
		}
	}
}
/*
out put =>
close is automatically called after try block code
Hello mr. Sachin
close.....
*/
