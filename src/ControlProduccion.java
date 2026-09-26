import java.util.Scanner;
public class ControlProduccion {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int[][] produciones = new int[4][5];
        int[] suma = new int[4] ;
        int[] sumaDias = new int[5];

        int contador = 0;
        int longitudFilas = produciones.length;
        int longitudColumnas = produciones[0].length;
        int sumaTotal = 0;
        

        for (int i = 0; i < longitudFilas; i++) {
            for (int j = 0; j < longitudColumnas; j++) {
                System.out.println("ingrese produccion maquina " + (i+1) + " dia " + (j+1));
                produciones[i][j] = leer.nextInt();

                while (produciones[i][j]<0) {
                    System.out.println("error, ingrese un numero positivo");
                    produciones[i][j] = leer.nextInt();
                }

                if (produciones[i][j]<20) {
                    contador += 1;
                }
                suma[i] += produciones[i][j];
                

            }
            sumaTotal += suma[i];
            }

        for (int j = 0; j < longitudColumnas; j++) {
            for (int i = 0; i < longitudFilas; i++) {
                sumaDias[j] += produciones[i][j];
                
            }
            System.out.println("en el dia " + (j+1) + " se produjo entre las 4 maquinas la cantidad de: " + sumaDias[j]);
        }

        int mayor = suma[0];
        int posicionmayor = 1;
        int menor = sumaDias[0];
        int posicionmenor = 1;
    

        for (int i = 0; i < longitudFilas; i++) {
            System.out.println("la cantidad que producio la maquina " + (i+1) + " fue de " + suma[i]);
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


         for (int i = 0; i < longitudFilas; i++) {
            for (int j = 0; j < longitudColumnas; j++) {
                System.out.print(produciones[i][j] + " ");
                
                
            }
            System.out.println();
        }

        leer.close();

    }
}
        



