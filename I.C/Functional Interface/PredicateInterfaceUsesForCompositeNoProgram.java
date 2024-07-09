import java.util.function.Predicate;
class PredicateInterfaceUsesForCompositeNoProgram
{     
public static void main(String ar[])
{

Predicate <Integer>p1=a->
{
	for(int i=2;i<a;i++)
	{
		if(a%i==0)return false;
		
	}
	return true;
};
show(p1.negate());

}
static void show(Predicate<Integer> p)
{
	for(int i=1;i<=100;i++)
	{
	if(p.test(i))
		System.out.println(i);
	}}
}

/*
there is no four digit prime palindorme number

1
2
3
5
7
11
101
131
151
181
191
313
353
373
383
727
757
787
797
919
929

*/

