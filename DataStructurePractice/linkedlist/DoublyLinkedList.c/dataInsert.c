#include<stdio.h>
#include<stdlib.h>
void insertAtB(int );
void deleteAtB( );
void showAll( );
void deleteAtE();
struct Node
{
	int data;
	struct Node *next;
	struct Node *prev;
};
	struct Node *start=NULL;
void main()
{
insertAtB(10);
//insertAtB(20);
//insertAtB(30);
//insertAtB(40);
//insertAtB(50);
//showAll();
//deleteAtE();
//showAll();
//deleteAtE();
//showAll();
//deleteAtE();
//showAll();
//deleteAtE();
showAll();
deleteAtE();
showAll();
deleteAtE();
showAll();
}
void insertAtB(int x)
{
	struct Node *temp=malloc(sizeof(struct Node));
if(temp==NULL)
{
	printf("no space\n");
	return;
}
temp->data=x;
temp->prev=NULL;
temp->next=start;
if(start!=NULL)
{
	start->prev=temp;
}
start=temp;
}

void showAll()
{
	if(start==NULL)
	{
		printf("list is empty\n");
		return;
	}
	struct Node *temp1=start;
	while(temp1!=NULL)
	{
			printf("%d\n",temp1->data);
			temp1=temp1->next;
		
	}
}

void deleteAtB()
{
	if(start==NULL)
	{
		printf("list is empty\n");
		return;
	}
	if(start->next==NULL)
	{    
			struct Node *temp1=start;
		free(temp1);
	
		start=NULL;
	}
	else
		{
				struct Node *temp1=start;
	start =start->next;
	start->prev=NULL;
	free(temp1);
		}
}
void deleteAtE()
{
	if(start==NULL)
	{
		printf("list is empty\n");
		return;
	}
	if(start->next==NULL)
	{
		deleteAtB();
		return;
	}
	struct Node *temp1=start;
	while(temp1->next->next!=NULL)
	{
		temp1=temp1->next;
	}
	free(temp1->next);
	temp1->next=NULL;
}