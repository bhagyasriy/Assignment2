package com.core;

public class BubbleSortDemo {

	public static void main(String[] args) {

		// Bubble sort
		int[] a = { 7, 5, 2, 3, 1, 4, 6 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length - i; j++) {
				if (a[j] < a[j - 1]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
		for (int k : a) {
			System.out.println(k);
		}
	}

}
