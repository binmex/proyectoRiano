package modelo;

import java.util.ArrayList;
//import java.util.Comparator;

public class LinkedCircle <T>{
    private NodeCircle<T> head;
    //private Comparator<T> comparator;


    public boolean isEmpy(){
        if (head == null){
            return true;
        }
        return false;
    }

    public void addNode(T info){
        NodeCircle<T> nodeNew= new NodeCircle<>(info);
        //BinaryTree<T> tor = new BinaryTree<>((numeOne, numeTwo) -> comparator.compare(numeOne, numeTwo));
        if (isEmpy()){
            head = nodeNew;
            head.setNext(nodeNew);
            //tor.addNode(nodeNew.getInfo());
        } else {
            nodeNew.setNext(head.getNext());
            //tor.addNode(nodeNew.getInfo());
            head.setNext(nodeNew);
        }
    }

    public ArrayList<T> getLinkedCircle(){
        ArrayList<T> out = new ArrayList<>();
        NodeCircle<T> aux = new NodeCircle<>();
        aux = head;
        do {
            out.add(aux.getNext().getInfo());
            aux = aux.getNext();
        }while (aux != head);
        return out;
    }


    public ArrayList<T> roamLinked( NodeCircle<T> node){
        ArrayList<T> out = new ArrayList<>();
        head = node;
        NodeCircle<T> aux = new NodeCircle<>();
        aux = head;
        do {
            out.add(aux.getNext().getInfo());
            aux = aux.getNext();
        }while (aux != head);
        return out;

    }

    public NodeCircle<T> findNode(String id){
        NodeCircle<T> aux = head;
        do {
            if (id.equals(aux.getNext().getInfo().toString())){
                return aux.getNext();
            }
            aux = aux.getNext();
        }while (aux != head);
        return null;
    }



}
