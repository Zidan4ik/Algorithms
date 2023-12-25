package task.task2;


public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {
        this.root=null;
    }
    public void preOrder(Node node){
        if(node!=null){
            preOrder(node.getLeft());
            preOrder(node.getRight());
            System.out.println(node.getValue());
        }
    }
    public void preOrder2(Node node){
        if(node!=null){
            preOrder(node.getLeft());
            System.out.println(node.getValue());
            preOrder(node.getRight());
        }
    }
    public void preOrder3(Node node){
        if(node!=null){
            System.out.println(node.getValue());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }
}
