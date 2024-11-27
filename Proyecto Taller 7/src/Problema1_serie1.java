/***
 * Problema 1
 * Realizar un programa Java que permita presentar en pantalla 
 * la siguiente secuencia: 1/10, 2/11, 3/12, 4/13, 5/14, 6/15
 * @author Usuario juampyz7
 */
import java.util.Scanner;

public class Problema1_serie1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 1, limite;
        System.out.print("DAME EL LIMITE: ");
        limite = tcl.nextInt();
        while (contador <= limite){
            System.out.print(contador + "/" + (contador + 9) + ", ");
            contador++;
        }
        System.out.println("");
    }
    
}
/***
 * run:
 * DAME EL LIMITE: 10
 * 1/10, 2/11, 3/12, 4/13, 5/14, 6/15, 7/16, 8/17, 9/18, 10/19, 
 * BUILD SUCCESSFUL (total time: 1 second)
 */

