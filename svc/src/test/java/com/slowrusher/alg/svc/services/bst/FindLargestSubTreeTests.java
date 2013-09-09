package com.slowrusher.alg.svc.services.bst;

import com.slowrusher.alg.svc.model.SubtreeValueNode;
import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: jackz_000
 * Date: 9/8/13
 * Time: 11:24 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class FindLargestSubTreeTests {
    @Autowired
    private FindLargestSubTree findLargestSubTree;

    @Test
    public void testLargestSubTree() throws Exception {
        SubtreeValueNode node1 = getTestData1();
        SubtreeValueNode result1 = findLargestSubTree.findLargestSubTree(node1);
        Assert.assertEquals("Should be -1", -1, result1.getValue());

    }

    private SubtreeValueNode getTestData1() {
        SubtreeValueNode root = new SubtreeValueNode();
        SubtreeValueNode c = root;
        c.setLeft(new SubtreeValueNode());
        c.setRight(new SubtreeValueNode());
        c.setValue(3);
        c.getRight().setValue(-4);

        c = c.getLeft();
        c.setLeft(new SubtreeValueNode());
        c.setRight(new SubtreeValueNode());
        c.setValue(-1);
        c.getLeft().setValue(4);
        c.getRight().setValue(2);

        return root;
    }
}
