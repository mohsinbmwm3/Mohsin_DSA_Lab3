package com.mohsin.dsa.lab3.bst;

import java.util.HashSet;

class BSTUtil {
    private Node root;
    
    BSTUtil(int[] values) {
        // create tree
        for(int value: values) {
            root = insert(root, value);
        }
    }

    public Node insert(Node root, int key){
        if (root == null) return new Node(key, null, null);
        if (key < root.data) root.left = insert(root.left, key);
        else root.right = insert(root.right, key);
        return root;
    }

    public void findPair(int sum){
        HashSet<Integer> set = new HashSet<Integer>();
        if (!findPair(root, sum, set))
            System.out.print("Do not exit \n");
    }
 
    // helper method, for finding pair
    private boolean findPair(Node root, int sum, HashSet<Integer> set){
        if (root == null) return false;
        if (findPair(root.left, sum, set)) return true;
        if (set.contains(sum - root.data)){
            System.out.println("Found (" + (sum - root.data) + ", " + root.data + ")");
            return true;
        }
        else set.add(root.data);
        return findPair(root.right, sum, set);
    }
}
