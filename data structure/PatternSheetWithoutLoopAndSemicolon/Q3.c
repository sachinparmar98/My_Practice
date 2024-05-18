#include<stdio.h>
int show(int a,int b,int n)
{
	if(b<=n){
		if(printf("%d ",a)&& a==n && printf("\n"))
		{
			if(a=b++){}
		}
	  if(show(++a,b,n)){}
		
	}
}

void  main()
{
if(show(1,1,5)){}
}

/*
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5

*/