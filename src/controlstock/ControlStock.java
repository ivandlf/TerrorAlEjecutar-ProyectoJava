package controlstock;

import java.util.Scanner;

public class ControlStock {

    public static void controlStock(String[] bebida, double[] valorB, double[] Sbebida, double[] Ssnack, String[] Snack, double[] valorSNK, double[] gastos, double[] ganancias, double[] Shamburguesa, double[] Squeso, double[] SpanL, double[] SpanH, double[] Sharina, double[] Smilanesa) {

        Scanner teclado = new Scanner(System.in);
        int opcionBe, opcionSNK, opcion, i, opcionCMD;

        do {
            System.out.println("");
            System.out.println(" -----------------------------------------");
            System.out.println("|                                         |");
            System.out.println("|-----------------------------------------|");
            System.out.println("|************** MENÚ STOCK ***************|");
            System.out.println("|-----------------------------------------|");
            System.out.println("|                                         |");
            System.out.println("|         *Opcion 1: Bebidas              |");
            System.out.println("|         *Opcion 2: Comidas              |");
            System.out.println("|         *Opcion 3: Snacks               |");
            System.out.println("|         *Opcion 4: Salir                |");
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
                        System.out.println("|************** MENU BEBIDAS *************|");
                        System.out.println("|-----------------------------------------|");
                        System.out.println("|     1_ ver stock de Bebidas             |");
                        System.out.println("|     2_ Ingresar stock                   |");
                        System.out.println("|     3_ Stock Perdido                    |");
                        System.out.println("|     4_ Volver                           |");
                        System.out.println("|     5_ Salir                            |");
                        System.out.println("|                                         |");
                        System.out.println(" ----------------------------------------- ");
                        System.out.println("");

                        System.out.println("*** Avisos *** ");
                        System.out.println("--------------------------");

                        for (int i = 0; i <= valorB; i++) {
                            System.out.println(i + "Bajo stock de" + bebida[i]);
                        }
                        System.out.println("--------------------------");
                        System.out.println("");

                        opcionBe = Integer.parseInt(teclado.next()); //se lee la opcion ingresada por el usuario
                        switch (opcionBe) {
                            case 1:
                                MenuBebidas(bebida, valorB, Sbebida);
                                break;
                            case 2:
                                EntradaBebidas(Sbebida, valorB, bebida, gastos);
                                break;
                            case 3:
                                BebidasPerdidas(Sbebida, valorB, bebida);
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("------------------------------------------------------------------------------------------");
                                System.out.println("|La opcion que a ingresado no es correcta. Por favor dijite una que se encuentre en el menu|");
                                System.out.println("------------------------------------------------------------------------------------------");
                                System.out.println("");
                                System.out.println("");
                        }
                    }while(opcion =! 5);
                    break;
                case 2: // Opcion 2 se muestra toda la informacion sobre comidas(Harina, panes, hamburguesas, milanesas, queso, etc)
                    do {
                        System.out.println("");
                        System.out.println(" -----------------------------------------");
                        System.out.println("|                                         |");
                        System.out.println("|-----------------------------------------|");
                        System.out.println("|************* INGREDIENTES **************|");
                        System.out.println("|                                         |");
                        System.out.println("|            1_ Ver stock                 |");
                        System.out.println("|            2_Ingresar Stock             |");
                        System.out.println("|            3_Stock perdido              |");
                        System.out.println("|            4_Volver                     |");
                        System.out.println("|            5_Salir                      |");
                        System.out.println("|                                         |");
                        System.out.println(" -----------------------------------------");
                        System.out.println("***Avisos***");
                        System.out.println("-----------------------------------------");
                        if (SpanL <= 10) {//Aviso de que hay que pedir más mercaderia
                            System.out.println("Hay mucha cantidad de packs de panes de lomos. No pedir más de momento");
                        } else {
                            if (SpanL >= 60) {//Aviso de que hay que pedir menos mercaderia
                                System.out.println("Hay mucha cantidad de packs de panes de lomos. No pedir más de momento");
                            }
                        }

                        if (SpanH <= 10) {
                            System.out.println("Quedan pocos panes de hamburguesas. Pedir un poco más");
                        } else {
                            if (SpanH <= 100) {//Aviso de que hay que pedir más mercaderia
                                System.out.println("Quedan pocos panes de hamburguesas. Pedir un poco más");
                            }
                        }
                        if (Smilanesa <= 10) {
                            System.out.println("Quedan pocas milanesas, pedir un poco más ");
                        } else {
                            if (Smilanesa >= 50) {
                                System.out.println("Hay muchas milanesas, no pedir más de momento");
                            }
                        }
                        if (Sharina <= 15) {
                            System.out.println("Hay pocos kg de harina, pedir un poco más");
                        } else {
                            if (Sharina >= 100) {
                                System.out.println("Hay muchos kg de harina, no pedir más de momento");
                            }
                        }
                        if (Squeso <= 3) {
                            System.out.println("Queda poca cantidad de queso, perdir más");
                        } else {
                            if (Squeso >= 15) {
                                System.out.println("Hay mucha cantidad de queso, no pedir más de momento");
                            }
                        }
                        if (Shamburguesa <= 10) {
                            System.out.println("Quedan pocas hamburguesas, pedir más");
                        } else {
                            if (Shamburguesa > 100) {
                                System.out.println("Hay muchas hamburguesas, no pedir más de momento");
                            }
                        }
                        System.out.println("-----------------------------------------");
                        opcionCMD = Integer.parseInt(teclado.nextLine());//Se lee la opcion ingresada por el usuario
                        switch (opcionCMD) {
                            case 1:
                                MenuIngredientes(SpanH, Squeso, Sharina, SpanL, Shamburguesa, Smilanesa);
                                break;
                            case 2:
                                Ingredientes(SpanH, SpanL, Squeso, Sharina, Shamburguesa, Smilanesa, gastos);
                                break;
                            case 3:
                                IngredientesPerdidos(Shamburguesa, Squeso, SpanL, SpanH, Sharina, Smilanesa);
                                break;
                            case 4:
                                break;

                            default:
                                System.out.println(" ------------------------------------------------------------------------------------------ ");
                                System.out.println("|La opcion que a ingresado no es correcta. Por favor dijite una que se encuentre en el menu|");
                                System.out.println(" ------------------------------------------------------------------------------------------ ");
                        }
                    } while (opcion =! 5);
                case 3:
                    do {
                        System.out.println("");
                        System.out.println(" -----------------------------------------");
                        System.out.println("|                                         |");
                        System.out.println("|-----------------------------------------|");
                        System.out.println("|***************  SNACKS *****************|");
                        System.out.println("|                                         |");
                        System.out.println("|           1_ Ver stock                  |");
                        System.out.println("|           2_ Ingresar stock             |");
                        System.out.println("|           3_ Stock perdido              |");
                        System.out.println("|           4_ Volver                     |");
                        System.out.println("|           5_ Salir                      |");
                        System.out.println(" -----------------------------------------");
                        System.out.println(" ***Avisos***");
                        System.out.println("-------------------------");
                        for (int i = 0; i <= valorSNK; i++) {
                            System.out.println(i + "Bajo stock de " + Snack[i]);
                        }
                        System.out.println("-------------------------");
                        opcionSNK = Integer.parseInt(teclado.nextLine());
                        switch (opcionSNK) {
                            case 1:
                                MenuSnack(Ssnack, valorSNK, Snack);
                                break;
                            case 2:
                                EntradaSnack(Ssnack, valorSNK, Snack, gastos);
                            case 3:
                                SnackPerdido(Ssnack, valorSNK, Snack);
                            case 4:
                                break;

                            default:
                                System.out.println("------------------------------------------------------------------------------------------");
                                System.out.println("|La opcion que a ingresado no es correcta. Por favor dijite una que se encuentre en el menu|");
                                System.out.println("------------------------------------------------------------------------------------------");
                                System.out.println("");
                                System.out.println("");
                        }
                    } while (opcion =! 5);
            }
        } while (opcion =! 4);
