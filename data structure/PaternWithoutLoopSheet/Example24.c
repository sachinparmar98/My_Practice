#include<stdio.h>
void show(int a,int b,int n)
{
	if(b>n)return;
	
		printf("%d ",n-b+1);
	if(a==b)
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

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/