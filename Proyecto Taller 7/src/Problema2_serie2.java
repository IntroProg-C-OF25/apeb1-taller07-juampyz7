
/** *
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 5/10, 10/12, 15/14, 20/16, 25/18, 30/20
 * @author Usuario juampyz7
 */
import java.util.Scanner;

public class Problema2_serie2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 0, numerador = 5, denominador = 10, limite;
        System.out.print("DAME EL LIMITE: ");
        limite = tcl.nextInt();
        while (contador <= limite) {
            System.out.print(numerador + "/" + denominador + ", ");
            numerador += 5;
            denominador += 2;
            contador++;
        }
    }
}
/***
 * run:
 * DAME EL LIMITE: 10
 * 5/10, 10/12, 15/14, 20/16, 25/18, 30/20, 35/22, 40/24, 45/26, 50/28, 55/30, 
 * BUILD SUCCESSFUL (total time: 21 seconds)
 */
