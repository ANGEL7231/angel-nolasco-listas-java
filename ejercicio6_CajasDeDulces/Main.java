import java.util.Scanner;

/**
 * Problema: Cajas de dulces
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * Fecha: 23/10/2026
 * Descripción: Encuentra la máxima suma de K cajas consecutivas mediante lista simple.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ListaSimple lista = new ListaSimple();
            for (int i = 0; i < n; i++) {
                lista.agregar(sc.nextInt());
            }
            System.out.println(lista.maximoDulces(k));
        }
        sc.close();
    }
}