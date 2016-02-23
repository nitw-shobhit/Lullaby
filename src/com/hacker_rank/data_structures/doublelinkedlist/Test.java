package com.hacker_rank.data_structures.doublelinkedlist;

public class Test {

	public static void main(String[] args) {
		Node head = null;
		
		head = DoubleLinkedList.Insert(head, 0);
		
		head = DoubleLinkedList.SortedInsert(head, 2);
		head = DoubleLinkedList.SortedInsert(head, 1);
		head = DoubleLinkedList.SortedInsert(head, 4);
		head = DoubleLinkedList.SortedInsert(head, 3);
		DoubleLinkedList.Print(head);
		head = DoubleLinkedList.Reverse(head);
		DoubleLinkedList.Print(head);
	}
}
