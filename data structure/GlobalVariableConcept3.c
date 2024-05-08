#include<stdio.h>
int n=14;
void show(int n)
{
if(n<0)return;
n=n-2;
show(n);
printf("%d\n",n);
}
void main()
{
show(n);
}