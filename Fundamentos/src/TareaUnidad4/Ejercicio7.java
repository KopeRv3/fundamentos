package TareaUnidad4;
//Proposito: 7.	Elaborar un programa que capture un arreglo bidimensional
//de orden 3X5 y luego lo imprima recorriendolo por renglón.
import java.util.Scanner;
public class Ejercicio7 {
    static void imprimirMatriz(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                int numeroActual = matriz[y][x];
                System.out.printf("%5d", numeroActual);
            }
            System.out.println();
        }
    }}

  