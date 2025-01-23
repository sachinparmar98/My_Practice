#include<stdio.h>
void display(int x[],int n);
void sort(int x[],int n)
{
int i,j,t,min;
for(i=0;i<n-1;i++)
{
min=i;
for(j=i+1;j<n;j++)
{
if(x[min]>x[j])
{
min=j;
}
}
if(min!=i)
{
t=x[i];
x[i]=x[min];
x[min]=t;
display(x,n);
}
}
}
void display(int x[],int n)
{
for(int i=0;i<n;i++)
{
printf("%d ",i[x]);
}
printf("\n");
}
void main()
{
	int n=8;
	int x[]={56,29,35,42,15,41,75,21};
	display(x,n);
	sort(x,n);
}