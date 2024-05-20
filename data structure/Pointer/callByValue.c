#include<stdio.h>
  void show(int ,int );
void main()
{
	int x=10;
	int y=20;
	printf("x=%d\n",x);
	printf("y=%d\n",y);
	show(x,y);
  	
	printf("x=%d\n",x);
	printf("y=%d\n",y);

}
void show(int a,int b)

{ 
a=a+b;
b=a-b;
a=a-b;
	
	
}
/*
x=10
y=20
x=10
y=20
*/