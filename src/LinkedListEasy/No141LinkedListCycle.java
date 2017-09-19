package LinkedListEasy;

public class No141LinkedListCycle {

	public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
