
package comandas;

import java.util.Scanner;

public class Comandas {
    public static void Comandas(double ganancias[], double sbebida[], int valorm[], int valorsnk[], int valorp[], int valorb[], double shamburguesa[], double squeso[], double spanl[], double spanh[], double sharina[], double smilanesa[], int ordenessumatoria[], String listacomanda[][], int ordenes[], double precioP[], double precioM[], double precioB[], String pizza[], String bebida[], String minuta[], String bandera[]) {
        Scanner entrada = new Scanner(System.in);
       // Le damos valores a las distintas comidas,productos y stock
         
        double precioTotal = 0;
        int num = 0;
        
       // Mostramos el menu de opciones
        do {
            System.out.println(" -------------------------------------");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println("|************* COMANDAS **************|");
            System.out.println("|-------------------------------------|");
            System.out.println("|        1_Ver comandas               |");
            System.out.println("|        2_Tomar ordenes              |");
            System.out.println("|        3_Salir                      |");
            System.out.println("|                                     |");
            System.out.println(" -------------------------------------");
            num = entrada.nextInt();
            
            switch(num){
                case 1 -> {
                    // en caso de que hayan comandas, se habilitara esta seccion y se recorreran las matrices mostrando las comandas guardadas
                    // En caso de que no, se mostrara un mensaje pidiendo que se tomen ordenes
                    if(bandera.equals("v")){
                        //Mostramos los titulos de la matriz
                        System.out.println("+---+----------+--------------------+--------------------+--------------------+--------------------+");
                         for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < listacomanda[i].length; j++) {
                                if(j == 0){
                                    System.out.print("| "+listacomanda[i][0]);
                                }
                                else if(j==1){
                                    System.out.printf("|%S",listacomanda[i][1]);
                                }
                                else{
                                    System.out.printf("|%-20S",listacomanda[i][j]);
                                }

                            }
                        }
                         System.out.print("|");
                         System.out.println("");
                         System.out.print("+---+----------+--------------------+--------------------+--------------------+--------------------+");
                         //Mostramos los pedidos
                         System.out.println("");
                         for (int i = 1; i <= ordenessumatoria[0]; i++) {
                             for (int j = 0; j < listacomanda[i].length; j++) {
                                 if(j==0){
                                     System.out.printf("|%-3S",listacomanda[i][0]);
                                 }
                                 else if(j==1){
                                    System.out.printf("|%-10s",listacomanda[i][1]); 
                                 }
                                 else{
                                     System.out.printf("|%-20s", listacomanda[i][j]);
                                 }
                             }
                             System.out.print("|");
                             System.out.println("");
                            }
                    }
                    else{
                        System.out.println("");
			System.out.println("  -----------------------------------");
			System.out.println(" |       Tome algunas ordenes        |");
			System.out.println("  -----------------------------------");
			System.out.println("");
			num = 0;
                    }
                    break;
                }
                
                case 2 -> {
                    // En esta opcion elegimos la cantidad de ordenes a tomar, elegimos la comida del menu, est proceso se repetira tantas veces como ordenes avisemos al programa que se tomaran
                    // Tambien ingresamos la fecha de la comanda,cantidad de comensales, y el numero de comanda
                    // Tambien avisamos al programa que hay comandas para ver en la seccion de "Ver comandas" , y guardamos los datos en la matriz que se mostrara en dicha seccion
                    // A su vez se restan los ingredientes de stock cada que ingresamos una comanda
                    System.out.println("  -----------------------------------");
                    System.out.println(" |           TOMAR ORDEN             |");
                    System.out.println("  -----------------------------------");
                    System.out.println("ingrese la cantidad de ordenes a tomar");
                    ordenes[0] = entrada.nextInt();
                    bandera[0] = "v";
                    for (int i = ordenessumatoria[0]; i <=ordenessumatoria[0]; i++) {
                        for (int j = 0; j < 5; j++) {
                            int opcomanda;
                            if(j<2){
                               System.out.println("ingrese "+listacomanda[0][j]);
                                listacomanda[i+1][j]=entrada.next();
                            }
                            else if(j==3){
                                listacomanda[i+1][2] = "";
				listacomanda[i+1][3] = "";
				listacomanda[i+1][4] = "";
                                do {
                                    System.out.println(" -------------------------------------");
                                    System.out.println("|                                     |");
                                    System.out.println("|-------------------------------------|");
                                    System.out.println("|*********** ELIJA SU MENU ***********|");
                                    System.out.println("|-------------------------------------|");
                                    System.out.println("|        1_Pizzas                     |");
                                    System.out.println("|        2_Minutas                    |");
                                    System.out.println("|        3_Bebidas                    |");
                                    System.out.println("|        4_Terminar                   |");
                                    System.out.println("|                                     |");
                                    System.out.println(" -------------------------------------");
                                    opcomanda = entrada.nextInt();
                                    switch (opcomanda) {
                                        case 1:
                                            System.out.println("Ingrese la cantidad de Pizzas: ");
                                            int cantidadpi = entrada.nextInt();
                                            System.out.println("elija la variedad: ");
                                            for (int k = 0; valorp[0] >= k; k++) {
                                                System.out.println(k+". "+pizza[k]);
                                            }
                                            System.out.println(valorp[0]+1+". Nada");
                                            int opcionPi = entrada.nextInt();
                                            if (sharina[0]>0.3 && squeso[0]>0.3) {
                                                if (opcionPi<=valorp[0]) {
                                                    listacomanda[i+1][2]= pizza[opcionPi]+" X "+cantidadpi;
                                                    sharina[0] -= 0.3;
                                                    squeso[0] -=0.3;
                                                    precioTotal += precioP[opcionPi]*cantidadpi;
                                                    System.out.println(precioTotal);
                                                }
                                                else if(opcionPi==valorp[0]+1){
                                                    listacomanda[i+1][2]="Nada";
                                                    precioTotal += 0;
                                                }
                                            }
                                            else{
                                                System.out.println("  ---------------------------------------------------");
                                                System.out.println(" |No hay stock de alimentos para realizar esta comanda|");
                                                System.out.println("  ---------------------------------------------------");
                                            }
                                            break;

                                        case 2:
                                            System.out.println("Ingrese la Minuta: ");
                                            for (int l = 0; valorm[0] >= l; l++) {
                                                System.out.println(l+". "+minuta[l]);
                                            }
                                            System.out.println(valorm[0]+1+". Nada");
                                            int opcionMi = entrada.nextInt();
                                            
                                            if(opcionMi<=valorm[0]){
                                                System.out.println("Ingrese la cantidad de "+minuta[opcionMi]);
                                                int cantidadMi = entrada.nextInt();
                                                if (opcionMi==0) {
                                                    if (smilanesa[0]>1) {
                                                        smilanesa[0] -= 1;
                                                        listacomanda[i+1][3] = minuta[opcionMi]+" X "+cantidadMi;
                                                        precioTotal += precioM[opcionMi]*cantidadMi;
                                                    }
                                                    else {
                                                        System.out.println("  ---------------------------------------------------");
                                                        System.out.println(" |No hay stock de alimentos para realizar esta comanda|");
                                                        System.out.println("  ---------------------------------------------------");
                                                    }
                                                }
                                                if (opcionMi==1) {
                                                    if (spanl[0]>1) {
							                        listacomanda[i+1][3] = minuta[opcionMi]+" X "+cantidadMi;
							                        precioTotal += precioM[opcionMi]*cantidadMi;
							                        spanl[0] -= 1;
                                                    } 
                                                    else {
							                        System.out.println("  ---------------------------------------------------");
							                        System.out.println(" |No hay stock de alimentos para realizar esta comanda|");
							                        System.out.println("  ---------------------------------------------------");
                                                    }
                                                }
                                                
                                                if (opcionMi==2) {
                                                    if (shamburguesa[0]>1 && spanh[0]>1) {
							                            listacomanda[i+1][3] = minuta[opcionMi]+" X "+cantidadMi;
							                            precioTotal += precioM[opcionMi]*cantidadMi;
							                            shamburguesa[0] -= 1;
							                            spanh[0] -= 1;
                                                    } 
                                                    else {
							                            System.out.println("  ---------------------------------------------------");
							                            System.out.println(" |No hay stock de alimentos para realizar esta comanda|");
							                            System.out.println("  ---------------------------------------------------");
                                                    }
                                                }
                                            }
                                            break;
                                        

                                        case 3:
                                            System.out.println("Bebidas: ");
                                            for (int m = 0; valorb[0] >= m; m++) {
                                                System.out.println(m+". "+bebida[m]);
                                            }
                                            System.out.println((valorb[0]+1)+". Nada");
                                            System.out.println("elija su opcion: ");
                                            int opcionBe = entrada.nextInt();
                                            System.out.println("elija la cantidad de "+bebida[opcionBe]);
                                            int cantidadBe = entrada.nextInt();
                                            if (opcionBe<=valorb[0]) {
						                        if (sbebida[opcionBe]>1) {
						                        listacomanda[i+1][4] = bebida[opcionBe]+" X "+cantidadBe;
						                        precioTotal += precioB[opcionBe]*cantidadBe;
						                        sbebida[opcionBe] = sbebida[opcionBe]-1;
                                                } 
                                                else {
					                                System.out.println("  ---------------------------------------------------");
						                            System.out.println(" |No hay stock de alimentos para realizar esta comanda|");
						                            System.out.println("  ---------------------------------------------------");
						                        }
                                            }
                                            if (opcionBe==(valorb[0]+1)) {
                                                listacomanda[i+1][4] = " ninguno";
                                            }
                                            break;

                                        case 4:
                                            break;
                                        
                                        default:
                                            System.out.println(" ------------------------------------------------------------------------------------------ ");
                                            System.out.println("|La opcion que a ingresado no es correcta. Por favor digite una que se encuentre en el menu|");
                                            System.out.println(" ------------------------------------------------------------------------------------------ ");
                                            System.out.println("");
                                            System.out.println("");
                                    }
                                }while (opcomanda!=4);
                                listacomanda[i+1][5]= "$ "+String.valueOf(precioTotal);
                                ganancias[0] += precioTotal;
                                precioTotal = 0;
                                
                            }    
                        }
                    }
                    ordenessumatoria[0] += ordenes[0];
                }
            }
            System.out.println("ganancias: "+ganancias[0]);
        }while (num!=3);
    }
}
