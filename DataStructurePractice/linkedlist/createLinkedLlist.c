#include<stdio.h>
#include<stdlib.h>
void insertAtB(int);
void showAll();
struct Node
{
	int data;
	struct Node *next;
};
struct Node *start=NULL;

void main()
{
	insertAtB(10);
	insertAtB(20);
	insertAtB(30);
	insertAtB(40);
	insertAtB(50);
	showAll();
	showAll();
	
}
void insertAtB(int x)
{
	struct Node *temp=malloc(sizeof(struct Node));
	
		temp->data=x;
		temp->next=start;
		start=temp;
	
	
}
void showAll()
{struct Node *temp1=start;
	while(temp1!=NULL)
	{
		
		printf("%d\n",temp1->data);
		temp1=temp1->next;
		
	}
}