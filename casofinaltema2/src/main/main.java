import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario las dimensiones de la matriz
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        // Crear la matriz cuadrada
        int[][] matriz = new int[dimension][dimension];

        // Rellenar la matriz con números aleatorios de modo simétrico
        rellenarMatrizSimetrica(matriz);

        // Imprimir la matriz
        imprimirMatriz(matriz);
    }

    // Función para rellenar la matriz con números aleatorios de modo simétrico
    public static void rellenarMatrizSimetrica(int[][] matriz) {
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i; j < matriz.length; j++) {
                int num = rand.nextInt(101); // Generar un número aleatorio entre 0 y 100
                matriz[i][j] = num;
                matriz[j][i] = num; // Hacer simétrico el elemento correspondiente
            }
        }
    }

    // Función para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("La matriz simétrica generada es:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}