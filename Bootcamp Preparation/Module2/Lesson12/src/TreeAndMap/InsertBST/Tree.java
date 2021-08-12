package TreeAndMap.InsertBST;

public interface Tree<E> {
    /**
     * Insert element e into the binary search tree.
     * Return true if the element is inserted successfully.
     */
    public boolean insert(E e);
    /**
     * Inorder traversal from the root
     */
    public void inorder();
    /**
     * Get the number of nodes in the tree
     */
    public int getSize();

    public TreeNode<E> getRoot();

    public void postorder();

    public void preorder();

    public boolean delete(E e);

    public boolean search(E e);

    public boolean isEmpty();

}
