package com.slowrusher.alg.svc.services.bst;

import com.slowrusher.alg.svc.model.SubtreeValueNode;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: jackz_000
 * Date: 9/8/13
 * Time: 11:05 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class FindLargestSubTree {

    /**
     * Strategy - calculate all the subtree sum values, then loop through and find the highest value
     * @param rootNode root node of the tree
     * @return
     */
    public SubtreeValueNode findLargestSubTree(SubtreeValueNode rootNode) {

        // first, find calculate sub tree
        return calculateSubTree(rootNode);
    }

    private SubtreeValueNode calculateSubTree(SubtreeValueNode node) {
        int leftSum = 0;
        int rightSum = 0;
        SubtreeValueNode maxLeftNode = null;
        SubtreeValueNode maxRightNode = null;
        if(node.getLeft() != null) {
            maxLeftNode = calculateSubTree(node.getLeft());
            leftSum = maxLeftNode.getSubTreeValue();
        }
        if(node.getRight() != null) {
            maxRightNode = calculateSubTree(node.getRight());
            rightSum = maxRightNode.getSubTreeValue();
        }
        int subTreeValue = node.getValue() + leftSum + rightSum;
        node.setSubTreeValue(subTreeValue);
        if(maxLeftNode != null && leftSum > subTreeValue) {
            return maxLeftNode;
        }
        if(maxRightNode != null && rightSum > subTreeValue) {
            return maxRightNode;
        }

        return node;
    }
}
