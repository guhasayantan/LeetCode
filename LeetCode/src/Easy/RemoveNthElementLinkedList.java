package Easy;
class NthNode
{
	int data;
	NthNode next;
	public NthNode(int d)
	{
		this.data =d;
		this.next = null;
	}
	public void display()
	{
		System.out.print(data + " ");
	}
}
public class RemoveNthElementLinkedList {

	public static void main(String[] args) {
		NthNode ll = new NthNode(1);
		ll.next = new NthNode(2);
		ll.next.next = new NthNode(3);
		ll.next.next.next = new NthNode(4);
		ll.next.next.next.next = new NthNode(5);
		printLL(ll);
		System.out.println();
		printLL(removeNthFromEnd(ll, 2));
	}
	public static void printLL(NthNode head)
	{
		NthNode temp = head;
		while(temp!=null)
		{
			temp.display();
			temp = temp.next;
		}
	}
	public static NthNode removeNthFromEnd(NthNode head, int n) 
	{
		NthNode first , second , dummy = new NthNode(0);
		first = dummy;
		second =dummy;
		dummy.next = head;
		for(int i = 0; i < n; i++)
		{
			second = second.next;
		}
		while(second.next!=null)
		{
			second = second.next;
			first=first.next;
		}
		first.next = first.next.next;
		return dummy.next;
	}

}
