package main;

import java.util.List;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = new Leaf();
    }

    @Override
    public String toString() {
        return this.root + "";
    }

    public boolean find(int a) {
        return root.find(a);
    }

    public void add(int a) {
        root = root.add(a);
    }

    public List<Integer> sorted() {
        return root.sorted();
    }

    
}
