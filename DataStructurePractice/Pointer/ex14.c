#include<stdio.h>
void show(int a[])
{
	
a[2]=55;
}
void main()
{
	int x[]={10,20,30,40,50};
	show(x);
for(int i=0;i<5;i++)
printf("%d\n",i[x]);

}

/*
 
out put


10
20
55
40
50


*/