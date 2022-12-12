package TareaUnidad4;

//Proposito: 8.	Escribir un programa que genere número aleatorios de 1 a 100,
//luego los ingrese en una matriz de orden 5X5y cree una función que encuentre
//la suma de la diagonal principal.
public class Ejercicio8 {

	public static void main(String[] args) {
		int matriz [][] = new int [5][5];
		for(int x = 0; x < matriz.length; x++) {
			System.out.print("|");
			for (int j = 0; j < matriz[x].length; j++) {
				matriz[x][j] = (int) (Math.random()*99+1);
				System.out.print(matriz [x][j]+" ");
				System.out.print("|");
			}
				System.out.println();	
			}
		
		}
	
	}

	
	

