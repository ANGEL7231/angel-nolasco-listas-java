/**
 * Lista simple con soporte de ventana deslizante para subsecuencias.
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * @date 23/10/2026
 */
public class ListaSimple {
    private Nodo cabeza, cola;
    private int tamano = 0;

    public ListaSimple() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregar(int d) {
        Nodo nuevo = new Nodo(d);
        if (cabeza == null) cabeza = cola = nuevo;
        else {
            cola.siguiente = nuevo;
            cola = nuevo;
        }
        tamano++;
    }

    /**
     * Calcula la suma máxima de K elementos consecutivos recorriendo nodos.
     * @param k Tamaño de la ventana
     * @return Suma máxima
     */
    public int maximoDulces(int k) {
        if (k > tamano || cabeza == null) return 0;

        int sumaAcc = 0;
        Nodo act = cabeza;
        for (int i = 0; i < k && act != null; i++) {
            sumaAcc += act.dulces;
            act = act.siguiente;
        }

        int max = sumaAcc;
        Nodo inicioVentana = cabeza;

        while (act != null) {
            sumaAcc = sumaAcc - inicioVentana.dulces + act.dulces;
            if (sumaAcc > max) max = sumaAcc;
            inicioVentana = inicioVentana.siguiente;
            act = act.siguiente;
        }

        return max;
    }
}