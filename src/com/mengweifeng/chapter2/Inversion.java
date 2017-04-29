package com.mengweifeng.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * 查找逆序对
 * 
 * @author mwf
 *
 */
public class Inversion {

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 3, 8, 6, 1 };
		Integer[][] result = findInversionNum(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i][0] + "," + result[i][1]);
		}
	}

	private static Integer[][] findInversionNum(int[] nums) {
		List<Integer[]> result = new ArrayList<Integer[]>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					result.add(new Integer[] { nums[i], nums[j] });
				}
			}
		}
		return result.toArray(new Integer[result.size()][]);
	}

}
