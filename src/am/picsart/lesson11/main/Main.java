package am.picsart.lesson11.main;


import am.picsart.lesson11.tree.BinarySearchTree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.add(5);
        bt.add(4);
        bt.add(10);
        bt.add(3);
        bt.add(9);
        bt.add(15);
        System.out.println(bt.contains(9));
        bt.breadthFirstSearch(bt.getRoot());
        System.out.println();
        bt.depthFirstSearch(bt.getRoot());
        System.out.println();
        bt.remove(5);
        bt.remove(4);
        bt.remove(9);
        System.out.println(bt.remove(10));
        bt.depthFirstSearch(bt.getRoot());
    }


}
