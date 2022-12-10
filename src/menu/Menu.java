
 
package menu;

import java.util.Scanner;

public class Menu {
   
    public static void Menu(double valorM[], double valorSNK[], double valorP[], double valorB[], double[] precioP, double[] precioM, double[] precioB, String[] pizza, String[] bebida, String[] minuta, String[] snack, double[] precioSNK) {
    Scanner teclado = new Scanner(System.in);
    int num;
    int nuevaOpcion;
            
        
        do{            
            System.out.println(" ");
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println("|**************** MENU ***************|");
            System.out.println("|-------------------------------------|");
            System.out.println("|        1_Ver Menu                   |");
            System.out.println("|        2_Cambiar Menu               |");
            System.out.println("|        3_Volver                     |");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println(" ");
            
            num = Integer.parseInt(teclado.next()); // Se lee opcion ingresada por el usuario
            
            switch(num){
            
                case 1 -> {
                    System.out.println("********* MENU *************");
                    System.out.println("----------------------------");
                    System.out.println("PIZZAS");
                    
                    for (int i=0; i <= valorP[0];i++){
                        System.out.println(pizza[i] +" $ "+precioP[i]);
                    }
                    
                    System.out.println("----------------------------");                    
                    
                    System.out.println("MINUTAS");
                    for (int i=0; i <= valorM[0];i++){
                        System.out.println(minuta[i] +" $ "+precioM[i]);
                    }                    
                    
                    System.out.println("----------------------------");
                    
                    System.out.println("BEBIDAS");                    
                    for (int i=0; i <= valorB[0];i++){
                        System.out.println(bebida[i] +" $ "+precioB[i]);
                    }
                    System.out.println("----------------------------");
                    
                    System.out.println("SNACKS");                    
                    for (int i=0; i <= valorSNK[0];i++){
                        System.out.println(snack[i] +" $ "+precioSNK[i]);
                    }
            }
                
                case 2 -> {
                    /* damos las diversas opciones de comidas a elegir
                     Luego se recorreran los arreglos y se seleccionara la opcion que se desea cambiar
                     A continuacion sustituiremos el nombre de esta variable por la de la nueva opcion y haremos lo mismo con el precio
                     Tambien daremos la opcion de aÃ±adir una nueva opcion ara ello aumentaremos el valor de la variable "valor" y su respectivo subindice
                    para luego asignarle un nombre y un precio
                    */
                    do{
                        System.out.println(" ");
                        System.out.println("|-------------------------------------|");
                        System.out.println("|                                     |");
                        System.out.println("|-------------------------------------|");
                        System.out.println("|*********** CAMBIAR MENU ************|");
                        System.out.println("|-------------------------------------|");
                        System.out.println("|        1_Pizzas                     |");
                        System.out.println("|        2_Minutas                    |");
                        System.out.println("|        3_Bebidas                    |");
                        System.out.println("|        4_Snacks                     |");
                        System.out.println("|        5_Volver                     |");
                        System.out.println("|                                     |");
                        System.out.println("|                                     |");
                        System.out.println("|-------------------------------------|");
                        System.out.println(" ");
                        num = Integer.parseInt(teclado.next()); // Se lee opcion ingresada por el usuario
                        
                        switch(num){
                            case 1 -> {
                                do{
                                    System.out.println("-------------------------------------");
                                    System.out.println("  Elija la opcion que desea cambiar  ");
                                    System.out.println("-------------------------------------");
                                    for(int i = 0; i <= valorP[0];i++){
                                        System.out.println(i+"_ "+pizza[i]);
                                    }                                    
                                    System.out.println(Math. round(valorP[0]+1)+"_ Añadir nueva opcion");
                                    System.out.println(Math. round(valorP[0]+2)+"_ Volver");
                                    
                                    System.out.println("-------------------------------------");
                                    nuevaOpcion = Integer.parseInt(teclado.next()); // Se lee opcion ingresada por el usuario                                  
                                    
                                    if(nuevaOpcion==Math. round(valorP[0]+1)){
                                        valorP[0] = Math. round(valorP[0]+1);                                        
                                    }
                                    if(nuevaOpcion<=valorP[0]){
                                        System.out.println("Escriba la nueva opcion");
                                        pizza[nuevaOpcion] = teclado.next(); // Se lee opcion ingresada por el usuario
                                        System.out.println("Asignar un precio");
                                        precioP[nuevaOpcion] = Double.parseDouble(teclado.next()); // Se lee opcion ingresada por el usuario
                                    }
                                }while(nuevaOpcion != Math. round(valorP[0]+2));
                            }
                            case 2 -> {
                                do{
                                    System.out.println("-------------------------------------");
                                    System.out.println("  Elija la opcion que desea cambiar  ");
                                    System.out.println("-------------------------------------");
                                    for(int i = 0; i <= valorM[0];i++){
                                        System.out.println(i+"_ "+minuta[i]);
                                    }                                    
                                    System.out.println(Math. round(valorM[0]+1)+"_ Añadir nueva opcion");
                                    System.out.println(Math. round(valorM[0]+2)+"_ Volver");
                                    
                                    System.out.println("-------------------------------------");                                    
                                    nuevaOpcion = Integer.parseInt(teclado.next()); // Se lee opcion ingresada por el usuario
                                    
                                    if(nuevaOpcion==Math. round(valorM+1)){
                                        valorM[0] = valorM[0]+1;
                                    }
                                    if(nuevaOpcion<=valorM[0]){
                                        System.out.println("Escriba la nueva opcion");
                                        minuta[nuevaOpcion] = teclado.next(); // Se lee opcion ingresada por el usuario
                                        System.out.println("Asignar un precio");
                                        precioM[nuevaOpcion] = Integer.parseInt(teclado.next()); // Se lee opcion ingresada por el usuario
                                    }
                                }while(nuevaOpcion != Math. round(valorM[0]+2));
                            }
                                
                            case 3 -> {
                                do{
                                    System.out.println("-------------------------------------");
                                    System.out.println("  Elija la opcion que desea cambiar  ");
                                    System.out.println("-------------------------------------");
                                    for(int i = 0; i <= valorB[0];i++){
                                        System.out.println(i+"_ "+bebida[i]);
                                    }                                    
                                    System.out.println(Math. round(valorB[0]+1)+"_ Añadir nueva opcion");
                                    System.out.println(Math. round(valorB[0]+2)+"_ Volver");
                                    System.out.println("-------------------------------------");                                    
                                    nuevaOpcion = Integer.parseInt(teclado.next()); // Se lee opcion ingresada por el usuario
                                    
                                    if(nuevaOpcion==Math. round(valorB[0]+1)){
                                        valorB[0] = valorB[0]+1;
                                        
                                    }
                                    if(nuevaOpcion<=valorB[0]){
                                        System.out.println("Escriba la nueva opcion");
                                        bebida[nuevaOpcion] = teclado.next(); // Se lee opcion ingresada por el usuario
                                        System.out.println("Asignar un precio");
                                        precioB[nuevaOpcion] = Integer.parseInt(teclado.next()); // Se lee opcicion ingresada por el usuario
                                    }
                                }while(nuevaOpcion != Math. round(valorB[0]+2));
                            }
                                
                            case 4 -> {
                                do{
                                    System.out.println("-------------------------------------");
                                    System.out.println("  Elija la opcion que desea cambiar  ");
                                    System.out.println("-------------------------------------");
                                    for(int i = 0; i <= valorSNK[0];i++){
                                        System.out.println(i+"_ "+snack[i]);
                                    }                                    
                                    System.out.println(Math. round(valorSNK[0]+1)+"_ Añadir Snack");
                                    System.out.println(Math. round(valorSNK[0]+2)+"_ Volver");                                    
                                    System.out.println("-------------------------------------");
                                    nuevaOpcion = Integer.parseInt(teclado.next()); // Se lee opcion ingresada por el usuario
                                    
                                    if(nuevaOpcion==(valorSNK[0]+1)){
                                        valorSNK = valorSNK[0]+1;
                                        
                                    }
                                    if(nuevaOpcion<=valorSNK[0]){
                                        System.out.println("Escriba la nueva opcion");
                                        snack[nuevaOpcion] = teclado.next(); // Se lee opcion ingresada por el usuario
                                        System.out.println("Asignar un precio");
                                        precioSNK[nuevaOpcion] = Integer.parseInt(teclado.next()); // Se lee opcion ingresada por el usuario
                                    }
                                }while(nuevaOpcion != Math. round(valorSNK[0]+2));
                            }
                            
                            case 5 -> {
                            }
                                
                            default -> {
                                System.out.println(" ------------------------------------------------------------------------------------------ ");
                                System.out.println("|La opcion que a ingresado no es correcta. Por favor dijite una que se encuentre en el menu|");
                                System.out.println(" ------------------------------------------------------------------------------------------ ");
                                System.out.println(" ");
                                System.out.println(" ");
                            }
                               
                        }
                        
                    }while(num!=5 );
            }
                    
                case 3 -> System.out.println("Saliste");
                
                default -> {
                    System.out.println(" ------------------------------------------------------------------------------------------ ");
                    System.out.println("|La opcion que a ingresado no es correcta. Por favor dijite una que se encuentre en el menu|");
                    System.out.println(" ------------------------------------------------------------------------------------------ ");
                    System.out.println(" ");
                    System.out.println(" ");
            }
                    
            }
        }while(num != 3 );      
    }
    
}
