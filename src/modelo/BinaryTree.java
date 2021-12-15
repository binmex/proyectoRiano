package modelo;

import java.util.Comparator;

public class BinaryTree<T> {
    private TreeNode<T> root;
    private Comparator<T> comparator;

    public BinaryTree(Comparator<T> comparator) {
        this.comparator = comparator;
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addNode(T info) {
        TreeNode<T> node = new TreeNode<>(info);
        if (isEmpty()) {
            root = node;
        } else {
            TreeNode<T> aux = root;
            TreeNode<T> ant = null;
            while (aux != null) {
                ant = aux;
                aux = comparator.compare(info, aux.getInfo()) < 0 ? aux.getLeft() : aux.getRight();
            }
            if (comparator.compare(info, ant.getInfo()) < 0) {
                ant.setLeft(node);
            } else {
                ant.setRight(node);
            }
        }
    }

    public TreeNode<T> findNode(T info ){
        TreeNode<T> aux=root;
        while(aux!=null){
            if(comparator.compare(info,aux.getInfo())==0){
                return aux;
            }
            aux=comparator.compare(info,aux.getInfo())<0?aux.getLeft():aux.getRight();
        }
        return null;
    }

}
