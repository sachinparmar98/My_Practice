#include<stdio.h>

void show(char x[])
{
	int a[26]={0};
	int i=0;
	int c=0;
	int count =0;
	
		
	while(x[i]!='\0')
	{
	
		a[x[i]-97]++;
		i++;
	}
	int min=a[0];
1	
	for(i=1;i<26;i++)
	{
		if(a[i]<min && a[i]!=0)
		{
			printf("%d\n",count++);
			min=a[i];
             c=i;
		}
	}
	printf("minimum occurence is %c => %d times",c+97,min);
	
}

void main()
{
char x[]="abckkjkjkcabz";

 show(x);
// printf("maximum ocurence is =>%d",y);
}