package com.hacker_rank.data_structures.doublelinkedlist;

public class DoubleLinkedList {

	public static void Print(Node head) {
		
		System.out.print("Doubly Linked List: ");
		
		if (head == null) {
			return;
		}
		while (head != null) {
			System.out.print(head.data);
			if(head.next != null) {
				System.out.print("<-->");
			}
			head = head.next;
		}
		
		System.out.println();
	}
	
	public static Node Insert(Node head,int data) {
		Node nodeToInsert = new Node();
		nodeToInsert.next = null;
		nodeToInsert.prev = null;
		nodeToInsert.data = data;
		
		if(head == null) {
			return nodeToInsert;
		}
		
		Node temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = nodeToInsert;
		nodeToInsert.prev = temp;
		
		return head;
	}
	
	public static Node SortedInsert(Node head,int data) {
		Node nodeToInsert = new Node();
		nodeToInsert.next = null;
		nodeToInsert.prev = null;
		nodeToInsert.data = data;
		
		if(head == null) {
			return nodeToInsert;
		}
		Node temp = head;
		while(temp != null) {
			if(temp.data >= data) {
				if(temp.prev == null) {
					nodeToInsert.next = temp;
					temp.prev = nodeToInsert;
				} else {
					temp = temp.prev;
					Node temp1 = temp.next;
					temp.next = nodeToInsert;
					nodeToInsert.prev = temp;
					nodeToInsert.next = temp1;
					temp1.prev = nodeToInsert;
				}
				return head;
			} else if(temp.next == null) {
				break;
			}
			temp = temp.next;
		}
		
		temp.next = nodeToInsert;
		nodeToInsert.prev = temp;
		return head;
	}
	
	public static Node Reverse(Node head) {
		if(head == null) {
			return null;
		}
		
		Node temp = head;
		while(temp.next != null) {
			Node temp1 = temp.prev;
			temp.prev = temp.next;
			Node temp2 = temp.next;
			temp.next = temp1;
			temp = temp2;
		}
		
		temp.next = temp.prev;
		temp.prev = null;
		
		return temp;
	}
}
