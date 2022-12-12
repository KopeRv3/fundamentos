package TareaUnidad4;
//Proposito: Elaborar un programa que asigne al primer elemento 
//de un arreglo bidimensional cero,al siguiente 1 y así sucesivamente

import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		int matriz [][] = new int [3][3];
		matriz[0][0] = 0;
		matriz[0][1] = 1;
		matriz[0][2] = 2;
		matriz[1][0] = 3;
		matriz[1][1] = 4;
		matriz[1][2] = 5;
		matriz[2][0] = 6;
		matriz[2][1] = 7;
		matriz[2][2] = 8;
		for (int x=0; x < matriz.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < matriz[x].length; y++) {
			    System.out.print (matriz[x][y]);
			    System.out.print(" ");
			  }
			  System.out.println("|");
			}
	}

}
