package Easy;

class MNode
{
	int data;
	MNode next;
	MNode(int d)
	{
		this.data =d;
	}
	public void display()
	{
		System.out.print(data + " ");
	}
}
class MLinkedList
{
	MNode head;
	public void printLL(MNode first)
	{
		MNode temp = first;
		while(temp!=null)
		{
			temp.display();
			temp=temp.next;
		}
	}
	public MNode mergeSortedList(MNode l1, MNode l2)
	{
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		if(l1.data < l2.data)
		{
			l1.next = mergeSortedList(l1.next, l2);
			return l1;
		}
		else
		{
			l2.next = mergeSortedList(l1, l2.next);
			return l2;
		}
	}
}
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		MLinkedList l = new MLinkedList();
		MNode l1 = new MNode(2);
		l1.next = new MNode(4);
		l1.next.next = new MNode(6);
		System.out.println("Printing Linked List 1 : ");
		l.printLL(l1);
		System.out.println();
		MNode l2 = new MNode(1);
		l2.next = new MNode(3);
		l2.next.next = new MNode(5);
		System.out.println("Printing Linked List 2 : ");
		l.printLL(l2);
		System.out.println();
		MNode newnode = l.mergeSortedList(l1, l2);
		System.out.println("Printing New Merged List : ");
		l.printLL(newnode);

	}

}
