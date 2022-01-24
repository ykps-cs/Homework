package ykps.day_1_basics;

import java.util.Arrays;

public class BasicNumbers {

	/**
	 * Returns the greatest common factor of the inputed integers.
	 */
	public static int greatestCommonFactor(int a, int b) {
		
		// initial setup
		int gcf = a;
		if (b < a) gcf = b;
		
		// while loop / enumerating
		while (gcf > 1) {
			if (a % gcf == 0 && b % gcf == 0) return gcf;
			
			gcf = gcf - 1;
		}
		
		return 1;
	}
	
	/**
	 * Returns the least common multiple of the inputed integers.
	 */
	public static int leastCommonMultiple(int a, int b) {
		
		int scalar = 1;
		int min = a;
		if (b < min) min = b;
		int max = b;
		if (a > max) max = a;
		
		while (scalar * min < a * b) {
			if (scalar * min % max == 0) return scalar * min;
			
			scalar = scalar + 1;
		}
		
		return a * b;
	}
	
	/**
	 * The input is an array of positive integers. The function
	 * should return the sum of even numbers minus the sum of odd
	 * numbers in the array.
	 */
	public static int strangeSum(int[] nums) {
		int sumOdd = 0, sumEven = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				sumEven += nums[i];
			} else {
				sumOdd += nums[i];
			}
		}
		
		return sumEven - sumOdd;
	}
	
	/**
	 * The input is an array of integers, and every integer appears
	 * twice except for one outlier, which only appears once in the
	 * array. Find that outlier and return it. 
	 */
	public static int findUnique(int[] nums) {
		return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
	}
}
