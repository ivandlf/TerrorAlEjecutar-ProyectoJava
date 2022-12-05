package controlStock;

import java.util.Scanner;

public class BebidasPerdidas {

    public static void BebidasPerdidas(double[] Sbebida, double[] valorB, String[] bebida) {
        int i, opcion, aux;
        Scanner teclado = new Scanner(System.in());
        System.out.println("");
        // Mostramos todas las bebidas disponibles para que se elija la deseada
        System.out.println("------------------------------------");
        System.out.println("***** STOCK PERDIDO (Bebidas) *****");
        System.out.println("------------------------------------");
        for (int i = 0; i <= valorB;i++){
            System.out.println("" + i + "_ " + bebida[i]);
        }
        System.out.println(Math. round(valorB + 1) + "_Volver");
        System.out.println("------------------------------------");
        opcion = Integer.parseInt(teclado.nextLine());
        if (opcion == valorB) {
            System.out.println("Ingrese la cantidad de botellas perdidas");
            aux = Integer.parseInt(teclado.nextLine());
            Sbebida[opcion] = Sbebida[opcion] - aux;//Disminuimos la cantidad de bebida perdidas del stock
        }
    }
}
