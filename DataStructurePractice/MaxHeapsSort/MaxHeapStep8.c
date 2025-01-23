#include<stdio.h>
void show(int x[],int n,int i)
{
	int l=i*2+1;
	int r=i*2+2;
	int t;
	int max=i;
	if(r<n)
	{
		if(x[r]>x[l])
		
			max=r;
		
		else
		
			max=l;
		
	}
	else if(l<n)
	
		max=l;
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
	int i;
	for(i=n/2-1;i>=0;i--)
	{
		show(x,n,i);
	}
}
void main()
{
	int n=12;
	int x[]={10,11,12,13,14,15,16,17,18,19,20,21};
	showloop(x,n);
	for(int i=0;i<n;i++)
	{
		printf("%d   ",x[i]);
	}
}