import java.util.Scanner;
public class ConsumoAgua {
        public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);
        
        int[] consumos = new int[10];
        int suma = 0;
        int longitud = consumos.length;
        int consumoMayor = consumos[0];
        int posicionMayor = 1;

        for (int i = 0; i < longitud; i++) {
            System.out.println("ingrese valor del consumo del sector" + " " + (i+1));
            consumos[i] = leer.nextInt();
            while (consumos[i]<0) {
                System.out.println("error, ingrese un numero positivo");
                    consumos[i] = leer.nextInt();
            }
            
            suma += consumos[i];
            if (consumoMayor < consumos[i]) {
                consumoMayor = consumos[i];
                posicionMayor = i+1;

            }
            
        }

        double prom = (double) suma/ longitud;
        int mayoresPromedio = 0;
        int rachaActual = 0;
        int rachaMaxima = 0;

        for (int j = 0; j < longitud; j++) {
            if (prom < consumos[j]) {
                mayoresPromedio += 1;
                rachaActual++;

                if (rachaActual > rachaMaxima) {
                    rachaMaxima = rachaActual;
                }

        } else {
        rachaActual = 0;
        }
}

        for (int i = 0; i < longitud; i++) {
            System.out.println("sector " + (i+1) + " = " + consumos[i]);
            
        }

        System.out.println("el consumo total de los sectores es de: " + suma);
        System.out.println("el promedio del consumo es de: " + prom);
        System.out.println("el sector " + posicionMayor + " " + "con un consumo de " + consumoMayor + " " + "es el sector con mayor consumo");
        System.out.println("la cantidad de sectores que tuvieron el consumo mayor al promedio fue de: " + mayoresPromedio);
        System.out.println("la racha más larga de sectores consecutivos superiores al promedio es de: " + rachaMaxima);

        leer.close();

    }
}