#include<stdio.h>
void show(int *a)
//void shoe(int a[])// this line is same as above
{
	printf("%d\n",sizeof(a));
printf("%d\n",a);
printf("%d\n",&a[0]);//line 6 and 7 are same
}
void main()
{
	int x[]={10,20,30,40,50};
	show(x);
//for(int i=0;i<5;i++)
	printf("%d\n",sizeof(x));
//printf("%d\n",x);

}

/*
 
out put


4
20

*/