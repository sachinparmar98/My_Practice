import java.util.function.Predicate;
class PredicateInterfaceNegateMethodWorking
{     
public static void main(String ar[])
{
int x[]={10,12,3,4,5,4,30,53,71,86,89,98,100};
Predicate <Integer>p1=a->a>=10;
Predicate<Integer>p2=a->a<=40;
show(x,p1.and(p2).negate());

}
static void show(int x[],Predicate<Integer> p)
{
	for(int i:x)
	if(p.test(i))
		System.out.println(i);
}
}

/*



3
4
5
4
53
71
86
89
98
100
*/

