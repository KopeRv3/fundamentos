package Unidad4;

public class DemoCadena2 {

	public static void main(String[] args) {
		//imprime el elemento 0 del arreglo String
		/*
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		*/
		for(int i=args.length-1;i>=0;i--)
			System.out.println(args[i]);
	
		//metodo length que devuelve el numero de caracteres
		String miCiudad="Culiacan";
		System.out.println("Longitud de la Cadena= "+miCiudad.length());
		//metodo concat() Añade una cadena al final de otra cadena
		String numero = "$1,000.00";
		String moneda = " PESOS";
		numero = numero.concat(moneda);
		System.out.println( numero);
		//Metodo charAt() devuelve el caracter cuyo indice es posicion
		String nombrePropio = "Lorena";
		for (int i=0;i<nombrePropio.length();i++)
		{
			System.out.println(nombrePropio.charAt(i));
		}
		System.out.println();
		for (int i=nombrePropio.length()-1;i>=0;i--){
			System.out.println(nombrePropio.charAt(i));
		}
		//Metodo compareTo compara dos cadeanas alfabeticamente
		//                 0 si son iguales
		//                 <0 -1 si alfabeticamente es menor c1 que c2
		//                 >0 1 si alfabeticamente es mayor c1 que c2
		String nom1="Ana Maria";
		String nom2="Bertha";
		if(nom1==nom2)
		{
			System.out.println("Los nombres son iguales");
		}
		else
			System.out.println("Los nombres no son iguales");
		int valor = nom1.compareTo(nom2);
		System.out.println(valor);
		if(nom1.compareTo(nom2)== 0)
		{
			System.out.println("Las cadenas son iguales");	
		}
		else if (nom1.compareTo(nom2)<0)
		{
			System.out.println(nom1 + " es menor que "+nom2);
		}
		else
		{
			System.out.println(nom1 + " es mayor que "+nom2);
		}
		//metodo subString() devuelve una cadena formada por los caracteres
		//                  entre inicial y final
		String cadena3 = "Esto es una cadena";
		String cadena4 = cadena3.substring(3,8);
		System.out.println(cadena4);
		String cadena5 = cadena3.substring(5);
		System.out.println(cadena5);


}
}
