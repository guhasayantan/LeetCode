package Easy;
class SwapNode
{
	int data;
	SwapNode next;
	SwapNode(int d)
	{
		this.data =d;
	}
	public void display()
	{
		System.out.print(data + " ");
	}
}
class SwapLinkedList
{
	SwapNode head;
	public void printLL(SwapNode first)
	{
		SwapNode temp = first;
		while(temp!=null)
		{
			temp.display();
			temp=temp.next;
		}
	}
	public SwapNode swapNodePairs(SwapNode l1)
	{
		if(l1 == null || l1.next== null)
			return l1;
		SwapNode first = l1;
		SwapNode second = first.next;
		SwapNode third = second.next;
		
		second.next = first;
		first.next = swapNodePairs(third);
		return second;
	}
	public void printSL(SwapNode head)
	{
		SwapNode temp = head;
		while(temp!=null)
		{
			temp.display();
			temp = temp.next;
		}
	}
}
public class SwapNodePairs {

	public static void main(String[] args) {
		SwapLinkedList sll = new SwapLinkedList();
		SwapNode l1 = new SwapNode(1);
		l1.next = new SwapNode(2);
		l1.next.next = new SwapNode(3);
		l1.next.next.next = new SwapNode(4);
		l1.next.next.next.next = new SwapNode(5);
		l1.next.next.next.next.next = new SwapNode(6);
		System.out.println("Linked List before swap: ");
		sll.printSL(l1);
		System.out.println("Linked List after swap: ");
		sll.swapNodePairs(l1);
		sll.printSL(l1);
	}

}
