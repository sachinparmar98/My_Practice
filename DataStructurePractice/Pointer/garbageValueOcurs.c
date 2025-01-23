#include<stdio.h>
void main()
{
	int x[]={10,20,30,40,50};
	int i;
	int *p=&x[0];
	for(i=1;i<=5;i++)
	{
	 printf("%d\n",*p);
p++;
}for(i=1;i<=5;i++)
	{
	 printf("%d\n",*p);
p--;
}
}
/*
10
20
30
40
50
6422296
50
40
30
20

*/