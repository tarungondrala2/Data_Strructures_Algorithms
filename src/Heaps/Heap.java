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
	
	// <------------ Heap operations --------------->
	
	/*
	 * This method will insert a node into heap.
	 */
	public void insert(int value) {
		
		heap.add(value);
		int current = heap.size() - 1;
		
		while(current > 0 && heap.get(current) > heap.get(parent(current))) {
			swap(current, parent(current));
			current = parent(current);
		}
	}
	
	/*
	 * This mehtod will remove and return top element from the heap.
	 */
	public Integer remove() {
		
		if(heap.size() == 0) {
			return null;
		}
		
		if(heap.size() == 1) {
			return heap.remove(0);
		}
		
		int maxValue = heap.get(0);
		heap.set(0, heap.remove(heap.size()-1));
		sinkDown(0);
		
		return maxValue;
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
	
	/*
	 * This method is helper method for remove operation. 
	 * It will reorganize the heap values.
	 */
	private void sinkDown(int index) {
		
		int maxIndex = index;
		
		while(true) {
			int leftIndex = leftChild(index);
			int rightIndex = rightChild(index);
			
			if(leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
				maxIndex = leftIndex;
			}
			
			if(rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
				maxIndex = rightIndex;
			}
			
			if(maxIndex != index) {
				swap(index, maxIndex);
				index = maxIndex;
			}
			else {
				return;
			}
		}
	}

}
