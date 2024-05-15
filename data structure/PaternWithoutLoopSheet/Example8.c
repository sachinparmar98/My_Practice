#include<stdio.h>
void show(int a,int b,int n)
{
	if(b>n)return;
	printf("%d  ",n-a+1);
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

5
5  4
5  4  3
5  4  3  2
5  4  3  2  1
*/