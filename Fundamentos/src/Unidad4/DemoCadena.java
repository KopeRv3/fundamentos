package Unidad4;
import java.util.Scanner;
public class DemoCadena {

	public static void main(String[] a) {
		String miPueblo = "Culiacan";
		String vacia="";
		String blanco=" ";
		System.out.println(miPueblo);
		Scanner entrada = new Scanner(System.in);
		//System.out.println("Introduzca su nombre");
		//String nombre = entrada.next();
		//System.out.println("Buenos Dias "+nombre);
		System.out.println("Introduzca su nombre y apellido ");
		String nombreApe = entrada.nextLine ();
		System.out.println("Buenos Dias "+nombreApe);
		String ciudades[]= {"Ahome","El Fuerte","Choix"};
		for(int i = 0; i<ciudades.length;i++)
			System.out.println(ciudades[i]);

	}

}
