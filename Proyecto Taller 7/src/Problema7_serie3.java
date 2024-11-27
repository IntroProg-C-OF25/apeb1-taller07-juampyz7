
/***
 * Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 *
 * @author Usuario juampyz7
 */
public class Problema7_serie3 {

    public static void main(String[] args) {
        int contador = 1;
        double sumatoria = 1, termino = 1.0;

        while (contador <= 10) {
            termino = 1.0 / contador;
            if (contador % 2 == 0) {
                sumatoria += termino;
            } else {
                sumatoria -= termino;
            }
            contador++;
        }
        System.out.printf("La sumatoria alternada es: %.5f\n", sumatoria);
    }
}
/***
 * run:
 * La sumatoria alternada es: 0,35437
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */
