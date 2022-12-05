package controlStock;

import java.util.Scanner;

public class MenuBebidas {

    public static void MenuBebidas(String[] bebida, double[] valorB, double[] Sbebida) {
        Scanner teclado = new Scanner(System.in);
        int i;
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------------");
        for (int i = 0; i <= valorB; i++) {
            System.out.println(i + "El stock" + bebida[i], "es de: " + Sbebida[i]);//Recorremos todas las bebidas, para mostrar todos los lugares a los que se les a asignado una bebida
            System.out.println("-----------------------------------");
        }   
    }    
}
