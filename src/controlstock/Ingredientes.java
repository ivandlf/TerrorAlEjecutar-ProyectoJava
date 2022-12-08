package controlstock;

import java.util.Scanner;

// ----------------------------
// SUBPROCESO INGREDIENTES        
// ----------------------------

public class Ingredientes {

    public static void ingredientes(double SpanH, double SpanL, double Squeso, double Sharina, double Shamburguesa, double Smilanesa, double gastos) {
        
        Scanner teclado = new Scanner(System.in);

        float Pqueso, packH, packL, PpanL, PpanH, Pharina, Phamburguesa, Pmilanesa, harina, PanL, PanH, hamburguesa, milanesa, queso, kgMilanesa;

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

            num = Integer.parseInt(teclado.next()); // Lee la opci�n ingresada por el usuario.

            switch (num) {
                case 1: // Opci�n: 1
                    System.out.println("Ingresar la cantidad de KG de queso que ingresan a stock.");
                    queso = Integer.parseInt(teclado.next());
                    System.out.println("Determinar el precio del KG de queso: ");
                    Pqueso = Integer.parseInt(teclado.next());
                    gastos = gastos + (queso * Pqueso); // Se hace una suma iterativa de gastos, as� se van sumando todos los precios de los productos.
                    Squeso = Squeso + queso;
                    break;

                case 2: // Opci�n 2
                    System.out.println("Ingresar la cantidad de packs de panes de hamburguesa que ingresan al stock: ");
                    packH = Integer.parseInt(teclado.next());
                    System.out.println("Determinar el tamaño del pack de panes: ");
                    PanH = Integer.parseInt(teclado.next());
                    gastos = gastos + (packH * PpanH); // Se hace una suma iterativa de gastos, as� se van sumando todos los precios de los productos.
                    SpanH = SpanH + (packH * PanH); // Suma al stock el nuevo stock de dicho ingrediente.
                    break;

                case 3: // Opci�n 3
                    System.out.println("Ingresar la cantidad de packs de panes de lomos que ingresan a stock: ");
                    packL = Integer.parseInt(teclado.next());
                    System.out.println("Determinar el tamaño del pack de panes: ");
                    PanL = Integer.parseInt(teclado.next());
                    System.out.println("Ingresar el precio de los packs: ");
                    PpanL = Integer.parseInt(teclado.next());
                    gastos = gastos + (packL * PpanL); // Se hace una suma iterativa de gastos, as� se van sumando todos los precios de los productos.
                    SpanL = SpanL + (packL * PanL); // Suma al stock el nuevo stock de dicho ingrediente.
                    break;

                case 4: // Opci�n 4
                    System.out.println("Ingresar la cantidad de packs de hamburguesas: ");
                    packH = Integer.parseInt(teclado.next());
                    System.out.println("Determinar la cantidad de hamburguesas que hay en cada pack: ");
                    hamburguesa = Integer.parseInt(teclado.next());
                    System.out.println("Ingresar el precio de los packs de hamburguesas: ");
                    Phamburguesa = Integer.parseInt(teclado.next());
                    gastos = gastos + (packH * Phamburguesa); // Se hace una suma iterativa de gastos, as� se van sumando todos los precios de los productos.
                    Shamburguesa = Shamburguesa + (packH * hamburguesa); // Suma al stock el nuevo stock de dicho ingrediente.
                    break;

                case 5: // Opci�n 4
                    System.out.println("Ingresar la cantidad de KG de Milanesas que ingresan: ");
                    kgMilanesa = Integer.parseInt(teclado.next());
                    System.out.println("Determinar el precio de el KG de milanesa: ");
                    Pmilanesa = Integer.parseInt(teclado.next());
                    System.out.println("Determinar la cantidad de milanesas que ingresaron ");
                    milanesa = Integer.parseInt(teclado.next());
                    gastos = gastos + (kgMilanesa * Pmilanesa); // Se hace una suma iterativa de gastos, as� se van sumando todos los precios de los productos.
                    Smilanesa = Shamburguesa + (Smilanesa * milanesa); // Suma al stock el nuevo stock de dicho ingrediente.
                    break;

                case 6: // Opci�n 6
                    System.out.println("Ingresar la cantidad de KG de harina que ingresan: ");
                    harina = Integer.parseInt(teclado.next());
                    System.out.println("Ingresar el precio del KG de harina: ");
                    Pharina = Integer.parseInt(teclado.next());
                    gastos = gastos + (harina * Pharina); // Se hace una suma iterativa de gastos, as� se van sumando todos los precios de los productos.
                    Sharina = Sharina + harina; // Suma al stock el nuevo stock de dicho ingrediente.
                    break;

                case 7: // Opci�n 7: Salir. Sale del condicional.
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