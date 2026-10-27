/**
 * Nodo doble para las estructuras de Derdenio.
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * @date 23/10/2026
 */
public class Nodo {
    int valor;
    Nodo sig, ant;

    public Nodo(int v) {
        this.valor = v;
        this.sig = null;
        this.ant = null;
    }
}