package com.hacker_rank.data_structures.doublelinkedlist;

public class Test {

	public static void main(String[] args) {
		Node nodeToInsert = null;
		nodeToInsert = LinkedList.InsertTail(nodeToInsert, 3);
		nodeToInsert = LinkedList.InsertTail(nodeToInsert, 5);
		nodeToInsert = LinkedList.InsertTail(nodeToInsert, 7);
		
		Node headA = null;
		headA = LinkedList.InsertTail(headA, 2);
		headA = LinkedList.InsertTail(headA, 4);
		
		Node temp
		
		LinkedList.Print(headA);
		System.out.println();
		Node headB = null;
		headB = LinkedList.InsertTail(headB, 6);
		headB = LinkedList.InsertTail(headB, 11);

		LinkedList.Print(headB);
		System.out.println();System.out.println();
		int result = LinkedList.FindMergeNode(headA, headB);
		System.out.println(result);
	}
}
