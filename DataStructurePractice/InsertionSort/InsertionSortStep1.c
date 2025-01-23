//Insertion Sort left to Rigt

#include<stdio.h>
void display(int x[],int n);
void insSort(int x[],int n)
{
	int i,j,value;
	for(i=1;i<n;i++)
	{
		value=x[i];
		for(j=i;j>0;j--)
		{
			if(x[j-1]>value)
				x[j]=x[j-1];
			else break;
		}
		x[j]=value;
		display(x,n);
	}
	
}
void display(int x[],int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("%d  ",x[i]);
	}
	printf("\n");
}
void main()
{
	int n=8;
	int x[]={56,29,35,42,15,41,75,21};
	display(x,n);
	insSort(x,n);
}