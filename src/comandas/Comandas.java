
package comandas;

import java.util.Scanner;

public class Comandas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       // Le damos valores a las distintas comidas,productos y stock
        int ordenessumatoria = 0;
	int valorB = 2;
        int valorP = 2;
	int valorSNK = 2;
        int valorM = 2;
	String bandera = "";
        int ordenes = 0;
	int gastos = 0;
        int ganancias = 0;
	int Shamburguesa = 0;
        int Squeso = 0;
	int SpanL = 0;
        int SpanH = 0;
	int Smilanesa = 0;
        int Sharina = 0;
	int bebidas = 0;
        int Ssnack[] = new int [3];
        Ssnack [0] = 0;
	Ssnack[1] = 0;
        Ssnack[2] = 0;
        int precioP[]= new int [4];
	precioP[0] = 700;
        precioP[1] = 800;
	precioP[2] = 900;
        precioP[3]= 0;
        int precioM[] = new int [4];
        precioM[0] = 500;
	precioM[1] = 800;
        precioM[2] = 650;
        precioM[3] = 0;
        int precioB[] = new int [4];
	precioB[0] = 290;
        precioB[1] = 400;
	precioB[2] = 900;
        precioB[3] = 0;
        int precioSNK[] = new int [3];
        precioSNK[0] = 100;
	precioSNK[1] = 150;
        precioSNK[2] = 200;
        String minuta [] = new String [4];
	minuta[0] = "Milanesas";
        minuta[1] = "Lomos";
	minuta[2] = "Hamburguesa";
        minuta[3] = "Nada";
        String pizza[] = new String[4];
        pizza[3] = "Nada";
        pizza[0] = "Especial";
	pizza[1] = "Fugaceta";
        pizza[2] = "Napolitana";
        String bebida[] = new String[4];
	bebida[0] = "Coca Cola";
        bebida[1] = "Cerveza";
	bebida[2] = "Fernet";
        bebida[3] = "Nada";
        int Sbebida[]= new int[3];
        Sbebida[0] = 0;
	Sbebida[1] = 0;
        Sbebida[2] = 0;
        String snack[] = new String [3];
	snack[0] = "Palitos Salados";
        snack[1] = "Mani Cervecero";
	snack[2] = "Papas Fritas"; 
        int precioTotal = 0;
        
      
        String listaComandas[][] = new String [50][6];
        listaComandas[0][0] = "Nº";
        listaComandas[0][1] = "Comensales";
        listaComandas[0][2] = "Pizzas";
        listaComandas[0][3] = "Minutas";
        listaComandas[0][4] = "Bebidas";
        listaComandas[0][5] = "Total";
        
        for (int i = 0; i < 3; i++) {
            System.out.println(precioP[i]);
        }
       
        //Tomamos los pedidos
        System.out.println("ingrese la cantidad de ordenes a tomar");
        ordenes = entrada.nextInt();
        for (int i = 1; i < ordenes+1; i++) {
            for (int j = 0; j < 5; j++) {
                
                switch (j) {
                    case 2:
                        System.out.println("Pizzas: ");
                        for (int k = 0; k < 4; k++) {
                            System.out.println(k+". "+pizza[k]);
                        }   
                        System.out.println("elija su opcion: ");
                        int opcionPi = entrada.nextInt();
                        listaComandas[i][2]= pizza[opcionPi];
                        precioTotal += precioP[opcionPi];
                        System.out.println(precioTotal);
                        break;
                //listaComandas[i][j]=entrada.next();
                    case 3:
                        System.out.println("Minutas: ");
                        for (int l = 0; l < 4; l++) {
                            System.out.println(l+". "+minuta[l]);
                        }
                        System.out.println("elija su opcion: ");
                        int opcionMi = entrada.nextInt();
                        listaComandas[i][3]= minuta[opcionMi];
                        precioTotal += precioP[opcionMi];
                        System.out.println(precioTotal);
                        break;
                    case 4:
                        System.out.println("Bebidas: ");
                        for (int m = 0; m < 4; m++) {
                            System.out.println(m+". "+bebida[m]);
                        }
                        System.out.println("elija su opcion: ");
                        int opcionBe = entrada.nextInt();
                        listaComandas[i][4] = bebida[opcionBe];
                        precioTotal += precioP[opcionBe];
                        System.out.println(precioTotal);
                        break;
                    default:
                        System.out.println("ingrese "+listaComandas[0][j]);
                        listaComandas[i][j]=entrada.next();
                        
                        break;
                }
            }
            listaComandas[i][5]= "$ "+Integer.toString(precioTotal);
            precioTotal = 0;
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
}
