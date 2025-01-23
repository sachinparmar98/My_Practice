#include<stdio.h>
void main()
{
int x=10;
int *p=&x;
printf("%d\n",*p);
printf("%d\n",p[0]);

}

/*
out put
10
10

*/
//p[0]==*(p+0)