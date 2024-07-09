import java.util.function.Consumer;
import java.util.function.Function;
class MethodReffrenceStep1
{
public static void main(String ar[])
{
Function<Integer,Double>F=Math::sqrt;
Consumer<Double>C=System.out::println;
C.accept(F.apply(25));
}
}

/*
5.0
*/