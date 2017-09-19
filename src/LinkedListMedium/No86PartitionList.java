package LinkedListMedium;

public class No86PartitionList {

	public ListNode partition(ListNode head, int x) {
        ListNode beforeHead1 = new ListNode(0);
        ListNode beforeHead2 = new ListNode(0);
        ListNode cur1 = beforeHead1;
        ListNode cur2 = beforeHead2;
        
        while (head != null) {
            if (head.val < x) {
                cur1.next = head;
                cur1 = head;
            }
            else {
                cur2.next = head;
                cur2 = head;
            }
            head = head.next;
        }
        cur2.next = null;
        cur1.next = beforeHead2.next;
        return beforeHead1.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
