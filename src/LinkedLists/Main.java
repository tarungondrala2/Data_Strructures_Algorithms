package LinkedLists;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList myList1 = new LinkedList(3);
		
		myList1.append(6);
		myList1.append(8);
		myList1.append(11);
		myList1.append(71);
		myList1.append(97);
		
		System.out.println("\nLinked List 1:");
		myList1.PrintList();
		
		LinkedList myList2 = new LinkedList(1);
		
		myList2.append(3);
		myList2.append(7);
		myList2.append(13);
		myList2.append(17);
		myList2.append(23);
		myList2.append(47);
		myList2.append(61);
		
		System.out.println("\nLinked List 2:");
		myList2.PrintList();
		
		System.out.println("\nTest Log");
		LinkedList mergedList = new LinkedList();
		mergedList = mergedList.mergeSortedLList(myList1, myList2);
		System.out.println("\n merged list:");
		mergedList.PrintList();
		

	}
	
//	public static LinkedList mergeSortedLinkedList(LinkedList myList1, LinkedList myList2) {
//		
//		int current1 = myList1.getHead();
//		int current2 = myList2.getHead;
//		
//		
//		LinkedList mergedList = new LinkedList();
//	}

}
