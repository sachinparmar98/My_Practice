#include<stdio.h>
  void show(int *,int *);
void main()
{
	int x[]={10,20,30,40,50};
	int i;
	int *p=&x[0];
	
	for(i=0;i<5;i++)
	{
	printf("%u\n",*p);

p++;
	}	



	for(i=1;i<=5;i++)
	{
	printf("%u\n",*p);

p--;
	}	

}
/*
10
20
30
40
50


*/