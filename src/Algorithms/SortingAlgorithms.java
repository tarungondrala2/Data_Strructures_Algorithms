package Algorithms;

import java.util.Arrays;

public class SortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {4,2,6,5,1,3};
		
		bubbleSort(myArray);
		
		System.out.println(Arrays.toString(myArray));
		
		int[] myArray2 = {4,2,6,5,1,3};
		
		selectionSort(myArray2);
		
		System.out.println(Arrays.toString(myArray2));
		
		
		int[] myArray3 = {4,2,6,5,1,3};
		
		insertionSort(myArray3);
		
		System.out.println(Arrays.toString(myArray3));
		
		int[] myArray4 = {4,2,6,5,1,3};
		
		int[] mergeSortedArray = mergeSort(myArray);
		
		System.out.println(Arrays.toString(mergeSortedArray));
		
		int[] myArray5 = {4,6,1,7,3,2,5};
		
		quickSort(myArray5);
		
		System.out.println(Arrays.toString(myArray5));
		
	}
	
	/*
	 * This method is the implementation of bubble sort algorithm
	 * 	
	 * 		Time Complexity - O(n^2)
	 * 		Space Complexity - O(1)
	 */
	public static void bubbleSort(int[] array) {
		for(int i = array.length - 1; i > 0; i-- ) {
			for(int j = 0; j < i; j ++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	/*
	 * This method implements selection sort algorithm 
	 * 
	 * 		Time complexity - O(n^2)
	 * 		Space complexity - O(1)
	 */
	public static void selectionSort(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			int minIndex = i;
			for(int j = i+1; j < array.length; j++) {
				
				if(array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			
			if(i != minIndex) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}
	
	/*
	 * This method implements insertion sort algorithm
	 * 
	 * 			Time complexity - O(n^2)
	 * 			Space complexity - O(1)
	 */
	public static void insertionSort(int[] array) {
		
		for(int i = 1; i < array.length; i++) {
			
			int temp = array[i];
			int j = i - 1;
			
			while(j >= 0 && temp < array[j]) {
				array[j+1] = array[j];
				array[j] = temp;
				j--;
			}
					
		}
	}
	
	/*
	 * THis method implements merge sort algorithm
	 * 
	 * 			Time complexity - O(n log n)
	 * 			Breaking - O(log n), merging - O(n)			
	 * 
	 * 			Space complexity - O(
	 */
	public static int[] mergeSort(int[] array) {
		
		if(array.length == 1) return array;
		
		int midIndex = array.length/2;
		int[] left = mergeSort(Arrays.copyOfRange(array,0,midIndex));
		int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
		
		return merge(left, right);		
	}
	
	/*
	 * This method is helper for merger sort algorithm
	 */
	public static int[] merge(int[] array1, int[] array2) {
		int[] combined = new int[array1.length + array2.length];
		
		int index = 0;
		int i = 0;
		int j = 0;
		
		while(i < array1.length && j < array2.length) {
			
			if(array1[i] < array2[j]) {
				combined[index] = array1[i];
				index++;
				i++;
			} else {
				combined[index] = array2[j];
				index++;
				j++;
			}
		}
		
		while(i < array1.length) {
			combined[index] = array1[i];
			index++;
			i++;
		}
		
		while(j < array2.length) {
			combined[index] = array2[j];
			index++;
			j++;
		}
		
		return combined;
	}
	
	/* 
	 * This method along pivot method implements quick sort algorithm.
	 */
	private static void quickSortHelper(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex-1);
            quickSortHelper(array, pivotIndex+1, right);
        }
    }
	
	/*
	 * This method invokes quick sort algorithm implementation.
	 * 		
	 * 			Time complexity - O(n log n) and O(n^2) if data is sorted
	 * 			Space complexity - O(1)
	 */
    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length-1);
    }

	
	/*
	 * THis method is helper for quick sort.
	 */
	private static int pivot(int[] array, int pivotIndex, int endIndex) {
		int swapIndex = pivotIndex;
		for(int i = pivotIndex+1; i <= endIndex; i++) {
			if(array[i] < array[pivotIndex]) {
				swapIndex++;
				swap(array, swapIndex, i);
			}
		}
		swap(array, pivotIndex, swapIndex);
		
		return swapIndex;
	}
	
	/* 
	 * This method is helper method for pivot method in quick sort
	 */
	private static void swap(int[] array, int firstIndex, int secondIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}
	
	

}
