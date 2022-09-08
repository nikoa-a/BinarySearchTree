package main;

import java.util.List;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = new Leaf();
    }
    
    public void add(int a) {
        root = root.add(a);
    }

    public void remove(int a) {
        root = root.remove(a);
    }

    public boolean find(int a) {
        return root.find(a);
    }

    public List<Integer> sorted() {
        return root.sorted();
    }
    
    @Override
    public String toString() {
        return this.root + "";
    }
  
}
