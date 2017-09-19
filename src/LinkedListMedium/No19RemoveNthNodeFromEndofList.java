package LinkedListMedium;

public class No19RemoveNthNodeFromEndofList {

	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode beforeHead = new ListNode(0);
        beforeHead.next = head;
        ListNode slow = beforeHead;
        ListNode fast = beforeHead;
        
        for (int i = 0; i <= n; i++) {   // 0 - 1 - 2 - 3 - 4 - 5
            fast = fast.next;           //             fast
        }
        while (fast != null) {
            slow = slow.next;         //  0 - 1 - 2 - 3 - 4 - 5  -  null
            fast = fast.next;       //               slow           fast
        }
        slow.next = slow.next.next; // fast 没改动这个链表，slow改动了这个链表，
        							//最后用beforehead.next来回到这个链表的头部
        return beforeHead.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
