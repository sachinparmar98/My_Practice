#include<stdio.h>
#include<stdlib.h>
void showAll();
void insertAtB(int);
void insertAtE(int);
struct Node
{
int data ;
struct Node *next;
};
struct Node *start=NULL;
void main()
{
insertAtE(10);
insertAtE(20);
insertAtE(30);
insertAtE(40);
insertAtE(50);
showAll();
}
void insertAtB(int x)
{
struct Node *temp=malloc(sizeof(struct Node));
if(temp==NULL)
{
printf("no memory avilable");
return;
}
  temp->data=x;
  temp->next=start;
  start=temp;
}
void insertAtE(int x)
{
struct Node *temp=malloc(sizeof(struct Node));
if(start==NULL)
{
insertAtB(x);
return;
}

temp->data=x;
temp->next=NULL;
struct Node *temp1=start;
while(temp1->next!=NULL)
{temp1=temp1->next;}

temp1->next=temp;
  }
 void showAll()
  {
	  struct Node *temp=start;
	  while(temp!=NULL)
	  {
		  printf("%d\n",temp->data);
		  temp=temp->next;
	  }
  }

