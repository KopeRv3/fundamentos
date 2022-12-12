package TareaUnidad4;
//Proposito: Elaborar un programa que obtenga 10 números aleatorios 
//entre 0 y 255 y los almacene en un arreglo luego los ordene utilizando
//en método de la burbuja
import java.util.*;
import java.util.Random;
public class Ejercicio4 {
	
	    public static void main(String[] args) {
	        Random numAzar = new Random();
	        int num;
	       
	        int arreglo[]=new int[10];
	         for(int i=0; i<arreglo.length; i++){ 
	            num = (int)(numAzar.nextDouble()*255);
	            arreglo[i]=num;
	         }
	        int aux; 
	        for(int i=1; i<=arreglo.length; i++) { 
	            for(int j=0; j<arreglo.length-i; j++) { 
	                if( arreglo[j] > arreglo[j+1] ) { 
	                    aux = arreglo[j]; 
	                    arreglo[j]  = arreglo[j+1]; 
	                    arreglo[j+1]= aux; 
	                }    
	            } 
	        } 
	        System.out.println("Numero random ordenados: "); 
	        for(int i=0; i<arreglo.length; i++) 
	            System.out.println( arreglo[i] ); 
	    }
}
