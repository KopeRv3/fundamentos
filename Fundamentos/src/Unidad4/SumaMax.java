package Unidad4;
/*
 * Proposito: se lee una lista de 21 numeros entero
 * a continuacion se calcula suma y el valor maximo la 
 * entrada de datos termina al introducir la clave -1
 */
import java.util.Scanner;
public class SumaMax {

	public static void main(String[] args) {
		final int NUM=21;
		int items[]=new int[NUM];
		int n;
		n=entrada(items);//devolver el numero de
		                 //elementos que leyo
		System.out.println("\nSuma de "+n+" elementos ");
		System.out.println(sumaEnteros(items,n));
		System.out.println("\nValor Maximo:"+maximo(items,n));
		
	}
static int entrada(int w[]){
	int k=0,x;
	Scanner entrada=new Scanner(System.in);
	System.out.println("Introduzca un maximo de "+w.length
			+" datos, terminar con -1");
	do {
		x = entrada.nextInt();
		if( x !=-1)
			w[k++]=x;
	}while ((k<w.length && (x != -1)));
	return k;
}
static int sumaEnteros (int w[],int n){
	int i, total=0;
	for(i=0;i<n;i++)
		total +=w[i];
	return total;
}
static int maximo(int w[], int n) {
	int mx,i;
	mx = w[0];
	for(i=1;i<n;i++)
		mx=(w[i]>mx?w[i]:mx);
	return mx;
}
}
