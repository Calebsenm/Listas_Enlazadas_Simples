
package ListaEnlazadas;


public class Main {
    public static void main(String[] args){
    
        //Ventana vn = new Ventana();
        //vn.setVisible(true);

        ListaEnlazada listaDatos = new ListaEnlazada();
        Nodo nodo1 = new Nodo();
        nodo1.setNombre("A");
      
        Nodo nodo2 = new Nodo();
        nodo2.setNombre("B");

        Nodo nodo3 = new Nodo();
        nodo3.setNombre("C");

        Nodo nodo4 = new Nodo();
        nodo4.setNombre("D");

        listaDatos.agregarAlPricipio(nodo1);
        listaDatos.Recorrer();

        listaDatos.agregarAlFinal(nodo2);
        listaDatos.Recorrer();

        listaDatos.agregarAlFinal(nodo3);
        listaDatos.Recorrer();

        listaDatos.agregarAlFinal(nodo4);
        listaDatos.Recorrer();

    }
            
}
