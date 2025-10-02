package com.sample;

public class RotatingMatrix {
	static int N = 4;

	static void rotate90Clockwise(int a[][]) {
		for (int i = 0; i < N / 2; i++) {
			for (int j = i; j < N - i - 1; j++) {
				int temp = a[i][j];
				a[i][j] = a[N - 1 - j][i];
				a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
				a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
				a[j][N - 1 - i] = temp;
			}
		}
	}

	static void printMatrix(int arr[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.println(arr[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		// 13 9 5 1
		// 14 10 6 2
		// 15 11 7 3
		// 16 12 8 4

		rotate90Clockwise(arr);
		printMatrix(arr);
	}

}
