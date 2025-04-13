package ProblemSolving;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(lengthOfLongestPalindrome("babad"));
		
	}

//	public static int findLongestPalindromeLength(String string) {
//		
//		
//	}
	
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
