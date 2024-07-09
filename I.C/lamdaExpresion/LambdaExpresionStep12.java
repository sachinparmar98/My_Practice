// this exaple for addition of two number using lamda expresion 

@FunctionalInterface
interface Inter1<T>//t ko capital smal la sakta ha ya koi bhi alphabet la sakta ha uper case lower case any
{
	boolean test(T  x);

}
class LambdaExpresionStep12
{
	public static void main(String ar[])
	{
		Inter1 <Integer>i=x->x>18;
		
	
		System.out.println(i.test(10));
		System.out.println(i.test(20));
	
	}
}

		//<Integer> this genric type now hum method parameter ma sirf Integer value he pass ker sakta ha
/* 
note single statement ka liya return type likhna compilsory  nhi hota ha lamda expresion ma

template type declare kerna int Sting kuch bhi pass ker sakta ha method parameter ma
out put  always ture  ayga
*/