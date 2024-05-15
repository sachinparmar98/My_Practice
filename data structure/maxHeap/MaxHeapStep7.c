#include<stdio.h>
void show(int x[],int n,int i)
{
int l=i*2+1;
int r=i*2+2;
int max=i;
int  t;
if(l<n && x[l]>x[r])
{
  max=l;
}
else if(r<n && x[r]>x[l])
{
max=r;
}
if(x[max]>x[i])
{
  t=x[i];
  x[i]=x[max];
  x[max]=t;
  show(x,n,max);
}

}
void showloop(int x[],int n)
{
for(int i=n*2-1;i>=0;i--)
{
show(x,n,i);
}
}
void main()
{
int n=7;
int x[]={1,2,3,4,5,6,7};
showloop(x,n);
for(int i=0;i<n;i++)
{
 printf("%d ",x[i]);
}
}

/*
out put
7 5 6 4 2 1 3
*/