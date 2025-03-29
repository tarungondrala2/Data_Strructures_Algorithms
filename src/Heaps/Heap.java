/**
 * 
 */
package Heaps;

import java.util.*;

/**
 * 
 */
public class Heap {
	
	private List<Integer> heap;
	
	public Heap() {
		this.heap = new ArrayList<>();
	}
	
	/*
	 * THis method will return copy of a heap
	 */
	public List<Integer> getHeap() {
		return new ArrayList<>(heap);
	}
	
	
	// <------------- Helper Methods ---------------->
	
	/*
	 * This method will return left child of a node.
	 */
	private int leftChild(int index) {
		return 2*index+1;
	}
	
	/*
	 * This method will return right child of a node.
	 */
	private int rightChild(int index) {
		return 2*index+2;
	}
	
	/*
	 * This method will return parent of a node/child.
	 */
	private int parent(int index) {
		return (index - 1) / 2;
	}
	
	/*
	 * This method will swap two nodes. 
	 */
	private void swap(int index1, int index2) {
		int temp = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp);
	}

}
