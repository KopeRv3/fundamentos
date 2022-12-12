package Unidad4;
/*
 * Arreglo. Es una secuencua de datos del mismo tipo
 * sintaxis:
 * tipo[] identificador
 * [] tipo identificador
 * Sintaxis para declarar un arreglo
 * forma 1:
 * tipo nombreArreglo [] = new tipo[NumerodeElementos]
 * 
 */

public class DemoArreglo2 {

	public static void main(String[] args) {
		//Decalracion de qarreglos
		int[]v;
		float w[];
		//distianas delaraciones de arreglos
		char car[],p;
		int []v1,w1;
		double []m,t[],x;
		//Creacion de arreglos: 2 formas
		//Forma 1:
		float[]notas;//Primero declaro el arreglo
		notas = new float[26]; //segundo creo el arreglo con un tamaño
		// Forma 2:
		float [] notas2 = new float[26];
		int a[] = new int[10]; //declarando un arreglo de nombre a y 
		                      //la defini con 10 elementos de tipo int
		final int N=20;
		float[]vector;
		vector = new float[N];
		//Subindices o Indices de un arreglo
		/*
		 *La forma de acceder a un elemento de un arreglo es a traves 
		 *de su inidce.
		 *El metodo de numeracion del enesimo elemento del indice es n-1 y
		 *se le denomina INDEXACION BASADA EN CERO
		 */
		int []mes = new int[12];
		// el primer elemento es mes[0] y el ultimo es mes[11]
		mes[4]= 5; //accediendo al elemento posicion 4
		//Tamaño de los arreglos, Atributo lenght
		double []v2 = new double[15];
		System.out.println(v2.length);
		//Inicializacion de un arreglo
		//Un arreglo se puede inicializar con valores constantes en 
		//una sentencia que ademas es capaz de determinar su tamaño
		int numeros[] = {10,20,30,40,50,60};
		System.out.println(numeros.length);
		System.out.println(numeros[3]);
		System.out.println(numeros[5]);
		System.out.println(numeros[0]);
		
		int[]nms= {3,4,5};
		
		char c[]= {'L','u','i','s'};
		
		final int ENE=31,FEB=28,MAR=31,ABR=30,MAY=31,
				JUN=30,JUL=31,AGO=31,SEP=30,OCT=31,
				NOV=30,DIC=31;
		int meses[] = {ENE,FEB,MAR,ABR,JUN,JUL,AGO,SEP,OCT,NOV,DIC};
		
		System.out.println(meses[1]);
		
			

	}

}
