#include<stdio.h>

void show(char x[])
{
	
	int a[26]={0};
	int i=0;
	int c=0;
	
		int max=a[0];
	while(x[i]!='\0')
	{
	
		a[x[i]-97]++;
		i++;
	}
	for(int j=0;j<26;j++)
	{

		if(max<a[j])
		{
	
		max=a[j];
          c=j;		
		}
	}
	printf("Maxium occurence is %c => %d times",c+97,max);
	
}

void main()
{
char x[]="ram ka papa bhopal gaya";

 show(x);
// printf("maximum ocurence is =>%d",y);
}