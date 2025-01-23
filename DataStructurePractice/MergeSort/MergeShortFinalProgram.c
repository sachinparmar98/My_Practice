//when an function call it self is called indirect recursion.
#include<stdio.h>
void sum(int a[],int b[],int x[],int n1,int n2);//n1 and n2 is the length of array
void show(int x[],int n)
{
	if(n<2)return;
	int m1=n/2;
	int m2=n-m1;
	int a[m1];
	int b[m2];
	int i;
	for(i=0;i<m1;i++)
		a[i]=x[i];
	
	for(i=0;i<m2;i++)
		b[i]=x[m1+i];
	
	show(a,m1);
	show(b,m2);
	sum(a,b,x,m1,m2);
	
}
void sum(int a[],int b[],int x[],int n1,int n2)
{
	int i,j,k;
	for(i=0,j=0,k=0;i<n1 && j<n2;)
	{
		if(a[i]<b[j])
		x[k++]=a[i++];
	else
		x[k++]=b[j++];
	}
	
	while(i<n1)
		x[k++]=a[i++];
		
	while(j<n2)
		x[k++]=b[j++];
		
}
void main()
{
	int x[]={9,7,5,2,8,1,3,6};
	show(x,8);
	int i;
	for(i=0;i<8;i++)
	{
		printf("%d  ",x[i]);
	}
}