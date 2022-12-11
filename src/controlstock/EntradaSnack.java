package controlstock;

import java.util.Scanner;

//--------------------------
// SUBPROCESO ENTRADA SNACKS
//--------------------------

public class EntradaSnack {
    public static void entradaSnack(double[] Ssnack, int valorSNK[], String[] snack, double gastos[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int i, Opcion;
        double aux, precio;
        // Mostramos todas las opciones de snacks disponibles.
        System.out.println("------------------------------------");
        System.out.println("****** INGRESAR STOCK (Snacks) *****");
        System.out.println("------------------------------------");
        
        for (i = 0; i <= valorSNK[0]; i++){
        System.out.printf("   "+ i+"_ "+ snack[i]);
        }
        System.out.printf(Math.round(valorSNK[0] + 1) + "- Volver");
        System.out.println("------------------------------------");
        
        Opcion = Integer.parseInt(teclado.next()); // Lee la opci�n ingresada por el usuario.
        System.out.println("");
        
        if (Opcion <= valorSNK[0]){ // Si la opcion este dentro de las opciones, ingresamos la cantidad comprada.
            System.out.println("Ingrese la cantidad de KG ingresados.");
            aux = Double.parseDouble(teclado.next());
            Ssnack[Opcion] +=  aux; // Ingresamos la cantidad de snacks comprados y la añadimos al stock.
            System.out.println("Ingrese el precio por KG.");
            precio = Double.parseDouble(teclado.next());
            gastos[0] += (precio * aux); // Sumamos el valor de la compra a gastos.
            System.out.println("");
        }
    }
}