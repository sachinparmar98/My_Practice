#include<stdio.h>
#include<stdlib.h>

void bubbleSort();
void showAll();
void insertAtB( );
void insertAtE();
void insertAtSp( );
void deleteAtB();
void deleteAtE();
void deleteAtSp();
int countNode();
struct Node
{
int data;
struct Node *next;
};
struct Node *start=NULL;
void main()
{
	int x=0;
	M:
	printf("..............MENU.............\n\n");
	printf("       1  -> Count Node \n");
	printf("       2  -> Insert Data at Begning  \n");
	printf("       3  -> Insrt Data at Ending \n");
	printf("       4  -> Insert Data at Specfic Postion\n");
	printf("       5  -> Delete Data at Begning \n");
	printf("       6  -> Delete Data at Ending  \n");
	printf("       7  -> Delete Data at Specfic Postion \n");
	printf("       8  -> Display Data\n");
	printf("       9  -> Sort  Data \n");
	printf("       10 ->Exit\n\n\n");
	printf("....ENTER NUNBER fOR REQUIRD OPERATION....\n\n");
	scanf("%d",&x);
	printf("\n\n");
	switch(x)
	{
		case 1:
		printf("total node=%d\n",countNode());
		goto M;
	   
		case 2:
		insertAtB();
		goto M; 
	   
		case 3:
		insertAtE();
		goto M;
	   
		case 4:
		insertAtSp();
		goto M;
	   
		case 5:
		deleteAtB();
	   goto M;
	   
		case 6:
		deleteAtE();
	    goto M;
		
		case 7:
		deleteAtSp();
	    goto M;
		
		case 8:
		showAll();
		goto M;
	   
		case 9:
		bubbleSort();
		goto M;
	   
		case 10:
		exit(0);
		default:
		printf("Enter apropriate choice\n");
		goto M;
	}

}
void insertAtB()
{
	
struct Node *temp=malloc(sizeof(struct Node));
if(temp==NULL)
{
printf("no memory avilable");
return;
}
int x;
	printf("enter value for insert data\n");
	scanf(" %d",&x);
	
  temp->data=x;
  
  temp->next=start;
  start=temp;
  printf("DATA INSERTED\n");
}



void insertAtE()
{

if(start==NULL)
{
insertAtB();
return;
}
struct Node *temp=malloc(sizeof(struct Node));
if(temp==NULL)
{
printf("no memory avilable");
return;
}
int x;
printf("enter value for insert data\n");
	scanf("%d",&x);
temp->data=x;
temp->next=NULL;
struct Node *temp1=start;
while(temp1->next!=NULL)
{temp1=temp1->next;}

temp1->next=temp;
  printf("DATA INSERTED\n");
  }
  
  
  
 void showAll()
 {
	  struct Node *temp=start;
	  printf("Data Of LinkedList Is Below\n");
	  while(temp!=NULL)
	  {
		  printf("%d\n",temp->data );
		  temp=temp->next;
	  }
  }
  
  
  
int countNode()
{
  int count=0;
  struct Node *temp=start;
  while(temp!=NULL)
  { count++;
	  temp=temp->next;
  }
  return count;
}



void bubbleSort()
{
	if(start->next==NULL  || start==NULL)
	{
		return;
	}
	
	struct Node *temp=start;

	struct Node *temp1=malloc(sizeof(struct Node));
	int i=countNode();
	int j;
	
	for(i=i-2;i>=0;i--)
	{
		for(j=0;j<=i;j++)
		{
			if(temp->data>temp->next->data)
			{
				 temp1->data=temp->data;
				temp->data=temp->next->data;
				temp->next->data=temp1->data;
				
			}
			temp=temp->next;
		}
		temp=start;
	}
}


void insertAtSp( )
{
	int position;int value;
	printf("Enter position for insert data\n");
	scanf("%d",&position);
	if(position<=1)
	{
		insertAtB();
		return;
	}
	if(position>countNode())
	{
		insertAtE();
		return;
	}
	printf("Enter value For inser Data\n");
	scanf("%d",&value);
	struct Node *temp1=start;
	struct Node *temp=malloc(sizeof(struct Node));
	temp->data=value;
	 for(int i=1;i<position-1;i++)
	 {
		 temp1=temp1->next;
	 }
temp->next=temp1->next;
temp1->next=temp;	 
}

void deleteAtB( )
{
	if(start==NULL)
	{
		printf("List is Empty\n");
	return;
	}
	struct Node *temp=start;
	start=start->next;
	free(temp);
}

void deleteAtE()
{
	if(start->next==NULL)
	{
		deleteAtB();
		return;
	}
	struct Node *temp=start;
	while(temp->next->next!=NULL)
	
	{
		temp=temp->next;
	}
	  free(temp->next);
	  temp->next=NULL;
	 
	
}

void deleteAtSp()
{
	if(start==NULL)
	{
		printf("list is Empty\n");
		return;
	}
	int position;
	printf("Enter Position for Delete data\n");
	scanf("%d",&position);
	if(position<=1)
	{
		deleteAtB();
		return;
	}
	if(position>countNode())
	{
		deleteAtE();
		return;
	}
	struct Node *temp=start;
	for(int i=1;i<position-1;i++)
	{
		temp=temp->next;
	}
	struct Node *temp1=temp->next;
	temp->next=temp->next->next;
	free(temp1);
	
}