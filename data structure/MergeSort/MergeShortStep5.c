//when an function call it self is called indirect recursion.

#include<stdio.h>
void show(int x[],int n)
{
	if(n<2)return;
	int m1=n/2;
	int m2=n-m1;
	int b[m2];
	 int a[m1];
	 int i;
	 for(i=0;i<m1;i++)
	 {
		 a[i]=x[i];
	 }
	 for(i=0;i<m2;i++)
	 {
		 b[i]=x[m1+i];
	 }
	 printf("%d\n",b[m2-1]);
	 show(b,m2);
}
void main()
{
	int x[]={10,20,30,40,50,60,70,80,90};
	show(x,9);
}

//out put
//90
//90
//90
//90


 // output
//10
//10
//10