
package comandas;

import java.util.Scanner;

public class Comandas {
    public static void Comandas(double ganancias, double sbebida[], double valorm, double valorsnk, double valorp, double valorb, double shamburguesa, double squeso, double spanl, double spanh, double sharina, double smilanesa, double ordenessumatoria, String listacomanda[][], double ordenes, double preciop[], double preciom[], double preciob[], String pizza[], String bebida[], String minuta[], String bandera) {
        Scanner entrada = new Scanner(System.in);
       // Le damos valores a las distintas comidas,productos y stock
         
        int precioTotal = 0;
        
        //Tomamos los pedidos
        System.out.println("ingrese la cantidad de ordenes a tomar");
        ordenes = entrada.nextInt();
        for (int i = 1; i < ordenes+1; i++) {
            for (int j = 0; j < 5; j++) {
                
                switch (j) {
                    case 2 -> {
                        System.out.println("Pizzas: ");
                        for (int k = 0; k < 4; k++) {
                            System.out.println(k+". "+pizza[k]);
                        }   
                        System.out.println("elija su opcion: ");
                        int opcionPi = entrada.nextInt();
                        listacomanda[i][2]= pizza[opcionPi];
                        precioTotal += preciop[opcionPi];
                    }
                    case 3 -> {
                        System.out.println("Minutas: ");
                        for (int l = 0; l < 4; l++) {
                            System.out.println(l+". "+minuta[l]);
                        }
                        System.out.println("elija su opcion: ");
                        int opcionMi = entrada.nextInt();
                        listacomanda[i][3]= minuta[opcionMi];
                        precioTotal += preciop[opcionMi];
                    }
                    case 4 -> {
                        System.out.println("Bebidas: ");
                        for (int m = 0; m < 4; m++) {
                            System.out.println(m+". "+bebida[m]);
                        }
                        System.out.println("elija su opcion: ");
                        int opcionBe = entrada.nextInt();
                        listacomanda[i][4] = bebida[opcionBe];
                        precioTotal += preciop[opcionBe];
                    }
                    default -> {
                            System.out.println("ingrese "+listacomanda[0][j]);
                            listacomanda[i][j]=entrada.next();
                    }
                }
                            }
            listacomanda[i][5]= "$ "+Integer.toString(precioTotal);
            precioTotal = 0;
        }
        
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
         for (int i = 1; i < ordenes+1; i++) {
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
}
