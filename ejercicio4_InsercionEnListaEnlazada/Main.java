import java.util.Scanner;

/**
 * Problema: Inserción en Lista Enlazada
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * Fecha: 23/10/2026
 * Descripción: Inserta datos en lista simple e imprime la secuencia resultante.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            ListaSimple lista = new ListaSimple();
            for (int i = 0; i < n; i++) {
                lista.insertar(sc.nextInt());
            }
            lista.imprimir();
        }
        sc.close();
    }
}