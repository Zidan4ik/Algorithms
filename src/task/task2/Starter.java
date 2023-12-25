package task.task2;

public class Starter {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root= new Node('A');
        tree.root.setLeft(new Node('B'));
        tree.root.setRight(new Node('C'));
        tree.root.getLeft().setRight(new Node('D'));
        tree.root.getLeft().setLeft(new Node('F'));
        tree.root.getRight().setRight(new Node('G'));
        tree.root.getRight().setLeft(new Node('H'));
        tree.preOrder3(tree.root);
    }
}
