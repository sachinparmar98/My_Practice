import java.util.function.Function;
class FunctionInterfaceApplyMethodStep3
{
	static public void main(String ar[])
	{
		Function<Integer,Integer>f1=s->s*s;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(20));
	}
}
