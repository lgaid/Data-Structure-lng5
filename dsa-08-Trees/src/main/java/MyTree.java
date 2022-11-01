import java.util.LinkedList;
import java.util.Queue;
import java.util.function.BinaryOperator;

public class MyTree {


    TNode root;


    public MyTree(){


    }
    void insert(int value){
        TNode newNode = new TNode(value);
        if (root == null){
            root = newNode;
            return;
        }
        TNode current = root;
        while (true){
            if (value <= current.value){
                if (current.leftChild == null){
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;

            }
            else {
                if (current.rightChild == null){
                    current.rightChild = newNode;
                    break;
                }

                current = current.rightChild;

            }
        }
    }

    // Preorder Traversal of the tree
    //Root-left-right

    void preOrderTraversal(TNode root){

        if (root == null){
            System.out.println(root.value);
            preOrderTraversal(root.leftChild);
            preOrderTraversal(root.leftChild);
        }

    }

    void inOrderTraversal(TNode root){
        if (root==null){
            inOrderTraversal(root.leftChild);
            System.out.println(root.value +",");
            inOrderTraversal(root.rightChild);

        }

    }

    void postOrderTraversal(TNode root){

        if (root == null){
            postOrderTraversal(root.leftChild);
            postOrderTraversal(root.rightChild);
            System.out.println(root.value + ", ");

        }

    }

    void levelOrderTraversal(){
        if(root==null) return;
        Queue<TNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TNode toVisit=queue.poll();
            System.out.print(toVisit.value+", ");
            if (toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild!=null) queue.add(toVisit.rightChild);

        }
    }






}
