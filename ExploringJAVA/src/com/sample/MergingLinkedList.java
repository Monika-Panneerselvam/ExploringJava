package com.sample;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class MergingLinkedList {

	public static void main(String[] args) {
		ListNode l1 = createLinkedList(new int[] { 10, 30, 50 });
		ListNode l2 = createLinkedList(new int[] { 20, 40, 60 });
		ListNode mergedLinkedList = mergeTwoLinkedLists(l1, l2);
		printLinkedList(mergedLinkedList);
	}

	static ListNode createLinkedList(int[] arr) {
		if (arr.length == 0)
			return null;
		ListNode head = new ListNode(arr[0]);
		ListNode current = head;
		for (int i = 1; i < arr.length; i++) {
			current.next = new ListNode(arr[i]);
			current = current.next;
		}
		return head;
	}

	static ListNode mergeTwoLinkedLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(-1);
		ListNode current = dummy;

		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				current.next = l1;
				l1 = l1.next;
			} else {
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}
		current.next = (l1 != null) ? l1 : l2;
		return dummy.next;
	}

	static void printLinkedList(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
		//System.out.println("null");
	}

}
