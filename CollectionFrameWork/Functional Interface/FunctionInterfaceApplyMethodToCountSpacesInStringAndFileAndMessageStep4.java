import java.util.function.Function;
class FunctionInterfaceApplyMethodToCountSpacesInStringAndFileAndMessageStep4
{
	static public void main(String ar[])
	{
		Function<String,Integer>f1=s->s.length()-s.replaceAll(" ","").length();
	  show(f1)	;
	}
	static void show(Function<String ,Integer>f1)
	{
		String s1[]={"hello ram ji","a dd adf ","dita ji ki jai ho","hello mr sachin parmar"};
		for(String s:s1)
		{
			System.out.println(f1.apply(s));
		}
	}
	
}

// note why it is not working (s.replaceAll(".",""))