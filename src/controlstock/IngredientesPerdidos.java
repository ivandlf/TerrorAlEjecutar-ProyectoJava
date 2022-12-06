package controlstock;

import java.util.Scanner;

// --------------------------------
// SUBPROCESO INGREDIENTES PERDIDOS        
// --------------------------------

public class IngredientesPerdidos {

    public static void ingredientesPerdidos(double SHamburguesa, double SQueso, double SPanL, double SPanH, double SHarina, double SMilanesa) {
        // Este subproceso sirve para marcar aquellos ingredientes perdidos o echados a perder.
        Scanner teclado = new Scanner(System.in);
        float Perdida;
        int num;
        Perdida = 0;
        System.out.println(" ");
        
        do {
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("|                                         |");
        System.out.println("------------------------------------------");
        System.out.println("|*** Seleccione el ingrediente perdido ***|");
        System.out.println("------------------------------------------");
        System.out.println("|                                         |");
        System.out.println("|        1 - Queso                        |");
        System.out.println("|        2 - Pan Hamburguesa              |");
        System.out.println("|        3 - Pan Lomo                     |");
        System.out.println("|        4 - Hamburguesa                  |");
        System.out.println("|        5 - Milanesas                    |");
        System.out.println("|        6 - Harina                       |");
        System.out.println("|        7 - Volver                       |");
        System.out.println("|                                         |");
        System.out.println("------------------------------------------");
            
        num = Integer.parseInt(teclado.next()); // Lee la opci�n ingresada por el usuario.
        
        System.out.println(" ");
        
        switch (num) {
            // En cada una de las opciones se pedir� cu�nto se ha perdido y se restar� con el stock existente.
            case 1: 
                System.out.println("Ingrese en KG la cantidad de queso perdido: ");
                Perdida = Integer.parseInt(teclado.next());
                SQueso = SQueso - Perdida;
                break;
            case 2:
                System.out.println("Ingrese la cantidad de panes de hamburgesa perdidos: ");
                Perdida = Integer.parseInt(teclado.next());
                SPanH = SPanH - Perdida;
                break;
            case 3:
                System.out.println("Ingrese la cantidad de panes de lomo perdidos: ");
                Perdida = Integer.parseInt(teclado.next());
                SPanL = SPanL - Perdida;
                break;
            case 4:
                System.out.println("Ingrese la cantidad de hamburguesas perdidas: ");
                SHamburguesa = Integer.parseInt(teclado.next());
                SHamburguesa = SHamburguesa - Perdida;
                break;
            case 5:
                System.out.println("Ingrese la cantidad de milanesas perdidas: ");
                Perdida = Integer.parseInt(teclado.next());
                SMilanesa = SMilanesa - Perdida;
                break;
            case 6:
                System.out.println("Ingrese en KG la cantidad de harina perdida: ");
                Perdida = Integer.parseInt(teclado.next());
                SHarina = SHarina - Perdida;
                break;
            case 7:
                break;
                
            default:
                System.out.println(" ------------------------------------------------------------------------------------------------ ");
                System.out.println(" | La opción que ha ingresado no es correcta. Por favor, digite una que se encuentre en el menú | ");
                System.out.println(" ------------------------------------------------------------------------------------------------ ");
                System.out.println(" ");
                System.out.println(" ");
                break;
            } 
        } while (7 == num);
    }
}