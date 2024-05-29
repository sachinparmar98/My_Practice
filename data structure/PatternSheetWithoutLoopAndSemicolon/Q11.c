#include<stdio.h>
int show(int a,int b,int n)
{
	if(b<=n){
		
		if(printf("%d ",a+b)&& a==n&& printf("6\n") && b++)
		{
			if(a=0){}
		}
	  if(show(++a,b,n)){}
		
	}
}

void  main()
{
if(show(1,1,5)){}
}

/*
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
6 7 8 9 10



*/