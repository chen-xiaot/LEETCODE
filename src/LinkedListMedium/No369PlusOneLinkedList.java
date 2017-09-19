package LinkedListMedium;

import java.util.Stack;

public class No369PlusOneLinkedList {

	public ListNode plusOne(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        
         while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        
        int sum = 1;
        ListNode cur = new ListNode(0);
        while (!stack.empty()) {
            sum += stack.pop();
            cur.val = sum % 10;
            ListNode newHead = new ListNode(sum / 10);
            newHead.next = cur;
            cur = newHead;
            sum /= 10;
        }
        return cur.val == 0 ? cur.next : cur;
    }
	
// 第二种解法 不需要用到stack， 用到stack是跟add two numbers 2 的方法一致	
	
	public ListNode plusOne2(ListNode head) {
		ListNode beforeHead = new ListNode(0);
        beforeHead.next = head;
        ListNode beforeNine = beforeHead;
        ListNode lastDigit = beforeHead;
        
        while (lastDigit.next != null) {
            lastDigit = lastDigit.next;  // 0   -  1  -   2   -   9   -   9
            if (lastDigit.val != 9) {    //BH        beforeNine        lastDigit
                beforeNine = lastDigit;
            }
        }
        
        if (lastDigit.val != 9) {
            lastDigit.val++;
        }
        else {
            beforeNine.val++;
            while (beforeNine.next != null) {
                beforeNine = beforeNine.next;
                beforeNine.val = 0;
            }
        }
        return beforeHead.val == 0 ? beforeHead.next : beforeHead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
