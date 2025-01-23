#include<stdio.h>
void main()
{
int x=10;
int *p=&x;
int **q=&p;
printf("%d\n",x);
printf("%d\n",&x);
printf("%d\n",p);
printf("%d\n",*p);

printf("%d\n",*q);
printf("%d\n",**q);
printf("%d\n",&p);
printf("%d\n",q);
printf("%d\n",&q);

}