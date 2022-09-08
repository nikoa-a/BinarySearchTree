package main;

import java.util.ArrayList;
import java.util.List;

public class InnerNode implements Node {

    private int x;
    private Node left, right;

    public InnerNode(int x) {
        this.x = x;
        left = new Leaf();
        right = new Leaf();
    }
    
    @Override
    public Node add(int a) {
        if (a < x) {
            left = left.add(a);
            return this;
        }
        right = right.add(a);
        return this;
    }

    @Override
    public Node remove(int a) {
        if (a == x) {
            InnerNode next = (InnerNode) left;
            this.x = next.ceiling();
            left = next.removeCeiling();
            return this;
        }
        if (a < x) {
            left = left.remove(a);
            return this;
        }
        right = right.remove(a);
        return this;
    }

    @Override
    public boolean find(int a) {
        if (a == x) {
            return true;
        }
        if (a < x) {
            return left.find(a);
        }
        return right.find(a);
    }
    
    @Override
    public List<Integer> sorted() {
        List<Integer> result = new ArrayList<Integer>();
        result.addAll(left.sorted());
        result.add(x);
        result.addAll(right.sorted());
        return result;
    }
    
    @Override
    public String toString() {
        String result = "" + x;
        if (left instanceof InnerNode) {
            result += "(" + left + ")";
        }
        if (right instanceof InnerNode) {
            result += "(" + right + ")";
        }
        return result;
    }

    public int ceiling() {
        if (right instanceof Leaf) {
            return x;
        }
        InnerNode next = (InnerNode) right;
        return next.ceiling();
    }

    public Node removeCeiling() {
        if (right instanceof Leaf) {
            return left;
        }
        InnerNode next = (InnerNode) right;
        right = next.removeCeiling();
        return this;
    }

}
