package Unidad4;
import java.util.Scanner;
public class FrecuenciaEdades {

public static void main(String[] args) {
//Crear arreglo
int edadesMenores10[]=new int[11];
leerEdades(edadesMenores10);
imprimirFrecuencia(edadesMenores10);


}
static void leerEdades(int edadesMenores10[])
{
Scanner entrada = new Scanner(System.in);
final int N=14;
int edad;
for(int i=1;i<=N;i++){
do
{
System.out.println("Proporciona Edad "+i+" (0-10): ");
edad = entrada.nextInt();
}while (edad<0 || edad>10);
   edadesMenores10[edad]=edadesMenores10[edad]+1;
}
entrada.close();
}
static void imprimirFrecuencia(int edadesMenores10[])
{
for(int i=0;i<=10;i++){
System.out.println("Edad["+i+"]="+edadesMenores10[i]);
}
}


}

