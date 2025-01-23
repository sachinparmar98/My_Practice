#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void insertAtB(int);
void insertAtSp(int ,int);
void insertAtE(int );
void showall();
void delteAtB();
int countNodes();
void deleteAtE();
void deleteAtSp(int  );
void palindrome();

struct node
{
	struct node *prev;
	struct node *next;
	int data;
};
struct node *start=NULL;
struct node *end=NULL;

void main()
{
	insertAtE(1);
	insertAtE(2);
	insertAtE(3);
	insertAtE(4);
	insertAtE(5);
	insertAtE(6);

	//insertAtSp(55,3);
	//delteAtB();
   showall();
  // palindrome();
	//deleteAtE();
//deleteAtSp(2);
   //showall();
 //  printf("%d\n",countNodes());
    // showall2();
}
void insertAtB(int x)
{
	struct node *temp = malloc(sizeof(struct node ));
	if(temp==NULL)
	{
		printf("No Space Available....///");
	}
	temp->data=x;
	temp->next=start;
	temp->prev=NULL;
	
	if(start!=NULL)start->prev=temp;
	else
	{
		end=temp;
	}
	start=temp;
}
void showall()
{if(start==NULL) 
	{
		printf("list is empty\n");
		return;
	}
	struct node *temp1 =start;
	while(temp1!=NULL)
	{
		printf("%d\n",temp1->data);
		temp1=temp1->next;
	}
}
void insertAtSp(int x,int p)
{
	if(p<=1)
	{
		
		insertAtB(x);
		return;
	}
	if(p>countNodes())
	{
		
		insertAtE(x);
		return;
	}
	
	struct node *temp=malloc(sizeof(struct node));
	if(temp==NULL)
	{
		printf("no space\n");
		return;
		
	}
	struct node *temp1=start;
	temp->data=x;
	for(p=1;p<3-1;p++)
	
	{
		temp1=temp1->next;
	}
	temp->next=temp1->next;
	temp->prev=temp1;
	temp->next->prev=temp1;
	temp1->next=temp;
	
}
void insertAtE(int x)
{
		if(start==NULL)
	{
		insertAtB(x);
	return;
	}
	struct node *temp = malloc(sizeof(struct node ));
	if(temp==NULL)
	{
		printf("No Space Available....///");
	}
		temp->data=x;
		temp->next=NULL;
		temp->prev=end;
		//end->next=temp;
		//end=temp;
		end=end->next=temp;
		//end->next=end=temp;
		}
int countNodes()
{
	
	if(start==NULL)
	{
		printf("list is empty\n");
		return 0;
	}
	struct node *temp=start;
	int count=0;
	while(temp!=NULL)
	{
		count++;
		temp=temp->next;
	}
	return count;
}

void delteAtB()
{
	if(start==NULL)
	{
		printf("list is empty\n");
		return;
	}
	struct node *temp=start;
		
	if(start->next!=NULL)  start->next->prev=NULL;
	else   end=NULL;
	
			
		start=start->next;
	free(temp);
}
void deleteAtE()
{
if(start==NULL || start->next==NULL)
{
	delteAtB();
	return;
}
struct node *temp=end;
end->prev->next=NULL;
end=end->prev;
free(temp);


}

void deleteAtSp(int position)
{
	if(start==NULL)
	{
		printf("list is empty\n");
		return;
	}
	if(position<=1)
	{
	  delteAtB();
	  return;
	}
	if(position>=countNodes())
	{
		deleteAtE();
		return;
	}
	struct node *temp=start;
	for(int i=1;i<position;i++)
	{
		temp=temp->next;
	}
	temp->prev->next=temp->next;
	temp->next->prev=temp->prev;
	free(temp);
	
}


void palindrome()
{

	if(start==NULL)
	{
		printf("list is empty\n");
		return;
	}
	int s=0,e=0;
  struct node *temp=start;
  struct node *temp1=end;
  while(temp!=NULL )
  {  int j=temp->data;
	  while(j!=0)
	  {
		  s=s*10+j%10;
		  j=j/10;
		  
	  }
	  temp=temp->next;
	  
  }
  while(temp1!=NULL )
  {  int j=temp1->data;
	  while(j!=0)
	  {
		  e=e*10+j%10;
		  j=j/10;
		  
	  }
	  temp1=temp1->prev;
	  
  }
  if(s==e)
  printf("linked list is palindrome\n");
else 
	printf("linked list is not palindrome\n");
}