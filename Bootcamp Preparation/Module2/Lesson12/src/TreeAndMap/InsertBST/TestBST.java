package TreeAndMap.InsertBST;

import com.sun.source.tree.ExpressionTree;

import java.beans.Expression;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //traverse tree
        //Inorder left - root - right
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());

        System.out.println("\n");

        //Postorder left - right  -root
        System.out.println("Postorder (sorted): ");
        tree.postorder();
        System.out.println("The number of nodes is: " + tree.getSize());

        System.out.println("\n");

        //Preorder root - left - right
        System.out.println("Preorder (sorted): ");
        tree.preorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
