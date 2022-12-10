
package menu_principal;


import java.util.Scanner;


public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String bandera[] = new String[1];
        String banderaB[] = new String[1];
        String banderaCa[] = new String[1];
        String banderaCo[] = new String[1];
        String barman [] = new String[1];
        double bebidas;
	String cajero[] = new String[1];
        String cocinero[] = new String[1];
	double ganancias[] = new double[1] ;
        double gastos[] = new double[1];
        double horasT[] = new double[1];
	String minuta[] = new String[1];
        int num;
	int ordenes;
        int ordenessumatoria;
	double pagoB[] = new double[1];
        double pagoC[] = new double[1];
	double pagoCA[] = new double[1];
	double salario[] = new double[1];
        double Shamburguesa, Sharina, Smilanesa;

        double SpanH, SpanL, Squeso;
        int valorB, valorM, valorP, valorSNK;
        // A continuacion Definimos todas las variables necesarias para definir las jornadas laborales
	// Tanto los dias de semana como las horas de cada empleado se guardan en arreglos para que cuando lo veamos sea mas estetico
        String semana[][] = new String [1][5];
	double horas [][] = new double[1][5];
        double horasC [][] = new double[1][5];
	double horasB [][] = new double[1][5];
        double horasCA [][] = new double[1][5];
	String[][] listacomanda = new String[999][999];
        listacomanda = new String[50][6];
        String bebida[] = new String[999];
	double precioB[] = new double[999];
        double Sbebida [] = new double[999];
	String pizza [] = new String[999];
        double precioP[] = new double[999];
	String snack[] = new String[999];
        double precioSNK [] = new double[999];
	double Ssnack [] = new double[999];
        minuta = new String[999];
	double precioM [] = new double[999];
        // A continuacion definimos valores a todas las variables necesaras para  que funcione el programa
	// Asignamos un valor falso a las banderas
        banderaCo[0] = "f";
	banderaB[0] = "f";
        banderaCa[0] = "f";
	// Asignamos los dias de la semana a su respectiva matriz
        semana[0][0] = "Lunes ";
	semana[0][1] = "Martes ";
        semana[0][2] = "Miercoles ";
	semana[0][3] = "Jueves ";
        semana[0][4] = "Viernes";
        // Asignamos los titulares de la lista comandas en la matriz
        listacomanda[0][0] = "N°";
        listacomanda[0][1] = "Comensales";
        listacomanda[0][2] = "Pizzas";
        listacomanda[0][3] = "Minutas";
        listacomanda[0][4] = "Bebidas";
        listacomanda[0][5] = "Total";
	// Le damos valores a las distintas comidas,productos y stock
        ordenessumatoria = 0;
	valorB = 2;
        valorP = 2;
	valorSNK = 2;
        valorM = 2;
	bandera[0] = "";
        ordenes = 0;
	gastos[0] = 0;
        ganancias[0] = 0;
	Shamburguesa = 10;
        Squeso = 5;
	SpanL = 10;
        SpanH = 10;
	Smilanesa = 10;
        Sharina = 5;
	bebidas = 0;
        Ssnack[0] = 0;
	Ssnack[1] = 0;
        Ssnack[2] = 0;
	precioP[0] = 700;
        precioP[1] = 800;
	precioP[2] = 900;
        precioM[0] = 500;
	precioM[1] = 800;
        precioM[2] = 650;
	precioB[0] = 290;
        precioB[1] = 400;
	precioB[2] = 900;
        precioSNK[0] = 100;
	precioSNK[1] = 150;
        precioSNK[2] = 200;
	minuta[0] = "Milanesas";
        minuta[1] = "Lomos";
	minuta[2] = "Hamburguesa";
        pizza[0] = "Especial";
	pizza[1] = "Fugaceta";
        pizza[2] = "Napolitana";
	bebida[0] = "Coca Cola";
        bebida[1] = "Cerveza";
	bebida[2] = "Fernet";
        Sbebida[0] = 10;
	Sbebida[1] = 10;
        Sbebida[2] = 10;
	snack[0] = "Palitos Salados";
        snack[1] = "Mani Cervecero";
	snack[2] = "Papas Fritas";
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
                System.out.println("|       Elija que desea supervisar:      |");
		System.out.println("|                                        |");
		System.out.println("|    * Opcion 1: Control Stock           |");
                System.out.println("|    * Opcion 2: Jornales                |");
		System.out.println("|    * Opcion 3: Menu                   |");
		System.out.println("|    * Opcion 4: Comandas                |");
                System.out.println("|    * Opcion 5: Costos y ganacias       |");
		System.out.println("|    * Opcion 6: Salir                   |");
		System.out.println(" -----------------------------------------");
                System.out.println("");
		// Se lee opcion ingresada por el usuario
		num = entrada.nextInt();
                System.out.println(""); 
		switch (num) {
		case 1 -> {
                    // invocamos al subProceso: Controlstock(Gastos,Ganancias)
                    // Subproceso de opcion1 Stock
                    controlstock.ControlStock.controlStock(bebida,valorB,Sbebida,Ssnack,snack,valorSNK,gastos,ganancias,Shamburguesa,Squeso,SpanL,SpanH,Sharina,Smilanesa);
                    // invocamos al SubProceso: Jornales(Gastos)
                }
		case 2 ->{ 
                    jornales.Jornales.jornales(semana,horas,horasC,horasB,horasCA,gastos,cocinero,barman,cajero,semana,banderaCo,banderaB,banderaCa,horasC,horasB,horasCA,salario,horasT,horas,pagoB,pagoC,pagoCA);
                    // invocamos al subProceso: Menu
                }
		case 3 ->{ menu.Menu.Menu(valorM,valorSNK,valorP,valorB,precioP,precioM,precioB,pizza,bebida,minuta,snack,precioSNK);		
                }
                // invocamos al subProceso: Comandas
		case 4 ->{ 
                    comandas.Comandas.Comandas(ganancias,Sbebida,valorM,valorSNK,valorP,valorB,Shamburguesa,Squeso,SpanL,SpanH,Sharina,Smilanesa,ordenessumatoria,listacomanda,ordenes,precioP,precioM,precioB,pizza,bebida,minuta,bandera);
                    // invocamos al subProceso: Costos y Ganancias
                }
		case 5 ->{ 
                    costosyganancias.CostosyGanancias.CostosyGanancias(ganancias,gastos);
                }
                case 6 -> {
                    break;
                }
		default -> {
                    // Se muestra en pantalla un mensaje en caso de que la opcion ingresada no exista
                    System.out.println(" ----------------------------------------------------------------------------------------------");
                    System.out.println("| La opcion que ha ingresado no es correcta. Por favor, digite una que se encuentre en el menu. |");
                    System.out.println(" ---------------------------------------------------------------------------------------------- ");
                    System.out.println("");
                    System.out.println("");
                }
		}
        } while (num!=6);
    }
    
    }
    
