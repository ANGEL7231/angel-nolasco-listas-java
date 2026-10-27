/**
 * Lista doblemente enlazada con manipulación e inversión de punteros.
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * @date 23/10/2026
 */
public class ListaDoble {
    private Nodo cabeza, cola;

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregarFinal(int val) {
        Nodo nuevo = new Nodo(val);
        if (cabeza == null) cabeza = cola = nuevo;
        else {
            cola.sig = nuevo;
            nuevo.ant = cola;
            cola = nuevo;
        }
    }

    /**
     * Invierte los punteros de toda la lista doble de forma eficiente.
     */
    public void invertirLista() {
        Nodo temp = null;
        Nodo actual = cabeza;
        while (actual != null) {
            temp = actual.ant;
            actual.ant = actual.sig;
            actual.sig = temp;
            actual = actual.ant;
        }
        if (temp != null) {
            cabeza = temp.ant;
        }
    }

    public void imprimir() {
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.print(aux.valor + (aux.sig != null ? " " : ""));
            aux = aux.sig;
        }
        System.out.println();
    }
}