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
public class BubbleSortTests {
    @Autowired
    private BubbleSortServiceImpl bubbleSortService;

    @Test
    public void testBubbleSort() {
        List<Integer> originalList = Arrays.asList(34, 13, 2, -34, -11, 1, 23, 3);
        List<Integer> sortedList = new ArrayList<Integer>();
        sortedList.addAll(originalList);
        Collections.sort(sortedList);
        Assert.assertEquals(sortedList, bubbleSortService.sort(originalList));
    }
}