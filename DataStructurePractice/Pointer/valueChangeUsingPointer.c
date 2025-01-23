#include<stdio.h>
void main()
{
	
int x=10;
int *p=&x;
printf("x=%d\n",x);
printf("&x=%u\n",&x);
printf("p=%d\n",p);
printf("&p=%d\n",&p);
printf("*p=%d\n",*p);
*p=55;
printf("x=%d\n",x);
}

/*

x=10
&x=6422300
p=6422300
&p=6422296
*p=10
x=55
*/