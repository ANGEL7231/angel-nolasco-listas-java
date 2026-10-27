/**
 * Nodo para almacenar caracteres en lista simple.
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * @date 23/10/2026
 */
public class Nodo {
    char caracter;
    Nodo siguiente;

    public Nodo(char caracter) {
        this.caracter = caracter;
        this.siguiente = null;
    }
}