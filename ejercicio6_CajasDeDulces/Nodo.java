/**
 * Nodo para almacenar la cantidad de dulces por caja.
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * @date 23/10/2026
 */
public class Nodo {
    int dulces;
    Nodo siguiente;

    public Nodo(int dulces) {
        this.dulces = dulces;
        this.siguiente = null;
    }
}