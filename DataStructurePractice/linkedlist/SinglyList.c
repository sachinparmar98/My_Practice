// friday test prepration
//  singly linked lists
#include <stdio.h>
#include <stdlib.h>
void insertAtB(int x);
void insertAtE(int x);
int deleteAtB();
int deleteAtE();
void showAll();
void insertAtSP(int x, int pos);
int deleteAtSP(int pos);
struct Node *createNode();
int countNode();
struct Node
{
	int data;
	struct Node *next;
};

struct Node *start = NULL;
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
	showAll();
	
	printf(".................................\n");
	printf("DELETED=>%d\n",deleteAtSP(1));
	showAll();printf(".................................\n");
	printf("DELETED=>%d\n",deleteAtSP(10));
	showAll();printf(".................................\n");
	printf("DELETED=>%d\n",deleteAtSP(3));
	showAll();printf(".................................\n");
	printf("DELETED=>%d\n",deleteAtSP(5));
	showAll();printf(".................................\n");
	printf("DELETED=>%d\n",deleteAtSP(7));
	showAll();
}

struct Node *createNode()
{
	struct Node *temp = malloc(sizeof(struct Node));
	if (temp == NULL)
	{
		printf("space is not avilable\n");
		exit(0);
	}
	return temp;
}

void insertAtB(int x)
{
	struct Node *temp = createNode();
	temp->data = x;
	temp->next = start;
	start = temp;
}

void showAll()
{
	struct Node *temp = start;
	while (temp != NULL)
	{
		printf("%d\n", temp->data);
		temp = temp->next;
	}
}

void insertAtE(int x)
{
	if (start == NULL)
	{
		insertAtB(x);
		return;
	}
	struct Node *temp = createNode();
	temp->data = x;
	struct Node *temp1 = start;
	while (temp1->next != NULL)
	{
		temp1 = temp1->next;
	}
	temp1->next = temp;
	temp->next = NULL;
}

int deleteAtB()
{
	if (start == NULL)
	{
		printf("list is empty\n");
		return;
	}

	struct Node *temp = start;
	int x = temp->data;
	start = start->next;
	free(temp);
	return x;
}

int deleteAtE()
{
	if (start == NULL || start->next == NULL)
	{
		deleteAtB();
		return;
	}

	struct Node *temp = start;
	struct Node *temp1;
	while (temp->next != NULL)
	{
		temp1 = temp;
		temp = temp->next;
	}
	int x = temp->data;
	free(temp);
	temp1->next = NULL;
	return x;
}

void insertAtSP(int x, int pos)
{
	if (start == NULL || pos<=1)
	{
		insertAtB(x);
		return;
	}
	else if(pos >countNode())
	{
		insertAtE(x);
		return;
	}
	struct Node *temp = createNode();
	temp->data=x;
	struct Node *temp1=start;
	
	for(int i=1;i<=pos-2;i++)
	{
		temp1=temp1->next;
	}
	
	    temp->next=temp1->next;
temp1->next=temp;		
	   
	 
}

int countNode()
{
	int x=0;
	if(start==NULL)
	  return x;
  
    struct Node *temp=start;
	 while(temp!=NULL)
	 {
		 ++x;
		 temp=temp->next;
	 }
	return x;
}

int deleteAtSP(int pos)
{
	if(start==NULL || pos<=1)
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
	 
	 for(int i=1;i<=pos-2;i++)
	 {
		 temp=temp->next;
	 }
	    
		 int x=temp->next->data;
		 
		 struct Node * temp1=temp->next;
		 
		 temp->next=temp->next->next;
		 free(temp1);
		 return x;
		 
		 
}
