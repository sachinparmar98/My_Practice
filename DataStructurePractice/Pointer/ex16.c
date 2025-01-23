#include<stdio.h>
void show(int a[])
{
	printf("%d\n",sizeof(a));

}
void main()
{
	int x[]={10,20,30,40,50};
	show(x);
//for(int i=0;i<5;i++)
	printf("%d\n",sizeof(x));
//printf("%d\n",x);

}

/*
 
out put


4
20

*/