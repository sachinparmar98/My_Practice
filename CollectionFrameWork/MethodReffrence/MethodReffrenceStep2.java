import java.util.function.Consumer;
import java.util.function.BiFunction;
class MethodReffrenceStep2
{
public static void main(String ar[])
{
BiFunction<Integer,Integer,Double>F=Math::pow;
Consumer<Double>C=System.out::println;
C.accept(F.apply(2,5));
}
}

/*
32.0
*/