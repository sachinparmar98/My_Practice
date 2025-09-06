#include<stdio.h>
#include<stdlib.h>
void insertAtB(int x);
void insertAtE(int x);
void insertAtSP(int x,int pos);
int deleteAtB();
int deleteAtE();
int deleteAtSP(int pos);
void showAll();
struct Node* createNode(int x);
int countNode();
void showRev();


void main()
{
insertAtE(1);	
insertAtE(2);	
insertAtE(3);	
insertAtE(4);	
insertAtE(5);	
insertAtE(6);
insertAtE(7);
insertAtE(8);
insertAtE(9);
insertAtE(10);
showAll();	
printf(".................\n");
showRev();
}

struct Node 
{
	struct Node *next;
	struct Node *prev;
	int data;
};

struct Node *start=NULL;

struct Node* createNode(int x)
{	
	struct Node *temp=malloc(sizeof(struct Node));
	if(temp==NULL)
	{
		printf("no space avilable\n");
		exit(0);
	}
	temp->data=x;
	return temp;
}

void insertAtB(int x)
{
	struct Node *temp=createNode(x);
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
		return ;
	}
	struct Node *temp=start;
	while(temp!=NULL)
	{
		printf("%d\n",temp->data);
		temp=temp->next;
	}
}

void insertAtE(int x)
{
	if(start==NULL)
	{
		insertAtB(x);
		return;
	}
	
	struct Node *temp=createNode(x);
	struct Node *temp1=start;
	
	while(temp1->next!=NULL)
	{
		temp1=temp1->next;
	}
	  temp1->next=temp;
	  temp->prev=temp1;
	  temp->next=NULL;

}

int countNode()
{  int x=0;
	if(start==NULL)
	{
		printf("list is empty\n");
		return x;
	}
	struct Node *temp=start;
	while(temp!=NULL)
	{
		++x;
		temp=temp->next;
	}
	return x;
}

void insertAtSP(int x,int pos)
{
	
	if(start==NULL || pos<=1)
	{
		insertAtB(x);
		return;
	}
	else if(pos>countNode())
	{
		insertAtE(x);
		return;
	}

       struct Node *temp=createNode(x);
	   struct Node *temp1=start;
	   
	   for(int i=1;i<pos-1;i++)
	   {
		   temp1=temp1->next;
	   }
	   temp->prev=temp1;
	   temp->next=temp1->next;
	   temp1->next=temp;
	   temp->next->prev=temp;
	   
	   
	   
}

int deleteAtB()
{
	if(start==NULL)
	{
		printf("list is empty\n");
		return ;
	}
	
	struct Node *temp=start;
	int x=temp->data;
		  start=temp->next;
		  start->prev=NULL;
		  free(temp);
		  return x;
}

int deleteAtE()
{
	if(start==NULL)
	{
		printf("list is empty\n");
		return;
	}
	
	struct Node *temp=start;
	
	while(temp->next!=NULL)
	{
       temp=temp->next;		
	}
	 int x=temp->data;
	 temp->prev->next=NULL;
	 free(temp);
	 return x;
}

int deleteAtSP(int pos)
{
	if(pos<=1)
	{
		deleteAtB();
		return;
	}
	else if(pos>countNode())
	{
		deleteAtE();
		return;
	}
	
	struct Node *temp=start;
	
	for(int i=1;i<=pos-1;i++)
	{
		temp=temp->next;
	}
	    
		temp->prev->next=temp->next;
		temp->next->prev=temp->prev;
		int x=temp->data;
		free(temp);
		return x;
	
	
}

void showRev()
{
	
	  
	if(start==NULL)
	{
		printf("list is empty\n");
		return;
	}
	struct Node *temp=start;
	while(temp->next!=NULL)
	{
		temp=temp->next;
		
	}
   
   while(temp!=NULL)
   {
	   printf("%d\n",temp->data);
	   temp=temp->prev;
   }
	
}