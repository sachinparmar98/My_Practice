#include"stdio.h"
#include<conio.h>

void main()
{
	/*
	//for find largest no, in 4 number
int x=700;
int y=600;
int z=501;
int w=500;
char c=x>y?x>z?'x':'z':y>z?'y':'z';
printf("%c is largest\n",c);


c=x>y?x>z?x>w?'x':'w':z>w?'z':'w':y>z?y>w?'y':'w':z>w?'z':'w';
printf("%c is largest",c);
*/
int x[]={1,2,3,4,5};
int *p=&x[0];
printf("%d\n",*p);
p++;
for(int i=1;i<=5;i++)
{
	printf("%d\n",*p);
	p--;
}
}
/*
if('a')//true
if('0')//true
if(0.01)//true
if(3.3)//true
int x=04;
if(x)//true
int x=0xa;
if(x)//true
int x=0x3;
if(x)//true
*/