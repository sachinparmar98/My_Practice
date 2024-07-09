import java.util.function.Consumer;
import java.util.function.Function;
class MethodReffrenceStep10
{
	public static void main(String ar[])
	{
		Function<Double,Double>F=Math::sqrt;
		Consumer <String>c=System.out::println;
c.accept("squre root is = "+ F.apply(25.0));
	}
}

/*
squre root is = 5.0
*/