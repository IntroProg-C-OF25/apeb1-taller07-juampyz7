
/***
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * Nombre el jugador: Posición en el campo de juego, Edad, Estatura.
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida.
 * Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 *
 * @author Usuario juampyz7
 */
import java.util.Scanner;

public class Problema4_JugadoresFutbol {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        String reporte = "Listado de Jugadores\n";
        int contador = 0;
        double sumaEdades = 0, sumaEstaturas = 0;
        boolean continuar = true;

        while (continuar) {
            contador++;

            System.out.println("Ingrese el nombre del jugador: ");
            String nombre = tcl.nextLine();

            System.out.println("Ingrese la posicion en el campo de juego: ");
            String posicion = tcl.nextLine();

            System.out.println("Ingrese la edad del jugador: ");
            int edad = tcl.nextInt();

            System.out.println("Ingrese la estatura del jugador (en metros): ");
            double estatura = tcl.nextDouble();
            tcl.nextLine();

            reporte += String.format("%d. %s -%s-, edad %d, estatura %.2f\n",
                    contador, nombre, posicion, edad, estatura);

            sumaEdades += edad;
            sumaEstaturas += estatura;

            System.out.println("¿Desea ingresar otro jugador? (si/no): ");
            String respuesta = tcl.nextLine().toLowerCase();
            if (respuesta.equals("no")) {
                continuar = false;
            }
        }

        double promedioEdades = sumaEdades / contador;
        double promedioEstaturas = sumaEstaturas / contador;

        reporte += String.format("Promedio de edades: %.1f\n", promedioEdades);
        reporte += String.format("Promedio de estaturas: %.2f\n", promedioEstaturas);

        System.out.println("\n" + reporte);
    }
}
/***
 * run:
 * Ingrese el nombre del jugador: 
 * Gabriel Chamba
 * Ingrese la posicion en el campo de juego: 
 * delantero
 * Ingrese la edad del jugador: 
 * 17
 * Ingrese la estatura del jugador (en metros): 
 * 1,75
 * �Desea ingresar otro jugador? (si/no): 
 * si
 * Ingrese el nombre del jugador: 
 * Juan Loja
 * Ingrese la posicion en el campo de juego: 
 * delantero
 * Ingrese la edad del jugador: 
 * 18
 * Ingrese la estatura del jugador (en metros): 
 * 1,70
 * �Desea ingresar otro jugador? (si/no): 
 * si
 * Ingrese el nombre del jugador: 
 * Antonny Regalado
 * Ingrese la posicion en el campo de juego: 
 * mediocentro
 * Ingrese la edad del jugador: 
 * 18
 * Ingrese la estatura del jugador (en metros): 
 * 1,75
 * �Desea ingresar otro jugador? (si/no): 
 * si
 * Ingrese el nombre del jugador: 
 * Willy Arevalo
 * Ingrese la posicion en el campo de juego: 
 * defensa
 * Ingrese la edad del jugador: 
 * 18
 * Ingrese la estatura del jugador (en metros): 
 * 1,77
 * �Desea ingresar otro jugador? (si/no): 
 * si
 * Ingrese el nombre del jugador: 
 * Dalton Flores
 * Ingrese la posicion en el campo de juego: 
 * arquero
 * Ingrese la edad del jugador: 
 * 18
 * Ingrese la estatura del jugador (en metros): 
 * 1,80
 * �Desea ingresar otro jugador? (si/no): 
 * no
 * Listado de Jugadores
 * 1. Gabriel Chamba -delantero-, edad 17, estatura 1,75
 * 2. Juan Loja -delanteroo-, edad 18, estatura 1,70
 * 3. Antonny Regalado -mediocentro-, edad 18, estatura 1,75
 * 4. Willy Arevalo -defensa-, edad 18, estatura 1,77
 * 5. Dalton Flores -arquero-, edad 18, estatura 1,80
 * Promedio de edades: 17,8
 * Promedio de estaturas: 1,75
 * BUILD SUCCESSFUL (total time: 2 minutes 4 seconds)
 */
