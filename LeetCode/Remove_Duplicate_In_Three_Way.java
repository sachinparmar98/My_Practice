//Remove Duplicate from LinkedList

//First way timeComplexity O(n*n)
class Remove_Duplicate_In_Three_Way
{
public static void main(String ar[])
{

}
public removeDupli(Node *head)
{
    Node *current=head;
   while(current!=NULL)
   {
	   Node *next_next=current->next;
	   while(next_next!=NULL)
	   {
		   if(current->data==next_next->data)
		   {
			  Node *temp=next_next;
			  current->next=temp->next;
			  delete(temp);
		   }
		   else
		   {
			   next_next=next_next->next;
		   }
	   }   
}
}
}
//second Way
 //import java.util.Map;
//import java.util.HashMap; 
 public void removeDuplicate(Node *head)
 {
	 Map<*Node ,Bollean>m=new HashMap<>();
        Node *current=head;	
	while(current!=NULL)
	 {
		 if()
	 }
 }