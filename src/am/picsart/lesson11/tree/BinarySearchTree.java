package am.picsart.lesson11.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    private Integer value;
    private Node left;
    private Node right;

    public Node(Integer value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" + value + '}';
    }
}

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void add(Integer value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            while (current != null) {
                if (value < current.getValue()) {
                    if (current.getLeft() == null) {
                        current.setLeft(newNode);
                        return;
                    }
                    current = current.getLeft();
                } else {
                    if (current.getRight() == null) {
                        current.setRight(newNode);
                        return;
                    }
                    current = current.getRight();
                }
            }
        }
    }

    public boolean contains(Integer value) {
        Node current = root;
        while (current != null) {
            if (value.equals(current.getValue())) {
                return true;
            }
            if (value < current.getValue()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return false;
    }

    public Node remove(Integer value) {
        if (root == null) {
            return null;
        }
        Node current = root;
        Node parent;
        if (value.equals(root.getValue())) {
            if (root.getRight() == null) {
                root = root.getLeft();
            } else {
                root = getSuccessor(root);
            }
            return current;
        }
        while (true) {
            parent = current;
            if (value < current.getValue()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
            if (current == null || value.equals(current.getValue())) break;
        }
        if (current == null) {
            return null;
        }
        if (parent.getLeft() != null && parent.getLeft().equals(current)) {
            if (current.getRight() == null) {
                parent.setLeft(current.getLeft());
            } else {
                parent.setLeft(getSuccessor(current));
            }
        } else {
            if (current.getRight() == null) {
                parent.setRight(current.getLeft());
            } else {
                parent.setRight(getSuccessor(current));
            }
        }
        return current;
    }

    private Node getSuccessor(Node removeNode) {
        Node current = removeNode.getRight();
        Node parent = current;

        while (current.getLeft() != null) {
            parent = current;
            current = current.getLeft();
        }
        if (!current.equals(removeNode.getRight())) {
            parent.setLeft(current.getRight());
            current.setRight(removeNode.getRight());
        }
        current.setLeft(removeNode.getLeft());


        return current;
    }

    public void depthFirstSearch(Node root) {
        if (root == null) {
            return;
        }
        depthFirstSearch(root.getLeft());
        System.out.print(root.getValue() + " ");
        depthFirstSearch(root.getRight());
    }

    public void breadthFirstSearch(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.getValue() + " ");
            if (current.getLeft() != null) {
                queue.offer(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.offer(current.getRight());
            }
        }
    }
}
