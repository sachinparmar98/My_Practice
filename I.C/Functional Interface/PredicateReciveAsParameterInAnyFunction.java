import java.util.function.Predicate;
class PredicateReciveAsParameterInAnyFunction
{     
public static void main(String ar[])
{
int x[]={10,12,3,4,5,4,30,53,71,86,89,98,100};
Predicate <Integer>p=a->a%2==0;
show(x,p);

}
static void show(int x[],Predicate<Integer> p)
{
	for(int i:x)
	if(p.test(i))
		System.out.println(i);
}
}

