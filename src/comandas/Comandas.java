
package comandas;

import java.util.Scanner;

public class Comandas {
    
    
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
                if(j==0){
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
}
    
    

    

	