#include<stdio.h>
void show(int x[],int n,int i )
{
int l=i*2+1;
int t;
 t=x[i];
 x[i]=x[l];
x[l]=t;
}
void main()
{
int x[]={1,2,3,4,5,6,7};
show(x,7,2);
for(int i=0;i<7;i++)
printf("%d ",x[i]);
}