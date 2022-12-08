package controlstock;

import java.util.Scanner;

//--------------------------
// SUBPROCESO SNACK PERDIDO
//--------------------------

public class SnackPerdido {
    
    public static void menuSnack(double[] Ssnack, double valorSNK, String[] Snack) {
        Scanner teclado = new Scanner(System.in);
        int i, Opcion, aux;
        
        System.out.println(" ");
        System.out.println("------------------------------------");
        System.out.println("******* STOCK PERDIDO (Snacks) *****");
        System.out.println("------------------------------------");
        
        for(i = 0; i <= valorSNK; i++){
            System.out.printf("   ", i, "- ", Snack[i]);
        }
        
        System.out.printf(Math.round(valorSNK + 1) + "- Volver");
        System.out.println("------------------------------------");
        Opcion = Integer.parseInt(teclado.next()); // Lee la opción ingresada por el usuario.
        // Borrar pantalla.
       
        if (Opcion <= valorSNK){
            System.out.println("Ingrese la cantidad de KG perdidos.");
            aux = Integer.parseInt(teclado.next()); // Lee la opción ingresada por el usuario.
            Ssnack[Opcion] = Ssnack[Opcion] - aux;
            // Borrar pantalla.
        }
    }
}