#include<stdio.h>
int show(int a,int b,int n)
{
	if(b<=n){
		if(printf("%d ",a)&& a==b && printf("\n") && b++)
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
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/