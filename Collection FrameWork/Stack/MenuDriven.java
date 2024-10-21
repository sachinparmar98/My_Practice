import java.util.*;

class MenuDriven {
public static void main(String ...a)
{
	LinkedList s=new LinkedList();
	while(true)
	{
System.out.printf("............Menu.........\n 1 for InsertAtBegining\n 2 for InsertAtEnding \n 3 for Remove first\n 4 for Remove last \n 5 for getFrist \n 6 for getLast \n 7 for showAll \n 8 for exit\n");
Scanner sc=new Scanner(System.in);
byte b=sc.nextByte();
int x=0;
if(b==1 || b==2)
{System.out.println("Enter data for insert\n");
x=sc.nextInt();}
switch(b)
{
shaif;
	case 1 :s.addFirst(x);
	break;
	case 2 :s.addLast(x);
	break;
	case 3 :System.out.println(s.removeFirst());
	break;
	case 4: System.out.println(s.removeLast());
    break;
	case 5: System.out.println(s.getFirst());
	break;
	case 6: System.out.println(s.getLast());
	break;
	case 7: System.out.println(s);
	break;
	case 8: System.exit(0);
	default:
	System.out.println("invalid case label");
}
}
}
}