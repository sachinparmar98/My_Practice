#include<stdio.h>
#include<stdlib.h>
struct Node* cn(int );
void insertAtB(int);
void insertAtE(int);
void showAll();
void showAllR();
void showForwardSpo(int );
void showBackwardSpo(int);
struct Node
{
	int data;
	struct Node *next;
	struct Node *prev;
};
	struct Node *start=NULL;
	struct Node *end=NULL;
	void main()
	{
		insertAtE(10);
		insertAtE(20);
		insertAtE(30);
		insertAtE(40);
		insertAtE(50);
showBackwardSpo(30);
         //showForwardSpo(30);
		///showAllR();
	}
	struct Node* cn(int x)
	{
		struct Node *temp=malloc(sizeof(struct Node));
		if(temp==NULL)
		{
			printf("no space\n");
			return temp;
		}
		temp->data=x;
		return temp;
	}
	void insertAtB(int x)
	{
		struct Node *temp=cn(x);
		
	if(start==NULL)  start=end=temp->next=temp->prev=temp;
	else 
	{
		temp->next=start;
		temp->prev=end;
start=end->next=start->prev=temp;
	
	}
	
	
	}
void showAll()
{
	if(start==NULL)
	{
		printf("list is empty\n");
		return;
	}
	struct Node *temp=start;
	do
	{
		printf("%d\n",temp->data);
		temp=temp-> next;
	}
	while(temp!=start);
}


void insertAtE(int x)
{
	if(start==NULL)
	{
		insertAtB(x);
		return;
	}
	struct Node *temp=cn(x);
start->prev=end->next=temp;
temp->prev=end;
temp->next=start;
end=temp;
	
}


void showAllR()
{
	if(start==NULL)
	{
		printf("list is empty\n");
		return;
	}
	struct Node *temp=end;
	do
	{
		printf("%d\n",temp->data);
		temp=temp->prev;
	}while(temp!=end);
}
void showForwardSpo(int x )
{
	struct Node *temp=start;
	while(temp->data!=x)
	{
		temp=temp->next;
		if(temp==start)
		{
			printf("list is empty\n");
			return;
		}
	}
struct Node *temp1=temp;
do
{
		printf("%d\n",temp->data);
temp=temp->next	;
}while(temp!=temp1);
}


 void showBackwardSpo(int x)
{
	struct Node *temp=start;
	while(temp->data!=x)
	{
		temp=temp->next;
		if(temp==start)
		{
			printf("list is empty\n");
			return;
		}
	}
struct Node *temp1=temp;
do
{
		printf("%d\n",temp->data);
temp=temp->prev	;
}while(temp!=temp1);
}
