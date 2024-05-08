
#include<stdio.h>
void main()
{
	int x=10;
	int y=40;
	int z=400;
	x>y && x>z && printf("x is largest\n");
	y>x && y>z && printf("y is largest\n");
	z>x && z>y && printf("z is largest\n");
}
//out put = z is largest