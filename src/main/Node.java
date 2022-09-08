package main;

import java.util.List;

public interface Node {

    public Node add(int a);

    public Node remove(int a);

    public boolean find(int a);
    
    public List<Integer> sorted();
    
    @Override
    public String toString();
    
}
