import java.util.Scanner;

/**
 * Problema: cuenta_letras_al_vector
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * Fecha: 23/10/2026
 * Descripción: Almacena caracteres en lista simple propia y calcula frecuencias.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String texto = sc.nextLine();
            ListaSimple lista = new ListaSimple();
            for (int i = 0; i < texto.length(); i++) {
                lista.insertarFinal(texto.charAt(i));
            }
            lista.contarFrecuencia();
        }
        sc.close();
    }
}