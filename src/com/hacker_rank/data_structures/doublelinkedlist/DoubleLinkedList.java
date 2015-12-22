package com.hacker_rank.data_structures.doublelinkedlist;

public class DoubleLinkedList {

	public static void Print(Node head) {
		if (head == null) {
			return;
		}
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
}
