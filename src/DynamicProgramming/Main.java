package DynamicProgramming;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fibi(40));
		System.out.println(counter);
		
		System.out.println(fibi2(40));
		System.out.println(counter2);
	}

	static int counter = 0;
	static Integer[] memo = new Integer[100];
	
	/*
	 * This method implements fibinacii logic using memoization
	 */
	static int fibi(int n) {
		
		counter++;
		
		if(memo[n] != null) {
			return memo[n];
		}
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		memo[n] = fibi(n-1) + fibi(n-2);
		return memo[n];
		
	}
	
	static int counter2 = 0;
	
	/*
	 * This method is altered / another approach for fibinacii logic with time complexity O(n)
	 * When we do dynamic programming iteratively, then it is called bottom-up
	 */
	static int fibi2(int n) {
		int[] fibList = new int[n+1];
		
		fibList[0] = 0;
		fibList[1] = 1;
		
		for(int index = 2; index <= n; index++) {
			fibList[index] = fibList[index-1] + fibList[index-2];
			counter2++;
		}
		
		return fibList[n];
	}
}
