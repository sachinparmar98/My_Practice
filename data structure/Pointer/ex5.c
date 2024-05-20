#include<stdio.h>
  void show(int *,int *);
void main()
{
	int x[]={10,20,30,40,50};
	int i;
	int *p=&x[0];
	for(i=0;i<5;i++)
     		
	printf("%u\n",&x[i]);
	printf("\n\n\n\n");
	p++;
     		
	printf("%u\n",*p);
	for(i=0;i<5;i++)
	printf("%u\n",&x[i]);


}
/*
6422276
6422280
6422284
6422288
6422292




20
6422276
6422280
6422284
6422288
6422292

*/