#include<stdio.h>
void show(int a,int b,int n)
{
	if(b>n)return;
	
	printf("%d  ",a+b);
	if(a==n)
	{
		printf("\n");
		a=0;
		b++;
	}
	a++;
	show(a,b,n);
}
void main()
{
show(1,1,5);
}


/*

2  3  4  5  6
3  4  5  6  7
4  5  6  7  8
5  6  7  8  9
6  7  8  9  10

*/