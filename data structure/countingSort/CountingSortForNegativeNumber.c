#include<stdio.h>
void show(int x[],int n)
{
int i;
int y[8];
int a[10]={0};
for(i=0;i<n;i++)
{
	a[x[i]]++;
	
}
for(i=1;i<10;i++)
{
	a[i]+=a[i-1];
	
}
for(i=0;i<n;i++)
{
	//hello
y[a[x[i]]-=1]=x[i];
}
for(i=0;i<n;i++)
{
	
	x[i]=y[i];
}
}
void main()
{
int n=8;
int x[]={2,7,7,1,3,4,5,9};
show(x,n);
for(int i=0;i<n;i++)
{
printf("%d    ",x[i]);
}
}
