#include<stdio.h>
  void show(int *);
void main()
{
	int x=10;
	printf("x=%d\n",x);
	show(&x);
	printf("x=%d\n",x);
  	

}
void show(int *a)
{
	*a=55;
}
/*
x=10
x=55

*/