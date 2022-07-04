package app.leetcode;

public class LinkedListUsingArray {

	public static <T> void createList(T[] array) {
		
		ListNode<T> parent = new ListNode<T>(null, null);

		for (int i = 0; i < array.length; i++) {
			parent.val = array[i];
			parent = new ListNode<T>(null, parent);
		}
	}

	public static class ListNode<T> {
		T val;
		ListNode<T> next;

//		ListNode() {	
//		}
//		ListNode(int val) {
//			this.val = val;
//		}

		ListNode(T val, ListNode<T> next) {
			this.val = val;
			this.next = next;
		}
	}
}