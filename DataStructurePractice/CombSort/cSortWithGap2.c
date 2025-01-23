#include<stdio.h>
void display(int x[]);
void csort(int x[],int n)
{
int g=n/1.3;
int i;
int t;
for(;g>=1;)
{
for (i=0;i<n-g;i++)
{
if(x[i]>x[g+i])
{
t=x[i];
x[i]=x[i+g];
x[i+g]=t;
display(x);
}
}
g=g/1.3;
}
}
void display(int x[])
{
for(int i=0;i<10;i++)
{
printf("%d ",x[i]);
}
printf("\n");
}
void main()
{
int n=10;
int i;
int x[]={4,0,3,2,7,1,8,5,9,6};
csort(x,n);
}