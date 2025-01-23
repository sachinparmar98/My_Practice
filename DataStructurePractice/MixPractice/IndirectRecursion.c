//when an function call each other is called indirect recursion.

#include<stdio.h>
void show2(int n);
void show(int n)
{
	if(n<=1)return;
	show2(n-1);
}
void show2(int n)
{
	printf("%d\n",n);
	show(n-1);
}
void main()
{
show(5);
}