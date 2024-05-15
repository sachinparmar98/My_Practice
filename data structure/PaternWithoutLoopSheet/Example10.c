#include<stdio.h>
void show(int a,int b,int n)
{
	if(b>n)return;
	if(b==1)printf("6\n");
	printf("%d  ",a);
	if(a==b)
	{
		printf("6\n");
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

6
1  6
1  2  6
1  2  3  6
1  2  3  4  6
1  2  3  4  5  6

*/