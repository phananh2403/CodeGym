package TreeAndMap.InsertBST;

public abstract class AbstractTree<E> implements Tree<E> {
    @Override /* Inorder traversal from the root*/
    public void inorder() {
    }

    @Override
    public void postorder() {
    }

    @Override
    public void preorder() {
    }

    @Override
    public boolean isEmpty(){
        return getSize() == 0;
    }
}
