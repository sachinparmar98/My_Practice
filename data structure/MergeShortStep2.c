//when an function call it self is called indirect recursion.

#include<stdio.h>
void show(int x[],int n)
{
	if(n<2)return;
	int m1=n/2;
	 int a[m1];
	 int i;
	 for(i=0;i<m1;i++)
	 {
		 a[i]=x[i];
	 }
	 show(a,m1);
	 printf("%d\n",a[m1-1]);
}
void main()
{
	int x[]={10,20,30,40,50,60,70,80,90};
	show(x,9);
}