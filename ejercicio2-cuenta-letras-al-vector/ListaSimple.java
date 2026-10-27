/**
 * Lista simple para inserción y conteo de caracteres.
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * @date 23/10/2026
 */
public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    /**
     * Inserta un carácter al final de la lista enlazada.
     * @param c Carácter a insertar
     */
    public void insertarFinal(char c) {
        Nodo nuevo = new Nodo(c);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo aux = cabeza;
        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }
        aux.siguiente = nuevo;
    }

    /**
     * Recorre la lista y cuenta las frecuencias de los caracteres.
     */
    public void contarFrecuencia() {
        int[] conteo = new int[256];
        Nodo aux = cabeza;
        while (aux != null) {
            conteo[aux.caracter]++;
            aux = aux.siguiente;
        }
        
        aux = cabeza;
        while (aux != null) {
            System.out.println(aux.caracter + ": " + conteo[aux.caracter]);
            aux = aux.siguiente;
        }
    }
}