package main;

import java.util.ArrayList;
import java.util.List;

public class Leaf implements Node {

    @Override
    public String toString() {
        return "";
    }

    @Override
    public Node add(int a) {
        return new InnerNode(a);
    }

    @Override
    public boolean find(int a) {
        return false;
    }

    @Override
    public List<Integer> sorted() {
        return new ArrayList<Integer>();
    }

}
