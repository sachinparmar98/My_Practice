import java.util.function.Function;
class FunctionInterfaceApplyMethodStep2
{
	static public void main(String ar[])
	{
		Function<String,Integer>f1=s->s.length();
		System.out.println(f1.apply("ram"));
		System.out.println(f1.apply("ram   ji"));
	}
}
