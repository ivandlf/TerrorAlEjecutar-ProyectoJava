
package menu_principal;

import static comandas.Comandas.Comandas;
import java.util.Scanner;
import static jornales.Jornales.jornales;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // ------------------
	// PANTALLA PRINCIPAL
        // ------------------
	do {
                System.out.println("           ");
		System.out.println(" ----------------------------------------");
                System.out.println("|                                        |");
		System.out.println("|----------------------------------------|");
                System.out.println("|************* CONTROL RESTO ************|");
		System.out.println("|----------------------------------------|");
		System.out.println("|                                        |");
                System.out.println("|       Elegir que desea supervisar:     |");
		System.out.println("|                                        |");
		System.out.println("|    *opcion 1: control Stock            |");
                System.out.println("|    *Opcion 2: Jornales                 |");
		System.out.println("|    *Opcion 3: Menu                     |");
		System.out.println("|    *Opcion 4: Comandas                 |");
                System.out.println("|    *Opcion 5: Costos y ganacias        |");
		System.out.println("|    *Opcion 6: Salir                    |");
		System.out.println(" -----------------------------------------");
                System.out.println("");
            // Se lee opci?n ingresada por el usuario
            int num = entrada.nextInt();
                System.out.println(""); // no hay forma directa de borrar la consola en Java
		switch (num) {
		case 1 -> {
                    // invocamos al subProceso: Controlstock(Gastos,Ganancias)
                    // Subproceso de opcion1 Stock
                    controlstock(bebida,valorb,sbebida,ssnack,snack,valorsnk,gastos,ganancias,shamburguesa,squeso,spanl,spanh,sharina,smilanesa);
                    // invocamos al SubProceso: Jornales(Gastos)
                }
		case 2 ->{ 
                    jornales(semana,horas,horasc,horasb,horasca,gastos,cocinero,barman,cajero,semana,banderaco,banderab,banderaca,horasc,horasb,horasca,salario,horast,horas,pagob,pagoc,pagoca);
                    // invocamos al subProceso: Men?
                }
		case 3 ->{ menu(valorm,valorsnk,valorp,valorb,aux,preciop,preciom,preciob,pizza,bebida,minuta,snack,preciosnk);		
                }
                // invocamos al subProceso: Comandas
		case 4 ->{ 
                    Comandas(ganancias,sbebida,valorm,valorsnk,valorp,valorb,shamburguesa,squeso,spanl,spanh,sharina,smilanesa,ordenessumatoria,listacomanda,ordenes,preciop,preciom,preciob,pizza,bebida,minuta,bandera);
                    // invocamos al subProceso: Costos y Ganancias
                }
		case 5 ->{ 
                    costosyganancias(ganancias,gastos);
                }
                case 6 -> {
                    break;
                }
		default -> {
                    // Se muestra en pantalla un mensaje en caso de que la opci?n ingresada no exista
                    System.out.println(" ------------------------------------------------------------------------------------------ ");
                    System.out.println("|La opcion que a ingresado no es correcta. Por favor dijite una que se encuentre en el menu|");
                    System.out.println(" ------------------------------------------------------------------------------------------ ");
                    System.out.println("");
                    System.out.println("");
                }
		}
        } while (num!=6);
    }
    
    }
    
