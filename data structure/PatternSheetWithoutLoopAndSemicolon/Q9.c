#include<stdio.h>
int show(int a,int b,int n)
{
	if(b>=1){
		if(printf("%d ",a)&& a==n&& printf("\n") && b--)
		{
			if(a=b-1){}
		}
	  if(show(++a,b,n)){}
		
	}
}

void  main()
{
if(show(5,5,5)){}
}

/*
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5


*/