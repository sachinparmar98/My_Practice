
//we asume base addres as 1000
#include<stdio.h>
void main()                                         
{
	int x[]={10,20,30,40,50};
	int i;
	int *p=&x[0];
	
	//case ->1
	//printf("%d\n",&x[0]);//1000
	//printf("%d\n",p);//1000
	
	//case ->2
	//printf("%d\n",&x[0]);//1000
	//printf("%d\n",&x[0]+1);//1004
	
	
	//case ->3
	//printf("%d\n",&x[0]);//1000
	//printf("%d\n",&x[0]+2);//1008
	
	//case ->4
	printf("%d\n",&x[0]);//1000
	printf("%d\n",&x[0]+0);//1000
	
	}
