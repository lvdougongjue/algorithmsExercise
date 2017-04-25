package com.mengweifeng.chapter1;

/**
 * 插入排序练习
 * 
 * @author mwf
 *
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] nums = { 11, 122, 31, 344, 5 };
		sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public static void sort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int value = nums[i];
			if (value < nums[i - 1]) {
				int j = i - 1;
				for (; j >= 0; j--) {
					if (value < nums[j]) {
						nums[j + 1] = nums[j];
					} else {
						break;
					}
				}
				nums[j + 1] = value;
			}
		}
	}
}
