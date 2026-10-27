import java.util.Scanner;

/**
 * Problema: Derdenio y sus Estructuras de Datos
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * Fecha: 23/10/2026
 * Descripción: Manipula y revierte los punteros de una lista doble.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            ListaDoble derdenio = new ListaDoble();
            for (int i = 0; i < n; i++) {
                derdenio.agregarFinal(sc.nextInt());
            }
            derdenio.invertirLista();
            derdenio.imprimir();
        }
        sc.close();
    }
}