#include<stdio.h>
int show(int a,int b,int n)
{
	if(b>=n){
		if(printf("%d ",a)&& a==b&& printf("\n")&& b-- )
		{
			if(a=6){}
		}
	  if(show(--a,b,n)){}
		
	}
}

void  main()
{
if(show(5,5,1)){}
}

/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1


*/