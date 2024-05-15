#include<stdio.h>
void show(int a,int b,int n)
{
	if(b>n)return;
	
		printf("%d ",a%2);
	if(a==n-b+1)
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
show(1,1,7);
}


/*

1 0 1 0 1 0 1
1 0 1 0 1 0
1 0 1 0 1
1 0 1 0
1 0 1
1 0
1

*/