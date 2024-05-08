#include<stdio.h>
int n=10;
void show()
{
if(n<0)return;
n=n-2;
show();
printf("%d\n",n);
}
void main()
{
show();
}