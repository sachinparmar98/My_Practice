#include<stdio.h>
int show(int x[],int si,int n)
{
int i,p,t,pi=x[n];
i=p=si;
for(;i<n;i++)
{
if(x[i]<pi)
{
t=x[i];
x[i]=x[p];
x[p]=t;
p++;
}
}
x[n]=x[p];
x[p]=pi;
return p;
}
void qsort (int x[],int si,int n)
{
if(n<=si)return;
int p=show(x,si,n);
qsort(x,0,p-1);
qsort(x,p+1,n);
}
void main()
{
int x[]={11,34,56,1,2,67,23,21,45};
int n=9;
qsort(x,0,n);
for(int i=0;i<sizeof(x)/sizeof(x[0]);i++)
{
printf("%d\n",x[i]);
}

}