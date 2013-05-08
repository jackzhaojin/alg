package com.slowrusher.alg.svc.services;

import junit.framework.Assert;
import org.apache.log4j.Logger;
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

	private static final Logger LOGGER = Logger.getLogger(SortTests.class);

    @Autowired
    private UnknownSortServiceImpl unknownSortService;
	@Autowired
	private BubbleSortServiceImpl bubbleSortService;

	private List<Integer> shortIntegerList = Arrays.asList(34, 13, 2, -34, -11, 1, 23, 3);

	private List<Integer> bubbleShortIntegerList = Arrays.asList(1, 0, 3, 2, 5, 4, 7, 6);

    @Test
    public void testUnknownSort() {
		testSort(unknownSortService, shortIntegerList);
		testSort(unknownSortService, bubbleShortIntegerList);
    }

	@Test
	public void testBubbleSort() {
		testSort(bubbleSortService, shortIntegerList);
		testSort(bubbleSortService, bubbleShortIntegerList);
	}

	private <T extends Comparable<T>> void testSort(SortService sortService, List<T> unsortedList) {
		LOGGER.info("Testing sort service: " + sortService.getClass().toString());

		List<T> sortedList = new ArrayList<T>(unsortedList);
		Collections.sort(sortedList);
		Assert.assertEquals(sortedList, sortService.sort(unsortedList));
	}
}