package control;

import modelo.BinaryTree;
import modelo.LinkedCircle;

import java.util.ArrayList;

public class Control {
    LinkedCircle<Integer> lista = new LinkedCircle<>();
    BinaryTree<Integer> arbol = new BinaryTree<Integer>((numeOne, numeTwo) -> Integer.compare(numeOne, numeTwo));

    public void addLista(int dato){
        lista.addNode(dato);
    }

    public void setUp(){
        lista.addNode(1);
        lista.addNode(2);
        lista.addNode(3);
        lista.addNode(4);
        lista.addNode(5);
    }


    public void addArbol(){
        for (int i = lista.getLinkedCircle().size()-1; i >= 0; i--) {
            //System.out.println(lista.getLinkedCircle().get(i).toString());
            arbol.addNode(lista.getLinkedCircle().get(i));
        }

    }

    public boolean findArbol(int prueba){
        //int prueba = 3;
        if (arbol.findNode(prueba) != null){
            System.out.println("el numero buscado es: "+arbol.findNode(prueba).getInfo().toString());
            return true;
        }
        return false;
    }

    public ArrayList<Integer> mostrar(){
        return lista.getLinkedCircle();
    }

    public boolean recorrerApartirDe(int dato){
        setUp();
        /*for (int i = lista.getLinkedCircle().size()-1; i >= 0; i--) {
            //System.out.println(lista.getLinkedCircle().get(i).toString());
            arbol.addNode(lista.roamLinked(lista.findNode()).get(i));
        }*/
        //System.out.println("el numero buscado es: "+arbol.findNode(dato).getInfo().toString());
        String datoBuscar = Integer.toString(dato);
        System.out.println("Dato a buscar: "+datoBuscar);

        for (int i = lista.roamLinked(lista.findNode("3")).size()-1; i >= 0; i--) {
            System.out.println(lista.roamLinked(lista.findNode("3")).get(i).toString());
        }

        return true;
    }

}
