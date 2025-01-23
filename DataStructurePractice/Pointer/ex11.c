#include<stdio.h>
void main()
{
int x=10;
int *a=&x;
printf("%d\n",sizeof(*a));
printf("%d\n",sizeof(a));
printf("\n\n\n\n");

char y='A';
char *b=&y;
printf("%d\n",sizeof(*b));
printf("%d\n",sizeof(b));
printf("\n\n\n\n");


float z=10;
float *c=&z;
printf("%d\n",sizeof(*c));
printf("%d\n",sizeof(c));
printf("\n\n\n\n");

long z1=10l;
long *d=&z1;
printf("%d\n",sizeof(*d));
printf("%d\n",sizeof(d));
printf("\n\n\n\n");

double z2=10l;
double *d1=&z2;
printf("%d\n",sizeof(*d1));
printf("%d\n",sizeof(d1));
printf("\n\n\n\n");


}

/*

4
4




1
4




4
4




4
4




8
4





*/
