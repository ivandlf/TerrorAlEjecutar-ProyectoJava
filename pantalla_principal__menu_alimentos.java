import java.util.Scanner;


public class restaurante {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);        
        int num;
        
        //**************************
        //PANTALLA PRINCIPAL
        //**************************
        
        do{       
        
            System.out.println(" ");
            System.out.println("|----------------------------------------|");
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
            System.out.println("|----------------------------------------|");
            System.out.println("|                                        |");
            System.out.println(" ");
        
            System.out.print("Seleccione una opci�n: ");        
            num = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
            
            switch(num){
            
                case 1:
                    // invocamos al subProceso: Controlstock(Gastos,Ganancias)
                    //Controlstock(Bebida,valorB,Sbebida,Ssnack,Snack,valorSNK,Gastos,Ganancias,SHamburguesa,SQueso,SPanL,SPanH,Sharina,SMilanesa); // Subproceso de opcion1 Stock
                    break;
                case 2:
                    // invocamos al SubProceso: Jornales(Gastos)
                    //Jornales(semana,Horas,HorasC,HorasB,HorasCA,Gastos,cocinero,barman,cajero,semana,banderaCo,banderaB,banderaCa,HorasC,HorasB,HorasCA,salario,HorasT,Horas,pagoB,pagoC,PagoCA);
                    break;
                case 3:
                    // invocamos al subProceso: Menú
                    //menu(valorM,valorSNK,valorP,valorB,aux,precioP,precioM,precioB,pizza,Bebida,Minuta,Snack,precioSNK);
                    break;
                case 4:
                    // invocamos al subProceso: Comandas
                    //comandas(Ganancias,Sbebida,valorM,valorSNK,valorP,valorB,SHamburguesa,SQueso,SPanL,SPanH,Sharina,SMilanesa,ordenesSumatoria,listaComanda,ordenes,precioP,precioM,precioB,pizza,Bebida,Minuta,bandera);
                    break;
                case 5:
                    // invocamos al subProceso: Costos y Ganancias                    
                    //CostosyGanancias(Ganancias,Gastos);
                    break;
                case 6:
                    System.out.println("|-------------------------|" );
                    System.out.println("|--- FIN DE EJECUCI�N --- |");
                    System.out.println("|-------------------------|" );
                    break;
                default:
                    System.out.println("-------------------------------------------------------------------------------------------" );
                    System.out.println("|La opcion que a ingresado no es correcta. Por favor dijite una que se encuentre en el menu|");
                    System.out.println("-------------------------------------------------------------------------------------------" );
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
            }
        
        }while(num == 6);
        
        
        
        //**************************
        // SUBPROCESO MENU ALIMENTOS
        //**************************
        
        
        
        public void menu(valorM,valorSNK,valorP,valorB,aux,precioP,precioM,precioB,pizza,Bebida,Minuta,Snack,precioSNK){ // Subproceso para el cambiar el menu
        
        Scanner teclado = new Scanner(System.in);
        do{            
            System.out.println(" ");
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println("|**************** MENU ***************|");
            System.out.println("|-------------------------------------|");
            System.out.println("|        1_Ver Menu                   |");
            System.out.println("|        2_Cambiar Menu               |");
            System.out.println("|        3_Salir                      |");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println(" ");
            
            int num = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
            
            switch(num){
            
                case 1:
                    System.out.println("********* MENÚ *************");
                    System.out.println("----------------------------");
                    System.out.println("PIZZAS");
                    
                    for (int i=0; i <= valorP;i++){
                        System.out.println(pizza[i] +" $ "+precioP[i]);
                    }

                    System.out.println("----------------------------");  
                    
                    System.out.println("MINUTAS");                    
                    for (int i=0; i <= valorM;i++){
                        System.out.println(Minuta[i] +" $ "+precioM[i]);
                    }                    
                    
                    System.out.println("----------------------------");
                    
                    System.out.println("BEBIDAS");                    
                    for (int i=0; i <= valorB;i++){
                        System.out.println(Bebida[i] +" $ "+precioB[i]);
                    }
                    System.out.println("----------------------------");
                    
                    System.out.println("SNACKS");                    
                    for (int i=0; i <= valorSNK;i++){
                        System.out.println(Snack[i] +" $ "+precioSnk[i]);
                    }  
                    
                    break;
                
                case 2:
                    // damos las diversas opciones de comidas a elegir
                    // Luego se recorreran los arreglos y se seleccionara la opcion que se desea cambiar
		    // A continuacion sustituiremos el nombre de esta variable por la de la nueva opcion y haremos lo mismo con el precio
		    // Tambien daremos la opcion de añadir una nueva opcion ara ello aumentaremos el valor de la variable "valor" y su respectivo subindice
		    // para luego asignarle un nombre y un precio
                    
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
                        System.out.println("|        6_Salir                      |");
                        System.out.println("|                                     |");
                        System.out.println("|-------------------------------------|");
                        System.out.println(" ");
                        num = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
                        
                        switch(num){
                            case 1:
                                
                                do{
                                    System.out.println("-------------------------------------");
                                    System.out.println("  Elija la opcion que desea cambiar  ");
                                    System.out.println("-------------------------------------");
                                    for(int i = 0; i == valorP;i++){
                                        System.out.println("_ "+pizza[i]);                                    
                                    }
                                    
                                    System.out.println("   "+valorP+1+"_ Añadir nueva opcion");
                                    System.out.println("   "+valorP+2+"_ Volver");
                                    System.out.println("   "+valorP+3+"_ Salir");
                                    System.out.println("-------------------------------------");
                                    i = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
                                    
                                    if(i==(valorP+1)){
                                        valorP = valorP+1;
                                        
                                    }
                                    if(i<=valorP){
                                        System.out.println("Escriba la nueva opción");
                                        pizza[i] = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
                                        System.out.println("Asignar un precio");
                                        precioP[i] = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
                                    }
                                    }while(i >=(valorP+2) || i >=(valorP+3));
                                    break;
                            case 2:
                                do{
                                    System.out.println("-------------------------------------");
                                    System.out.println("  Elija la opcion que desea cambiar  ");
                                    System.out.println("-------------------------------------");
                                    for(int i = 0; i <= valorM;i++){
                                        System.out.println("_ "+Minuta[i]);                                    
                                    }
                                    
                                    System.out.println("   "+valorM+1+"_ Añadir nueva opcion");
                                    System.out.println("   "+valorM+2+"_ Volver");
                                    System.out.println("   "+valorM+3+"_ Salir");
                                    System.out.println("-------------------------------------");
                                    i = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
                                    
                                    if(i==(valorM+1)){
                                        valorM = valorM+1;
                                        
                                    }
                                    if(i<=valorM){
                                        System.out.println("Escriba la nueva opción");
                                        Minuta[i] = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
                                        System.out.println("Asignar un precio");
                                        precioM[i] = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
                                    }
                                }while(i >=(valorM+2) || i >=(valorM+3));
                                
                                break;
                                
                            case 3:
                                do{
                                    System.out.println("-------------------------------------");
                                    System.out.println("  Elija la opcion que desea cambiar  ");
                                    System.out.println("-------------------------------------");
                                    for(int i = 0; i == valorB;i++){
                                        System.out.println("_ "+Bebida[i]);                                    
                                    }
                                    
                                    System.out.println("   "+valorB+1+"_ Añadir nueva opcion");
                                    System.out.println("   "+valorB+2+"_ Volver");
                                    System.out.println("   "+valorB+3+"_ Salir");
                                    System.out.println("-------------------------------------");
                                    i = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
                                    
                                    if(i==(valorB+1)){
                                        valorB = valorB+1;
                                        
                                    }
                                    if(i<=valorB){
                                        System.out.println("Escriba la nueva opción");
                                        Bebida[i] = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
                                        System.out.println("Asignar un precio");
                                        precioB[i] = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
                                    }
                                }while(i >=(valorB+2) || i >=(valorB+3));
                                
                                break;
                                
                            case 4:
                                do{
                                    System.out.println("-------------------------------------");
                                    System.out.println("  Elija la opcion que desea cambiar  ");
                                    System.out.println("-------------------------------------");
                                    for(int i = 0; i == valorSNK;i++){
                                        System.out.println("_ "+Snack[i]);                                    
                                    }
                                    
                                    System.out.println("   "+valorSNK+1+"_ Añadir nueva opcion");
                                    System.out.println("   "+valorSNK+2+"_ Volver");
                                    System.out.println("   "+valorSNK+3+"_ Salir");
                                    System.out.println("-------------------------------------");
                                    i = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
                                    
                                    if(i==(valorSNK+1)){
                                        valorSNK = valorSNK+1;
                                        
                                    }
                                    if(i<=valorSNK){
                                        System.out.println("Escriba la nueva opción");
                                        Snack[i] = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
                                        System.out.println("Asignar un precio");
                                        precioSNK[i] = Integer.parseInt(teclado.next()); // Se lee opción ingresada por el usuario
                                    }
                                }while(i >=(valorSNK+2) || i >=(valorSNK+3));
                                break;
                            
                            case 5:
                                break;
                            
                            default:
                                System.out.println(" ------------------------------------------------------------------------------------------ ");
                                System.out.println("|La opcion que a ingresado no es correcta. Por favor dijite una que se encuentre en el menu|");
                                System.out.println(" ------------------------------------------------------------------------------------------ ");
                                System.out.println(" ");
                                System.out.println(" ");
                                break;
                        }
                        
                    }while(num=5 || num=6);
                        
                    break;
                    
                case 3:
                    System.out.println(" ------------------------------------------------------------------------------------------ ");
                    System.out.println("|La opcion que a ingresado no es correcta. Por favor dijite una que se encuentre en el menu|");
                    System.out.println(" ------------------------------------------------------------------------------------------ ");
                    System.out.println(" ");
                    System.out.println(" ");                    
                    break;
                
                default:                    
                    break;
            }
        }while(num == 3 || num == 6);        
    }
}
