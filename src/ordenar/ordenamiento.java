package ordenar;

import java.util.Arrays;
import java.util.Scanner;

public class ordenamiento {
	
	public void Orden() {
		
		int tamano, i;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa cuantos numeros desear ordenar: ");
		tamano = entrada.nextInt();
		
		int[] arrayNumeros = new int[tamano];
		
		for(i = 0; i < tamano; i++) {
			System.out.print("Ingresa la posicion " + (i + 1)  + " de los numeros a ordernar \n" );
			arrayNumeros[i] = entrada.nextInt();
		}
			
		Arrays.sort(arrayNumeros);
		System.out.println("El arreglo quedo de la siguiente manera");
		System.out.print("[" );
		
		for(i = 0; i < tamano; i++) {
			System.out.print( arrayNumeros[i] + "," );
		}
		
		System.out.print("]");
		
	}
	

}
