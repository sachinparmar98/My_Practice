//when an function call it self is called indirect recursion.

#include<stdio.h>

void show(int n)
{
	if(n<=0)return;
	printf("%d \n",n);
	show(n-2);
}

void main()
{
show(10);
}