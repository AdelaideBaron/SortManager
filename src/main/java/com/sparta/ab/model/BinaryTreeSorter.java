package com.sparta.ab.model;

public class BinaryTreeSorter implements BinaryTree, Sorts {

    private static class Node {
        private final int value;
        private Node leftChild;
        private Node rightChild;
        public Node(int value) {
            this.value = value;
        }
        public int getValue() { return value; }
        public Node getLeftChild() { return leftChild; }
        public void setLeftChild(Node leftChild) { this.leftChild = leftChild; }
        public Node getRightChild() { return rightChild; }
        public void setRightChild(Node rightChild) { this.rightChild = rightChild; }
        public boolean isLeftChildEmpty() {
            if (leftChild == null){ return true;} else { return false; }
        }
        public boolean isRightChildEmpty() {
            if (rightChild == null){ return true; } else { return false; }
        }
    }

    private Node rootNode;

    private int[] arraySortedByTree;
    private int arrayIndex = 0;

    private int amountOfNodes = 1;


    public BinaryTreeSorter(final int element) {
        rootNode = new Node(element);
    }


    public int[] getSortedArray(int[] unorderedArray, int arraySize) {
              BinaryTreeSorter tree = new BinaryTreeSorter(unorderedArray[0]);
        for( int i =1; i< unorderedArray.length; i++){
            tree.addElement(unorderedArray[i]);
        }
        int[] arraySorted = tree.getSortedTreeAsc();
        return arraySorted;
    }

    @Override
    public long timeTaken(int[] array, int arraySize){
        return binaryTreeTimer(array, arraySize);
    }


    private static long binaryTreeTimer(int[] unorderedArray, int arraySize){
        long start = System.nanoTime();
        int unorderedArrayNought = unorderedArray[0];
        BinaryTreeSorter tree = new BinaryTreeSorter(unorderedArrayNought);
        for( int i =0; i< unorderedArray.length -1; i++){
            tree.addElements(unorderedArray);
        }
        int[] arraySorted = tree.getSortedTreeAsc();
        long finish = System.nanoTime();
        long timeTaken = finish - start;
        return timeTaken;
    }

    @Override
    public long timeTaken(int[] array) {
        return 0;
    }


    @Override
    public int getRootElement() {
        int rootNodeValue = rootNode.getValue();
        //rootNode = new Node(element);
        return rootNodeValue;
    }


    @Override
    public int getRootElement(int element) {
        int rootNodeValue = rootNode.getValue();
        //rootNode = new Node(element);
        return rootNodeValue;
    }

    @Override
    public int getNumberOfElements() {
        return amountOfNodes;
    }

    @Override
    public void addElement(int element) {
        if(rootNode == null){
            rootNode = new Node(element);
            return;
        }
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] arrayOfNumbersToSort) {
        rootNode = new Node(arrayOfNumbersToSort[0]);
        for( int i = 0; i < arrayOfNumbersToSort.length; i++) { //double check if i = 0 or 1
            addNodeToTree(rootNode, i);
        }
    }


    @Override
    public boolean findElement(final int element) {
        return findNode(element) !=null;
    }

    @Override
    public int getLeftChild(final int element) throws ChildNotFoundException{
        return getLeftChildOfNode(element);

    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException{
        return getRightChildOfNode(element);
    }

    @Override
    public int[] getSortedTreeAsc(){
        return treeSortAscending(rootNode);
    }

    @Override
    public int[] getSortedTreeDesc() { //to do
        return treeSortDescending(rootNode);
    }


    private int[] treeSortAscending(Node node){
        arraySortedByTree = new int[amountOfNodes];
        traverseAscending(node);
        arrayIndex = 0;
        return arraySortedByTree;
    }

    private int[] treeSortDescending(Node node){
        arraySortedByTree = new int[amountOfNodes];
        traverseDescending(node);
        arrayIndex = 0;
        return arraySortedByTree;
    }

    private void traverseAscending(Node node){
        if(node == null) return;
        traverseAscending(node.getLeftChild());
        arraySortedByTree[arrayIndex++] = node.getValue();
        traverseAscending(node.getRightChild());
    }

    private void traverseDescending(Node node){
        if(node == null) return;
        traverseDescending(node.getRightChild());
        arraySortedByTree[arrayIndex++] = node.getValue();
        traverseDescending(node.getLeftChild());
    }

    private void addNodeToTree(Node node, int element) {
        if (element <= node.getValue()) {
            if (node.isLeftChildEmpty()) {
                Node leftChild = new Node(element);
                node.setLeftChild(leftChild);
                amountOfNodes++;
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else { //need to check if it has a right child first
            if (node.isRightChildEmpty()) {
                Node rightChild = new Node(element);
                node.setRightChild(rightChild);
                amountOfNodes++;
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    private int getLeftChildOfNode(int element) throws ChildNotFoundException {
        boolean t = true;
        boolean f = false;
        int leftchild = 0;
        if (Boolean.compare(findElement(element), t) == 0) {
            Node node = findNode(element);
            if (Boolean.compare(node.isLeftChildEmpty(), f) == 0) {
                leftchild = node.getLeftChild().getValue();
                return leftchild;
            }
        }
        return leftchild;
    }

    private int getRightChildOfNode(int element) throws ChildNotFoundException {
        boolean t = true;
        boolean f = false;
        int rightChild = 0;
        if (Boolean.compare(findElement(element), t) == 0) {
            Node node = findNode(element);
            if (Boolean.compare(node.isLeftChildEmpty(), f) == 0) {
                rightChild = node.getLeftChild().getValue();
                return rightChild;
            }
        }
        return 0;
    }

    private Node findNode(int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            } else if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }


}