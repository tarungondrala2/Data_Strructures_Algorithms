package ProblemSolving;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(lengthOfLongestPalindrome("babad"));
		
		int[] array = {1,2,3,4,5,6};
		array = reverseArrayByK(array,4);
		System.out.println(Arrays.toString(array));
	}

//	public static int findLongestPalindromeLength(String string) {
//		
//		
//	}
	
	public static int[] reverseArrayByK(int[] array, int k) {
	    List<Integer> myList = new ArrayList<>();
	    for (int num : array) {
	        myList.add(num);
	    }

	    for (int i = 1; i <= k; i++) {
	        int temp = myList.remove(myList.size() - 1);
	        myList.add(0, temp);
	    }

	    int[] result = new int[myList.size()];
	    for (int i = 0; i < myList.size(); i++) {
	        result[i] = myList.get(i);
	    }

	    return result;
	}

	
	public static int lengthOfLongestPalindrome(String string) {
		
		String longestPalindrome = "";
		String palindrome = "";
		
		for(int i = 1; i < string.length(); i++) {
			
			int left = i;
			int right = i;
			
			palindrome = getPalindrome(string, left, right);
			
			if(palindrome.length() > longestPalindrome.length()) longestPalindrome = palindrome;
			
			left = i-1;
			right = i;
			
			palindrome = getPalindrome(string, left, right);
			
			if(palindrome.length() > longestPalindrome.length()) longestPalindrome = palindrome;
				
		}
		
		return longestPalindrome.length();
	}
	
	public static String getPalindrome(String string, int left, int right) {
		
		while(string.charAt(left) == string.charAt(right)) {
			left--;
			right++;
			
			if(left == -1 || right == string.length()) break;
		}
		
		return string.substring(left+1,right);
	}

}
