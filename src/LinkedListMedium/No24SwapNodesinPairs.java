package LinkedListMedium;

public class No24SwapNodesinPairs {

	public ListNode swapPairs(ListNode head) {
        ListNode beforeHead = new ListNode(0);
        beforeHead.next = head;
        ListNode cur = beforeHead;
        while (cur.next != null && cur.next.next != null) {
            ListNode first = cur.next;
            ListNode second = cur.next.next;
            first.next = second.next;
            cur.next = second;
            second.next = first;
            cur = cur.next.next;
        }
        return beforeHead.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
