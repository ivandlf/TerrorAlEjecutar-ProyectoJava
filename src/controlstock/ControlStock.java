package controlstock;

import java.util.Scanner;

public class ControlStock {

    public static void controlStock(String[] bebida, int valorB[], double[] Sbebida, double[] Ssnack, String[] snack, int valorSNK[], double gastos[], double ganancias [], double Shamburguesa[], double Squeso[], double SpanL[], double SpanH[], double Sharina[], double Smilanesa[]) {

        Scanner teclado = new Scanner(System.in);
        
        int opcionBe, opcionSNK, opcion, i, opcionCMD;

        do {
            System.out.println("");
            System.out.println(" -----------------------------------------");
            System.out.println("|                                         |");
            System.out.println("|-----------------------------------------|");
            System.out.println("|************** MENU STOCK ***************|");
            System.out.println("|-----------------------------------------|");
            System.out.println("|                                         |");
            System.out.println("|         * Opcion 1: Bebidas             |");
            System.out.println("|         * Opcion 2: Comidas             |");
            System.out.println("|         * Opcion 3: Snacks              |");
            System.out.println("|         * Opcion 4: Salir               |");
            System.out.println("|                                         |");
            System.out.println(" -----------------------------------------");
            System.out.println("");

            opcion = Integer.parseInt(teclado.next()); // Se lee la opcion ingresada por el usuario

            switch (opcion) {

                case 1:
                    do {
                        System.out.println("");
                        System.out.println(" -----------------------------------------");
                        System.out.println("|                                         |");
                        System.out.println("|-----------------------------------------|");
                        System.out.println("|************* MENU BEBIDAS **************|");
                        System.out.println("|-----------------------------------------|");
                        System.out.println("|     1 - Ver stock de Bebidas            |");
                        System.out.println("|     2 - Ingresar stock                  |");
                        System.out.println("|     3 - Stock Perdido                   |");
                        System.out.println("|     4 - Volver                          |");
                        System.out.println("|     5 - Salir                           |");
                        System.out.println("|                                         |");
                        System.out.println(" ----------------------------------------- ");
                        System.out.println("");


                        opcionBe = Integer.parseInt(teclado.next()); //se lee la opcion ingresada por el usuario
                        switch (opcionBe) {
                            case 1 -> MenuBebidas.menuBebidas(bebida, valorB, Sbebida);
                            case 2 -> EntradaBebidas.entradaBebidas(Sbebida, valorB, bebida, gastos);
                            case 3 -> BebidasPerdidas.bebidasPerdidas(Sbebida, valorB, bebida);
                            case 4 -> {
                                break;
                    }
                            case 5 -> {
                                break;
                    }
                            default -> {
                                System.out.println("------------------------------------------------------------------------------------------------");
                                System.out.println("| La opción que ha ingresado no es correcta. Por favor, digite una que se encuentre en el menú. |");
                                System.out.println("------------------------------------------------------------------------------------------------");
                                System.out.println("");
                                System.out.println("");
                    }
                        }
                    } while(opcionBe != 5 || opcionBe != 4);

                    break;

                case 2: // Opcion 2 se muestra toda la informacion sobre comidas(Harina, panes, hamburguesas, milanesas, queso, etc)
                    do {
                        System.out.println("");
                        System.out.println(" -----------------------------------------");
                        System.out.println("|                                         |");
                        System.out.println("|-----------------------------------------|");
                        System.out.println("|************* INGREDIENTES **************|");
                        System.out.println("|                                         |");
                        System.out.println("|            1 - Ver stock                |");
                        System.out.println("|            2 - Ingresar Stock           |");
                        System.out.println("|            3 - Stock perdido            |");
                        System.out.println("|            4 - Volver                   |");
                        System.out.println("|            5 - Salir                    |");
                        System.out.println("|                                         |");
                        System.out.println(" -----------------------------------------");
                        System.out.println("***Avisos***");
                        System.out.println("------------------------------------------");
                        
                        if (SpanL[0] <= 10) {//Aviso de que hay que pedir más mercaderia
                            System.out.println("Hay mucha cantidad de packs de panes de lomos. No pedir más de momento");
                        } else if (SpanL[0] >= 60) {//Aviso de que hay que pedir menos mercaderia
                                System.out.println("Hay mucha cantidad de packs de panes de lomos. No pedir más de momento");
                            
                        }

                        if (SpanH[0] <= 10) {
                            System.out.println("Quedan pocos panes de hamburguesas. Pedir un poco más");
                        } else if (SpanH[0] <= 100) {//Aviso de que hay que pedir más mercaderia
                                System.out.println("Quedan pocos panes de hamburguesas. Pedir un poco más");
                            
                        }
                        if (Smilanesa[0] <= 10) {
                            System.out.println("Quedan pocas milanesas, pedir un poco más ");
                        } else if (Smilanesa[0] >= 50) {
                            System.out.println("Hay muchas milanesas, no pedir más de momento");
                            
                        }
                        if (Sharina[0] <= 15) {
                            System.out.println("Hay pocos kg de harina, pedir un poco más");
                        } 
                        else if (Sharina[0] >= 100) {
                            System.out.println("Hay muchos kg de harina, no pedir más de momento");
                            
                        }
                        if (Squeso[0] <= 3) {
                            System.out.println("Queda poca cantidad de queso, perdir más");
                        } 
                        else if (Squeso[0] >= 15) {
                                System.out.println("Hay mucha cantidad de queso, no pedir más de momento");
                        }
                        
                        if (Shamburguesa[0] <= 10) {
                            System.out.println("Quedan pocas hamburguesas, pedir más");
                        } 
                        else if (Shamburguesa[0] > 100) {
                            System.out.println("Hay muchas hamburguesas, no pedir más de momento");
                            
                        }
                        System.out.println("-----------------------------------------");
                        opcionCMD = Integer.parseInt(teclado.next());//Se lee la opcion ingresada por el usuario
                        switch (opcionCMD) {
                            case 1:
                                MenuIngredientes.menuIngredientes(SpanH, Squeso, Sharina, SpanL, Shamburguesa, Smilanesa);
                                break;
                            case 2:
                                Ingredientes.ingredientes(SpanH, SpanL, Squeso, Sharina, Shamburguesa, Smilanesa, gastos);
                                break;
                            case 3:
                                IngredientesPerdidos.ingredientesPerdidos(Shamburguesa, Squeso, SpanL, SpanH, Sharina, Smilanesa);
                                break;
                            case 4:
                                break;

                            default:
                                System.out.println(" -----------------------------------------------------------------------------------------------");
                                System.out.println("| La opción que ha ingresado no es correcta. Por favor, digite una que se encuentre en el menú. |");
                                System.out.println(" -----------------------------------------------------------------------------------------------");
                        }
                    } while (opcionCMD != 5 || opcionCMD != 4);

                case 3:
                    do {
                        System.out.println("");
                        System.out.println(" -----------------------------------------");
                        System.out.println("|                                         |");
                        System.out.println("|-----------------------------------------|");
                        System.out.println("|***************  SNACKS *****************|");
                        System.out.println("|                                         |");
                        System.out.println("|           1 - Ver stock                 |");
                        System.out.println("|           2 - Ingresar stock            |");
                        System.out.println("|           3 - Stock perdido             |");
                        System.out.println("|           4 - Volver                    |");
                        System.out.println("|           5 - Salir                     |");
                        System.out.println(" -----------------------------------------");

                    
                        opcionSNK = Integer.parseInt(teclado.next());
                        
                        switch (opcionSNK) {
                            case 1:
                                MenuSnack.menuSnack(Ssnack, valorSNK, snack);
                                break;
                            case 2:
                                EntradaSnack.entradaSnack(Ssnack, valorSNK, snack, gastos);
                            case 3:
                                SnackPerdido.menuSnack(Ssnack, valorSNK, snack);
                            case 4:
                                break;

                            default:
                                System.out.println("-------------------------------------------------------------------------------------------------");
                                System.out.println("| La opción que ha ingresado no es correcta. Por favor, digite una que se encuentre en el menú. |");
                                System.out.println("-------------------------------------------------------------------------------------------------");
                                System.out.println("");
                                System.out.println("");
                                break;
                        }
                    } while (opcionSNK != 5 || opcionSNK != 4);
            }
        } while (opcion != 4);
    }
}