package leetcode30;

public class NO83RemoveDuplicatesfromSortedList {

	class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
		

		    public ListNode deleteDuplicates(ListNode head) {
		        ListNode current=head;
		        while(current!=null && current.next!=null){
		            if(current.val==current.next.val){
		                current.next=current.next.next;
		            }
		            else current=current.next;
		        }
		        
		        return head;
		    }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
