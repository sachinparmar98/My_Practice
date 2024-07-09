import java.util.function.Predicate;
class PredicateInterfaceAndMethodWorking
{     
public static void main(String ar[])
{
int x[]={10,12,3,4,5,4,30,53,71,86,89,98,100};
Predicate <Integer>p1=a->a>=10;
Predicate<Integer>p2=a->a<=40;
show(x,p1.and(p2));

}
static void show(int x[],Predicate<Integer> p)
{
	for(int i:x)
	if(p.test(i))
		System.out.println(i);
}
}

//and method ka case ma dono condition true hona chahiya tabhi chala ga

