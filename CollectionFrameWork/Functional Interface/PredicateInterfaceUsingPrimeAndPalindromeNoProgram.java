import java.util.function.Predicate;
class PredicateInterfaceUsingPrimeAndPalindromeNoProgram
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
Predicate<Integer>p2=a->
{
	int n1=a;
	int s=0;
	while(a!=0)
	{
		s=s*10+a%10;
		a=a/10;
	}
	return n1==s;
};
show(p1.and(p2));

}
static void show(Predicate<Integer> p)
{
	for(int i=1;i<=1000;i++)
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

