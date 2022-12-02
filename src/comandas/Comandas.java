
package comandas;

import java.util.Scanner;

public class Comandas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String bandera, banderaB, banderaCa, banderaCo, bebida[];
        String barman = null;
        double bebidas;
	String cajero = null;
        String cocinero = null;
	double ganancias, gastos, horasT = 0;
        String listacomanda[][];
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
	listacomanda = new String[50][7];
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
        // A continuacion definimos valores a todas la svariables necesaras para  que funcione el programa
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
		// Se lee opci?n ingresada por el usuario
		num = entrada.nextInt();
                System.out.println(""); // no hay forma directa de borrar la consola en Java
		switch (num) {
		case 1 -> {
                    // invocamos al subProceso: Controlstock(Gastos,Ganancias)
                    // Subproceso de opcion1 Stock
                    controlstock(bebida,valorB,Sbebida,Ssnack,snack,valorSNK,gastos,ganancias,Shamburguesa,Squeso,SpanL,SpanH,Sharina,Smilanesa);
                    // invocamos al SubProceso: Jornales(Gastos)
                }
		case 2 ->{ 
                    jornales(semana,horas,horasC,horasB,horasCA,gastos,cocinero,barman,cajero,semana,banderaCo,banderaB,banderaCa,horasC,horasB,horasCA,salario,horasT,horas,pagoB,pagoC,pagoCA);
                    // invocamos al subProceso: Men?
                }
		case 3 ->{ menu(valorM,valorSNK,valorP,valorB,precioP,precioM,precioB,pizza,bebida,minuta,snack,precioSNK);		
                }
                // invocamos al subProceso: Comandas
		case 4 ->{ 
                    Comandas(ganancias,Sbebida,valorM,valorSNK,valorP,valorB,Shamburguesa,Squeso,SpanL,SpanH,Sharina,Smilanesa,ordenessumatoria,listacomanda,ordenes,precioP,precioM,precioB,pizza,bebida,minuta,bandera);
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
    
    
    public static void Comandas(double ganancias, double[] sbebida, double valorm, double valorsnk, double valorp, double valorb, double shamburguesa, double squeso, double spanl, double spanh, double sharina, double smilanesa, int ordenessumatoria, String[][] listacomanda, int orden, double[] preciop, double[] preciom, double[] preciob, String[] pizza, String[] bebida, String[] minuta, String bandera){
        Scanner entrada = new Scanner(System.in);
        String listaComandas[][] = new String [50][6];
        listaComandas[0][0] = "Nº";
        listaComandas[0][1] = "Comensales";
        listaComandas[0][2] = "Pizzas";
        listaComandas[0][3] = "Minutas";
        listaComandas[0][4] = "Bebidas";
        listaComandas[0][5] = "Total";
        
       
        //Tomamos los pedidos
        System.out.println("ingrese la cantidad de ordenes a tomar");
        int ordenes = entrada.nextInt();
        for (int i = 1; i < ordenes+1; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("ingrese "+listaComandas[0][j]);
                listaComandas[i][j]=entrada.next();
            }
            
        }
        //Mostramos los titulos de la matriz
        System.out.println("+---+----------+--------------------+--------------------+--------------------+--------------------+");
         for (int i = 0; i < 1; i++) {
            for (int j = 0; j < listaComandas[i].length; j++) {
                if(j == 0){
                    System.out.print("| "+listaComandas[i][0]);
                }
                else if(j==1){
                    System.out.printf("|%S",listaComandas[i][1]);
                }
                else{
                    System.out.printf("|%-20S",listaComandas[i][j]);
                }
                
            }
        }
         System.out.print("|");
         System.out.println("");
         System.out.print("+---+----------+--------------------+--------------------+--------------------+--------------------+");
         //Mostramos los pedidos
         System.out.println("");
         for (int i = 1; i < ordenes+1; i++) {
             for (int j = 0; j < listaComandas[i].length; j++) {
                 if(j==0){
                     System.out.printf("|%-3S",listaComandas[i][0]);
                 }
                 else if(j==1){
                    System.out.printf("|%-10s",listaComandas[i][1]); 
                 }
                 else{
                     System.out.printf("|%-20s", listaComandas[i][j]);
                 }
             }
             System.out.print("|");
             System.out.println("");
        }
    }
    

    public static void jornales(String[][] semana, double[][] horas, double[][] horasC, double[][] horasB, double[][] horasCA, double gastos, String cocinero, String barman, String cajero, String[][] semana1, String banderaCo, String banderaB, String banderaCa, double[][] horasC1, double[][] horasB1, double[][] horasCA1, double salario, double horasT, double[][] horas1, double pagoB, double pagoC, double pagoCA){
		double i, j;
		int num;
                Scanner entrada = new Scanner(System.in);
		double opcionE;
		// A continuacion Definimos todas las variables necesarias para definir las jornadas laborales
		// Definimos banderas para avisarnos cuando las jornadas no hayan sido registradas
		
		// asignamos un valor a HorasT 
		horasT = 0;
		do {
			System.out.println("");
			System.out.println(" --------------------------------------");
			System.out.println("|                                      |");
			System.out.println("|--------------------------------------|");
			System.out.println("|************** JORNALES **************|");
			System.out.println("|--------------------------------------|");
			System.out.println("|        1_Ver Jornadas                |");
			System.out.println("|        2_Editar jornadas             |");
			System.out.println("|        3_Salir                       |");
			System.out.println("|                                      |");
			System.out.println(" --------------------------------------");
			num = entrada.nextInt();
			System.out.println(""); 
			switch (num) {
			case 1 -> {
                            do {
                                // Damos mensajes para aquellos casos en los que no hayan sido definidas las jornadas
                                System.out.println(" ");
                                System.out.println("VER JORNADAS: ");
                                if (banderaCo.equals("v")) {
                                    System.out.println("1_ Cocinero: "+cocinero);
                                } else {
                                    System.out.println("falta editar las jornadas del cocinero");
                                }
                                if (banderaB.equals("v")) {
                                    System.out.println("2_ Barman: "+barman);
                                } else {
                                    System.out.println("falta editar las jornadas del barman");
                                }
                                if (banderaCa.equals("v")) {
                                    System.out.println("3_ Cajero: "+cajero);
                                } else {
                                    System.out.println("Falta editar las jornadas del cajero");
                                }
                                System.out.println("4_ Volver");
                                System.out.println("5_ Salir");
                                num = entrada.nextInt();
                                System.out.println(""); 
                                switch (num) {
                                    case 1 -> {
                                        // A continuacion mostramos los arreglos, primero los dias de la semana y luego las horas que registramos para queda uno, esto de manera ordenada y separada por empleado
                                        if (banderaCo.equals ("v")) {
                                            System.out.println("Se encarga de la cocina");
                                            for (i=0;i<=1;i++) {
                                                for (j=0;j<=4;j++) {
                                                    if (i==0) {
                                                        System.out.print("|"+semana[0][j]+"| ");
                                                    } else {
                                                        System.out.print("   "+horasC[0][j]+"       ");
                                                    }
                                                }
                                                System.out.println(" ");
                                            }
                                            System.out.println("salario de esta semana: "+pagoc);
                                        } else {
                                            System.out.println("PRIMERO DEBE EDITAR LAS JORNADAS");
                                            System.out.println("");
                                        }
                                    }
                                    case 2 -> {
                                        if (banderaV.equals("v")) {
                                            System.out.println("Se encarga de la barra");
                                            System.out.println("Jornada semana: ");
                                            System.out.println("");
                                            for (i=0;i<=1;i++) {
                                                for (j=0;j<=4;j++) {
                                                    if (i==0) {
                                                        System.out.print("|"+semana[0][j]+"| ");
                                                    } else {
                                                        System.out.print("   "+horasB[0][j]+"       ");
                                                    }
                                                }
                                                System.out.println(" ");
                                            }
                                            System.out.println("salario de esta semana: "+pagob);
                                        } else {
                                            System.out.println("PRIMERO DEBE EDITAR LAS JORNADAS");
                                            System.out.println("");
                                        }
                                    }
                                    case 3 -> {
                                        if (banderaCa.equals("v")) {
                                            System.out.println("Se encarga de la caja");
                                            System.out.println("Jornada semana: ");
                                            System.out.println("");
                                            for (i=0;i<=1;i++) {
                                                for (j=0;j<=4;j++) {
                                                    if (i==0) {
                                                        System.out.print("|"+semana[0][j]+"| ");
                                                    } else {
                                                        System.out.print("   "+horasCa[0][j]+"       ");
                                                    }
                                                }
                                                System.out.println(" ");
                                            }
                                            System.out.println("salario de esta semana: "+pagoca);
                                        } else {
                                            System.out.println("PRIMERO DEBE EDITAR LAS JORNADAS");
                                            System.out.println("");
                                        }
                                    }
                                    case 4 -> {
                                    }
                                    default -> {
                                        System.out.println(" ------------------------------------------------------------------------------------------ ");
                                        System.out.println("|La opcion que a ingresado no es correcta. Por favor dijite una que se encuentre en el menu|");
                                        System.out.println(" ------------------------------------------------------------------------------------------ ");
                                        System.out.println("");
                                        System.out.println("");
                                    }
                                }
                            } while (!(num==4 || num==5));
                        }
			case 2 -> {
                            do {
                                System.out.println("");
                                System.out.println(" -------------------------------------");
                                System.out.println("|                                     |");
                                System.out.println("|-------------------------------------|");
                                System.out.println("|********** EDITAR JORNADAS **********|");
                                System.out.println("|-------------------------------------|");
                                System.out.println("|        1_Cocinero                   |");
                                System.out.println("|        2_Barman                     |");
                                System.out.println("|        3_Cajero                     |");
                                System.out.println("|        4_Volver                     |");
                                System.out.println("|        5_Salir                      |");
                                System.out.println("|                                     |");
                                System.out.println(" -------------------------------------");
                                System.out.println(" ");
                                // leemos la opcion que ingreso el gerente y entra a su respectiva opcion
                                opcionE = entrada.nextInt();
                                System.out.println(""); 
                                switch (opcionE) {
                                    case 1 -> {
                                        // En cada empleado primero le asignamos nombre y el salario que cobrara por hora, luego le asignamos las horas de la semana
                                        // Las cuales estan explicadas en su subpreceso, mostramos su jornada semanal, y calculamos su salario de la semana
                                        // A travez de una Funcion sencilla, agregamos el sueldo a gastos, y mostramos su pago al gerente, y le asignamos a bandera que ya esta lista para ver su joranada en su seccion
                                        System.out.println(" ");
                                        System.out.print("Digite el nombre del empleado: ");
                                        cocinero = entrada.nextLine();
                                        System.out.print("Definir salario por hora: ");
                                        salario = entrada.nextLine();
                                        System.out.println("");
                                        // invocamos a el SubProceso:  CalculoJornales(HorasT)
                                        calculojornales(horast,semana,horas);
                                        for (j=0;j<=4;j++) {
                                            horasC[0][j] = horas[0][j];
                                        }
                                        // se le asigna la suma de  las horas semanales
                                        pagoC = calculosalario(horast,salario);
                                        gastos += pagoC;
                                        banderaco = "v";
                                        // mostramos el total del pago semanal
                                        System.out.println("El total de "+cocinero+" de la semana es: "+pagoc);
                                    }
                                    case 2 -> {
                                        System.out.println(" ");
                                        System.out.print("Digite el nombre del empleado: ");
                                        barman = entrada.nextLine();
                                        System.out.print("Digite salario por hora: ");
                                        salario = entrada.nextDouble();
                                        System.out.println(""); // no hay forma directa de borrar la consola en Java
                                        // invocamos a el SubProceso:  CalculoJornales(HorasT)
                                        calculojornales(horasT,semana,horas);
                                        for (j=0;j<=4;j++) {
                                            horasB[0][j] = horas[0][j];
                                        }
                                        // se le asigna la suma de  las horas semanales
                                        pagoB = calculosalario(horast,salario);
                                        gastos = pagob+gastos;
                                        banderab = "v";
                                        // mostramos el total del pago semanal
                                        System.out.println("El pago de "+barman+" de la semana es: "+pagob);
                                    }
                                    case 3 -> {
                                        System.out.println(" ");
                                        System.out.print("Digite el nombre del empleado: ");
                                        cajero = entrada.nextLine();
                                        System.out.print("Digite salario por hora: ");
                                        salario = entrada.nextDouble();
                                        System.out.println(""); // no hay forma directa de borrar la consola en Java
                                        // invocamos a el SubProceso:  CalculoJornales(HorasT)
                                        calculojornales(horast,semana,horas);
                                        for (j=0;j<=4;j++) {
                                            horasca[0][j] = horas[0][j];
                                        }
                                        // se le asigna la suma de  las horas semanales
                                        pagoca = calculosalario(horast,salario);
                                        gastos = pagoca+gastos;
                                        banderaca = "v";
                                        // mostramos el total del pago semanal
                                        System.out.println("El pago de "+cajero+" de la semana es: "+pagoca);
                                    }
                                    case 4 -> {
                                    }
                                    case 5 -> {
                                    }
                                    default -> {
                                        System.out.println(" ------------------------------------------------------------------------------------------ ");
                                        System.out.println("|La opcion que a ingresado no es correcta. Por favor dijite una que se encuentre en el menu|");
                                        System.out.println(" ------------------------------------------------------------------------------------------ ");
                                        System.out.println("");
                                        System.out.println("");
                                    }
                                }
                            } while (!(opcione==4 || opcione==5));
                        }
			case 3 -> {
                        }
			default -> {
                            System.out.println(" ------------------------------------------------------------------------------------------ ");
                            System.out.println("|La opcion que a ingresado no es correcta. Por favor dijite una que se encuentre en el menu|");
                            System.out.println(" ------------------------------------------------------------------------------------------ ");
                            System.out.println("");
                            System.out.println("");
                        }
			}
		} while (!(num==3 || num==5 || opcione==5));
	}

	// ----------------------------
	// SUBPROCESO CALCULO JORNALES
	// ----------------------------
	// Subproceso para asignar horas a empleadosao
	public static void calculojornales(double horast, String semana[][], double horas[][]) {
            Scanner entrada = new Scanner(System.in);
		int i;
		int j;
		int pago;
		// asignamos un valor a HorasT 
		horast = 0;
		// esto recorrer los 5 dias y va poniendo las horas que trabajo 
		for (j=0;j<=4;j++) {
			System.out.print("Definir las horas del dia "+j+1+"? De la semana");
			horas[0][j] = entrada.nextDouble();
			// aca se van sumando el total de horas q trabajo en la semana 
			horast = horast+horas[0][j];
			System.out.println(""); // no hay forma directa de borrar la consola en Java
		}
		// recorremos la matriz
		for (i=0;i<=1;i++) {
			for (j=0;j<=4;j++) {
				// esto nos va a mostrar primero los dias de la semana 
				if (i==0) {
					System.out.print("|"+semana[0][j]+"| ");
					// en las acciones por falso, nos muestra las horas que trabajo con sus respectivos dias
				} else {
					System.out.print("   "+horas[0][j]+"       ");
				}
			}
			System.out.println(" ");
		}
		// se muestra el total de horas de la semana 
		System.out.println("La cantidad de horas semanales de este empleado son:"+horast);
	}

	public static double calculosalario(double horast, double salario) {
		double pago;
		// esta funcion realiza un calculo multiplicando el salario por horas, y las horas de la semana
		pago = horast*salario;
		return pago;
	}
}
