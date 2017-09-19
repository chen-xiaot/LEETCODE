package LinkedListMedium;

import java.util.Stack;

//Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 8 -> 0 -> 7

public class No445AddTwoNumbers2 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        int sum = 0;
        ListNode cur = new ListNode(0);
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) sum += s1.pop();
            if (!s2.empty()) sum += s2.pop();
            
            cur.val = sum % 10;
            ListNode head = new ListNode(sum / 10);     // if   4 + 6
            											// return  1 -> 0
            head.next = cur;   //cur 是全局变量，head是局部变量，每个loop都会产生新的node：head；
            cur = head;
            sum /= 10;
        }
        return cur.val == 0 ? cur.next : cur;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
