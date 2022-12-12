package Unidad4;
import java.util.Scanner;

public class PromedioGrupal {

	public static void main(String[] args) {
		int tabla[][]=new int[6][25];
		leerEntrada(tabla);
		promedioAlumno(tabla);
		

	}
	public static void leerEntrada(int tabla[][]){
		Scanner entrada = new Scanner(System.in);
		int calf;
		for (int i = 0; i < 6; i++) {
			tabla[i][0]=i+1;
		}
		for (int i = 0; i < 6 ; i++) {
			System.out.println(" *** captura las calificaciones de la materia "+
		                        tabla[i][0]+" *** ");
			for (int j = 1; j <tabla[i].length; j++) {
				do
				{
					System.out.println("Proporciona las calificaciones del alumno "+j+": ");
					calf= entrada.nextInt();
					
				}while(calf<0);
				tabla[i][j]=calf;
			}
		
		}
	}
		
	public static void promedioAlumno(int prom[][]){
		double promA, promedioGrupal;
		int total = 0;
		int cantidaddeElementos = 0;
		promedioGrupal=0;
		for(int columna=1;columna<25;columna++){			
			promA=0;	
			total=0;
			for(int renglon=1;renglon<6;renglon++){
				total=total+prom[renglon][columna];
				cantidaddeElementos=cantidaddeElementos+1;
			}
			promA=total/cantidaddeElementos;
			promedioGrupal = promedioGrupal/promA;
			System.out.println("Promedio del alumno "+columna+
					" = "+promA);
		}
		System.out.println("promedio grupal = "+promedioGrupal);

}
	}
