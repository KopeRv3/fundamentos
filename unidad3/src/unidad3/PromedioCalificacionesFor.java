package unidad3;

import java.util.Scanner;

/*
 * Proposito: Captura 5 calificaciones para sacar su promedio
 * Autor
 * Fecha:
 */
public class PromedioCalificacionesFor {

public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
float promedio;
int calificacion;
float suma=0;
for (int i=1; i<=5; i++)
{
System.out.println("Proporciona la calificacion "+i+":");
calificacion = entrada.nextInt();
suma = suma + calificacion;
}
promedio = suma/5;
System.out.println("Promedio: "+promedio);

}

}