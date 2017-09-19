package LinkedListMedium;

public class No143ReorderList {

	public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode pre = slow;
        ListNode start = slow.next;
        ListNode then = start.next;
        
        while (then != null) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        // 1 - 2 - 3 - 4 - 5 - 6                   1 - 2 - 3 - 6 - 5 - 4
        ListNode cur = head;                //    cur     pre next
        ListNode next = pre.next;
        while (cur != pre) {            // 1 - 6 - 2 - 3 - 5 - 4 
            pre.next = next.next;   //            cur     next
            next.next = cur.next;   //   1 - 6 - 2 - 5 - 3 - 4
            cur.next = next;
            cur = next.next;
            next = pre.next;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
