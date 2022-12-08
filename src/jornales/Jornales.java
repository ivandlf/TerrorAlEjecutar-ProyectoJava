
package jornales;

import java.util.Scanner;
import static jornales.CalculoJornales.calculojornales;
import static jornales.CalculoJornales.calculosalario;

public class Jornales {
    
public static void jornales(String[][] semana, double[][] horas, double[][] horasC, double[][] horasB, double[][] horasCA, double gastos, String cocinero, String barman, String cajero, String[][] semana1, String banderaCo, String banderaB, String banderaCa, double[][] horasC1, double[][] horasB1, double[][] horasCA1, double salario, double horasT, double[][] horas1, double pagoB, double pagoC, double pagoCA){
		int i, j;
		int num;
                Scanner entrada = new Scanner(System.in);
		int opcionE = 0;
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
                                                        System.out.print("| "+semana[0][j]+"| ");
                                                    } else {
                                                        System.out.print("   "+horasC[0][j]+"      ");
                                                    }
                                                }
                                                System.out.println(" ");
                                            }
                                            System.out.println("salario de esta semana: "+pagoC);
                                        } else {
                                            System.out.println("PRIMERO DEBE EDITAR LAS JORNADAS");
                                            System.out.println("");
                                        }
                                    }
                                    case 2 -> {
                                        if (banderaB.equals("v")) {
                                            System.out.println("Se encarga de la barra");
                                            System.out.println("Jornada semana: ");
                                            System.out.println("");
                                            for (i=0;i<=1;i++) {
                                                for (j=0;j<=4;j++) {
                                                    if (i==0) {
                                                        System.out.print("|"+semana[0][j]+"| ");
                                                    } else {
                                                        System.out.print("   "+horasB[0][j]+"      ");
                                                    }
                                                }
                                                System.out.println(" ");
                                            }
                                            System.out.println("salario de esta semana: "+pagoB);
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
                                                        System.out.print("   "+horasCA[0][j]+"     ");
                                                    }
                                                }
                                                System.out.println(" ");
                                            }
                                            System.out.println("salario de esta semana: "+pagoCA);
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
                                        System.out.println("Digite el nombre del empleado: ");
                                        cocinero = entrada.next();
                                        System.out.println("Definir salario por hora: ");
                                        salario = entrada.nextInt();
                                        System.out.println("");
                                        // invocamos a el SubProceso:  CalculoJornales(HorasT)
                                        calculojornales(horasT,semana,horas);
                                        for (j=0;j<=4;j++) {
                                            horasC[0][j] = horas[0][j];
                                        }
                                        // se le asigna la suma de  las horas semanales
                                        pagoC = calculosalario(horasT,salario);
                                        gastos += pagoC;
                                        banderaCo = "v";
                                        // mostramos el total del pago semanal
                                        System.out.println("El total de "+cocinero+" de la semana es: "+pagoC);
                                    }
                                    case 2 -> {
                                        System.out.println(" ");
                                        System.out.print("Digite el nombre del empleado: ");
                                        barman = entrada.next();
                                        System.out.print("Digite salario por hora: ");
                                        salario = entrada.nextDouble();
                                        System.out.println(""); 
                                        // invocamos a el SubProceso:  CalculoJornales(HorasT)
                                        calculojornales(horasT,semana,horas);
                                        for (j=0;j<=4;j++) {
                                            horasB[0][j] = horas[0][j];
                                        }
                                        // se le asigna la suma de  las horas semanales
                                        pagoB = calculosalario(horasT,salario);
                                        gastos += pagoB;
                                        banderaB = "v";
                                        // mostramos el total del pago semanal
                                        System.out.println("El pago de "+barman+" de la semana es: "+pagoB);
                                    }
                                    case 3 -> {
                                        System.out.println(" ");
                                        System.out.print("Digite el nombre del empleado: ");
                                        cajero = entrada.next();
                                        System.out.print("Digite salario por hora: ");
                                        salario = entrada.nextDouble();
                                        System.out.println(""); 
                                        // invocamos a el SubProceso:  CalculoJornales(HorasT)
                                        calculojornales(horasT,semana,horas);
                                        for (j=0;j<=4;j++) {
                                            horasCA[0][j] = horas[0][j];
                                        }
                                        // se le asigna la suma de  las horas semanales
                                        pagoCA = calculosalario(horasT,salario);
                                        gastos += pagoCA;
                                        banderaCa = "v";
                                        // mostramos el total del pago semanal
                                        System.out.println("El pago de "+cajero+" de la semana es: "+pagoCA);
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
                            } while (!(opcionE==4 || opcionE==5));
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
		} while (!(num==3 || num==5 || opcionE==5));
    }
}
