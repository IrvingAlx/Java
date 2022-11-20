package practica_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaTextos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int tamaño, cont = 0 , i;
		int cont=0;
		ArrayList <String> list2 = new ArrayList <String>();
		ArrayList <String> list3 = new ArrayList <String>();
		ArrayList <String> list4 = new ArrayList <String>();

		System.out.println("hola");

		
				list2 = Validar.regresaArrayList("C:\\Users\\jhons\\Downloads\\tweets.csv");
				//System.out.println("hola");
				//list2 = Validar.depuraArraylist(list2);
		/**
		for(String txt : list2) {
			System.out.println(txt);
		}
		**/
				//list3 = Validar.sentimientosArray(list2);
				//System.out.println("hola");
				//list4 = Validar.limpiarArrayPalabras(list3);
				//System.out.println("hola");
		for(String txt : list2) {
			cont++;
			System.out.println(txt);
		}
		System.out.println("hola " + cont);
		/**
		
		tamaño = list2.size();
		
		System.out.println("El ultimo elemento es: "+list2.get(tamaño-1));
		
		String cadena = "ham,\"I am sorry it hurt you.,\",";
		
		for(i=0; i< tamaño; i++) {
			if(cadena.equals(list2.get(i))) {
				cont++;
				System.out.println("Coincide en : "+i);

			}
		}	
		
		System.out.println("El numero de coincidencias es: "+cont);
		 **/

		
	}

}
