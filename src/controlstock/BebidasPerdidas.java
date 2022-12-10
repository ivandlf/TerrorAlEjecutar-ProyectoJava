package controlstock;

import java.util.Scanner;

public class BebidasPerdidas {

    public static void bebidasPerdidas(double[] Sbebida, double valorB[], String[] bebida) {
        int i, opcion, aux;
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        // Mostramos todas las bebidas disponibles para que se elija la deseada
        System.out.println("------------------------------------");
        System.out.println("***** STOCK PERDIDO (Bebidas) *****");
        System.out.println("------------------------------------");
        for (i = 0; i <= valorB[0]; i++){
            System.out.println("" + i + "_ " + bebida[i]);
        }
        System.out.println(Math. round(valorB[0] + 1) + "- Volver");
        System.out.println("------------------------------------");
        opcion = Integer.parseInt(teclado.nextLine());
        if (opcion == valorB[0]) {
            System.out.println("Ingrese la cantidad de botellas perdidas");
            aux = Integer.parseInt(teclado.nextLine());
            Sbebida[opcion] = Sbebida[opcion] - aux;//Disminuimos la cantidad de bebida perdidas del stock
        }
    }
}
