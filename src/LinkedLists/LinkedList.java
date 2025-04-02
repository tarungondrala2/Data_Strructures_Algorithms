package LinkedLists;

public class LinkedList{

	private Node head;
	private Node tail;
	private int length;
	
	class Node {
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}

	// Creates a new node
	public LinkedList(int value) {
		Node node = new Node(value);
		head = node;
		tail = node;
		length = 1;
	}
	
	public LinkedList() {
		head = null;
		tail = null;
		length = 0;
	}
	
	// Creates a new node and add's it to end
	public void append(int value) {
		Node node = new Node(value);
		if(length == 0) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			tail = node;
		}
		length++;
	}
	
	// Creates a new node and add's it to beginning
	public void prepend(int value) {
		Node newNode = new Node(value);
		
		if(length==0) {
			head = newNode;
			tail = newNode;
		} 
		else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}
	
	// Removes a node at the ith index
	public Node remove(int index) {
		
		if(index<0 || index >= length) return null;
		if(index == 0) return removeFirst();
		if(index == length-1) return removeLast();
		
		Node prev = get(index - 1);
		Node temp = prev.next;
		prev.next = temp.next;
		temp.next = null;
		length--;
		
		return temp;
	}
	
	// Removes a first node and return's that node
	public Node removeFirst() {
		if(length == 0) return null;
		
		Node temp = head;
		head = head.next;
		temp.next = null;
		length -= 1;
		
		if(length == 0) {
			tail = null;
		}
		
		return temp;
	}
	
	// Removes a last node and return's that node
	public Node removeLast() {
		
		if(length == 0) return null;
		
		Node temp = head;
		Node pre = head;
		
		while(temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		tail = pre;
		tail.next = null;
		length--;
		
		if(length == 0) {
			head = null;
			tail = null;
		}
		
		return temp;
	}
	
	// Returns a node at the ith index
	public Node get(int index) {
		if(index < 0 || index >= length) return null;
		
		Node temp = head;
		for(int i=0; i<index; i++) {
			temp = temp.next;
		}
		
		return temp;
	} 
	
	// Set's the value at given index.
	public boolean set(int index, int value) {
		Node temp = get(index);
		if(temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}
	
	// Creates a new node and inserts it at the i-th position
	public boolean insert(int index, int value) {
	
		if(index<0 || index > length) return false;
		
		if(index == 0) {
			prepend(value);
			return true;
		}
		
		if(index == length){
			append(value);
			return true;
		}
		
		Node newNode = new Node(value);
		Node temp = get(index-1);
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;
	}
	
	// Reverse's the current linked list
	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		
		Node before = null;
		Node after = temp.next;
		
		for(int i=0; i< length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}
	
	// Prints the entire linkedlist to output stream
	public void PrintList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}	
	}
	
	public void getHead() {
		System.out.println("Head: " + head.value);
	}
	
	public void getTail() {
		System.out.println("Tail: " + tail.value);
	}
	
	public void getLength() {
		System.out.println("Lenght: " + length);
	}
	
	// <------------------ problem solving ---------------------------->
	
	public LinkedList mergeSortedLList(LinkedList list1, LinkedList list2) {
		
		if(list1.length == 0 && list2.length == 0) return null;
		if(list1.length == 0) return list2;
		if(list2.length == 0) return list1;
		
		LinkedList mergedList = new LinkedList();
		Node current1 = list1.head;
		Node current2 = list2.head;
		
		while(current1 != null || current2 != null) {
			
			if(current1 != null & current2 != null) {
				
				if(current1.value < current2.value) {
					mergedList.append(current1.value);
					current1 = current1.next;
				} else if(current2.value < current1.value) {
					mergedList.append(current2.value);
					current2 = current2.next;
				} else if(current1.value == current2.value) {
					mergedList.append(current1.value);
					current1 = current1.next;
					current2 = current2.next;
				}
			}
			
			if(current1 == null) {
				mergedList.append(current2.value);
			} else if(current2 == null) {
				mergedList.append(current1.value);
			}
			
		}
		return mergedList;
	}
	
}
