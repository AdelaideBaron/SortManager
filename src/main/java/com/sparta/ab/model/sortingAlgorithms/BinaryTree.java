package com.sparta.ab.model.sortingAlgorithms;

public interface BinaryTree {
    int getRootElement();

    int getRootElement(int element);

    int getNumberOfElements();

    void addElement(int element);

    void addElements(final int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();

}

