
//we asume base addres as 1000
#include<stdio.h>
void main()                                         
{
	int x[]={10,20,30,40,50};
	int i;
	int *p=&x[0];
	
	//case ->1
	//printf("%d\n",*&x[0]);//10
	//printf("%d\n",*(&x[0]+2));//30
	
	//case ->3
	//printf("%d\n",p);//1000
	//printf("%d\n",p+2);//1008
	
	//case ->5
	//printf("%d\n",*p);//10
//	printf("%d\n",*(p+2));//30

	//case ->7
	//printf("%d\n",x);//1000
	//printf("%d\n",&x[0]);//1000
	
	//case ->9
	//printf("%d\n",x+1);//1004
	//printf("%d\n",&x[0]+1);//1004
	
	//case ->11
	//printf("%d\n",(&x+1));//1000
	//printf("%d\n",&x[0]+1);//1004
	
	//case ->13
	printf("%d\n",*x);//10
	printf("%d\n",*(x+2));//30
	
	
	
	
	
	}
