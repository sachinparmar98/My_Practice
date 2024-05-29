#include<stdio.h>
int show(int a,int b,int n)
{
	if(b<=n){
		
		if(printf("* ")&& a==b&& printf("\n") && b++)
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
*
* *
* * *
* * * *
* * * * *
*/