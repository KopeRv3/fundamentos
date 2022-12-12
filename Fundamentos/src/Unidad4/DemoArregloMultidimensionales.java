package Unidad4;
/*
 * Sintaxis:
 * <tipo de datoElemento> <nombre arreglo> [][]
 * o bien
 * <tipo de datoElemento> [][] <nombre arreglo>;
 * o bien
 * <tipo de datoElemento> <nombre arreglo>[][] =
 * new <tipo de datoElemento> [<NumeroDeFilas>]
 */

public class DemoArregloMultidimensionales {

	public static void main(String[] args) {
		char pantalla[][];
			int puestos[][];
			double[][]matriz;
			
			pantalla = new char [80][24];//matriz de 80 filas y 24 columnas
			
			puestos = new int [10][5];//matriz de 10 filas y 5 columnas;
			
			final int N=4;
			matriz = new double [N][N]; //Matriz cuadrada de NXN
			int tabla [][]= new int [4][2];
			//Inicializacion de arreglos multidimensionales
			int tabla1[][]= {{51,52,53},{54,55,56}};//Orden 2X3
			
			int tabla2[][]= {{51,52,53},
					         {54,55,56}};//Orden 2x3
			
			int tabala3[][]= {
					          {1,2,3,4},
					          {5,6,7,8},
					          {9,10,11,12}
			                  };// Orden 3x4
			//ARREGLOS IRREGULARES O TRIANGULARES
			
			}
	
		

	{}


}
