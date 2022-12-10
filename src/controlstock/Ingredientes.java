package controlstock;

import java.util.Scanner;

// ----------------------------
// SUBPROCESO INGREDIENTES        
// ----------------------------

public class Ingredientes {

    public static void ingredientes(double SpanH[], double SpanL[], double Squeso[], double Sharina[], double Shamburguesa[], double Smilanesa[], double gastos[]) {
        
        Scanner teclado = new Scanner(System.in);

        float Pqueso, packH, packL, PpanL, PpanH = 0 , Pharina, Phamburguesa, Pmilanesa, harina, PanL, PanH, hamburguesa, milanesa, queso, kgMilanesa;

        int num;

        do {  // Este ciclo se repite hasta que num sea = 7.
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("|                                         |");
            System.out.println("------------------------------------------");
            System.out.println("|****** INGRESAR STOCK (Ingredientes) ****|");
            System.out.println("------------------------------------------");
            System.out.println("|        1 - Queso                        |");
            System.out.println("|        2 - Pan Hamburguesa              |");
            System.out.println("|        3 - Pan Lomo                     |");
            System.out.println("|        4 - Hamburguesa                  |");
            System.out.println("|        5 - Milanesas                    |");
            System.out.println("|        6 - Harina                       |");
            System.out.println("|        7 - Volver                       |");
            System.out.println("|                                         |");
            System.out.println("------------------------------------------");

            num = Integer.parseInt(teclado.next()); // Lee la opcion ingresada por el usuario.

            switch (num) {
                case 1: // Opcion: 1
                    System.out.println("Ingresar la cantidad de KG de queso que ingresan a stock.");
                    queso = Integer.parseInt(teclado.next());
                    System.out.println("Determinar el precio del KG de queso: ");
                    Pqueso = Integer.parseInt(teclado.next());
                    gastos[0] += (queso * Pqueso); // Se hace una suma iterativa de gastos, as� se van sumando todos los precios de los productos.
                    Squeso[0] += queso;
                    break;

                case 2: // Opcion 2
                    System.out.println("Ingresar la cantidad de packs de panes de hamburguesa que ingresan al stock: ");
                    packH = Integer.parseInt(teclado.next());
                    System.out.println("Determinar el tamaño del pack de panes: ");
                    PanH = Integer.parseInt(teclado.next());
                    gastos[0] += (packH * PpanH); // Se hace una suma iterativa de gastos, asi se van sumando todos los precios de los productos.
                    SpanH[0] +=  (packH * PanH); // Suma al stock el nuevo stock de dicho ingrediente.
                    break;

                case 3: // Opcion 3
                    System.out.println("Ingresar la cantidad de packs de panes de lomos que ingresan a stock: ");
                    packL = Integer.parseInt(teclado.next());
                    System.out.println("Determinar el tamaño del pack de panes: ");
                    PanL = Integer.parseInt(teclado.next());
                    System.out.println("Ingresar el precio de los packs: ");
                    PpanL = Integer.parseInt(teclado.next());
                    gastos[0] += (packL * PpanL); // Se hace una suma iterativa de gastos, asi se van sumando todos los precios de los productos.
                    SpanL[0] += (packL * PanL); // Suma al stock el nuevo stock de dicho ingrediente.
                    break;

                case 4: // Opcion 4
                    System.out.println("Ingresar la cantidad de packs de hamburguesas: ");
                    packH = Integer.parseInt(teclado.next());
                    System.out.println("Determinar la cantidad de hamburguesas que hay en cada pack: ");
                    hamburguesa = Integer.parseInt(teclado.next());
                    System.out.println("Ingresar el precio de los packs de hamburguesas: ");
                    Phamburguesa = Integer.parseInt(teclado.next());
                    gastos[0] += (packH * Phamburguesa); // Se hace una suma iterativa de gastos, asi se van sumando todos los precios de los productos.
                    Shamburguesa[0] += (packH * hamburguesa); // Suma al stock el nuevo stock de dicho ingrediente.
                    break;

                case 5: // Opcion 4
                    System.out.println("Ingresar la cantidad de KG de Milanesas que ingresan: ");
                    kgMilanesa = Integer.parseInt(teclado.next());
                    System.out.println("Determinar el precio de el KG de milanesa: ");
                    Pmilanesa = Integer.parseInt(teclado.next());
                    System.out.println("Determinar la cantidad de milanesas por kilo ");
                    milanesa = Integer.parseInt(teclado.next());
                    gastos[0] += (kgMilanesa * Pmilanesa); // Se hace una suma iterativa de gastos, asi se van sumando todos los precios de los productos.
                    Smilanesa[0] += (Smilanesa * milanesa); // Suma al stock el nuevo stock de dicho ingrediente.
                    break;

                case 6: // Opcion 6
                    System.out.println("Ingresar la cantidad de KG de harina que ingresan: ");
                    harina = Integer.parseInt(teclado.next());
                    System.out.println("Ingresar el precio del KG de harina: ");
                    Pharina = Integer.parseInt(teclado.next());
                    gastos[0] += (harina * Pharina); // Se hace una suma iterativa de gastos, asi se van sumando todos los precios de los productos.
                    Sharina[] += harina; // Suma al stock el nuevo stock de dicho ingrediente.
                    break;

                case 7: // Opcion 7: Salir. Sale del condicional.
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