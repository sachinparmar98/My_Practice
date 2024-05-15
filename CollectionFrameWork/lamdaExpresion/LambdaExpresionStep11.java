// this exaple for addition of two number using lamda expresion 

@FunctionalInterface
interface Inter1<T>//t ko capital smal la sakta ha ya koi bhi alphabet la sakta ha uper case lower case any
{
	boolean test(T  x);

}
class LambdaExpresionStep11
{
	public static void main(String ar[])
	{
		Inter1 i=x->true;
		
		System.out.println(i.test('a'));
	
	
	}
}

/* 
note single statement ka liya return type likhna compilsory  nhi hota ha lamda expresion ma

template type declare kerna int Sting kuch bhi pass ker sakta ha method parameter ma
out put  always ture  ayga
*/