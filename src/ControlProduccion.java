import java.util.Scanner;
public class ControlProduccion {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner leer = new Scanner(System.in);
        int[][] produciones = new int[4][5];
        int[] suma = new int[4] ;
        int contador = 0;
        int longitudFilas = produciones.length;
        int longitudcolumnas = produciones[0].length;

        for (int i = 0; i < longitudFilas; i++) {
            for (int j = 0; j < longitudcolumnas; j++) {
                System.out.println("ingrese produccion maquina " + i + "dia " + j);
                produciones[i][j] = leer.nextInt();

                if (produciones[i][j]<0) {
                    System.out.println("error, ingrese un numero positivo");
                    produciones[i][j] = leer.nextInt();
                }

                suma[i] += produciones[0][j]; 
                if (produciones[i][j]>20) {
                    contador += 1;
                }

            }
            
            }
        for (int i = 0; i < longitudFilas; i++) {
            for (int j = 0; j < longitudcolumnas; j++) {
                System.out.println(produciones[i][j] + " ");
                
                
            }
            System.out.println();
        }
            
    }
        



