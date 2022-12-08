package controlstock;

import java.util.Scanner;

//--------------------------
// SUBPROCESO ENTRADA SNACKS
//--------------------------

public class EntradaSnack {
    public static void entradaSnack(double[] Ssnack, double valorSNK, String[] snack, double gastos){
        
        Scanner teclado = new Scanner(System.in);
        
        int i, Opcion, aux, precio;
        // Mostramos todas las opciones de snacks disponibles.
        System.out.println("------------------------------------");
        System.out.println("****** INGRESAR STOCK (Snacks) *****");
        System.out.println("------------------------------------");
        
        for (i = 0; i <= valorSNK; i++){
        System.out.printf("   ", i, snack[i]);
        }
        System.out.printf(Math.round(valorSNK + 1) + "- Volver");
        System.out.println("------------------------------------");
        
        Opcion = Integer.parseInt(teclado.next()); // Lee la opci�n ingresada por el usuario.
        System.out.println("");
        
        if (Opcion <= valorSNK){ // Si la opci�n est� dentro de las opciones, ingresamos la cantidad comprada.
            System.out.println("Ingrese la cantidad de KG ingresados.");
            aux = Integer.parseInt(teclado.next());
            Ssnack[Opcion] = Ssnack[Opcion] + aux; // Ingresamos la cantidad de snacks comprados y la a�adimos al stock.
            System.out.println("Ingrese el precio por KG.");
            precio = Integer.parseInt(teclado.next());
            gastos = gastos + (precio * aux); // Sumamos el valor de la compra a gastos.
            System.out.println("");
        }
    }
}