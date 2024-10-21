import java.util.*;
class CFPage173_7
{
	public static void main(String ...a)
	{
		TreeSet t=new TreeSet();
t.add(50.0);
t.add(49.9);
t.add(50.1);
t.add(50.2);
t.add(50.3);
t.add(50.4);
t.add(50.5);
		 //System.out.println(t.lower(50.0));//49.9
		//System.out.println(t.floor(50.0));//50.0
		 //System.out.println(t.ceiling(50.0));//50.0
		 System.out.println(t.higher(50.0));//50.1
		// System.out.println(t.pollFirst());//49.5 and remove from TreeSet
		//System.out.println(t.pollLast());//50.5 and remove from TreeSet
		//System.out.println(t.last());//50.5
		//System.out.println(t.first());//49.9
		//System.out.println(t.headSet(50.3));//[49.9, 50.0, 50.1, 50.2]
		//System.out.println(t.tailSet(50.3));//[50.3, 50.4, 50.5]
		//System.out.println(t.tailSet(50.9));//[]
		//System.out.println(t.subSet(50.9,60.9));//[]
		System.out.println(t.subSet(50.1,50.4));//[]


	}
}