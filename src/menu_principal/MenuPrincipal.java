
package menu_principal;


import java.util.Scanner;


public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String bandera, banderaB, banderaCa, banderaCo, bebida[];
        String barman = null;
        double bebidas;
	String cajero = null;
        String cocinero = null;
	double ganancias, gastos, horasT = 0;
	String minuta[];
        int num;
	int ordenes;
        int ordenessumatoria;
	double pagoB = 0;
        double pagoC = 0;
	double pagoCA = 0;
	double salario = 0;
        double Shamburguesa, Sharina, Smilanesa;
	String snack[];
        double SpanH, SpanL, Squeso;
        double valorB, valorM, valorP, valorSNK;
        // A continuacion Definimos todas las variables necesarias para definir las jornadas laborales
	// Tanto los dias de semana como las horas de cada empleado se guardan en arreglos para que cuando lo veamos sea mas estetico
        String semana[][] = new String [1][5];
	double horas [][] = new double[1][5];
        double horasC [][] = new double[1][5];
	double horasB [][] = new double[1][5];
        double horasCA [][] = new double[1][5];
	String[][] listacomanda;
        listacomanda = new String[50][6];
        bebida = new String[999];
	double precioB[] = new double[999];
        double Sbebida [] = new double[999];
	String pizza [] = new String[999];
        double precioP[] = new double[999];
	snack = new String[999];
        double precioSNK [] = new double[999];
	double Ssnack [] = new double[999];
        minuta = new String[999];
	double precioM [] = new double[999];
        // A continuacion definimos valores a todas las variables necesaras para  que funcione el programa
	// Asignamos un valor falso a las banderas
        banderaCo = "f";
	banderaB = "f";
        banderaCa = "f";
	// Asignamos los dias de la semana a su respectiva matriz
        semana[0][0] = "Lunes ";
	semana[0][1] = "Martes ";
        semana[0][2] = "miercoles ";
	semana[0][3] = "Jueves ";
        semana[0][4] = "Viernes";
        // Asignamos los titulares de la lista comandas en la matriz
        listacomanda[0][0] = "Nº";
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
	bandera = "";
        ordenes = 0;
	gastos = 0;
        ganancias = 0;
	Shamburguesa = 0;
        Squeso = 0;
	SpanL = 0;
        SpanH = 0;
	Smilanesa = 0;
        Sharina = 0;
	bebidas = 0;
        Ssnack[0] = 0;
	Ssnack[1] = 0;
        Ssnack[2] = 0;
        precioP[0] = 0;
	precioP[1] = 700;
        precioP[2] = 800;
	precioP[3] = 900;
        precioM[0] = 0;
        precioM[1] = 500;
	precioM[2] = 800;
        precioM[3] = 650;
        precioB[0] = 0;
	precioB[1] = 290;
        precioB[2] = 400;
	precioB[3] = 900;
        precioSNK[0] = 100;
	precioSNK[1] = 150;
        precioSNK[2] = 200;
        minuta[0] = "Nada";
	minuta[1] = "Milanesas";
        minuta[2] = "Lomos";
	minuta[3] = "Hamburguesa";
        pizza[0] = "Nada";
        pizza[1] = "Especial";
	pizza[2] = "Fugaceta";
        pizza[3] = "Napolitana";
        bebida[0] = "Nada";
	bebida[1] = "Coca Cola";
        bebida[2] = "Cerveza";
	bebida[3] = "Fernet";
        Sbebida[0] = 0;
	Sbebida[1] = 0;
        Sbebida[2] = 0;
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
		// Se lee opcion ingresada por el usuario
		num = entrada.nextInt();
                System.out.println(""); 
		switch (num) {
		case 1 -> {
                    // invocamos al subProceso: Controlstock(Gastos,Ganancias)
                    // Subproceso de opcion1 Stock
                    controlstock.ControlStock.controlstock(bebida,valorB,Sbebida,Ssnack,snack,valorSNK,gastos,ganancias,Shamburguesa,Squeso,SpanL,SpanH,Sharina,Smilanesa);
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
    
