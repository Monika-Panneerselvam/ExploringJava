package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixDiagonalDifference {

	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<>();
		matrix.add(Arrays.asList(11, 2, 4));
		matrix.add(Arrays.asList(4, 5, 6));
		matrix.add(Arrays.asList(10, 8, -12));
		System.out.println("Matrix Diagonal Difference: " + getMatrixDiagonalDifference(matrix));
	}

	static int getMatrixDiagonalDifference(List<List<Integer>> matrix) {
		int n = matrix.size();
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;
		for (int i = 0; i < n; i++) {
			primaryDiagonalSum += matrix.get(i).get(i);
			secondaryDiagonalSum += matrix.get(i).get(n - 1 - i);
		}
		return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
	}

}
