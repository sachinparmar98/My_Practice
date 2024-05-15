import java.util.function.Predicate;
class FindArrayEvenNoByPredicateInteface
{
public static void main(String ar[])
{
int x[]={10,12,3,4,5,4,3,50,78,86,89,98,100};
Predicate <Integer>p=a->a%2==0;
for(int i:x)
	if(p.test(i))
		System.out.println(i);
}
}

//Integer ko hata na per error kyo a raha ha