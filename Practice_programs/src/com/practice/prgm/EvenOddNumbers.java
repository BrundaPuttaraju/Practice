package com.practice.prgm;

public class EvenOddNumbers {

	public static void main(String[] args) {

		int[] list = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Even numbers : ");
		for (int i = 0; i < list.length - 1; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Odd numbers : ");
		for (int i = 0; i < list.length - 1; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
