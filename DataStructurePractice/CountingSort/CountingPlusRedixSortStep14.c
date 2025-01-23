#include<stdio.h>
void show(int x[],int n,int div)
{
	int a[10]={0};
	int y[n];
     int i;
	 for(i=0;i<n;i++)
		 a[x[i]/div%10]++;

  for(i=1;i<10;i++)
	  a[i]+=a[i-1];

for(i=0;i<n;i++)
	y[a[x[i]/div%10]-=1]=x[i];

for(i=0;i<n;i++)

	x[i]=y[i];
}
void main()
{
	int n=7;
	int x[]={329,457,657,839,436,720,355};
	show(x,n,1);
	show(x,n,10);
	show(x,n,100);
	for(int i=0;i<n;i++)
		printf("%d  ",x[i]);
}