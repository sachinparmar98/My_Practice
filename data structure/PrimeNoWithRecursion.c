#include<stdio.h>


int isPrime(int n ,int i)
{
int c=1;
if(i==n)return c;

if(n%i==0)
{
c=0;
return c;
}
i++;
isPrime(n,i);

}
void main()
{
	int i=2;
	int n;
	printf("enter any number\n");
	scanf("%d",&n);
if(isPrime(n,i	))
printf("number is Prime");
else
printf("number is not prime\n");
}
