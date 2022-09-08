package main;

public class Main {

    public static void main(String[] args) throws Exception {
        
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(8);
        tree.add(3);
        tree.add(10);
        tree.add(1);
        tree.add(6);
        tree.add(14);
        tree.add(4);
        tree.add(7);
        tree.add(13);

        System.out.println(tree);
        System.out.println(tree.sorted());
        System.out.println(tree.find(6));
        System.out.println(tree.find(2));

        tree.remove(6);

        System.out.println(tree);
    }

}
