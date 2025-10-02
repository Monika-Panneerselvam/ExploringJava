package com.sample;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntSummaryStatisticsExample {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 5, 7, 8, 3, 10);
		int[] num = { 10, 20, 30 };
		addingValuesInIntSummaryStatistics();
		getIntSummaryStatisticsForListOfIntegers(list);
		getIntSummaryStatisticsForIntOfArray(num);
	}
	
	static void addingValuesInIntSummaryStatistics() {
		IntSummaryStatistics stats = new IntSummaryStatistics();
		stats.accept(5);
		stats.accept(10);
		stats.accept(15);
		System.out.println("Added Values & its stats: " +stats);
	}

	static void getIntSummaryStatisticsForListOfIntegers(List<Integer> list) {
		IntSummaryStatistics stats1 = list.stream().collect(Collectors.summarizingInt(n -> n));
		System.out.println("Minimum value in stats: " + stats1.getMin());
		System.out.println("Maximum value in stats: " + stats1.getMax());
		System.out.println("Sum of stats: " + stats1.getSum());
		System.out.println("Average value of stats: " + stats1.getAverage());
		System.out.println("Count of stats: " + stats1.getCount());
	}

	static void getIntSummaryStatisticsForIntOfArray(int[] arr) {
		IntSummaryStatistics stats2 = IntStream.of(arr).summaryStatistics();
		System.out.println("Minimum value in stats: " + stats2.getMin());
		System.out.println("Maximum value in stats: " + stats2.getMax());
		System.out.println("Sum of stats: " + stats2.getSum());
		System.out.println("Average value of stats: " + stats2.getAverage());
		System.out.println("Count of stats: " + stats2.getCount());
	}

}
