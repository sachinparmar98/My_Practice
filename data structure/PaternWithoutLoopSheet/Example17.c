#include<stdio.h>
void show(int a,int b,int n)
{
	if(b>n)return;
	if(a<=b)
		printf("%d ",b);
	else
	printf("%d ",a);
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

1 2 3 4 5
2 2 3 4 5
3 3 3 4 5
4 4 4 4 5
5 5 5 5 5

*/