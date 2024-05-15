#include<stdio.h>

void show(char x[],int o)
{
	int a[26]={0};
	int i=0;
	
	
	
		
	while(x[i]!='\0')
	{
	
		a[x[i]-97]++;
		i++;
	}
	
	for(i=0;i<26;i++)
	{
		if(a[i]==o)
		{
			
	printf(" %c => %d times\n",i+97,o);
			
            
		}
	}
	
}

void main()
{
int l;
char x[]="vvvvvvllllllabppppppckkjkjkcabz";
printf("enter no for ocurence criteria\n ");
scanf("%d",&l);
 show(x,l);
// printf("maximum ocurence is =>%d",y);
}