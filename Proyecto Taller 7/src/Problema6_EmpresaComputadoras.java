
/***
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento
 * por tipo de cliente: Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20%
 * En caso que sea otro tipo de cliente, no hay descuento.
 * Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 *
 * @author Usuario juamoyz7
 */
import java.util.Scanner;

public class Problema6_EmpresaComputadoras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 0, tipoCliente;
        String reporte = "Reporte de Ventas:\n";
        double totalVentas = 0, descuento = 0, precioFinal;
        System.out.println("Ingrese los datos de las ventas (7 ventas en total):");
        while (contador < 7) {
            System.out.println("\nVenta #" + (contador + 1));
            System.out.print("Nombre del cliente: ");
            String nombreCliente = tcl.next();
            System.out.print("Costo de la computadora ($): ");
            double costoComputadora = tcl.nextDouble();
            System.out.print("Tipo de cliente (1, 2, otro): ");
            tipoCliente = tcl.nextInt();
            if (tipoCliente == 1) {
                descuento = costoComputadora * 0.10;
            } else if (tipoCliente == 2) {
                descuento = costoComputadora * 0.20;
            }
            precioFinal = costoComputadora - descuento;
            totalVentas += precioFinal;
            reporte += String.format("Cliente %s (Tipo %d): Costo original $%.2f, Descuento $%.2f, Total a pagar $%.2f\n",
            nombreCliente, tipoCliente, costoComputadora, descuento, precioFinal);
            contador++;
        }
        System.out.println("\n" + reporte);
        System.out.printf("Total acumulado de ventas: $%.2f\n", totalVentas);
    }
}
/***
 * run:
 * Ingrese los datos de las ventas (7 ventas en total):
 * 
 * Venta #1
 * Nombre del cliente: Gabriel
 * Costo de la computadora ($): 980
 * Tipo de cliente (1, 2, otro): 2
 * 
 * Venta #2
 * Nombre del cliente: Andres
 * Costo de la computadora ($): 1450
 * Tipo de cliente (1, 2, otro): 2
 * 
 * Venta #3
 * Nombre del cliente: Antonny
 * Costo de la computadora ($): 860
 * Tipo de cliente (1, 2, otro): 1
 * 
 * Venta #4
 * Nombre del cliente: Daniel
 * Costo de la computadora ($): 750
 * Tipo de cliente (1, 2, otro): 2
 * 
 * Venta #5
 * Nombre del cliente: Javier
 * Costo de la computadora ($): 1110
 * Tipo de cliente (1, 2, otro): 1
 * 
 * Venta #6
 * Nombre del cliente: Juan
 * Costo de la computadora ($): 1750
 * Tipo de cliente (1, 2, otro): 1
 * 
 * Venta #7
 * Nombre del cliente: Patricio
 * Costo de la computadora ($): 1850
 * Tipo de cliente (1, 2, otro): 1
 * 
 * Reporte de Ventas:
 * Cliente Gabriel (Tipo 2): Costo original $980,00, Descuento $196,00, Total a pagar $784,00
 * Cliente Andres (Tipo 2): Costo original $1450,00, Descuento $290,00, Total a pagar $1160,00
 * Cliente Antonny (Tipo 1): Costo original $860,00, Descuento $86,00, Total a pagar $774,00
 * Cliente Daniel (Tipo 2): Costo original $750,00, Descuento $150,00, Total a pagar $600,00
 * Cliente Javier (Tipo 1): Costo original $1110,00, Descuento $111,00, Total a pagar $999,00
 * Cliente Juan (Tipo 1): Costo original $1750,00, Descuento $175,00, Total a pagar $1575,00
 * Cliente Patricio (Tipo 1): Costo original $1850,00, Descuento $185,00, Total a pagar $1665,00
 * 
 * Total acumulado de ventas: $7557,00
 * BUILD SUCCESSFUL (total time: 1 minute 29 seconds)
 */

