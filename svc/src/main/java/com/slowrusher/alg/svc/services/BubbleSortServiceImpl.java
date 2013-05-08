package com.slowrusher.alg.svc.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: C02900
 * Date: 5/8/13
 * Time: 3:44 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class BubbleSortServiceImpl implements SortService{
	/**
	 * From wikipedia
	 * https://en.wikipedia.org/wiki/Sorting_algorithm#Bubble_sort
	 * Bubble sort is a simple sorting algorithm. The algorithm starts at the beginning of the data set.
	 * It compares the first two elements, and if the first is greater than the second, it swaps them.
	 * It continues doing this for each pair of adjacent elements to the end of the data set.
	 * It then starts again with the first two elements, repeating until no swaps have occurred on the last pass.
	 * This algorithm's average and worst case performance is O(n2), so it is rarely used to sort large,
	 * unordered, data sets. Bubble sort can be used to sort a small number of items (where its asymptotic
	 * inefficiency is not a high penalty). Bubble sort can also be used efficiently on a list of any length
	 * that is nearly sorted (that is, the elements are not significantly out of place). For example, if any number
	 * of elements are out of place by only one position (e.g. 0123546789 and 1032547698), bubble sort's exchange
	 * will get them in order on the first pass, the second pass will find all elements in order, so the sort will
	 * take only 2n time.
	 *
	 *
	 * @param inputList list to be sorted
	 * @param <T> Sortable object
	 * @return sorted list
	 */
	@Override
	public <T extends Comparable<T>> List<T> sort(List<T> inputList) {
		if(inputList == null || inputList.size() == 1) {
			return inputList;
		}

		T[] inputArray = (T[]) inputList.toArray();

		boolean sortedInLoop = true;

		while(sortedInLoop) {
			sortedInLoop = false;
			for(int i = 0; i < inputArray.length - 1; i++) {
				int comparisonResult = inputArray[i].compareTo(inputArray[i + 1]);
				if(comparisonResult > 0) {
					T temp = inputArray[i];
					inputArray[i] = inputArray[i + 1];
					inputArray[i + 1] = temp;
					sortedInLoop = true;
				}
			}
		}

		return Arrays.asList(inputArray);
	}
}
