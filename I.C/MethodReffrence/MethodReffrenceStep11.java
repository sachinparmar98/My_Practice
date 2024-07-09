import java.util.function.Consumer;
import java.util.function.BiFunction;
class MethodReffrenceStep11
{
	public static void main(String ar[])
	{
		BiFunction<Integer,Integer,Double>F=Math::pow;
		Consumer <Double>c=System.out::println;
c.accept( F.apply(2,5));
	}
}

/*
32.0
*/