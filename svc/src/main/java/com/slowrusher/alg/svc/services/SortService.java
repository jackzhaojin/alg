package com.slowrusher.alg.svc.services;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jackz_000
 * Date: 4/24/13
 * Time: 10:01 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SortService {
    /**
     * Sorts the list passed in, original list will not be modified
     *
     * @param inputList list to be sorted
     * @return the sorted list
     */
    public <T extends Comparable<T>> List<T> sort(List<T> inputList);
}
