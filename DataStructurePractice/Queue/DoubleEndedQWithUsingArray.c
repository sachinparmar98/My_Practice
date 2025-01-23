#include<stdio.h>
#define CAPACITY 5
void enqueueAtB(int);
void enqueueAtE(int);
int dequeueAtB();
int dequeueAtE();
void showAll();
int queue[CAPACITY];
int f=-1;
int r=-1;
void main()
{
enqueueAtE(10);
enqueueAtE(20);
enqueueAtE(30);
enqueueAtE(40);
enqueueAtE(50);
showAll();
dequeueAtB();
dequeueAtB();
showAll();
enqueueAtB(60);
enqueueAtB(70);
showAll();
}

void enqueueAtE(int x)
{    
	if(f==-1)f++;
	queue[++r]=x;
}
void enqueueAtB(int x)
{
	if(f>0 )
	{
	
	queue[--f]=x;
	}
	
}
int dequeueAtB()
{
	return queue[f++];
}
void showAll()
{ int i=f;
	while(i<=r)
	{
		printf("%d\n",queue[i++]);
	}
}