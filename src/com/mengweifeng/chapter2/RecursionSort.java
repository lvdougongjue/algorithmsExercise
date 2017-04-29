package com.mengweifeng.chapter2;

import java.util.Arrays;

/**
 * 归并排序
 * 
 * @author mwf
 *
 */
public class RecursionSort {

	public static void main(String[] args) {
		int[] nums = { 234234, 11, 122, 31, 344, 5 };
		nums = sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	private static int[] sort(int[] nums) {
		if (nums.length == 1) {
			return nums;
		}
		int splitIndex = nums.length / 2;
		int[] firstList = Arrays.copyOfRange(nums, 0, splitIndex);
		firstList = sort(firstList);
		int[] secondList = Arrays.copyOfRange(nums, splitIndex, nums.length);
		secondList = sort(secondList);
		int[] result = merge(firstList, secondList);
		return result;
	}

	private static int[] merge(int[] firstList, int[] secondList) {
		int[] result = new int[firstList.length + secondList.length];
		int i = 0, j = 0, c = 0;
		do {
			if (i == firstList.length && j == secondList.length) {
				break;
			}
			int firstNumber, secondNumber;
			if (i == firstList.length) {
				firstNumber = Integer.MAX_VALUE;
			} else {
				firstNumber = firstList[i];
			}
			if (j == secondList.length) {
				secondNumber = Integer.MAX_VALUE;
			} else {
				secondNumber = secondList[j];
			}
			if (firstNumber < secondNumber) {
				result[c++] = firstNumber;
				i++;
			} else {
				result[c++] = secondNumber;
				j++;
			}

		} while (true);
		return result;
	}

}
