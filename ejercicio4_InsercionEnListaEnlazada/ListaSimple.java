/**
 * Implementación de Lista Simple para inserción de elementos.
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * @date 23/10/2026
 */
public class ListaSimple {
    private Nodo cabeza;
    private Nodo cola;

    public ListaSimple() {
        this.cabeza = null;
        this.cola = null;
    }

    public void insertar(int val) {
        Nodo nuevo = new Nodo(val);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
        }
    }

    public void imprimir() {
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.print(aux.dato + (aux.siguiente != null ? " " : ""));
            aux = aux.siguiente;
        }
        System.out.println();
    }
}