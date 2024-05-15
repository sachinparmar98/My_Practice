#include<stdio.h>
int show(char c[])
{
	int length=0;
int i=0;
while(c[i]!='\0')
{
length++;
i++;	
}
return length;
}

void main()
{

char c[]="ram  ";

printf("Length of String => %d",show(c));
}