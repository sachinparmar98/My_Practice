import java.util.function.Predicate;
class fourDigitPrimeAndPalindromeNumberUsingPredicate
{     
public static void main(String ar[])
{

Predicate <Integer>p1=n->
{
for(int i=2;i<=n/2;i++)
{
	if(n%i==0)return false;
}
return true;
};
Predicate<Integer>p2=n->

{
	int s=0;
	int n1=n;
	while(n!=0)
	{
		s=s*10+n%10;
		n=n/10;
	}
	return n1==s;
};
show(p1.and(p2));
}
static void show(Predicate<Integer>p)

{
	int i;
	for(i=1;i<=9999;i++)
	{
		if(p.test(i))
			System.out.println(i);
	}
	
}
}

