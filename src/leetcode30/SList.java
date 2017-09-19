package leetcode30;

public class SList{
	private SListNode head;
	private int size;
	
	public SList() {  
		head = null;
		size = 0;
	}
	
	public void insertFront(Object item) {
		head = new SListNode(item,head);
		size++;
	}
	
	public class SListNode {
		  public SListNode(Object item2, SListNode head) {
			// TODO Auto-generated constructor stub
		}
		public Object item;
		  public SListNode next;
	}
}