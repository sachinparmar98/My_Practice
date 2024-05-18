#include<stdio.h>
int show(int a,int b,int n)
{
	if(b<=n){
		if(printf("%d ",a)&& a==1&& printf("\n")&& b++ )
		{
			if(a=n+1){}
		}
	  if(show(--a,b,n)){}
		
	}
}

void  main()
{
if(show(5,1,5)){}
}

/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1


*/