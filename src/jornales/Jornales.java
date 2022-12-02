
package jornales;

import static comandas.Comandas.Comandas;
import java.util.Scanner;

public class Jornales {
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
        double pagoV = 0;
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
	
        
}

public static void jornales(){
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