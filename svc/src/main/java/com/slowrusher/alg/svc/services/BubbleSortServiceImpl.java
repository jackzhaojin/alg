package com.slowrusher.alg.svc.services;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jackz_000
 * Date: 4/24/13
 * Time: 10:01 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class BubbleSortServiceImpl implements SortService {
    @Override
    public <T extends Comparable<T>> List<T> sort(List<T> inputList) {
        if(inputList == null) {
            return null;
        }

        T[] inputArray = (T[]) inputList.toArray();

        // for each item on the list
        for(int i = 0; i < inputArray.length; i++) {
            // if it's null, do not do anything
            if(inputArray[i] != null) {
                // for each next items in the list, we'll need to compare it to the current item, if it's less than the current item,
                // swap it
                for(int j = i + 1; j < inputArray.length; j++) {
                    if(inputArray[j] == null) {
                        break;
                    }
                    int comparisonResult = inputArray[i].compareTo(inputArray[j]);
                    if(comparisonResult > 0) {
                        T temp = inputArray[i];
                        inputArray[i] = inputArray[j];
                        inputArray[j] = temp;
                    }
                }
            }

        }

        return Arrays.asList(inputArray);
    }
}
