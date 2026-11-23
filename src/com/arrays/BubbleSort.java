package com.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		 //int[] arr= {8,2,9,5,9,2,8,4,3,1,7,6};
		int[] arr = { 1, 2, 3, 4, 5 };

		int temp = 0;
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			count1++;
			boolean flag = false;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count2++;
					flag = true;

				}
			}
			if (!flag) {
				break;

			}

		}
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(Arrays.toString(arr));

	}

}
