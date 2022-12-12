package Unidad4;

public class AsignarValoresMatriz2 {

	public static void main(String[] args) {
		int num [][] = new int [3][4];
		int t,i;
		//Asigno los valores consecutivos
		for (t=0;t<3;t++)
			for(i=0;i<4;i++)
				num[t][i]=t*4 + i*1;
		//Imprimo los valores consecutivos
		for (t=0;t<3;t++) {
			for(i=0;i<4;i++)
			{
				System.out.println("num["+t+"]["+i+"]="+num[t][i]+" ");
			}
			System.out.println();
		}

	}

}
