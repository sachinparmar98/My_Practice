#include<stdio.h>
  void show(int *,int *);
void main()
{
	int x=10;
	int y=20;
	printf("x=%d\n",x);
	printf("y=%d\n",y);
	show(&x,&y);
	printf("x=%d\n",x);
	printf("y=%d\n",y);
	//int x1=10;
	
	//int *p=x1;
	//printf("p=%d\n",p);
   //why this line is not working and line 24 working
}
void show(int *a,int *b)

{ 
int t;
t=*a;
*a=*b;
*b=t;

}
/*

*/