package Unidad4;
/*Proposito:
 * 
 */
import java.util.Scanner;

public class TablaVotaciones {

	public static void main(String[] args) {
		int tabla[][]=new int[6][4];
		capturarTabla(tabla);
		totalCandidato(tabla);
		

	}
	public static void capturarTabla(int tabla[][]){
		Scanner entrada = new Scanner(System.in);
		int votos;
		/*
		tabla[0][0]=1;
		tabla[1][0]=2;
		tabla[2][0]=3;
		tabla[3][0]=4;
		tabla[4][0]=5;
		asi se hace de manera original, con for se reduce la mecanica
		*/
		for (int i = 0; i < 5; i++) {
			tabla[i][0]=i+1;
		}
		for (int i = 0; i <tabla.length-1; i++) {
			System.out.println(" *** Captura los votos del distrito  "+
		                        tabla[i][0]+" *** ");
			for (int j = 1; j <tabla[i].length; j++) {
				do
				{
					System.out.println("Proporciona votos del Candidato "+j+": ");
					votos= entrada.nextInt();
					
				}while(votos<0);
				tabla[i][j]=votos;
			}
		
		}
	}
		
	public static void totalCandidato(int t[][]){
		int totalC, totalGlobal;
		totalGlobal=0;
		for(int columna=1;columna<4;columna++){
			totalC=0;
			int renglon;
			for(renglon=0;renglon<5;renglon++){
				totalC=totalC+t[renglon][columna];
			}
			totalGlobal=totalGlobal+totalC;
			System.out.println("Votos del Candidato "+columna+
					" = "+totalC);
			t[renglon-1][columna]=totalC;
		}
		System.out.println("Votos totales = "+totalGlobal);
		for(int columna=1;columna<t[5].length;columna++){
			System.out.println("Votos del Candidato "+columna
					+" "+t[5][columna]+" "+(double)t[5][columna]/(double)totalGlobal*100);
			
		}
}
	}

