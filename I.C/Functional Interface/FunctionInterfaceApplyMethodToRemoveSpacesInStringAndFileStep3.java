import java.util.function.Function;
class FunctionInterfaceApplyMethodToRemoveSpacesInStringAndFileStep3
{
	static public void main(String ar[])
	{
		Function<String,String>f1=s->s.replaceAll(" ","");
		System.out.println(f1.apply("my name is ram"));
		System.out.println(f1.apply("Hell mrsachin"));
	}
}

// note why it is not working (s.replaceAll(".",""))