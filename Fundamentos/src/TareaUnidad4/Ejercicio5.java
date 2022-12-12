package TareaUnidad4;
//Proposito: 5.	Elaborar un programa  que lea los elementos de un arreglo por consola de orden 2X3
public class Ejercicio5 {

	public static void main(String[] args) {
			int matriz [][] = new int [2][3];
			matriz[0][0] = 5;
			matriz[0][1] = 6;
			matriz[0][2] = 3;
			matriz[1][0] = 1;
			matriz[1][1] = 3;
			matriz[1][2] = 58;
			
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