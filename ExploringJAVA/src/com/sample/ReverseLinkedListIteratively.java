package com.sample;

public class ReverseLinkedListIteratively {

	// Definition for singly-linked list
	static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Method to reverse the linked list iteratively
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		ListNode next = null;

		while (current != null) {
			next = current.next; // store next node
			current.next = prev; // reverse the link
			prev = current; // move prev one step forward
			current = next; // move current one step forward
		}

		// 'prev' is the new head of the reversed list
		return prev;
	}

	// Utility method to print linked list
	public static void printList(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// Main method for testing
	public static void main(String[] args) {
		// Create linked list: 1 -> 2 -> 3 -> 4 -> 5
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		System.out.println("Original List:");
		printList(head);

		head = reverseList(head);

		System.out.println("Reversed List:");
		printList(head);
	}
}
