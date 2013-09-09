package com.slowrusher.alg.svc.model;

/**
 * Created with IntelliJ IDEA.
 * User: jackz_000
 * Date: 9/8/13
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class SubtreeValueNode extends Node {
    private int subTreeValue;
    private SubtreeValueNode left;
    private SubtreeValueNode right;

    public int getSubTreeValue() {
        return subTreeValue;
    }

    public void setSubTreeValue(int subTreeValue) {
        this.subTreeValue = subTreeValue;
    }

    public SubtreeValueNode getLeft() {
        return left;
    }

    public void setLeft(SubtreeValueNode left) {
        this.left = left;
    }

    public SubtreeValueNode getRight() {
        return right;
    }

    public void setRight(SubtreeValueNode right) {
        this.right = right;
    }
}
