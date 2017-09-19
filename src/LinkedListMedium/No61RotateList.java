package LinkedListMedium;
//没有node.before指针，不然可以每次把最后的移到最前，最后的前一个指向null；
//beforeHead -> 1 -> 2 -> 3 -> 4 -> 5 -> null
//                      |         |
//                    startNode   cur
public class No61RotateList {

	public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode beforeHead = new ListNode(0);
        beforeHead.next = head;
        ListNode cur = beforeHead; int length = 0;         // cur 从beforehead开始数
        
        while (cur.next != null) {  // cur.next != null  not cur != null
            length++;
            cur = cur.next;
        }
        
        int rotatePoint = length - k % length;
        ListNode startNode = beforeHead;                 //startnode 从 beforehead开始数
        for (; rotatePoint > 0; rotatePoint--) {  // not >= 0
            startNode = startNode.next;
        }
        
        cur.next = beforeHead.next;
        beforeHead.next = startNode.next;
        startNode.next = null;
        
        return beforeHead.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
