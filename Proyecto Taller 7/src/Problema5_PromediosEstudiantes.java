
/** *
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos
 * ingresar el nombre del estudiante, el promedio de ciclo. Presentar el siguiente reporte
 * Estudiante1	10	Aprobado
 * Estudiante2	6.9	Reprobado
 * Estudiante3	7	Aprobado
 * Estudiante4	5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 *
 * @author usuario juampyz7
 */
import java.util.Scanner;

public class Problema5_PromediosEstudiantes {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, estado;
        double promedio;
        int contador = 1;
        while (contador <= 4) {
            System.out.print("DAME EL NOMBRE Y PROMEDIO DEL ESTUDIANTE " + contador + ":");
            nombre = tcl.next();
            promedio = tcl.nextDouble();
            if (promedio < 7) {
                estado = "Reprobado";
            } else {
                estado = "Aprobado";
            }
            System.out.printf("| %s | %s | %s |\n", "NOMBRE", "PROMEDIO", "ESTADO");
            System.out.printf("| %s | %.2f | %s |\n", nombre, promedio, estado);
            contador++;
            System.out.println("");
        }

    }

}
/**
 * *
 * run: DAME EL NOMBRE Y PROMEDIO DEL ESTUDIANTE 1: Gabriel 8,5 | NOMBRE |
 * PROMEDIO | ESTADO | | Gabriel | 8,50 | Aprobado |
 *
 * DAME EL NOMBRE Y PROMEDIO DEL ESTUDIANTE 2: Juan 8 | NOMBRE | PROMEDIO |
 * ESTADO | | Juan | 8,00 | Aprobado |
 *
 * DAME EL NOMBRE Y PROMEDIO DEL ESTUDIANTE 3: Mateo 5 | NOMBRE | PROMEDIO |
 * ESTADO | | Mateo | 5,00 | Reprobado |
 *
 * DAME EL NOMBRE Y PROMEDIO DEL ESTUDIANTE 4: Andres 6,7 | NOMBRE | PROMEDIO |
 * ESTADO | | Andres | 6,70 | Reprobado |
 *
 * BUILD SUCCESSFUL (total time: 1 minute 24 seconds)
 */


