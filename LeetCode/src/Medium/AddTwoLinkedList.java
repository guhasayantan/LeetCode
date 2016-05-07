package Medium;
/*
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */
class ListNode
{
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
public class AddTwoLinkedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		AddTwoLinkedList addll = new AddTwoLinkedList();
		ListNode c = addll.addTwoNumbers(l1, l2);
		
		while(c!=null)
		{
			System.out.print(c.val + " ");
			c=c.next;
		}
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    
	    int carryover=0;
	    
	    ListNode newNode =  new ListNode(0);
	    ListNode a=l1, b= l2, c=newNode;
	    
	    while(a!=null || b!=null)
	    {
	        if(a!=null)
	        {
	            carryover+=a.val;
	            a=a.next;
	        }
	        if(b!=null)
	        {
	            carryover+=b.val;
	            b=b.next;
	        }
	        c.next = new ListNode(carryover%10);
	        c=c.next;
	        carryover/=10;
	    }
	    if(carryover==1) 
	            c.next=new ListNode(1);
	    return newNode.next;
	    }
}
