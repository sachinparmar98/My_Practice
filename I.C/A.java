class A 
{
public static void main(String ar[])
{
int n=11;
for(int i=n;i>=1;i--)
{
for(int j=i;j<=n;j++)
{
	System.out.printf(" ");

}
for(int k=1;k<=i;k++)
{
System.out.printf("* ");
}
System.out.println();
}
}

}