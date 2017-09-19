package LinkedListMedium;

public class No82RemoveDuplicatesfromSortedList2 {

	public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode beforeHead = new ListNode(0);
        beforeHead.next = head;
        ListNode pre = beforeHead;
        ListNode cur = head;
        
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            if (pre.next == cur) {
                pre = pre.next;
            }
            else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return beforeHead.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
