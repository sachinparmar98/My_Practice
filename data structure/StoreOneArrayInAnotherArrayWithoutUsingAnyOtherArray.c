#include<stdio.h>
void display(int x[],int n);
	void reverse(int x[],int n)
	{int value;
		for(int i=0;i<n/2;i++)
		{
			value=x[i];
			   x[i]=x[n-1-i];
			  x[n-1-i]=value;
             display(x,n);			  
	}}
		void display(int x[],int n)
		{
		for(int i=0;i<n;i++)
		{
			printf("%d  ",x[i]);
		}
		printf("\n");}
	
void main()
{
	int n=10
	;
	int x[]={1,2,3,4,5,6,7,8,9,10};
	reverse(x,n);
	
}