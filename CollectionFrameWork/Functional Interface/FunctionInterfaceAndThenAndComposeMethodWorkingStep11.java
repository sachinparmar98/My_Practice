import java.util.function.Function;
class FunctionInterfaceAndThenAndComposeMethodWorkingStep11
{
	static public void main(String ar[])
	{
		Function<Integer,Integer>f1=s->
		{
			System.out.println("f1");
		return s+s;
		
		};
		Function<Integer,Integer>f2=s->
		{
			System.out.println("f2");
			return s*s;
		};
		Function<Integer,Integer>f3=s->
		{
			System.out.println("f3");
			return s*5;
		};
		Function<Integer,Integer>f4=s->
		{
			System.out.println("f4");
			return s+5;
		};
	  
	  System.out.println(f1.andThen(f2).compose(f3).andThen(f4).apply(10));
	 
	}
	
}
