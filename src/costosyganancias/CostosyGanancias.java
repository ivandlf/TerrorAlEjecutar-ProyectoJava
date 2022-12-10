
package costosyganancias;

public class CostosyGanancias {
  
    public static void CostosyGanancias(double ganancias[], double gastos[]) {
	double total = 0.0;
	// Aqui simplemente mostramos los gastos y ganancias registrados en el resto del programa, y mostramos la ganancia neta, restandole el total de los gastos menos el total de las ganancias
	System.out.println("-------------------------------------");
	System.out.println("");
	System.out.println("Los costos totales son: $"+gastos[0]);
	System.out.println("-------------------------------------");
	System.out.println("");
	System.out.println("Las ganancias brutas son: $"+ganancias[0]);
	System.out.println("-------------------------------------");
	System.out.println("");
	total = ganancias[0]-gastos[0];
	System.out.println("Las Ganancias netas son: $"+total);
	System.out.println("-------------------------------------");
	

    }
    
}
