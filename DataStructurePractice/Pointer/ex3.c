#include<stdio.h>
  void show(int *,int *);
void main()
{
	int x=10;
	short y=3;
	printf("x=%d\n",x);
    int *p=&x;
	
	printf("p=%u\n",p);
	++p;
	printf("p=%u\n",p);


printf("y=%d\n",y);
    int *q=&y;
	
	printf("q=%u\n",q);
	++q;
	printf("q=%u\n",q);

 float c=40;
printf("c=%f\n",c);
    int *s=&c;
	
	printf("s=%u\n",s);
	++s;
	printf("s=%u\n",s);
}
/*
x=10
p=6422288
p=6422292
y=3
q=6422286
q=6422290
c=40.000000
s=6422280
s=6422284


int ha isliya 4 sa plus ho rha ha int size 4 byte
*/