class A
{}
class AutoCloseableStep2
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
AutoCloseable is an interface it has single abstract method close();
  
  Autocloseable is an Functional interface


AutoCloseableStep2.java:7: error: incompatible types: try-with-resources not applicable to variable type
                try(A a1=new A())
                      ^
    (A cannot be converted to AutoCloseable)
1 error


*/
