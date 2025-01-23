
#include<stdio.h>
int s=0;
void show(int n)
{
	if(n==0)return;
	s=s*10+n%10;
	show(n/10);
}

int isPrime(int n)
{  s=0;
	show(n);
	return n==s;
}
void main()
{
	if(isPrime(252))
		printf("number is palindrome");
	else
		printf("number is not palindrome");
	
}
