#include<stdio.h>
 
void main()
{
int x=10;
int *p=&x;
int **q=&p;


printf("%d\n",x);
printf("%u\n",&x);

printf("%u\n",p);
printf("%d\n",*p);
printf("%u\n",&p);

printf("%d\n",**q);
printf("%u\n",q);
printf("%u\n",&q);



}
/*



*/