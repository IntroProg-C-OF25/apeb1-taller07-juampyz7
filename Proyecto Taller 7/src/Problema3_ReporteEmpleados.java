
/** *
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados.
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo.
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 * Nombre 1	10	$2.5	$25
 * Nombre 2	11	$2	$22
 * Nombre 3	9	$3	$27
 * Nombre 4	5	$4	$20
 * Nombre 5	12	$2	$24
 *
 * @author Usuario juampyz7
 */
import java.util.Scanner;

public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        int contador = 1;
        double costoDias, costoTotal, numeroDias;
        while (contador <= 5) {
            System.out.println("Ingrese el nombre del empleado: ");
            nombre = tcl.next();
            System.out.println("Ingrese el numero de dias trabajados: ");
            numeroDias = tcl.nextInt();
            System.out.println("Ingrese el costo por dia trabajado: ");
            costoDias = tcl.nextDouble();
            costoTotal = numeroDias * costoDias;
            contador++;
            System.out.println("\nReporte de Empleados:");
            System.out.printf("| %s\t | %s | %s | %s |\n", "Nombres", "Num_Dias trabajados", "Cost_Dias Trabajados", "CostoT a Pagar");
            System.out.printf("| %s\t | %.2f\t | %.2f\t | %.2f\t |\n", nombre, numeroDias, costoDias, costoTotal);
            contador++;
    }
}
/***
 * run:
 * Ingrese el nombre del empleado: 
 * Gabriel
 * Ingrese el numero de dias trabajados: 
 * 5
 * Ingrese el costo por dia trabajado: 
 * 25
 * 
 * Reporte de Empleados:
 * | Nombres	 | Num_Dias trabajados | Cost_Dias Trabajados | CostoT a Pagar |
 * | Gabriel	 | 5,00	 | 25,00	 | 125,00	 |
 * Ingrese el nombre del empleado: 
 * Andres
 * Ingrese el numero de dias trabajados: 
 * 7
 * Ingrese el costo por dia trabajado: 
 * 25
 * 
 * Reporte de Empleados:
 * | Nombres	 | Num_Dias trabajados | Cost_Dias Trabajados | CostoT a Pagar |
 * | Andres	 | 7,00	 | 25,00	 | 175,00	 |
 * Ingrese el nombre del empleado: 
 * Antonny 
 * Ingrese el numero de dias trabajados: 
 * 15
 * Ingrese el costo por dia trabajado: 
 * 25
 * 
 * Reporte de Empleados:
 * | Nombres	 | Num_Dias trabajados | Cost_Dias Trabajados | CostoT a Pagar |
 * | Antonny	 | 15,00	 | 25,00	 | 375,00	 |
 * BUILD SUCCESSFUL (total time: 34 seconds)
 */