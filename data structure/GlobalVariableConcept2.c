#include<stdio.h>
int n=10;
void show()
{
if(n<0)return;
n=n-2;
printf("%d\n",n);
show();
}
void main()
{
show();
}