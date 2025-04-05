package Algorithms;

import java.util.Arrays;

public class SortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {4,2,6,5,1,3};
		
		bubbleSort(myArray);
		
		System.out.println(Arrays.toString(myArray));
		
		int[] myArray2 = {4,2,6,5,1,3};
		
		selectionSort(myArray);
		
		System.out.println(Arrays.toString(myArray));
		
		
		int[] myArray3 = {4,2,6,5,1,3};
		
		insertionSort(myArray);
		
		System.out.println(Arrays.toString(myArray));
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

}
