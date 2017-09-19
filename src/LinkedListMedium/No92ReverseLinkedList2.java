package LinkedListMedium;

class ListNode {
	ListNode next;
	int val;
	ListNode (int x) {
		val = x;
	}
}

public class No92ReverseLinkedList2 {

	public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return null;
        ListNode beforeHead = new ListNode(0);
        beforeHead.next = head;
        ListNode pre = beforeHead;
        
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }
        
        ListNode start = pre.next;
        ListNode then = start.next;
        
        for (int i = 0; i < n-m; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        return beforeHead.next;  // head 会转移到后面去， pre会变， 只有beforeHead.next 不会变
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
