class A implements AutoCloseable
{
	public void close()
	{
		System.out.println("close.....");
	}
}
class AutoCloseableStep4
{
	public static void main(String ar[])
	{
		try(A a1=new A())
		{
			System.out.println("Hello mr. Sachin");
			System.out.println(10/0);
		}
	}
}
/*
out put =>


Hello mr. Sachin
close.....
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at AutoCloseableStep4.main(AutoCloseableStep4.java:15)

*/
