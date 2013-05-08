package com.slowrusher.alg.svc.services;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SortTests {

    @Autowired
    private UnknownSortServiceImpl unknownSortService;
	@Autowired
	private BubbleSortServiceImpl bubbleSortService;

	private List<Integer> shortIntegerList = Arrays.asList(34, 13, 2, -34, -11, 1, 23, 3);

    @Test
    public void testUnknownSort() {
        List<Integer> sortedList = new ArrayList<Integer>();
        sortedList.addAll(shortIntegerList);
        Collections.sort(sortedList);
        Assert.assertEquals(sortedList, unknownSortService.sort(shortIntegerList));
    }

	@Test
	public void testBubbleSort() {
		List<Integer> sortedList = new ArrayList<Integer>();
		sortedList.addAll(shortIntegerList);
		Collections.sort(sortedList);
		Assert.assertEquals(sortedList, bubbleSortService.sort(shortIntegerList));
	}
}