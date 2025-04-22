package ProblemSolving;

import java.util.Arrays;

// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/

public class ArthmeticProgressionFromSequence {
	
	public boolean CanMakeArithmeticProgression(int[] arr) {

        if(arr.length < 2) return true;

        Arrays.sort(arr);

        int diff = arr[1] - arr[0];

        for(int i = 1; i < arr.length-1; i++) {
            if(diff != arr[i+1]-arr[i]) {
                return false;
            }
        }

        return true;
        
    }

}
