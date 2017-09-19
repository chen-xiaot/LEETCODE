package LinkedListMedium;

//    3  <-   4   <-   2
// +  4  <-   6   <-   5
// =  8  <-   0   <-   7 


public class No2AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode beforeHead = new ListNode(0);
        ListNode res = beforeHead;
        int sum = 0;
        
        while (l1 != null || l2 != null) {
            sum /= 10;
            
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            res.next = new ListNode(sum % 10);
            res = res.next;
        }
        
        if (sum / 10 == 1) {
            res.next = new ListNode(1);
        }
        return beforeHead.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
