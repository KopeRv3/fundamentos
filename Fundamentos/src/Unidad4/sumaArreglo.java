package Unidad4;
import java.util.Scanner;

public class sumaArreglo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double arreglo[]= new double[13];
		for(int i=0;i<arreglo.length;i++)
		{
			System.out.println("Proporciona el valor de la posicion " +i+ ":");
			arreglo[i]=entrada.nextDouble();
		}
		System.out.println(suma(arreglo));

	}
	static double suma(double[] w){
		double s= 0.0;
		for(int i=0;i<w.length;i++)
			s += w[i];
		return s;
	}

}
