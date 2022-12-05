package controlstock;

//--------------------------
// SUBPROCESO ENTRADA SNACKS
//--------------------------

public class EntradaSnack {
    public static void EntradaSnack(double Ssnack, double valorSNK, double Snack, doble Gastos){
        int i, Opcion, aux, precio;
        // Mostramos todas las opciones de snacks disponibles.
        System.out.println("------------------------------------");
        System.out.println("****** INGRESAR STOCK (Snacks) *****");
        System.out.println("------------------------------------");
        
        for (i = 0; i = valorSNK; ){
        System.out.println("   ", i, Snack[i]);
        }
        System.out.println(valorSNK + 1, " - Volver");
        System.out.println("------------------------------------");
        
        Opcion = Integer.parseInt(teclado.next()); // Lee la opción ingresada por el usuario.
        System.out.println("");
        
        if (Opcion <= valorSNK){ // Si la opción está dentro de las opciones, ingresamos la cantidad comprada.
            System.out.println("Ingrese la cantidad de KG ingresadas.");
            aux = Integer.parseInt(teclado.next());
            Ssnack[Opcion] = Ssnack[Opcion] + aux; // Ingresamos la cantidad de snacks comprados y la añadimos al stock.
            System.out.println("Ingrese el precio por KG.");
            precio = Integer.parseInt(teclado.next());
            Gastos = Gastos + (precio * aux); // Sumamos el valor de la compra a gastos.
            System.out.println("");
        }
    }
}