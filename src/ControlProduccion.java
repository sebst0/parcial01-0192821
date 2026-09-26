import java.util.Scanner;
public class ControlProduccion {
    public static void main(String[] args) throws Exception {

        // Configuro el scanner, la matriz de 4x5, los arreglos de sumas y las variables contadoras
        Scanner leer = new Scanner(System.in);
        int[][] producciones = new int[4][5];
        int[] suma = new int[4] ;
        int[] sumaDias = new int[5];

        int contador = 0;
        int longitudFilas = producciones.length;
        int longitudColumnas = producciones[0].length;
        int sumaTotal = 0;
        
        // Aca recorre la matriz para pedir los datos al usuario, valida con un while que no sean negativos y acumula la producción de cada máquina
        for (int i = 0; i < longitudFilas; i++) {
            for (int j = 0; j < longitudColumnas; j++) {
                System.out.println("ingrese produccion maquina " + (i+1) + " dia " + (j+1));
                producciones[i][j] = leer.nextInt();

                while (producciones[i][j]<0) {
                    System.out.println("error, ingrese un numero positivo");
                    producciones[i][j] = leer.nextInt();
                }

                if (producciones[i][j]<20) {
                    contador += 1;
                }
                suma[i] += producciones[i][j];
                

            }
            sumaTotal += suma[i];
        }
        // se recorren las columnas para sumar y mostrar el total producido por los cuatro días de trabajo
        for (int j = 0; j < longitudColumnas; j++) {
            for (int i = 0; i < longitudFilas; i++) {
                sumaDias[j] += producciones[i][j];
                
            }
            System.out.println("en el dia " + (j+1) + " se produjo entre las 4 maquinas la cantidad de: " + sumaDias[j]);
        }

        int mayor = suma[0];
        int posicionmayor = 1;
        int menor = sumaDias[0];
        int posicionmenor = 1;

        // Compara los arreglos de las sumas para mirar cual máquina produjo más, cuál día se produjo menos, y muestra los totales y el conteo menores a 20
        for (int i = 0; i < longitudFilas; i++) {
            System.out.println("la cantidad que produjo la maquina " + (i+1) + " fue de " + suma[i]);
            if (suma[i]>mayor) {
                mayor = suma[i];
                posicionmayor = i+1;
            }
            
        }
        
        for (int j = 0; j < longitudColumnas; j++) {
            if (sumaDias[j]<menor) {
                menor = sumaDias[j];
                posicionmenor = j+1;
            }
            
        }

        System.out.println("el total producido fue de: " + sumaTotal);
        System.out.println("el total de registros menores a 20 fue de: " + contador);
        System.out.println("la maquina con mas produccion fue la numero " + posicionmayor + " con una produccion de: " + mayor);
        System.out.println("el dia con la menor producion fue el " + posicionmenor + " con una produccion de: " + menor);

        // imprime la matriz completa en filas y columnas para que se pueda ver de manera más ordenada 
        for (int i = 0; i < longitudFilas; i++) {
            for (int j = 0; j < longitudColumnas; j++) {
                System.out.print(producciones[i][j] + " ");
                
                
            }
            System.out.println();
        }

        leer.close();

    }
}
        



