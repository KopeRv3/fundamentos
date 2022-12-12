package Unidad4;
/*
 * Proposito: programa que entrada y una posterior 
 * visualizacion de un arreglo bidimensional, utilizando
 * dos metodos: leer() y visualizar()
 */
import java.util.Scanner;

public class Tabla {
	public static void main(String[] args) {
		int v[][] = new int [3][5];
		
		leer(v);
		visualizar(v);
	}
			static void leer(int a[][])
	{
		int i,j;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entrada de datos de la matriz");
		for(i=0;i<a.length;i++)
		{
			System.out.println("Fila: "+1);
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=entrada.nextInt();
			}
		}
	}
			static void visualizar (int a[][]){
				int i,j;
				System.out.println("\nMatriz leida\n");
				for(i=0;i<a.length;i++)
				{
					for(j=0;j<a[i].length;j++)
						System.out.println((a[i][j]+" "));
					System.out.println();
				}

	}

}
