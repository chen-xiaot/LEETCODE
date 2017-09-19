package LinkedListHard;

import java.util.Comparator;
import java.util.PriorityQueue;

class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}

class ListNodeComparer implements Comparator<ListNode> {
    @Override
    public int compare(ListNode o1, ListNode o2) {
        return Integer.compare(o1.val, o2.val);
    }
}

public class No23MergekSortedLists {

	public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        
        PriorityQueue<ListNode> pq= new PriorityQueue<ListNode>(lists.length, new ListNodeComparer());
        
        ListNode beforeHead = new ListNode(0);
        ListNode cur = beforeHead;
        
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }
        
        while (!pq.isEmpty()) {
            cur.next = pq.poll();
            cur = cur.next;
            if (cur.next != null) {
                pq.add(cur.next);
            }
        }
        return beforeHead.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
