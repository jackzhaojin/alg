package com.slowrusher.alg.svc.model;

/**
 * Created with IntelliJ IDEA.
 * User: jackz_000
 * Date: 9/8/13
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    private Node left;
    private Node right;
    private int value;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
