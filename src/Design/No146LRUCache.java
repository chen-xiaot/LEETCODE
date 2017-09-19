package Design;

import java.util.HashMap;
import java.util.Map;

public class No146LRUCache {

	class DLinkedNode {
	    int key;
	    int val;
	    DLinkedNode prev;
	    DLinkedNode next;
    }
    
    // Always add the new node right after head;
    private void addNode(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        
        head.next.prev = node;
        head.next = node;
    }
    
    private void removeNode(DLinkedNode node) {
        DLinkedNode prev = node.prev;
        DLinkedNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    
    private void moveToHead(DLinkedNode node) {
        this.removeNode(node);
	    this.addNode(node);
    }
    
    private DLinkedNode popTail() {
	    DLinkedNode res = tail.prev;
	    this.removeNode(res);
	    return res;
    }
    
    private Map<Integer, DLinkedNode> cache = new HashMap<>();
    private int count;
    private int capacity;
    private DLinkedNode head, tail;
    
    public No146LRUCache(int capacity) {
        this.count = 0;
	    this.capacity = capacity;

	    head = new DLinkedNode();
	    head.prev = null;
	
	    tail = new DLinkedNode();
	    tail.next = null;
	
	    head.next = tail;
	    tail.prev = head;
    }
    
    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        this.moveToHead(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        
        if (node != null) { //node的key 存在，要修改node的值
            node.val = value;
		    this.moveToHead(node);
        } else {
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.val = value;
            
    		this.cache.put(key, newNode);
		    this.addNode(newNode);
            count++;
            
            if (count > capacity) {
                DLinkedNode tail = this.popTail();
			    this.cache.remove(tail.key);
			    count--;
            }
            
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
