#include<stdio.h>
void show(int x[],int n)
{
	
	int y[n];
     int i;
   int max=x[0];
   int min=x[0];
	 for(i=1;i<n;i++)
	 {
		if(max<x[i])
			max=x[i];
   if(min>x[i])
	   min=x[i];
	 }
	 max++;
	 int a[max-min];
	 for(i=0;i<max-min;i++)
		 a[i]=0;
	 for(i=0;i<n;i++)
	 {
		 a[x[i]-min]++;
	 }
  for(i=1;i<max-min;i++)
	  a[i]+=a[i-1];

for(i=0;i<n;i++)
	y[a[x[i]-min]-=1]=x[i];

for(i=0;i<n;i++)

	x[i]=y[i];
}
void main()
{
	int n=7;
	int x[]={-329,4,-657,839,6,0,3595};
	show(x,n);
	for(int i=0;i<n;i++)
		printf("%d  ",x[i]);
}