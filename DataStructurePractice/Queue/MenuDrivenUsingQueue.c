#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
void enqueueAtB(int x);
void enqueueAtE(int x);
int dequeueAtB();
int dequeueAtE();
bool isEmpty();
void showAll();
int peek();
struct Node
{
int data;
struct Node *next;
};
struct Node *front=NULL;
struct Node *rear=NULL;
void main()
{
	int x,x1;
	M:
printf("...........MENU............\n") ;
printf("1 For Insert At Begning\n")     ;
printf("2 For Insert At Ending\n")      ;
printf("3 For Delete At Ending\n")      ;
printf("4 For Delete At Begning\n")     ;
printf("5 For Queue is Empty or Not\n");
printf("6 For Show all Data\n");
printf("7 For Exit\n");
printf("Enter Your Choice\n");
scanf("%d",&x);
switch(x)
{
	case 1:
printf("enter any vlaue\n");
scanf("%d",&x1);
      enqueueAtB( x1);	
	goto M;
case 2:
	printf("enter any vlaue\n");
scanf("%d",&x1);
      enqueueAtE( x1);
	goto M;
case 3:
	printf("%d\n",dequeueAtE());
	goto M;
case 4:
	printf("%d\n",dequeueAtB());
	goto M;
case 5:
	printf("%s\n",isEmpty()?"Queue is Empty":"Queue is not Empty");
	goto M;
	case 6:
	showAll();
	goto M;
case 7:
	exit(0);
	default:
	printf("invalid data\n");
	goto M;
}
}
void enqueueAtB(int x)
{
struct Node *temp=malloc(sizeof(struct Node));
if(temp==NULL)
{
	printf("no spaces\n");
	return;
}
if(isEmpty())
{
	rear=temp;
}
temp->data=x;
temp->next=front;
front=temp;
}
void enqueueAtE(int x)
{
	if(front==NULL)
	{
		enqueueAtB(x);
		return;
	}
struct Node *temp=malloc(sizeof(struct Node));
if(temp==NULL)
{
	printf("no spaces\n");
	return;
}
temp->data=x;
temp->next=NULL;
rear=rear->next=temp;

}
int dequeueAtB()
{
if(isEmpty())
{
	printf("queue is empty\n");
	exit(0);
}
struct Node *temp=front;
 front=front->next;
 int x=temp->data;
 free(temp);
 return(x);
}
int dequeueAtE()
{
if(isEmpty())
{
	printf("queue is empty\n");
	exit(0);
	
}
if(front->next==NULL)
{
	dequeueAtB();
}
else
{
struct Node *temp=front;
while(temp->next->next!=NULL)
{
temp=temp->next;	
}
int x=rear->data;
rear=temp;
rear->next=NULL;
free(temp->next);
return x;
}
}
bool isEmpty()
{
if(front==NULL)
return true;
return false;
}
void showAll()
{
	if(isEmpty())
	{
		printf("queue is empty\n");
		return;
	}
struct Node *temp=front;
while(temp!=NULL)
{
	printf("%d\n",temp->data);
	temp=temp->next;
}	
}


