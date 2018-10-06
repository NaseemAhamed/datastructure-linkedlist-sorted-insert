package com.linkedlist.sorted.insertion;

public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void sortedNode(Node newNode) {
		Node current;

		if (head == null || (head.data >= newNode.data)) // If the list is empty or if the head is greater than that of
															// newNode.data, make the newNode as the front node.
		{
			newNode.next = head;
			head = newNode;
		} else { // else iterate through the list and stop before the GN (Greater Node). Insert
					// the node here.
			current = head;
			while (current.next != null && (current.next.data < newNode.data)) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	Node newNode(int data) {
		Node newNode = new Node(data);
		return newNode;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String arg[]) {
		System.out.println("Inserting.. ");
		LinkedList list = new LinkedList();
		Node newNode;
		newNode = list.newNode(3);
		list.sortedNode(newNode);
		newNode = list.newNode(2);
		list.sortedNode(newNode);
		newNode = list.newNode(6);
		list.sortedNode(newNode);
		list.printList();
	}
}
