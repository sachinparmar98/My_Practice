#include<stdio.h>
int show(int a,int b,int n)
{
	if(b<=n){
		if(printf("%d ",a+1)&& a==0 && printf("\n") )
		{
			if(a=++b){}
		}
	  if(show(--a,b,n)){}
		
	}
}

void  main()
{
if(show(0,1,5)){}
}

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/