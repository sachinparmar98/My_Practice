import java.util.function.Consumer;
import java.util.function.Function;
class MethodReffrenceStep9
{
	public static void main(String ar[])
	{
		Function<Double,Double>F=Math::sqrt;
		Consumer <Double>c=System.out::println;
c.accept(F.apply(25.0));
	}
}

/*
5.0
*/