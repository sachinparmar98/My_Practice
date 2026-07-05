#include <stdio.h>
void show(int x[], int n, int div)
{
	int a[10] = {0};
	int y[n];
	int i;
	for (i = 0; i < n; i++)
		a[x[i] / div % 10]++;
                  
	for (i = 1; i < 10; i++)
		a[i] += a[i - 1];

	for (i = 0; i < n; i++)
		y[a[x[i] / div % 10] -= 1] = x[i];

	for (i = 0; i < n; i++)

		x[i] = y[i];
}
void main()
{
	int n = 7;
	int x[] = {329, 457, 657, 839, 436, 720, 350};
	show(x, n, 1);
	show(x, n, 10);
	show(x, n, 100);
	for (int i = 0; i < n; i++)
		printf("%d  ", x[i]);
}
class can be do in the smae way that mean 
class can be do in the smae way that meanmy man be the honest to be in the same we could
in the chance of solution can be the same way of the could we make in some of the chance be the some of the ellusion in they could be the chance can be it 
class Dem
{ 
	public static void main(String r[])uild can be om  s
	{
		in the formation of the chance can be in the formation in some of the way that can be in the some of the chanxe can be in formation in the b
	}
}some of the ccan be could my name is sachin priyanshu parmar anar sing parar 
mohan lal singh can be 